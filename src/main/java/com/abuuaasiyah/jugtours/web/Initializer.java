package com.abuuaasiyah.jugtours.web;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;

import com.abuuaasiyah.jugtours.model.Event;
import com.abuuaasiyah.jugtours.model.Group;
import com.abuuaasiyah.jugtours.model.GroupRepository;

public class Initializer implements CommandLineRunner {
    private final GroupRepository group_repo;

    public Initializer(GroupRepository group_repo) {
        this.group_repo = group_repo;
    }

    public void run(String ...strings){
        Stream.of("Omaha JUG", "Kansas City JUG", "Chicago JUG",
        "Dallas JUG", "Philly JUG", "Garden State JUG", "NY Java SIG")
        .forEach(name -> group_repo.save(new Group(name)));

        Group jug = group_repo.findByName("Garden State JUG");
        Event event = new Event(Instant.parse("2023-10-18T18:00:00.000Z"),
        "OAuth for Java Developers", "Learn all about OAuth and OIDC + Java!");

        jug.setEvents(Collections.singleton(event));
        group_repo.save(jug);

        group_repo.save(jug);
        group_repo.findAll().forEach(System.out::println);
    }
    
}
