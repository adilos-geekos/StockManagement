package com.adilelmansouri.stockmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="cmd_clt_ligne")
public class CommandClientLigne {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_cmd_clt_ligne")
	private long idCmdCltLigne;
}
