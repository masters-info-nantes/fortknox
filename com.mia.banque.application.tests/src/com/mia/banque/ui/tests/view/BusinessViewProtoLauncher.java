package com.mia.banque.ui.tests.view;

import com.mia.banque.application.tests.datas.BanqueTest;
import com.mia.banque.model.impl.Banque;
import com.mia.banque.ui.controler.swt.BanqueControler;


public class BusinessViewProtoLauncher {

	public static void main(String[] args) {
		Banque banqueTest = BanqueTest.createTestBanque();
		BanqueControler banqueControler = new BanqueControler(banqueTest);
		banqueControler.initView();
	}

}
