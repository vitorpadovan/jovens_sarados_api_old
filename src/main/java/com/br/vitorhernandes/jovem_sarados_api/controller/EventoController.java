package com.br.vitorhernandes.jovem_sarados_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.vitorhernandes.jovem_sarados_api.model.Evento;
import com.br.vitorhernandes.jovem_sarados_api.service.EventoService;

@RestController
@RequestMapping("/api/evento")
public class EventoController {

	@Autowired
	private EventoService servico;


	@GetMapping
	public List<Evento> getEventosAtivos() {
		return servico.getEventosAtivos();
	}
}
