# 🧠 Problema de Parada - Rama `builder`

Este proyecto es una **simulación conceptual** del problema de parada propuesto por Alan Turing en 1936. Se desarrolla sobre la rama `builder` usando **Java 19**, **Spring Boot 3.2.0** y **Maven**.

## 📌 Objetivo

Mostrar que no existe un programa general que pueda determinar si **otro programa** se detendrá o no, usando una estructura sencilla basada en:

- `CountDown`: programa que se detiene
- `CountUp`: programa que nunca se detiene
- `HaltChecker`: simula (artificialmente) un detector de parada
- `Reverser`: programa que invierte la lógica del HaltChecker

## 📚 Teoría

- Este proyecto no resuelve el problema de parada.
- Simula su comportamiento para demostrar que es indecidible.
- Turing probó que un "HaltChecker" universal lleva a contradicciones lógicas.
- Reverser es la prueba por contradicción: se comporta de forma imposible si HaltChecker fuera perfecto.

---

## 🏗️ Estructura del proyecto

Problema-parada-builder/
│
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── problemparada/
                    ├── ProblemaDeLaParadaApplication.java
                    │
                    ├── controller/
                    │   └── SimController.java
                    │
                    └── service/
                        ├── CountDown.java
                        ├── CountUp.java
                        ├── HaltChecker.java
                        └── Reverser.java

## 🌐 Endpoints disponibles

GET http://localhost:8080/sim/reverser/CountDown
GET http://localhost:8080/sim/reverser/CountUp
GET http://localhost:8080/sim/reverser/Reverser


