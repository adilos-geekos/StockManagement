package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name ="fournisseur")
public class Fournisseur extends Personne implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_fournisseur")
	private long idFourniss;
	private String position = "fournisseur";
	public long getIdFourniss() {
		return idFourniss;
	}
	public void setIdFourniss(long idFourniss) {
		this.idFourniss = idFourniss;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
