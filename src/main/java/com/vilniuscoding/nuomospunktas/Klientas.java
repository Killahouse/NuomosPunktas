package com.vilniuscoding.nuomospunktas;

public class Klientas {
	private long klientoAsmensKodas;
	private String klientoVardas;
	private String klientoPavarde;
	private int klientoTelefonoNumeris;

	public void klientoDuomenys() {
		
		
	    String kazkas = ScannerioKlase.getString();
	  
		
		System.out.println("Iveskite kliento varda");
	    klientoVardas = ScannerioKlase.getString();
	    setKlientoVardas(klientoVardas);
	    
	    System.out.println("Iveskite kliento pavarde");
	    klientoPavarde = ScannerioKlase.getString();
	    setKlientoPavarde(klientoPavarde);
	    
	    System.out.println("Iveskite kliento telefono numeri");
	    klientoTelefonoNumeris = ScannerioKlase.getNumber();	    
	    String telefonoNumerioIlgis;
	    telefonoNumerioIlgis = Integer.toString(klientoTelefonoNumeris);	    
	    while (telefonoNumerioIlgis.length() !=9) {
	    	System.out.println("Ivedete netinkamo ilgio telefono numeri");
	    	System.out.println("Iveskite kliento telefono numeri dar karta");
		    klientoTelefonoNumeris = ScannerioKlase.getNumber();
		    telefonoNumerioIlgis = Integer.toString(klientoTelefonoNumeris);
		}	    
	    setKlientoTelefonoNumeris(klientoTelefonoNumeris);
	    
	    System.out.println("Iveskite kliento asmens koda");
	    klientoAsmensKodas = ScannerioKlase.getLong();
	    String asmensKodoIlgis;
	    asmensKodoIlgis = Long.toString(klientoAsmensKodas);	    
	    while (asmensKodoIlgis.length() !=11) {
	    	System.out.println("Ivedete netinkamo ilgio asmens koda");
	    	System.out.println("Iveskite kliento asmens koda dar karta");
	    	klientoAsmensKodas = ScannerioKlase.getLong();
		    asmensKodoIlgis = Long.toString(klientoAsmensKodas);
		}	    
	    setKlientoAsmensKodas(klientoAsmensKodas);
	    
	    System.out.println("Vardas -- " + klientoVardas);
	    System.out.println("Pavarde -- " + klientoPavarde);
	    System.out.println("Asmens Kodas -- " + klientoAsmensKodas);
	    System.out.println("Telefono Numeris -- " + klientoTelefonoNumeris);
	  
	}
	
	public long getKlientoAsmensKodas() {
		return klientoAsmensKodas;
	}

	private void setKlientoAsmensKodas(long klientoAsmensKodas) {
		this.klientoAsmensKodas = klientoAsmensKodas;
	}

	public String getKlientoVardas() {
		return klientoVardas;
	}

	private void setKlientoVardas(String klientoVardas) {
		this.klientoVardas = klientoVardas;
	}

	public String getKlientoPavarde() {
		return klientoPavarde;
	}

	private void setKlientoPavarde(String klientoPavarde) {
		this.klientoPavarde = klientoPavarde;
	}

	public int getKlientoTelefonoNumeris() {
		return klientoTelefonoNumeris;
	}

	private void setKlientoTelefonoNumeris(int klientoTelefonoNumeris) {
		this.klientoTelefonoNumeris = klientoTelefonoNumeris;
	}

}
