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
@Table(
		indexes = { @Index(name = "unk_evento", columnList = "evento", unique = true),
				@Index(name = "unk_dta_evento", columnList = "dataEvento", unique = true) }
)
public class Evento {

	@Column(columnDefinition = "boolean")
	private Boolean ativo = true;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codEvento;

	@Column(columnDefinition = "datetime")
	private Date dataEvento;

	@Column(columnDefinition = "datetime")
	private Date dataPublicacao;

	@Column(columnDefinition = "text")
	private String detalheEvento;

	@Column(columnDefinition = "varchar(150)", length = 150)
	private String evento;

	@Column(columnDefinition = "datetime")
	private Date limiteInscricao;

	@Column(columnDefinition = "varchar(500)", length = 500)
	private String linkInscricao;

	@Column(columnDefinition = "boolean")
	private Boolean obrigatorioInscricao = false;


	public Evento() {
		super();
	}

	public Evento(
			Date dataPublicacao,
			Date dataEvento,
			String detalheEvento,
			String evento,
			Date limiteInscricao,
			String linkInscricao,
			Boolean obrigatorioInscricao,
			Boolean ativo) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.dataEvento = dataEvento;
		this.detalheEvento = detalheEvento;
		this.evento = evento;
		this.limiteInscricao = limiteInscricao;
		this.linkInscricao = linkInscricao;
		this.obrigatorioInscricao = obrigatorioInscricao;
		this.ativo = ativo;
	}

	public Evento(
			Integer codEvento,
			Date dataPublicacao,
			Date dataEvento,
			String detalheEvento,
			String evento,
			Date limiteInscricao,
			String linkInscricao,
			Boolean obrigatorioInscricao,
			Boolean ativo) {
		super();
		this.codEvento = codEvento;
		this.dataPublicacao = dataPublicacao;
		this.dataEvento = dataEvento;
		this.detalheEvento = detalheEvento;
		this.evento = evento;
		this.limiteInscricao = limiteInscricao;
		this.linkInscricao = linkInscricao;
		this.obrigatorioInscricao = obrigatorioInscricao;
		this.ativo = ativo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public Integer getCodEvento() {
		return codEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public String getDetalheEvento() {
		return detalheEvento;
	}

	public String getEvento() {
		return evento;
	}

	public Date getLimiteInscricao() {
		return limiteInscricao;
	}

	public String getLinkInscricao() {
		return linkInscricao;
	}

	public Boolean getObrigatorioInscricao() {
		return obrigatorioInscricao;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public void setCodEvento(Integer codEvento) {
		this.codEvento = codEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public void setDetalheEvento(String detalheEvento) {
		this.detalheEvento = detalheEvento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public void setLimiteInscricao(Date limiteInscricao) {
		this.limiteInscricao = limiteInscricao;
	}

	public void setLinkInscricao(String linkInscricao) {
		this.linkInscricao = linkInscricao;
	}

	public void setObrigatorioInscricao(Boolean obrigatorioInscricao) {
		this.obrigatorioInscricao = obrigatorioInscricao;
	}
}
