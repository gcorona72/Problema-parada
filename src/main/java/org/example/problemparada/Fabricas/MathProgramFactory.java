package org.example.problemparada.Fabricas;

import org.example.problemparada.Fabricas.ProgramFactory;
import org.example.problemparada.modelos.Program;
import org.example.problemparada.productos.DescendingCounterProgram;
import org.example.problemparada.productos.ReverseStringProgram;

/**
 * Fábrica concreta que produce programas que sí se detienen.
 */
public class MathProgramFactory implements ProgramFactory {

    @Override
    public Program<Integer> createCounterProgram() {
        // Contador descendente (se detiene al llegar a 0)
        return new DescendingCounterProgram(10);
    }

    @Override
    public Program<String> createStringProgram() {
        // Programa que invierte cadenas (se detiene)
        return new ReverseStringProgram("hello");
    }
}
