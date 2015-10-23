package com.mia.banque.model.impl;

import java.util.List;

import java.util.ArrayList;

import com.mia.banque.model.ICompte;


public class Compte implements com.mia.banque.model.ICompte {
	public List<com.mia.banque.model.IOperation> getOperations();
	
	public void setOperations(List<com.mia.banque.model.IOperation> newValue);
	

}
