package org.example.problemparada.productos;

import org.example.problemparada.modelos.StringProgram;

/**
 * Programa que repite la cadena indefinidamente (bucle infinito).
 */
public class RepeatStringProgram extends StringProgram {

    public RepeatStringProgram(String initialString) {
        super(initialString);
    }

    @Override
    public void execute(String input) {
        String str = (input != null) ? input : initialString;
        while (true) {
            System.out.println(str);
        }
    }

    @Override
    public String getName() {
        return "RepeatString";
    }

    @Override
    public boolean willHalt() {
        return false;
    }
}
