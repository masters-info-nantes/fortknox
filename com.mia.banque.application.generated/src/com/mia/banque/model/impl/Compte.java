package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Compte implements com.mia.banque.model.ICompte {

	// Class attributes
	private String Numero;

	private List<com.mia.banque.model.IOperation> listOperations;


	// Getters and setters
	public String getNumero() {
		return this.Numero;
	}
	
	public void setNumero(String newValue) {
		this.Numero = newValue;
	}

	public List<com.mia.banque.model.IOperation> getListOperations() {
		if (this.listOperations == null) {
			this.listOperations= new ArrayList<com.mia.banque.model.IOperation>();
		}
		return this.listOperations;
	}
		
	public void setListOperations(List<com.mia.banque.model.IOperation> newValue) {
		this.listOperations = newValue;
	}

}
