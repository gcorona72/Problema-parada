# Problema de la Parada

Este proyecto es una simulación del problema de la parada utilizando Spring Boot. El objetivo es demostrar cómo diferentes programas pueden o no detenerse, utilizando fábricas para crear instancias de estos programas.

## Estructura del Proyecto

### Clases Principales

1. **ProblemaDeLaParadaApplication**
   - Clase principal que inicia la aplicación Spring Boot y ejecuta la lógica de validación de los programas.
   - Valida varios prototipos de programas (`IntegerProgram` y `StringProgram`).

2. **HaltChecker**
   - Clase utilitaria que valida si los programas se detendrán o no.
   - Métodos:
     - `validatePrototype(HaltingPrototype<T> prototype, T input)`: Valida un prototipo de programa clonándolo y ejecutándolo.

### Modelos

1. **HaltingPrototype**
   - Interfaz base para todos los programas.
   - Métodos:
     - `HaltingPrototype<T> clone() throws CloneNotSupportedException`
     - `void execute(T input)`
     - `boolean willHalt()`
     - `String getDescription()`

2. **AbstractProgram**
   - Clase abstracta que implementa `HaltingPrototype`.
   - Atributos:
     - `protected T initialValue`
     - `protected String description`
   - Métodos:
     - `abstract HaltingPrototype<T> clone() throws CloneNotSupportedException`
     - `String getDescription()`

### Programas

1. **IntegerProgram**
   - Programa que trabaja con enteros.
   - Atributos:
     - `private boolean descendingCounter`
   - Métodos:
     - `execute(Integer input)`: Ejecuta un contador ascendente o descendente.
     - `willHalt()`: Retorna `true` si es un contador descendente, `false` si es ascendente.
     - `clone()`: Clona el programa.

2. **StringProgram**
   - Programa que trabaja con cadenas.
   - Atributos:
     - `private boolean willReverse`
   - Métodos:
     - `execute(String input)`: Ejecuta una operación de inversión de cadena o repetición infinita.
     - `willHalt()`: Retorna `true` si invierte la cadena, `false` si la repite indefinidamente.
     - `clone()`: Clona el programa.

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando de Maven:

```bash
mvn spring-boot:run
```

La aplicación validará los prototipos de programas y mostrará en la consola si los programas se detendrán o no.

## Requisitos

- Java 21
- Maven
- Spring Boot 3.4.4

## Enlaces de Referencia

- [Documentación oficial de Apache Maven](https://maven.apache.org/guides/index.html)
- [Guía de referencia del plugin de Spring Boot para Maven](https://docs.spring.io/spring-boot/3.4.4/maven-plugin)
- [Crear una imagen OCI](https://docs.spring.io/spring-boot/3.4.4/maven-plugin/build-image.html)

## Licencia

Este proyecto no tiene una licencia específica.

## Desarrolladores

Este proyecto no tiene desarrolladores específicos listados.

## SCM

Este proyecto no tiene información de SCM específica listada.
