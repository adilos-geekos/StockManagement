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
@Table (name ="client")
public class Client extends Personne implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_client")
	private long idClient;
	private String position = "client";
	@OneToMany (mappedBy = "idClientCommande")
	private List<ClientCommande> client_commandes;
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<ClientCommande> getClient_commandes() {
		return client_commandes;
	}
	public void setClient_commandes(List<ClientCommande> client_commandes) {
		this.client_commandes = client_commandes;
	}
	

}
