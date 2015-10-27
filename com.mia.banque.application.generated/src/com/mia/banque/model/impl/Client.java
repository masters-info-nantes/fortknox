package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Client implements com.mia.banque.model.IClient {

	// Class attributes
	private String Nom;
	private String Prenom;
	private String Adresse;

	private List<com.mia.banque.model.ICompte> listComptes;


	// Getters and setters
	public String getNom() {
		return this.Nom;
	}
	
	public void setNom(String newValue) {
		this.Nom = newValue;
	}
	public String getPrenom() {
		return this.Prenom;
	}
	
	public void setPrenom(String newValue) {
		this.Prenom = newValue;
	}
	public String getAdresse() {
		return this.Adresse;
	}
	
	public void setAdresse(String newValue) {
		this.Adresse = newValue;
	}

	public List<com.mia.banque.model.ICompte> getListComptes() {
		if (this.listComptes == null) {
			this.listComptes= new ArrayList<com.mia.banque.model.ICompte>();
		}
		return this.listComptes;
	}
		
	public void setListComptes(List<com.mia.banque.model.ICompte> newValue) {
		this.listComptes = newValue;
	}

}
