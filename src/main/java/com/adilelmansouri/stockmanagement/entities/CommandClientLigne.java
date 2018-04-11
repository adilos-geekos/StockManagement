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
@Table (name ="cmd_clt_ligne")
public class CommandClientLigne {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_cmd_clt_ligne")
	private long idCmdCltLigne;
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idClientCommande")
	private ClientCommande clt_cmd;
	public long getIdCmdCltLigne() {
		return idCmdCltLigne;
	}
	public void setIdCmdCltLigne(long idCmdCltLigne) {
		this.idCmdCltLigne = idCmdCltLigne;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public ClientCommande getClt_cmd() {
		return clt_cmd;
	}
	public void setClt_cmd(ClientCommande clt_cmd) {
		this.clt_cmd = clt_cmd;
	}
	
}
