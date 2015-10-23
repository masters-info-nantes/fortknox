package com.mia.banque.model.impl;

import java.util.List;

import java.util.ArrayList;

import com.mia.banque.model.IBanque;


public class Banque implements com.mia.banque.model.IBanque {
	public List<com.mia.banque.model.IClient> getClients();
	
	public void setClients(List<com.mia.banque.model.IClient> newValue);
	

}
