package com.vilniuscoding.nuomospunktas;

import java.util.Scanner;

public class Klientas {
	public long klientoAsmensKodas;
	public String klientoVardas;
	public String klientoPavarde;
	public int klientoTelefonoNumeris;

	public void klientoDuomenys() {
		
		System.out.println("Iveskite kliento varda");
		Scanner Ivedimas = new Scanner(System.in);
	    klientoVardas = Ivedimas.nextLine();
	    setKlientoVardas(klientoVardas);
	    
	    System.out.println("Iveskite kliento pavarde");
	    klientoPavarde = Ivedimas.nextLine();
	    setKlientoPavarde(klientoPavarde);
	    
	    System.out.println("Iveskite kliento telefono numeri");
	    klientoTelefonoNumeris = Ivedimas.nextInt();
	    setKlientoTelefonoNumeris(klientoTelefonoNumeris);
	    
	    System.out.println("Iveskite kliento asmens koda");
	    klientoAsmensKodas = Ivedimas.nextLong();
	    setKlientoAsmensKodas(klientoAsmensKodas);
	    
	    System.out.println("Vardas -- " + klientoVardas);
	    System.out.println("Pavarde -- " + klientoPavarde);
	    System.out.println("Asmens Kodas -- " + klientoAsmensKodas);
	    System.out.println("Telefono Numeris -- " + klientoTelefonoNumeris);
	    
	    Ivedimas.close();
	  
	}
	
	public long getKlientoAsmensKodas() {
		return klientoAsmensKodas;
	}

	public void setKlientoAsmensKodas(long klientoAsmensKodas) {
		this.klientoAsmensKodas = klientoAsmensKodas;
	}

	public String getKlientoVardas() {
		return klientoVardas;
	}

	public void setKlientoVardas(String klientoVardas) {
		this.klientoVardas = klientoVardas;
	}

	public String getKlientoPavarde() {
		return klientoPavarde;
	}

	public void setKlientoPavarde(String klientoPavarde) {
		this.klientoPavarde = klientoPavarde;
	}

	public int getKlientoTelefonoNumeris() {
		return klientoTelefonoNumeris;
	}

	public void setKlientoTelefonoNumeris(int klientoTelefonoNumeris) {
		this.klientoTelefonoNumeris = klientoTelefonoNumeris;
	}

}
