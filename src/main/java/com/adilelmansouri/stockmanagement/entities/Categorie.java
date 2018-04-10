package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name ="categorie")
public class Categorie implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_categorie")
	private long idCategorie;
	private String code_categorie;
	private String designation;
	// une catégorie contient zéro ou plusieurs articles (List)
	@OneToMany(mappedBy = "Categorie_MP")
	private List<Article> articles;
	public long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getCode_categorie() {
		return code_categorie;
	}
	public void setCode_categorie(String code_categorie) {
		this.code_categorie = code_categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
}
