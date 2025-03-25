package org.example.problemparada.maquinas;

import org.example.problemparada.Modelos.AbstractProgram;
import org.example.problemparada.Modelos.HaltingPrototype;

public class StringProgram extends AbstractProgram<String> {
    private boolean willReverse;

    public StringProgram(String initialValue, boolean willReverse) {
        super(initialValue,
              willReverse ? "String Reverser" : "Infinite String Processor");
        this.willReverse = willReverse;
    }

    @Override
    public void execute(String input) {
        String str = input != null ? input : initialValue;
        if (willReverse) {
            System.out.println("Original: " + str);
            StringBuilder reversed = new StringBuilder(str).reverse();
            System.out.println("Reversed: " + reversed);
        } else {
            while (true) {
                System.out.println(str);
                str = str + "...";
            }
        }
    }

    @Override
    public boolean willHalt() {
        return willReverse;
    }

    @Override
    public HaltingPrototype<String> clone() throws CloneNotSupportedException {
        // Create a new instance instead of calling super.clone() on an abstract method
        return new StringProgram(this.initialValue, this.willReverse);
    }
}