package com.co.ware;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.co.ware.model.Usuario;
import com.co.ware.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebApplicationTests {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setNombre("Joan");
		usuario.setClave(encoder.encode("12345"));
		Usuario retorno = repo.save(usuario);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(usuario.getClave()));
	}

}
