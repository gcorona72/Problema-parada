package org.example.problemparada.productos;

import org.example.problemparada.modelos.CounterProgram;

/**
 * Contador descendente: se detiene cuando llega a 0.
 */
public class DescendingCounterProgram extends CounterProgram {

    public DescendingCounterProgram(int initialValue) {
        super(initialValue);
    }

    @Override
    public void execute(Integer input) {
        int num = (input != null) ? input : initialValue;
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    @Override
    public String getName() {
        return "DescendingCounter";
    }

    @Override
    public boolean willHalt() {
        return true;
    }
}
