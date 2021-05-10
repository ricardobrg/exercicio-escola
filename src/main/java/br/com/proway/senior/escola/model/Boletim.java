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

	private Integer id;
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
	 * Id do Boletim
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setMedia(double media) {
		this.media = media;		
	}

	public void resetProvas() {
		this.provas = new ArrayList<Prova>();
	}
}
