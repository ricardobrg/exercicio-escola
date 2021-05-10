package br.com.proway.senior.escola.model;

import java.util.ArrayList;

import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaDao {

	Boletim boletim;
	ArrayListPersistenceProva db;
	
	public ProvaDao(ArrayListPersistenceProva db, Boletim boletim) {
		this.db = db;
	}

	public void removeAll() {
		db.removeAll(boletim.getId());
	}

	public void remove(Integer index) {
		db.remove(boletim.getId(), index);	
	}

	public void add(boletim.getId(), Prova prova) {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.add(prova);		
	}

}
