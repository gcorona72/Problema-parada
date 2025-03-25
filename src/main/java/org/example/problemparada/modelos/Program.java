package org.example.problemparada.modelos;

/**
 * Interfaz base para todos los Programas.
 * @param <T> tipo de dato que procesa el programa (Integer o String en este caso).
 */
public interface Program<T> {
    void execute(T input);
    String getName();
    boolean willHalt();
}
