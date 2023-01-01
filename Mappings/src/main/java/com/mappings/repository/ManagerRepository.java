package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Integer> {

}
