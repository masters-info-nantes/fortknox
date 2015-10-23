package com.mia.banque.ui.view.swt;

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
import com.mia.banque.model.IClient;

public class ClientView extends Shell implements IClientView {
	
	private IClientControler controler;
	private IClient model;

	private Button btnafficherCompte;
	private Button btnquitter;
	public List CompteList;


	/**
	 * Create the shell.
	 * @param display
	 */
	public ClientView(Display display, com.mia.banque.model.IClient model, IClientControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}

	public void afficherCompte() {
		this.controler.afficherCompte();
	}
	public void quitter() {
		this.controler.quitter();
	}

	private void createContents(){
		setText("Vue Client");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));

		Label lblNom = new Label(this, SWT.NONE);
		lblNom.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblNom.setText("Nom");

		Text NomField = new Text(this, SWT.BORDER);
		NomField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		NomField.setText(this.model.getNom());


		Label lblPrenom = new Label(this, SWT.NONE);
		lblPrenom.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblPrenom.setText("Prenom");

		Text PrenomField = new Text(this, SWT.BORDER);
		PrenomField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		PrenomField.setText(this.model.getPrenom());


		Label lblAdresse = new Label(this, SWT.NONE);
		lblAdresse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblAdresse.setText("Adresse");

		Text AdresseField = new Text(this, SWT.BORDER);
		AdresseField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		AdresseField.setText(this.model.getAdresse());


		// Liste
		Group grpCompte = new Group(this, SWT.NONE);
		grpCompte.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpCompte.setText("Liste des Compte");
		grpCompte.setLayout(new GridLayout());

		this.CompteList = new List(grpCompte, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		this.CompteList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		for (final com.mia.banque.model.ICompte elt : this.model.getComptes()) {
			this.CompteList.add(elt.toString());
		}




		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		btnafficherCompte = new Button(grpButtons, SWT.NONE);
		btnafficherCompte.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		btnafficherCompte.setText("afficherCompte");
		btnafficherCompte.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          afficherCompte();
		        }
		      });
		

		btnquitter = new Button(grpButtons, SWT.NONE);
		btnquitter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		btnquitter.setText("quitter");
		btnquitter.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          quitter();
		        }
		      });
		


	}


	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}


}