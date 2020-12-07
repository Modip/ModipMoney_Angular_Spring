package com.modip.modipmoney.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Recepteur {
	@Id
	@Column(length = 11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30)
	private String nom;
	
	@Column(length = 30)
	private String prenom;
	
	@Column(length = 13)
	private int telephone;
	
	@Column(length = 13)
	private String cni;
	
	@Column(length = 10)
	private int numtrans;
	
	@Column(length = 10)
	private String date;

	public Recepteur() {
		super();
	}

	public Recepteur(int id, String nom, String prenom, int telephone, String cni, int numtrans, String date) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.cni = cni;
		this.numtrans = numtrans;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public int getNumtrans() {
		return numtrans;
	}

	public void setNumtrans(int numtrans) {
		this.numtrans = numtrans;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
