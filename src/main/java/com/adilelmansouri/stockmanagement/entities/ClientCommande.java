package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name ="client_commande")
public class ClientCommande implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_client_commande")
	private long idClientCommande;
	private String Code;
	@Temporal (TemporalType.TIMESTAMP)
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@OneToMany (mappedBy =  "idCmdCltLigne")
	private List<CommandClientLigne> cmdClientLinge;
	public long getIdClientCommande() {
		return idClientCommande;
	}
	public void setIdClientCommande(long idClientCommande) {
		this.idClientCommande = idClientCommande;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<CommandClientLigne> getCmdClientLinge() {
		return cmdClientLinge;
	}
	public void setCmdClientLinge(List<CommandClientLigne> cmdClientLinge) {
		this.cmdClientLinge = cmdClientLinge;
	}
	
}
