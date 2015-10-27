package com.mia.banque.model;

import java.util.List;

public interface IClient {
	public String getNom();
	public void setNom(String newValue);
	public String getPrenom();
	public void setPrenom(String newValue);
	public String getAdresse();
	public void setAdresse(String newValue);

	public List<com.mia.banque.model.ICompte> getListComptes();
	public void setListComptes(List<com.mia.banque.model.ICompte> newValue);

}