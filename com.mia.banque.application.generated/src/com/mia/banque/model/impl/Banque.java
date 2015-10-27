package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Banque implements com.mia.banque.model.IBanque {

	// Class attributes

	private List<com.mia.banque.model.IClient> listClients;


	// Getters and setters

	public List<com.mia.banque.model.IClient> getListClients() {
		if (this.listClients == null) {
			this.listClients= new ArrayList<com.mia.banque.model.IClient>();
		}
		return this.listClients;
	}
		
	public void setListClients(List<com.mia.banque.model.IClient> newValue) {
		this.listClients = newValue;
	}

}
