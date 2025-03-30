package org.example.problemparada.controller;

import org.example.problemparada.service.Reverser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sim")
public class SimController {

    @Autowired
    private Reverser reverser;

    @GetMapping("/reverser/{programName}")
    public String simulate(@PathVariable String programName) {
        if (programName.equalsIgnoreCase("CountDown") || programName.equalsIgnoreCase("CountUp") || programName.equalsIgnoreCase("Reverser")) {
            new Thread(() -> reverser.execute(programName)).start();
            return "Simulación lanzada para: " + programName;
        }
        return "Programa desconocido.";
    }
}