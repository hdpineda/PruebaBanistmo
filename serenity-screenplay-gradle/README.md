# Serenity Screenplay Gradle

This project is a Gradle-based implementation of the Serenity Screenplay pattern for automated testing. It provides a structured approach to writing tests using the Screenplay pattern, which promotes better organization and readability of test code.

## Project Structure

The project is organized as follows:

```
serenity-screenplay-gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── screenplay
│   │   │               └── App.java
│   │   └── resources
│   │       └── serenity.conf
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── screenplay
│       │               └── AppTest.java
│       └── resources
│           └── serenity.properties
├── build.gradle
├── settings.gradle
└── README.md
```

## Getting Started

To get started with the project, ensure you have Gradle installed on your machine. You can then clone the repository and run the following command to build the project:

```
gradle build
```

## Running Tests

To execute the tests, use the following command:

```
gradle test
```

## Configuration

The `serenity.conf` file located in `src/main/resources` contains configuration settings for the Serenity framework. You can customize it according to your testing needs.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.