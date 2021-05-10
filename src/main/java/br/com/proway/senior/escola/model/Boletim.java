package br.com.proway.senior.escola.model;

import java.util.ArrayList;

/**
 * ReÃºne as {@link Prova}s de um {@link Aluno}.
 * 
 * O boletim possui uma lista de {@link Prova}s e Ã© referente a um periodo de um
 * {@link Aluno}. Para cada perÃ­odo Ã© calculada a mÃ©dia das provas que resulta
 * na nota do Boletim.
 * 
 * @author ricardo.goncalves
 *
 */
public class Boletim {

	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	/**
	 * Cria um novo Boletim
	 * 
	 * O Boletim Ã© criado a partir de um aluno e um perÃ­odo. Conforme as provas
	 * sÃ£o adicionadas, realiza-se o cÃ¡lculo atualizado da mÃ©dia.
	 * 
	 * @param aluno
	 * @param periodo
	 * @param media
	 */
	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}

	/**
	 * Aluno do boletim
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * PerÃ­odo no formato YYYYMM
	 * 
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Retorna a mÃ©dia das provas atualizada.
	 * 
	 * @return
	 */
	public Double getMedia() {
		return media;
	}
	
	/**
	 * Retorna todas as provas.
	 * 
	 * @return ArrayList<Prova>
	 */
	public ArrayList<Prova> getProvas() {
		return this.provas;
	}


	/**
	 * Adiciona uma avaliaÃ§Ã£o ao boletim.
	 * 
	 * Ao adicionar a Prova, a mÃ©dia Ã© recalculada.
	 * 
	 * @param prova
	 */
	public void addProva(Prova prova) {
		provas.add(prova);
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
			provas.remove(index);
		}catch(Exception e) {
			System.out.println("Prova não removida. Erro:" + e.getMessage());
		}
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
		for(Prova prova : provas) {
			total += prova.getNota() * prova.getPeso();
			pesos += prova.getPeso();
		}
		this.media = total / pesos; 
	}
	
	/**;
	 * Remove todas as provas.
	 * 
	 */
	public void removeTodasProvas() {
		this.provas = new ArrayList<Prova>();
	}

}
