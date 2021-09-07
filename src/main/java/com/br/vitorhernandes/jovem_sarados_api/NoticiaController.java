package com.br.vitorhernandes.jovem_sarados_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.vitorhernandes.jovem_sarados_api.model.Noticia;
import com.br.vitorhernandes.jovem_sarados_api.service.NoticiaService;

@RestController
@RequestMapping("api/noticia")
public class NoticiaController {

	@Autowired
	NoticiaService servico;

	@GetMapping
	public List<Noticia> getNoticia() {
		return servico.getTodasNoticias();
	}
}
