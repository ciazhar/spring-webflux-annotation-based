package com.example.springwebfluxannotationbased.controller;

import com.example.springwebfluxannotationbased.model.Person;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ciazhar on 11/7/17.
 * <p>
 * [ Documentation Here ]
 */

@RestController
public class SimpleController {

    List<Person> list = new  ArrayList<>();

    @GetMapping("/halo")
    public Mono<String> halo(){
        return Mono.just("Halo");
    }

    @GetMapping("/param")
    public Mono<String> param(@RequestParam String name){
        return Mono.just("Halo "+name);
    }

    @GetMapping("/path/{nama}")
    public Mono<String> path(@PathVariable String name){
        return Mono.just("Halo "+name);
    }

    @PostMapping("/add")
    public Mono<Person> add(@RequestBody Person p){
        Person person = Person.builder().name(p.getName()).joinedDate(new Date()).build();
        list.add(person);
        return Mono.just(person);
    }

    @GetMapping("/all")
    public Mono<List<Person>> all(){
        return Mono.just(list);
    }

}
