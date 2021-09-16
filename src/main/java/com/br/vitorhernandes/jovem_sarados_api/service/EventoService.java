package com.br.vitorhernandes.jovem_sarados_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.vitorhernandes.jovem_sarados_api.jpa.EventoJpa;
import com.br.vitorhernandes.jovem_sarados_api.model.Evento;

@Service
public class EventoService {

	@Autowired
	private EventoJpa repo;

	public List<Evento> getEventosAtivos() {
		List<Evento> eventos;
		eventos = repo.getEventosAtivos();
		return eventos;
	}
}
