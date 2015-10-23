package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.IOperation;

public class Operation implements com.mia.banque.model.IOperation {
	private String Numero;
	private String Montant;

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