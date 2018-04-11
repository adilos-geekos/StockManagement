package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;
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
@Entity
@Table (name ="fournisseur_commande")
public class FournisseurCommande implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_fourniss_cmd")
	private long idFournissCmd;
	@ManyToOne
	@JoinColumn(name = "idFourniss")
	private Fournisseur fourniss;
	@OneToMany (mappedBy="idmdFsLigne")
	private List<CommandFournisseurLigne> cmd_fou_ligne;
	public long getIdFournissCmd() {
		return idFournissCmd;
	}
	public void setIdFournissCmd(long idFournissCmd) {
		this.idFournissCmd = idFournissCmd;
	}
	public Fournisseur getFourniss() {
		return fourniss;
	}
	public void setFourniss(Fournisseur fourniss) {
		this.fourniss = fourniss;
	}
	public List<CommandFournisseurLigne> getCmd_fou_ligne() {
		return cmd_fou_ligne;
	}
	public void setCmd_fou_ligne(List<CommandFournisseurLigne> cmd_fou_ligne) {
		this.cmd_fou_ligne = cmd_fou_ligne;
	}
	
}
