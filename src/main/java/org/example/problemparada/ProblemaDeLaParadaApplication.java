package org.example.problemparada;

import org.example.problemparada.Modelos.HaltingPrototype;
import org.example.problemparada.maquinas.IntegerProgram;
import org.example.problemparada.maquinas.StringProgram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.example.problemparada.utilidades.HaltChecker.validatePrototype;

@SpringBootApplication
public class ProblemaDeLaParadaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemaDeLaParadaApplication.class, args);

        HaltingPrototype<Integer> descendingCounter =
                new IntegerProgram(10, true);
        HaltingPrototype<Integer> ascendingCounter =
                new IntegerProgram(1, false);

        HaltingPrototype<String> reverseString =
                new StringProgram("hello", true);
        HaltingPrototype<String> infiniteString =
                new StringProgram("infinite", false);

        System.out.println("Validando Descending Counter Prototype:");
        validatePrototype(descendingCounter, null);

        System.out.println("\nValidando Ascending Counter Prototype:");
        validatePrototype(ascendingCounter, null);

        System.out.println("\nValidando Reverse String Prototype:");
        validatePrototype(reverseString, null);

        System.out.println("\nValidando Infinite String Prototype:");
        validatePrototype(infiniteString, null);
    }
}