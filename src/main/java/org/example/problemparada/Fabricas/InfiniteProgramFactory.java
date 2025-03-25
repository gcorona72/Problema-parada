package org.example.problemparada.Fabricas;

import org.example.problemparada.modelos.Program;
import org.example.problemparada.productos.AscendingCounterProgram;
import org.example.problemparada.productos.RepeatStringProgram;

/**
 * Fábrica concreta que produce programas infinitos.
 */
public class InfiniteProgramFactory implements ProgramFactory {

    @Override
    public Program<Integer> createCounterProgram() {
        // Contador ascendente (nunca se detiene)
        return new AscendingCounterProgram(1);
    }

    @Override
    public Program<String> createStringProgram() {
        // Programa que repite cadenas infinitamente
        return new RepeatStringProgram("infinite");
    }
}
