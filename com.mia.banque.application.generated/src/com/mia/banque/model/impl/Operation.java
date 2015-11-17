package com.mia.banque.model.impl;




public class Operation implements com.mia.banque.model.IOperation {

	// Class attributes
	private String Numero;
	private String Montant;



	// Getters and setters
	public String getNumero() {
		return this.Numero;
	}
	
	public void setNumero(String newValue) {
		this.Numero = newValue;
	}
	public String getMontant() {
		return this.Montant;
	}
	
	public void setMontant(String newValue) {
		this.Montant = newValue;
	}


}
