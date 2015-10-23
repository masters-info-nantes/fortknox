package com.mia.banque.ui.controler.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Group;

import com.mia.banque.ui.controler.IClientControler;
import com.mia.banque.ui.view.IClientView;
import com.mia.banque.ui.view.swt.ClientView;
import com.mia.banque.model.IClient;

public class ClientControler implements IClientControler {

	private ClientView view;
	private IClient model;

	public ClientControler(com.mia.banque.model.IClient model) {
		this.model = model;
	}


	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new ClientView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}

	public void afficherCompte() {
// Start of user code for afficherCompte
		if (this.view.CompteList.getSelection().length >0) {
			String compteSelection = this.view.CompteList.getSelection()[0];
			for (final com.mia.banque.model.ICompte aCompte : this.model.getComptes()) {
				if (aCompte.toString().equals(compteSelection)) { // TODO gerer un champ id plutôt que utiliser toString()
					CompteControler compteControler = new CompteControler(aCompte);
					compteControler.initView();
				}
			}
		}
// End of user code for afficherCompte
	}
	public void quitter() {
// Start of user code for quitter
		//On veut fermer toutes les fenêtres ouvertes
		Display.getCurrent().dispose();
// End of user code for quitter
	}

}