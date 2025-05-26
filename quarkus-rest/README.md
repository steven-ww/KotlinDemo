# Kotlin Learning Path REST API

This submodule provides a REST API for managing Kotlin learning resources using Quarkus.

## Overview

The Kotlin Learning Path REST API allows users to:

- Retrieve a list of Kotlin learning resources
- Update the name of the learning path
- Add or update resources in the learning path
- Remove resources from the learning path
- Reset the learning path to default values

## Project Structure

```
quarkus-rest/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── za/co/ee/learning/
│   │   │       ├── client/
│   │   │       │   └── UrlValidatorClient.kt
│   │   │       ├── model/
│   │   │       │   └── KotlinLearningPath.kt
│   │   │       ├── resource/
│   │   │       │   └── LearningPathResource.kt
│   │   │       └── service/
│   │   │           ├── InvalidLearningResourceUrl.kt
│   │   │           └── LearningPathService.kt
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       ├── kotlin/
│       │   └── za/
│       └── resources/
│           ├── __files/
│           ├── mappings/
│           └── wiremock/
├── build.gradle.kts
├── gradle.properties
└── README.md
```

## API Endpoints

| Method | Endpoint                      | Description                                |
|--------|-------------------------------|--------------------------------------------|
| GET    | /learning-path                | Get the current learning path              |
| PUT    | /learning-path/name/{name}    | Update the name of the learning path       |
| PUT    | /learning-path/resource       | Add or update a resource (query params: name, url) |
| DELETE | /learning-path/resource/{name}| Remove a resource from the learning path   |
| POST   | /learning-path/reset          | Reset the learning path to default values  |

## Default Resources

The API comes pre-configured with the following resources:

- Kotlin Home: https://kotlinlang.org/
- Quarkus Home: https://quarkus.io/
- Http4k Home: https://www.http4k.org/
- Ktor Home: https://ktor.io/

## Running the Application

To run the application in development mode:

```bash
./gradlew :quarkus-rest:quarkusDev
```

## Testing

The project includes WireMock configuration files for testing external service interactions, but no actual test classes are provided. These configuration files can be found in the `src/test/resources` directory.

If you want to add your own tests, you can use the following command to run them:

```bash
./gradlew :quarkus-rest:test
```

## External Service Integration

The application integrates with an external service for URL validation using the `UrlValidatorClient`. This service is configured in `application.properties`:

```properties
%dev.quarkus.rest-client."validator-service".url=http://localhost:${quarkus.wiremock.devservices.port}
%test.quarkus.rest-client."validator-service".url=http://localhost:${quarkus.wiremock.devservices.port}
```

In development and test environments, this service is mocked using WireMock, which is configured with:

```properties
%dev.quarkus.wiremock.devservices.files-mapping=${PROJECT_DIR}/src/test/resources
```
