package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name ="cmd_frss_ligne")
public class CommandFournisseurLigne implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_Cmd_F_Ligne")
	private long idmdFsLigne;
	@ManyToOne
	@JoinColumn(name="idFourniss")
	private FournisseurCommande fourniss_cmd;
	@ManyToOne
	@JoinColumn (name = "idArticle")
	private Article article;
	public long getIdmdFsLigne() {
		return idmdFsLigne;
	}
	public void setIdmdFsLigne(long idmdFsLigne) {
		this.idmdFsLigne = idmdFsLigne;
	}
	public FournisseurCommande getFourniss_cmd() {
		return fourniss_cmd;
	}
	public void setFourniss_cmd(FournisseurCommande fourniss_cmd) {
		this.fourniss_cmd = fourniss_cmd;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
