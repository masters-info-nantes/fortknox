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

import com.mia.banque.ui.controler.IBanqueControler;
import com.mia.banque.ui.view.IBanqueView;
import com.mia.banque.ui.view.swt.BanqueView;
import com.mia.banque.model.IBanque;

public class BanqueControler implements IBanqueControler {

	private BanqueView view;
	private IBanque model;

	public BanqueControler(com.mia.banque.model.IBanque model) {
		this.model = model;
	}


	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new BanqueView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}

	public void afficherClient() {
// Start of user code for afficherClient
		if (this.view.ClientList.getSelection().length >0) {
			String clientSelection = this.view.ClientList.getSelection()[0];
			for (final com.mia.banque.model.IClient aClient : this.model.getClients()) {
				if (aClient.toString().equals(clientSelection)) { // TODO gerer un champ id plutôt que utiliser toString()
					ClientControler clientControler = new ClientControler(aClient);
					clientControler.initView();
				}
			}
		}
// End of user code for afficherClient
	}
	public void quitter() {
// Start of user code for quitter
		//On veut fermer toutes les fenêtres ouvertes
		Display.getCurrent().dispose();
// End of user code for quitter
	}

}