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

import com.mia.banque.ui.controler.ICompteControler;
import com.mia.banque.ui.view.ICompteView;
import com.mia.banque.ui.view.swt.CompteView;
import com.mia.banque.model.ICompte;

public class CompteControler implements ICompteControler {

	private CompteView view;
	private ICompte model;

	public CompteControler(com.mia.banque.model.ICompte model) {
		this.model = model;
	}


	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new CompteView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}

	public void afficherOperation() {
// Start of user code for afficherOperation
		if (this.view.OperationList.getSelection().length >0) {
			String compteSelection = this.view.OperationList.getSelection()[0];
			for (final com.mia.banque.model.IOperation aOp : this.model.getOperations()) {
				if (aOp.toString().equals(compteSelection)) { // TODO gerer un champ id plutôt que utiliser toString()
					OperationControler opeControler = new OperationControler(aOp);
					opeControler.initView();
				}
			}
		}
// End of user code for afficherOperation
	}
	public void quitter() {
// Start of user code for quitter
		//On veut fermer toutes les fenêtres ouvertes
		Display.getCurrent().dispose();
// End of user code for quitter
	}

}