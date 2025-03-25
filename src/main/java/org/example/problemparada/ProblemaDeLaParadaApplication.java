package org.example.problemparada;

import org.example.problemparada.Fabricas.MathProgramFactory;
import org.example.problemparada.Fabricas.InfiniteProgramFactory;
import org.example.problemparada.utilidades.HaltChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProblemaDeLaParadaApplication {

    public static void main(String[] args) {
        // Inicia la aplicación Spring Boot
        SpringApplication.run(ProblemaDeLaParadaApplication.class, args);

        // Ejecuta la lógica de validación
        System.out.println("Validando Fábrica de Matemáticas:");
        HaltChecker.validateFactory(new MathProgramFactory());

        System.out.println("\nValidando Fábrica de Programas Infinitos:");
        HaltChecker.validateFactory(new InfiniteProgramFactory());
    }
}