package com.adilelmansouri.stockmanagement.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table (name ="mov_stock")
public class MovStock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id_mov_stock")
	private long idMovStock;
	@Temporal (TemporalType.TIMESTAMP)
	private Date date;
	private BigDecimal qte;
	private int mov_type;
	@ManyToOne
	@JoinColumn (name ="idArticle")
	private Article article;
	public long getIdMovStock() {
		return idMovStock;
	}
	public void setIdMovStock(long idMovStock) {
		this.idMovStock = idMovStock;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getQte() {
		return qte;
	}
	public void setQte(BigDecimal qte) {
		this.qte = qte;
	}
	public int getMov_type() {
		return mov_type;
	}
	public void setMov_type(int mov_type) {
		this.mov_type = mov_type;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
