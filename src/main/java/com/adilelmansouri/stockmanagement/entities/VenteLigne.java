package com.adilelmansouri.stockmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="vente_ligne")
public class VenteLigne {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_vente_ligne")
	private long idVenteLigne;
	@ManyToOne
	@JoinColumn (name = "idVente")
	private Vente vente;
	@ManyToOne
	@JoinColumn (name = "idArticle")
	private Article article;
	public long getIdVenteLigne() {
		return idVenteLigne;
	}
	public void setIdVenteLigne(long idVenteLigne) {
		this.idVenteLigne = idVenteLigne;
	}
	public Vente getVente() {
		return vente;
	}
	public void setVente(Vente vente) {
		this.vente = vente;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
