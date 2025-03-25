package org.example.problemparada.utilidades;

import org.example.problemparada.Fabricas.ProgramFactory;
import org.example.problemparada.modelos.Program;

/**
 * Simula un "HaltChecker" para decidir si un programa se detiene o no.
 * En la práctica, esto es indecidible, pero aquí lo simulamos con ejemplos concretos.
 */
public class HaltChecker {

    public static void validateFactory(ProgramFactory factory) {
        Program<Integer> intProgram = factory.createCounterProgram();
        Program<String> stringProgram = factory.createStringProgram();

        System.out.println("Integer Program: " + intProgram.getName() +
                " | Will Halt: " + intProgram.willHalt());
        System.out.println("String Program: " + stringProgram.getName() +
                " | Will Halt: " + stringProgram.willHalt());
    }
}
