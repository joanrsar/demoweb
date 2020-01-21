package com.co.ware.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.ware.model.Persona;
import com.co.ware.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario,Integer> {

	 Usuario findByNombre(String nombre);
		

}
