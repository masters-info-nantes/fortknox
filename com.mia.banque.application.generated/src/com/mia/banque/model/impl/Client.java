package com.mia.banque.model.impl;

import java.util.List;

import java.util.ArrayList;

import com.mia.banque.model.IClient;


public class Client implements com.mia.banque.model.IClient {
	public List<com.mia.banque.model.ICompte> getComptes();
	
	public void setComptes(List<com.mia.banque.model.ICompte> newValue);
	

}
