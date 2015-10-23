package com.mia.banque.model;

import java.util.List;

public interface IBanque {

	public List<IClient> getClients();
	
	public void setClients(List<IClient> newValue);
}