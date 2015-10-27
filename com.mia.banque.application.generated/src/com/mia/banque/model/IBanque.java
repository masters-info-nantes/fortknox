package com.mia.banque.model;

import java.util.List;

public interface IBanque {

	public List<com.mia.banque.model.IClient> getListClients();
	public void setListClients(List<com.mia.banque.model.IClient> newValue);

}