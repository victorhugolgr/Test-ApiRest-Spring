package com.algaworks.socialbooks;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.algaworks.socialbooks.domain.Livro;
import com.algaworks.socialbooks.services.LivrosService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SocialbooksapiApplicationTests {

	@Autowired
	private LivrosService livrosService;
	
	@Test
	public void contextLoads() {
		Livro livro = livrosService.salvar(new Livro("GIT Passo-a-passo"));
		assertNotNull(livro.getId());
	}

}
