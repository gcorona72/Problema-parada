# Problema de la Parada

Este proyecto es una simulación del problema de la parada utilizando Spring Boot. El objetivo es demostrar cómo diferentes programas pueden o no detenerse, utilizando fábricas para crear instancias de estos programas.

## Estructura del Proyecto

### Clases Principales

1. **ProblemaDeLaParadaApplication**
   - Clase principal que inicia la aplicación Spring Boot y ejecuta la lógica de validación de los programas.
   - Valida dos fábricas de programas: `MathProgramFactory` y `InfiniteProgramFactory`.

2. **HaltChecker**
   - Clase utilitaria que valida si los programas creados por una fábrica se detendrán o no.
   - Métodos:
     - `validateFactory(ProgramFactory factory)`: Valida los programas de enteros y cadenas creados por la fábrica.

### Fábricas

1. **ProgramFactory**
   - Interfaz que define métodos para crear programas de enteros y de cadenas.
   - Métodos:
     - `Program<Integer> createCounterProgram()`
     - `Program<String> createStringProgram()`

2. **MathProgramFactory**
   - Fábrica concreta que produce programas que se detienen.
   - Métodos:
     - `createCounterProgram()`: Crea un `DescendingCounterProgram`.
     - `createStringProgram()`: Crea un `ReverseStringProgram`.

3. **InfiniteProgramFactory**
   - Fábrica concreta que produce programas infinitos.
   - Métodos:
     - `createCounterProgram()`: Crea un `AscendingCounterProgram`.
     - `createStringProgram()`: Crea un `RepeatStringProgram`.

### Modelos

1. **Program**
   - Interfaz base para todos los programas.
   - Métodos:
     - `void execute(T input)`
     - `String getName()`
     - `boolean willHalt()`

2. **CounterProgram**
   - Clase abstracta base para programas que trabajan con enteros (contadores).
   - Atributos:
     - `protected int initialValue`

3. **StringProgram**
   - Clase abstracta base para programas que trabajan con cadenas.
   - Atributos:
     - `protected String initialString`

### Productos

1. **AscendingCounterProgram**
   - Contador ascendente que nunca se detiene.
   - Métodos:
     - `execute(Integer input)`: Imprime números ascendentes indefinidamente.
     - `getName()`: Retorna "AscendingCounter".
     - `willHalt()`: Retorna `false`.

2. **DescendingCounterProgram**
   - Contador descendente que se detiene al llegar a 0.
   - Métodos:
     - `execute(Integer input)`: Imprime números descendentes hasta llegar a 0.
     - `getName()`: Retorna "DescendingCounter".
     - `willHalt()`: Retorna `true`.

3. **RepeatStringProgram**
   - Programa que repite una cadena indefinidamente.
   - Métodos:
     - `execute(String input)`: Imprime la cadena indefinidamente.
     - `getName()`: Retorna "RepeatString".
     - `willHalt()`: Retorna `false`.

4. **ReverseStringProgram**
   - Programa que invierte una cadena y se detiene.
   - Métodos:
     - `execute(String input)`: Imprime la cadena invertida.
     - `getName()`: Retorna "ReverseString".
     - `willHalt()`: Retorna `true`.

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando de Maven:

```bash
mvn spring-boot:run
```

La aplicación validará las fábricas de programas y mostrará en la consola si los programas se detendrán o no.

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
