package com.adilelmansouri.stockmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="vente_ligne")
public class VenteLigne {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_vente_ligne")
	private long idVenteLigne;
}
