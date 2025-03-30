package org.example.problemparada.service;

import org.springframework.stereotype.Service;

@Service
public class HaltChecker {

    public boolean halts(String programName) {
        switch (programName) {
            case "CountDown":
                return true;
            case "CountUp":
                return false;
            case "Reverser":
                System.out.println("Contradicción detectada en Reverser.");
                return false;
            default:
                System.out.println("HaltChecker no puede decidir.");
                return false;
        }
    }
}