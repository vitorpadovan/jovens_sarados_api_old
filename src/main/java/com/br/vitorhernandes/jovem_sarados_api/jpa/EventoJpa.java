package com.br.vitorhernandes.jovem_sarados_api.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.vitorhernandes.jovem_sarados_api.model.Evento;

@Repository
public interface EventoJpa extends JpaRepository<Evento, Integer> {

	@Query("SELECT e FROM Evento e WHERE e.ativo = true")
	public List<Evento> getEventosAtivos();

	public Evento findByCodEvento(Integer codEvento);
}
