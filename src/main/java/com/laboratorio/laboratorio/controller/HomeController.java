package com.laboratorio.laboratorio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    /**
     * Este es el cambio para el develop
     * @return
     */
    @RequestMapping(value = "/")
    public String getHomePage() {
        return "Hola";
    }
}
