package br.com.proway.senior.escola.model;

import java.util.ArrayList;

public class ProvaDao {

	Boletim boletim;
	
	public ProvaDao(Boletim boletim) {
		this.boletim = boletim;
	}

	public void removeAll() {
		boletim.resetProvas();		
	}

	public void remove(int index) {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.remove(index);		
	}

	public void add(Prova prova) {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.add(prova);		
	}

}
