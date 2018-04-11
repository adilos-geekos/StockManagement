package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name ="fournisseur")
public class Fournisseur extends Personne implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_fournisseur")
	private long idFourniss;
	private String position = "fournisseur";
	@OneToMany(mappedBy = "idFournissCmd")
	private List<FournisseurCommande> fourss_cmd;
	public long getIdFourniss() {
		return idFourniss;
	}
	public List<FournisseurCommande> getFourss_cmd() {
		return fourss_cmd;
	}
	public void setFourss_cmd(List<FournisseurCommande> fourss_cmd) {
		this.fourss_cmd = fourss_cmd;
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
