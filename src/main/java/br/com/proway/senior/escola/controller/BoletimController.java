package br.com.proway.senior.escola.controller;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.BoletimDao;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceBoletim;

public class BoletimController {
	
	private Boletim boletim;
	private BoletimDao boletimDao;
	private ArrayListPersistenceBoletim dbBoletim = new ArrayListPersistenceBoletim();

	/**
	 * Classe de controle do boletim
	 * 
	 * Recebe um boletim e verifica se o boletim já existe na persistência.
	 * Se não existir, cria um novo.
	 * 
	 * @param boletimEntrada
	 */
	public BoletimController(Boletim boletimEntrada) {
		this.boletimDao = new BoletimDao(dbBoletim);
	}
	
	public Boletim addBoletim() {
		if(this.boletim.getId() != null) {
			return this.boletimDao.add(this.boletim);	
		}else {
			return this.boletimDao.get(this.boletim.getId());
		}	
	}
	
	/**
	 * Adiciona uma avaliaÃ§Ã£o ao boletim.
	 * 
	 * Ao adicionar a Prova, a mÃ©dia Ã© recalculada.
	 * 
	 * @param prova
	 */
	public void addProva(Prova prova) {
		ProvaController provaController = new ProvaController(prova);
		if(prova.getId() != null) {
			provaController.addProva();	
		}else {
			provaController.get(prova.getId());	
		}		
		boletim.getProvas().add(prova);
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
		ProvaController provaController = new ProvaController(index);
		provaController.removeProva();	
		boletim.getProvas().remove(index);
		this.calcularMedia();
	}

	/**;
	 * Remove todas as provas.
	 * 
	 */
	public void removeTodasProvas() {
		ArrayList<Prova> provas = this.boletim.getProvas();
		
		for(Prova prova : provas) {
			ProvaController provaController = new ProvaController(prova);
			provaController.removeProva();	
		}
		this.boletim.getProvas().clear();
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
