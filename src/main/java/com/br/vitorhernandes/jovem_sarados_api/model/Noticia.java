package com.br.vitorhernandes.jovem_sarados_api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(indexes = @Index(name = "idx_titulo", columnList = "titulo", unique = true))
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codNoticia;
	@Column(name = "titulo", columnDefinition = "varchar(50)")
	private String titulo;
	@Column(name = "dataPublicacao", columnDefinition = "datetime")
	private Date dataPublicacao;
	@Column(name = "dataCadastro", columnDefinition = "datetime")
	private Date dataCadastro;
	@Column(name = "descricao", columnDefinition = "text")
	private String descricao;

	public int getCodNoticia() {
		return codNoticia;
	}

	public void setCodNoticia(int codNoticia) {
		this.codNoticia = codNoticia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Noticia() {
		super();
	}
}
