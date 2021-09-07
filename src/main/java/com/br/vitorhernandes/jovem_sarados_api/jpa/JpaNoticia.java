package com.br.vitorhernandes.jovem_sarados_api.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.vitorhernandes.jovem_sarados_api.model.Noticia;

public interface JpaNoticia extends JpaRepository<Noticia, Integer> {
}
