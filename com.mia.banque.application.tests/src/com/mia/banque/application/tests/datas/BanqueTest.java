package com.mia.banque.application.tests.datas;

import java.util.ArrayList;

import com.mia.banque.model.IClient;
import com.mia.banque.model.ICompte;
import com.mia.banque.model.IOperation;
import com.mia.banque.model.impl.Banque;
import com.mia.banque.model.impl.Client;
import com.mia.banque.model.impl.Compte;
import com.mia.banque.model.impl.Operation;

public class BanqueTest {

	public static Banque createTestBanque() {
		
	    Compte compte;

	    Banque banque = new Banque();

	    Client client1 = new Client();
	    client1.setNom("Dupont");
	    client1.setPrenom("Jean");
	    client1.setAdresse("Paris");
	    Client client2 = new Client();
	    client2.setNom("Durant");
	    client2.setPrenom("Pierre");
	    client2.setAdresse("Lyon");

	    banque.getClients().add(client1);
	    banque.getClients().add(client2);

	    // Client 1

	    compte = new Compte();
	    compte.setNumero("123456");
	    
	    client1.getComptes().add(compte);
	    
    	Operation credit = new Operation();
    	credit.setMontant("1000");
    	credit.setNumero("Salaire");
    	
    	Operation debit1 = new Operation();
    	debit1.setMontant("-100");
    	debit1.setNumero("Téléphone");

    	Operation debit2 = new Operation();
    	debit2.setMontant("-400");
    	debit2.setNumero("Loyer");
    	
    	compte.getOperations().add(credit);
    	compte.getOperations().add(debit1);
    	compte.getOperations().add(debit2);


	    // Client 2
	    
	    compte = new Compte();
	    compte.setNumero("789123");
	    
	    client2.getComptes().add(compte);
	    
    	credit = new Operation();
    	credit.setMontant("400");
    	credit.setNumero("Loto");
    	
    	debit1 = new Operation();
    	debit1.setMontant("-300");
    	debit1.setNumero("Electricité");

    	compte.getOperations().add(credit);
    	compte.getOperations().add(debit1);


	    return banque;
	}
}
