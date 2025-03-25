package org.example.problemparada.maquinas;

import org.example.problemparada.Modelos.AbstractProgram;
import org.example.problemparada.Modelos.HaltingPrototype;

public class IntegerProgram extends AbstractProgram<Integer> {
    private boolean descendingCounter;

    public IntegerProgram(Integer initialValue, boolean descendingCounter) {
        super(initialValue,
                descendingCounter ? "Descending Counter" : "Ascending Counter");
        this.descendingCounter = descendingCounter;
    }

    @Override
    public void execute(Integer input) {
        int num = input != null ? input : initialValue;
        if (descendingCounter) {
            while (num > 0) {
                System.out.println(num);
                num--;
            }
        } else {
            while (true) {
                System.out.println(num);
                num++;
            }
        }
    }

    @Override
    public boolean willHalt() {
        return descendingCounter;
    }

    @Override
    public HaltingPrototype<Integer> clone() throws CloneNotSupportedException {
        return (HaltingPrototype<Integer>) super.clone();
    }
}
