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

import com.mia.banque.ui.controler.IOperationControler;
import com.mia.banque.ui.view.IOperationView;
import com.mia.banque.model.IOperation;

public class OperationView extends Shell implements IOperationView {
	
	private IOperationControler controler;
	private IOperation model;

	private Button btnquitter;


	/**
	 * Create the shell.
	 * @param display
	 */
	public OperationView(Display display, com.mia.banque.model.IOperation model, IOperationControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}

	public void quitter() {
		this.controler.quitter();
	}

	private void createContents(){
		setText("Vue Operation");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));

		Label lblNumero = new Label(this, SWT.NONE);
		lblNumero.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblNumero.setText("Numero");

		Text NumeroField = new Text(this, SWT.BORDER);
		NumeroField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		NumeroField.setText(this.model.getNumero());


		Label lblMontant = new Label(this, SWT.NONE);
		lblMontant.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblMontant.setText("Montant");

		Text MontantField = new Text(this, SWT.BORDER);
		MontantField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		MontantField.setText(this.model.getMontant());




		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
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