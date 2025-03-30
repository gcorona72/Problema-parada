package org.example.problemparada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Reverser {

    @Autowired
    private HaltChecker haltChecker;

    public void execute(String programName) {
        boolean halts = haltChecker.halts(programName);
        if (halts) {
            while (true) {
                System.out.println("Reverser en bucle porque " + programName + " se detiene.");
            }
        } else {
            System.out.println("Reverser finaliza porque " + programName + " no se detiene.");
        }
    }
}