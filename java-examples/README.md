# terminology-service in 5 Minutes: Java Tutorial

This tutorial shows how to use a locally defined Java client to interact with the terminology-service API, mirroring the cURL examples provided in the project. Each cURL example has a corresponding Java/Gradle test command.

## Prerequisites

- JDK 11+ must be installed
- Gradle (7.2+)

The API URL for terminology-service is:

`export API_URL=https://snomed.westcoastinformatics.com`

Run this command before the sample calls below as they expect $API_URL to be set.

## Building the Code

It is possible that your file permissions may not be set up correctly to run the ./gradlew commands. If you run into any errors regarding permissions, run the following command from the `java-examples` directory:

```
chmod 755 ./gradlew
```

This should explicitly set read, write, and execute permissions for running the ./gradlew commands.

Once permissions are set, building the java-examples should be as simple as running the following command from this directory.

```
./gradlew clean build
```

This will invoke Gradle to build the model objects and the clients themselves and then will also run the unit tests which demonstrate use of the client to make actual API calls against terminology-service.

If you only want to build (for example to run the tests separately) then run:

```
./gradlew clean build -x test
```

This will build the model objects and clients, while not running the tests.

## Client generation (no authentication required)

This client targets `https://snomed.westcoastinformatics.com` and does not require login. To generate/update the client code, follow `.work/run.md` for Docker or JAR instructions. The generator output should replace only `src/main/java/api/**` sources. The base URL can be overridden with `-DapiUrl` or `API_URL`.

### Sample Java tests (TerminologyApi)
-----------------

Run these from the `java-examples` directory:

- Get terminologies
```
./gradlew test --tests api.TerminologyApiTest.getTerminologiesTest
```

- Get terminology
```
./gradlew test --tests api.TerminologyApiTest.getTerminologyTest
```

- Get concept
```
./gradlew test --tests api.TerminologyApiTest.getConceptTest
```

- Find concepts (global)
```
./gradlew test --tests api.TerminologyApiTest.findConceptsGlobalTest
```

- Find concepts (by terminology)
```
./gradlew test --tests api.TerminologyApiTest.findConceptsByTerminologyTest
```

- Get relationships
```
./gradlew test --tests api.TerminologyApiTest.getConceptRelationshipsTest
```

- Get subsets and subset
```
./gradlew test --tests api.TerminologyApiTest.getSubsetsAndSubsetTest
```

- Get subtree and tree positions
```
./gradlew test --tests api.TerminologyApiTest.getSubtreeAndTreePositionsTest
```

- Resolve expression
```
./gradlew test --tests api.TerminologyApiTest.resolveExpressionTest
```

- Get config properties
```
./gradlew test --tests api.TerminologyApiTest.getConfigPropertiesTest
```

## Notes
- If you add new endpoints or cURL examples, add corresponding Java/Gradle test commands here.
- For more details on request/response payloads, see the `samples/` directory or the API documentation.