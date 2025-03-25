package org.example.problemparada.modelos;

/**
 * Clase abstracta base para programas que trabajan con enteros (contadores).
 */
public abstract class CounterProgram implements Program<Integer> {
    protected int initialValue;

    public CounterProgram(int initialValue) {
        this.initialValue = initialValue;
    }
}
