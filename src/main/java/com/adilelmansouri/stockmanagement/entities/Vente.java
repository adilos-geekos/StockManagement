package com.adilelmansouri.stockmanagement.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name ="vente")
public class Vente {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_vente")
	private long idVente;
	private String Code;
	@Temporal (TemporalType.TIMESTAMP)
	private Date date_vente;
	@OneToMany (mappedBy ="idVenteLigne")
	private List<VenteLigne> vente_ligne;
	public long getIdVente() {
		return idVente;
	}
	public void setIdVente(long idVente) {
		this.idVente = idVente;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public Date getDate_vente() {
		return date_vente;
	}
	public void setDate_vente(Date date_vente) {
		this.date_vente = date_vente;
	}
	public List<VenteLigne> getVente_ligne() {
		return vente_ligne;
	}
	public void setVente_ligne(List<VenteLigne> vente_ligne) {
		this.vente_ligne = vente_ligne;
	}
	
}
