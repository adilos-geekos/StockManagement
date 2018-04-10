package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="article")
public class Article implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_article")
	private long idArticle;
	private String code_article;
	private BigDecimal prix_unitaire_ht;
	private BigDecimal taux_tva;
	private BigDecimal prix_unitaire_ttc;
	private String article_photo;
	private String designation;
	// chaque ARTICLE appartient à une seule catégorie Categorie
	@ManyToOne
	@JoinColumn (name ="idCategorie")
	private Categorie Categorie_MP;
	public long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}
	public String getCode_article() {
		return code_article;
	}
	public void setCode_article(String code_article) {
		this.code_article = code_article;
	}
	public BigDecimal getPrix_unitaire_ht() {
		return prix_unitaire_ht;
	}
	public void setPrix_unitaire_ht(BigDecimal prix_unitaire_ht) {
		this.prix_unitaire_ht = prix_unitaire_ht;
	}
	public BigDecimal getTaux_tva() {
		return taux_tva;
	}
	public void setTaux_tva(BigDecimal taux_tva) {
		this.taux_tva = taux_tva;
	}
	public BigDecimal getPrix_unitaire_ttc() {
		return prix_unitaire_ttc;
	}
	public void setPrix_unitaire_ttc(BigDecimal prix_unitaire_ttc) {
		this.prix_unitaire_ttc = prix_unitaire_ttc;
	}
	public String getArticle_photo() {
		return article_photo;
	}
	public void setArticle_photo(String article_photo) {
		this.article_photo = article_photo;
	}
	public Categorie getCategorie_MP() {
		return Categorie_MP;
	}
	public void setCategorie(Categorie categorie) {
		Categorie_MP = categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
