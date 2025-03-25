package org.example.problemparada.Modelos;

public interface HaltingPrototype<T> extends Cloneable {
    HaltingPrototype<T> clone() throws CloneNotSupportedException;
    void execute(T input);
    boolean willHalt();
    String getDescription();
}