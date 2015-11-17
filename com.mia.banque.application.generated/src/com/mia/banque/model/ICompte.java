package com.mia.banque.model;

import java.util.List;

public interface ICompte {
	public String getNumero();
	public void setNumero(String newValue);

	public List<IOperation> getListOperations();
	public void setListOperations(List<com.mia.banque.model.IOperation> newValue);

}