package com.abuuaasiyah.jugtours.model;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface UserRepository extends JpaRepository<User,Id>{

    User findByName(String name);
}
