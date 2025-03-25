package org.example.problemparada.utilidades;

import org.example.problemparada.Modelos.HaltingPrototype;

public class HaltChecker {
    public static <T> void validatePrototype(HaltingPrototype<T> prototype, T input) {
        try {
            HaltingPrototype<T> clonedPrototype = prototype.clone();

            System.out.println("Original Prototype: " + prototype.getDescription());
            System.out.println("Will Halt: " + prototype.willHalt());

            System.out.println("\nCloned Prototype: " + clonedPrototype.getDescription());
            System.out.println("Will Halt: " + clonedPrototype.willHalt());

            System.out.println("\nExecuting Cloned Prototype:");
            clonedPrototype.execute(input);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
