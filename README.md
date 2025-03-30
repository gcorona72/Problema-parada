# 🧠 Problema de la Parada

Este proyecto es una **simulación conceptual** del famoso problema de la parada, propuesto por Alan Turing en 1936. Está desarrollado en Java usando **Spring Boot** y **Maven**, y se organiza por ramas aplicando distintos patrones de diseño: `builder`, `factoría abstracta`, `prototype`, entre otros.

---

## 🎯 Objetivo

Demostrar que no existe un algoritmo general capaz de determinar si **cualquier programa** se detendrá o se ejecutará indefinidamente. Se implementan varias simulaciones para ilustrar esta paradoja mediante distintos enfoques.

---

## 🧩 Ramas y enfoques implementados

### 🔨 Rama `builder`
- Implementa una estructura simple con clases:
  - `CountDown`: se detiene.
  - `CountUp`: bucle infinito.
  - `HaltChecker`: simula un verificador de parada.
  - `Reverser`: invierte la lógica del HaltChecker para provocar contradicción.
- Expone endpoints REST para probarlos fácilmente.

### 🧪 Rama `prototype`
- Basado en la interfaz `HaltingPrototype<T>`.
- Permite clonar y ejecutar programas genéricos con lógica de parada.
- Incluye versiones con enteros y cadenas (e.g., `IntegerProgram`, `StringProgram`).

### 🏭 Rama `factoría abstracta`
- Usa `ProgramFactory` para generar familias de programas:
  - `MathProgramFactory`: produce programas que sí se detienen.
  - `InfiniteProgramFactory`: produce programas que no se detienen.
- Cada programa implementa una lógica distinta (`willHalt()`).

---

## 🌐 Endpoints disponibles (builder)

- GET http://localhost:8080/sim/reverser/CountDown
- GET http://localhost:8080/sim/reverser/CountUp
- GET http://localhost:8080/sim/reverser/Reverser

---

## 🧠 Teoría aplicada

CountDown: termina.  
CountUp: bucle infinito.  
HaltChecker: pretende decidir si un programa para, pero falla con Reverser.  
Reverser: prueba por contradicción de la indecidibilidad.  
Esto refleja la paradoja de Turing, demostrando que no puede existir un HaltChecker universal para todos los programas.

## ✅ Requisitos 

Java 19 o 21  
Maven  
Spring Boot 3.2.0+  
📚 Recursos útiles

## 📄 Licencia y Autores 

Este proyecto es educativo y no tiene licencia específica.  
Desarrollado como parte del curso de Ingeniería Informática – UAX.




