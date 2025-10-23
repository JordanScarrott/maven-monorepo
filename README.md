# Core Library

This is the "core" multi-module library for my team.

## Modules

*   **util-module**: For common, standalone utilities.
*   **config-module**: For shared configuration classes (e.g., optional Spring Boot auto-configurations).

## Build

This is a standard Maven project. To build it, run:

```bash
mvn clean install
```

## Usage

To use these libraries in your own Maven project, first build this project locally to install the artifacts into your local Maven repository (`~/.m2/repository`):

```bash
mvn clean install
```

Then, add the following dependencies to your `pom.xml` file.

**Note:** Replace `${revision}` with the desired version of the library.

### Util Module

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>util-module</artifactId>
    <version>${revision}</version>
</dependency>
```

### Config Module

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>config-module</artifactId>
    <version>${revision}</version>
</dependency>
```
