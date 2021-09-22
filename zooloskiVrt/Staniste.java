package zooloskiVrt;

import java.util.ArrayList;

public class Staniste {
	private String nazivStanista;
	private ArrayList<Zivotinje> listaZivotinja;
	
	public Staniste(String nazivStanista) {
		this.nazivStanista = nazivStanista;
		listaZivotinja = new ArrayList<Zivotinje>();
	}
	
	public String getNazivStanista() {
		return nazivStanista;
	}

	public void dodavanjeZivotinja(Zivotinje a) {
		this.listaZivotinja.add(a);
	}
	
	public void uklonizivotinju(Zivotinje a) {
		listaZivotinja.remove(a);
	}
	
	
	public ArrayList<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}


	public void stampanje() {
		System.out.println("U stanistu: "+ this.nazivStanista + " zive: ");
		for(int i = 0; i<this.listaZivotinja.size();i++) {
			System.out.print(this.listaZivotinja.get(i).getName() +", ");
		}
	}

}
