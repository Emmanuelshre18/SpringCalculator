package com.example.SpringCalculator.controller;


import com.example.SpringCalculator.service.SpringCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpringCalculatorController {

    @Autowired
    private SpringCalculatorService calculatorService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operator,
            Model model
    ) {

        double result = calculatorService.calculate(num1, num2, operator);

        model.addAttribute("result", result);

        return "index";
    }
}
