package com.example.biblioteca.controller;

import com.example.biblioteca.model.libro;
import com.example.biblioteca.service.LIbroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/libros")
public class libroController {
    @Autowired
    private LIbroService libroService;

    @GetMapping()
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
