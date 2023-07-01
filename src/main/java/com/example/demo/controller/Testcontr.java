package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/")
public class Testcontr {

    @GetMapping

    public List<String > getStrings(){
        List<String > a=new ArrayList<>();
        a.add("MAnoj");
        a.add("harsh");
        return a;
    }
}
