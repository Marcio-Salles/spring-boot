package com.example.exerciciosb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @RequestMapping
    public String Ola(){
        return "Ola Spring boot!";
    }
}
