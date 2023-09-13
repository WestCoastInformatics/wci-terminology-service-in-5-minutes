/*
 * West Coast Informatics Terminology API
 * API documentation for the <a href=\"https://www.westcoastinformatics.com\">West Coast Informatics</a> terminology server API.<p>Request a 30-day bearer token from <a href=\"mailto:info@westcoastinformatics.com\">info@westcoastinformatics.com</a>.</p> <p>For full documentation on this service, please visit our wiki page at <a href=\"https://wci-wiki.atlassian.net/wiki/spaces/TSV2\">https://wci-wiki.atlassian.net/wiki/spaces/TSV2</a>.</p>
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@westcoastinformatics.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Represents a set of mappings from a concept in one terminology to a concept in another
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-13T22:04:29.340934Z[Etc/UTC]")
public class Mapset {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MAPPED_TO_TERMINOLOGY = "mappedToTerminology";
  @SerializedName(SERIALIZED_NAME_MAPPED_TO_TERMINOLOGY)
  private String mappedToTerminology;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private Boolean local;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TERMINOLOGY = "terminology";
  @SerializedName(SERIALIZED_NAME_TERMINOLOGY)
  private String terminology;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = new HashMap<>();

  public Mapset() {
  }

  public Mapset code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * the code in the specified terminology
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Mapset mappedToTerminology(String mappedToTerminology) {
    
    this.mappedToTerminology = mappedToTerminology;
    return this;
  }

   /**
   * the target terminology of this map set
   * @return mappedToTerminology
  **/
  @javax.annotation.Nonnull
  public String getMappedToTerminology() {
    return mappedToTerminology;
  }


  public void setMappedToTerminology(String mappedToTerminology) {
    this.mappedToTerminology = mappedToTerminology;
  }


  public Mapset created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * the created date
   * @return created
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Mapset local(Boolean local) {
    
    this.local = local;
    return this;
  }

   /**
   * indicates whether this data element was created by local editing
   * @return local
  **/
  @javax.annotation.Nonnull
  public Boolean getLocal() {
    return local;
  }


  public void setLocal(Boolean local) {
    this.local = local;
  }


  public Mapset modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * the identifier of the user who made the last modification
   * @return modifiedBy
  **/
  @javax.annotation.Nonnull
  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public Mapset modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * the last modified date
   * @return modified
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public Mapset id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * the unique identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Mapset active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * indicates whether or not this data element is active
   * @return active
  **/
  @javax.annotation.Nonnull
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Mapset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Mapset terminology(String terminology) {
    
    this.terminology = terminology;
    return this;
  }

   /**
   * the terminology abbreviation
   * @return terminology
  **/
  @javax.annotation.Nonnull
  public String getTerminology() {
    return terminology;
  }


  public void setTerminology(String terminology) {
    this.terminology = terminology;
  }


  public Mapset attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Mapset putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * key/value pairs associated with this object. Entries in this map are terminology-specific
   * @return attributes
  **/
  @javax.annotation.Nullable
  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mapset mapset = (Mapset) o;
    return Objects.equals(this.code, mapset.code) &&
        Objects.equals(this.mappedToTerminology, mapset.mappedToTerminology) &&
        Objects.equals(this.created, mapset.created) &&
        Objects.equals(this.local, mapset.local) &&
        Objects.equals(this.modifiedBy, mapset.modifiedBy) &&
        Objects.equals(this.modified, mapset.modified) &&
        Objects.equals(this.id, mapset.id) &&
        Objects.equals(this.active, mapset.active) &&
        Objects.equals(this.name, mapset.name) &&
        Objects.equals(this.terminology, mapset.terminology) &&
        Objects.equals(this.attributes, mapset.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, mappedToTerminology, created, local, modifiedBy, modified, id, active, name, terminology, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mapset {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    mappedToTerminology: ").append(toIndentedString(mappedToTerminology)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    terminology: ").append(toIndentedString(terminology)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("mappedToTerminology");
    openapiFields.add("created");
    openapiFields.add("local");
    openapiFields.add("modifiedBy");
    openapiFields.add("modified");
    openapiFields.add("id");
    openapiFields.add("active");
    openapiFields.add("name");
    openapiFields.add("terminology");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("mappedToTerminology");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("local");
    openapiRequiredFields.add("modifiedBy");
    openapiRequiredFields.add("modified");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("terminology");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Mapset
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Mapset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mapset is not found in the empty JSON string", Mapset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Mapset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Mapset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Mapset.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("mappedToTerminology").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappedToTerminology` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mappedToTerminology").toString()));
      }
      if (!jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("terminology").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminology` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminology").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mapset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mapset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mapset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mapset.class));

       return (TypeAdapter<T>) new TypeAdapter<Mapset>() {
           @Override
           public void write(JsonWriter out, Mapset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Mapset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Mapset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Mapset
  * @throws IOException if the JSON string is invalid with respect to Mapset
  */
  public static Mapset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mapset.class);
  }

 /**
  * Convert an instance of Mapset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

