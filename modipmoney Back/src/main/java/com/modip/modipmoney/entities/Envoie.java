package com.modip.modipmoney.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Envoie {
	@Id
	@Column(length= 11)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 8)
	private int montant;
	
	@Column(length = 10)
	private String date;
	
	@ManyToOne
	@JoinColumn(name= "emetteur_id")
	private Emetteur emetteur = new Emetteur();
	
	@ManyToOne
	@JoinColumn(name="recepteur_id")
	private Recepteur recepteur = new Recepteur();

	public Envoie() {
		super();
	}

	public Envoie(int id, int montant, String date, Emetteur emetteur, Recepteur recepteur) {
		super();
		this.id = id;
		this.montant = montant;
		this.date = date;
		this.emetteur = emetteur;
		this.recepteur = recepteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Emetteur getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(Emetteur emetteur) {
		this.emetteur = emetteur;
	}

	public Recepteur getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(Recepteur recepteur) {
		this.recepteur = recepteur;
	}
	

}
