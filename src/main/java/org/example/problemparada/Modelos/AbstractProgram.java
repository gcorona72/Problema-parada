package org.example.problemparada.Modelos;

public abstract class AbstractProgram<T> implements HaltingPrototype<T> {
    protected T initialValue;
    protected String description;

    public AbstractProgram(T initialValue, String description) {
        this.initialValue = initialValue;
        this.description = description;
    }

    @Override
    public abstract HaltingPrototype<T> clone() throws CloneNotSupportedException;

    @Override
    public String getDescription() {
        return description;
    }
}