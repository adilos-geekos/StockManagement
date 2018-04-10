package com.adilelmansouri.stockmanagement.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String tel;
	private String client_photo;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getClient_photo() {
		return client_photo;
	}
	public void setClient_photo(String client_photo) {
		this.client_photo = client_photo;
	}
	
}
