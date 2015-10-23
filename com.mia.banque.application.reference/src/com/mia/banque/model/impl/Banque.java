package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.IBanque;

public class Banque implements com.mia.banque.model.IBanque {


	private List<com.mia.banque.model.IClient> listClient;

	public List<com.mia.banque.model.IClient> getClients() {
		if (this.listClient == null) {
			this.listClient = new ArrayList<com.mia.banque.model.IClient>();
		}
		return this.listClient;
	}
	
	public void setClients(List<com.mia.banque.model.IClient> newValue) {
		this.listClient = newValue;
	}

}