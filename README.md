# gradle-conventions

[![Build](https://img.shields.io/github/actions/workflow/status/user/gradle-conventions/ci.yml?branch=main)]()
[![Java](https://img.shields.io/badge/java-17+-blue.svg)]()
[![License: MIT](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

**gradle-conventions** custom Gradle plugin for enforcing project conventions and code quality. Built with simplicity and performance in mind.

## Features

- Observability: Micrometer metrics and structured logging via SLF4J
- Dependency Injection: Clean DI patterns with constructor injection
- Type Safe: Full use of Java generics and sealed interfaces

## Getting Started

### Installation

Add to your `pom.xml`:

```xml
<dependency>
  <groupId>com.example</groupId>
  <artifactId>gradle-conventions</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Usage

```java
import com.example.gradleconventions.GradleConventions;

public class Main {
    public static void main(String[] args) {
        var client = GradleConventions.builder()
            .timeout(Duration.ofSeconds(30))
            .build();

        var result = client.run();
        System.out.println(result);
    }
}
```

## Configuration

Configuration can be provided via environment variables, a config file, or programmatically.

| Variable | Description | Default |
|----------|-------------|--------|
| `GRADLE_CONVENTIONS_TIMEOUT` | Request timeout in seconds | `30` |
| `GRADLE_CONVENTIONS_RETRIES` | Number of retry attempts | `3` |
| `GRADLE_CONVENTIONS_LOG_LEVEL` | Log verbosity (debug, info, warn, error) | `info` |

## Contributing

Contributions are welcome! Please read the [contributing guidelines](CONTRIBUTING.md) before submitting a pull request.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'feat: add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.
