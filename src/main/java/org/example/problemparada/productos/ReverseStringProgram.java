package org.example.problemparada.productos;

import org.example.problemparada.modelos.StringProgram;

/**
 * Programa que invierte la cadena y se detiene tras hacerlo una sola vez.
 */
public class ReverseStringProgram extends StringProgram {

    public ReverseStringProgram(String initialString) {
        super(initialString);
    }

    @Override
    public void execute(String input) {
        String str = (input != null) ? input : initialString;
        System.out.println(new StringBuilder(str).reverse());
    }

    @Override
    public String getName() {
        return "ReverseString";
    }

    @Override
    public boolean willHalt() {
        return true;
    }
}
