package com.vilniuscoding.nuomospunktas;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Sveiki atvyke i nuomos punkta");
		System.out.println("Noresite 1----Isnuomoti  ar  2----Atiduoti");
		int meniuPasirinkimas = ScannerioKlase.getNumber();

		switch (meniuPasirinkimas) {
		case 1:
			InventoriausSpausdinimas.meniu();

			Klientas klientas = new Klientas();
			klientas.klientoDuomenys();

			KlientuDB.idetiKlientoDuomenisDB(klientas.getKlientoAsmensKodas(), klientas.getKlientoVardas(),
					klientas.getKlientoPavarde(), klientas.getKlientoTelefonoNumeris());

			Controller.main(args);

			break;
		case 2:
			GrazinimoTikrinimas.Tikrinimas();
			break;
		default:
			break;
		}

	}

}
