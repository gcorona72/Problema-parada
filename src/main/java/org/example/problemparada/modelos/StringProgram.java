package org.example.problemparada.modelos;

/**
 * Clase abstracta base para programas que trabajan con cadenas.
 */
public abstract class StringProgram implements Program<String> {
    protected String initialString;

    public StringProgram(String initialString) {
        this.initialString = initialString;
    }
}
