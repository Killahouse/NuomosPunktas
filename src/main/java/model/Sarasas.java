package model;

public class Sarasas {

	private Integer id;
	private Integer kiekis;	
	
	public Sarasas(int id, int kiekis) {
		this.id = new Integer(id);
		this.kiekis = new Integer(kiekis);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKiekis() {
		return kiekis;
	}

	public void setKiekis(Integer kiekis) {
		this.kiekis = kiekis;
	}
	
	public String toString(Sarasas sarasas2) {
		String zodis;
		zodis = (id.toString() + " " + kiekis.toString());
		return zodis;
		
	}
}
