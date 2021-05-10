package br.com.proway.senior.escola.controller;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.model.ProvaDao;

public class BoletimController {
	
	private Boletim boletim;
	
	public BoletimController(Boletim boletimEntrada) {
		this.boletim = boletimEntrada;
	}
	
	/**
	 * Adiciona uma avaliaÃ§Ã£o ao boletim.
	 * 
	 * Ao adicionar a Prova, a mÃ©dia Ã© recalculada.
	 * 
	 * @param prova
	 */
	public void addProva(Prova prova) {
		ProvaDao provaDao = new ProvaDao(boletim);
		provaDao.add(prova);
		this.calcularMedia();
	}

	/**
	 * Remove uma avaliaÃ§Ã£o do boletim.
	 * 
	 * Ao remover a Prova, a mÃ©dia Ã© recalculada.
	 * 
	 * @param prova
	 */
	public void removeProva(int index) {
		try{
			ProvaDao provaDao = new ProvaDao(boletim);
			provaDao.remove(index);
		}catch(Exception e) {
			System.out.println("Prova não removida. Erro:" + e.getMessage());
		}
		this.calcularMedia();
	}

	/**;
	 * Remove todas as provas.
	 * 
	 */
	public void removeTodasProvas() {
		ProvaDao provaDao = new ProvaDao(boletim);
		provaDao.removeAll();
		this.calcularMedia();
	}
	
	/**
	 * Calcula a mÃ©dia ponderada das provas.
	 * 
	 * Realiza o cÃ¡lculo da mÃ©dia das notas das provas e atualiza o valor da
	 * media.
	 */
	private void calcularMedia() {
		Double total = 0.0;
		int pesos = 0;
		for(Prova prova : boletim.getProvas()) {
			total += prova.getNota() * prova.getPeso();
			pesos += prova.getPeso();
		}
		boletim.setMedia(total / pesos); 
	}

	public Boletim getBoletim() {
		return this.boletim;
	}
	
}
