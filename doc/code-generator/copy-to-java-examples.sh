#!/usr/bin/env bash
set -euo pipefail

# From doc/code-generator, copy generated sources into java-examples
# Layout enforced:
# - Invoker: api/invoker/** (single source of truth)
# - API:     api/TerminologyApi.java
# - Models:  com/wci/terminology/client/model/**

# Repo root (two levels up from doc/code-generator)
ROOT_DIR="$(cd "$(dirname "$0")/../.." && pwd)"
GEN_DIR="$ROOT_DIR/doc/code-generator/build/java/src/main/java"
DEST_DIR="$ROOT_DIR/java-examples/src/main/java"
ALT_INVOKER_DIR="$ROOT_DIR/../wci-automap-in-5-minutes/doc/code-generator/build/java/src/main/java/api/invoker"

echo "Using GEN_DIR=$GEN_DIR"
echo "Using DEST_DIR=$DEST_DIR"

# Sanity checks
if [ ! -d "$GEN_DIR" ]; then
  echo "ERROR: Generated sources not found at $GEN_DIR. Run: (cd doc/code-generator && ./gradlew buildJavaSdk)" >&2
  exit 1
fi

mkdir -p "$DEST_DIR/api" "$DEST_DIR/com/wci/terminology/client"

# 1) Copy invoker (api.invoker) — single invoker
rm -rf "$DEST_DIR/api/invoker"
mkdir -p "$DEST_DIR/api/invoker"
if [ -d "$GEN_DIR/api/invoker" ] && [ -f "$GEN_DIR/api/invoker/ApiClient.java" ]; then
  cp -R "$GEN_DIR/api/invoker/." "$DEST_DIR/api/invoker/"
  echo "Copied api/invoker from generator"
elif [ -d "$ALT_INVOKER_DIR" ] && [ -f "$ALT_INVOKER_DIR/ApiClient.java" ]; then
  cp -R "$ALT_INVOKER_DIR/." "$DEST_DIR/api/invoker/"
  echo "Copied api/invoker from automap fallback"
else
  echo "ERROR: Could not find invoker (ApiClient.java). Ensure generator ran or automap fallback exists." >&2
  exit 1
fi

# 2) Copy TerminologyApi.java
if [ -f "$GEN_DIR/api/TerminologyApi.java" ]; then
  cp -f "$GEN_DIR/api/TerminologyApi.java" "$DEST_DIR/api/"
  echo "Copied api/TerminologyApi.java"
else
  echo "ERROR: $GEN_DIR/api/TerminologyApi.java not found. Ensure apis=\"\" or includes terminology." >&2
  exit 1
fi

# 3) Copy models (com.wci.terminology.client.model)
if [ -d "$GEN_DIR/com/wci/terminology/client/model" ]; then
  rm -rf "$DEST_DIR/com/wci/terminology/client/model"
  mkdir -p "$DEST_DIR/com/wci/terminology/client/model"
  cp -R "$GEN_DIR/com/wci/terminology/client/model/." "$DEST_DIR/com/wci/terminology/client/model/"
  echo "Copied com/wci/terminology/client/model (cp)"
else
  echo "ERROR: $GEN_DIR/com/wci/terminology/client/model not found. Check modelPackage." >&2
  exit 1
fi

# 4) Remove any duplicate/unwanted APIs
rm -f "$DEST_DIR/api/LoginApi.java" "$DEST_DIR/api/NlmApi.java" 2>/dev/null || true

# 5) Ensure api/invoker/JSON imports generated model package
JSON_FILE="$DEST_DIR/api/invoker/JSON.java"
if [ -f "$JSON_FILE" ]; then
  if grep -qE '^import[[:space:]]+api\.model\..*;' "$JSON_FILE"; then
    sed -i 's/^import[[:space:]]\+api\.model\..*/import com.wci.terminology.client.model.*;/' "$JSON_FILE"
    echo "Rewrote import in api/invoker/JSON.java to com.wci.terminology.client.model.*"
  fi
fi

# 6) Remove any stray duplicate invoker under com/wci (we use api/invoker only)
rm -rf "$DEST_DIR/com/wci/terminology/client/invoker" 2>/dev/null || true

echo "Done. Now run: (cd $ROOT_DIR/java-examples && ./gradlew clean test)"


