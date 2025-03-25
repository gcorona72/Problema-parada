package org.example.problemparada.Fabricas;

import org.example.problemparada.modelos.Program;

/**
 * Fábrica Abstracta que define métodos para crear programas
 * de enteros (contadores) y de cadenas.
 */
public interface ProgramFactory {
    Program<Integer> createCounterProgram();
    Program<String> createStringProgram();
}
