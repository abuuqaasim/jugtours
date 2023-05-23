package com.abuuaasiyah.jugtours.controller;


import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abuuaasiyah.jugtours.model.Group;
import com.abuuaasiyah.jugtours.model.GroupRepository;

@RestController
@RequestMapping
public class GroupController {

    private final GroupRepository group_Repository;
    private final Logger log = LoggerFactory.getLogger(GroupController.class);

    public GroupController(GroupRepository group_Repository) {
        this.group_Repository = group_Repository;
    }

    @GetMapping("/groups")
    Collection<Group> getAllGroups(){
        return this.group_Repository.findAll();
    }


    
    



    
}
