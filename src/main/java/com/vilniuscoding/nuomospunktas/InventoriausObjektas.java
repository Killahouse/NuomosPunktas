package com.vilniuscoding.nuomospunktas;

public class InventoriausObjektas {
	
	int id;
	String tipas;
	String pavadinimas;
	int kiekis;
	double kaina;
	
	@Override
	   public String toString() {
	        return (this.getId()+
	                    "    "+ this.getTipas() +
	                    "    "+ this.getPavadinimas() +
	                    "    " + this.getKiekis() +
	                    "    " + this.getKaina());
	   }
	
	public InventoriausObjektas(int id, String tipas, String pavadinimas, int kiekis, double kaina) {
		this.id = id;
		this.tipas = tipas;
		this.pavadinimas = pavadinimas;
		this.kiekis = kiekis;
		this.kaina = kaina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipas() {
		return tipas;
	}

	public void setTipas(String tipas) {
		this.tipas = tipas;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getKiekis() {
		return kiekis;
	}

	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}

	public double getKaina() {
		return kaina;
	}

	public void setKaina(double kaina) {
		this.kaina = kaina;
	}
}
