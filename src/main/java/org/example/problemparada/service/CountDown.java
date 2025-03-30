package org.example.problemparada.service;

public class CountDown {
    public void run() {
        int num = 10;
        while (num != 0) {
            System.out.println(num--);
        }
    }
}