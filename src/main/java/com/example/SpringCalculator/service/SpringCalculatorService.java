package com.example.SpringCalculator.service;

import org.springframework.stereotype.Service;

@Service
public class SpringCalculatorService {

    public double calculate(double num1, double num2, String operator) {

        switch (operator) {

            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;

            case "*":
                return num1 * num2;

            case "/":
                return num1 / num2;

            default:
                return 0;
        }
    }
}