package org.example.problemparada.productos;

import org.example.problemparada.modelos.CounterProgram;

/**
 * Contador ascendente: no se detiene nunca (bucle infinito).
 */
public class AscendingCounterProgram extends CounterProgram {

    public AscendingCounterProgram(int initialValue) {
        super(initialValue);
    }

    @Override
    public void execute(Integer input) {
        int num = (input != null) ? input : initialValue;
        while (true) {
            System.out.println(num);
            num++;
        }
    }

    @Override
    public String getName() {
        return "AscendingCounter";
    }

    @Override
    public boolean willHalt() {
        return false;
    }
}
