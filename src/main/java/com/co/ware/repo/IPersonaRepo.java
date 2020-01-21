package com.co.ware.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.ware.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona,Integer> {

}
