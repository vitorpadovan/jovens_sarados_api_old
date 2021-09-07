package com.br.vitorhernandes.jovem_sarados_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.vitorhernandes.jovem_sarados_api.jpa.JpaNoticia;
import com.br.vitorhernandes.jovem_sarados_api.model.Noticia;

@Service
public class NoticiaService {

	@Autowired
	JpaNoticia repo;

	public List<Noticia> getTodasNoticias() {
		// TODO implementar todas as notícias
		return repo.findAll();
	}

	public List<Noticia> getNoticiasPublicadas() {
		// TODO implementar apenas notícias publicadas
		return repo.findAll();
	}
}
