package br.com.proway.senior.escola.model;

/**
 * A avalição do desempenho do Aluno em uma Materia.
 * 
 * A prova registra uma avalição realizada pelo {@link Aluno} relativo ao
 * conhecimento de uma matéria. O {@link Aluno} poderá realizar várias
 * avaliações da mesma a matéria. A média ponderada das notas das Provas é
 * registrada no {@link Boletim} e verifica se o aluno foi aprovado.
 * 
 * @author ricardo.goncalves
 * @see Aluno
 * @see Boletim
 *
 */
public class Prova {

	private Integer id;
	private Integer periodo;
	private Aluno aluno;
	private Materia materia;
	private Double nota = 0.0;
	private int peso = 1; 
	
	/**
	 * Avaliação de desempenho do aluno
	 * 
	 * No construtor da prova não atribui-se valor para a nota para que seja
	 * possível a criação de provas para depois serem atribuídas as notas
	 * 
	 * @param periodo Periodo no formato YYYYMM
	 * @param aluno Aluno que realizou a prova
	 * @param materia Materia da prova
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Valor da avaliação do aluno.
	 */
	public Double getNota() {
		return nota;
	}
	
	/**
	 * Determina a avaliação do aluno.
	 * 
	 * Não pode ser menor que 0 nem maior do que o atributo Materia.notaMaxima.
	 * 
	 * @param nota
	 */
	public void setNota(Double nota) throws Exception {
		if(nota < 0 || nota > this.materia.notaMaxima) {
			throw new Exception("Valor da nota inválido.");
		}
		this.nota = nota;
	}
	
	/**
	 * Período no formato YYYYMM.
	 * @return periodo da prova
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Aluno que realizou a Prova.
	 * @return Aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * Materia da prova.
	 * @return Materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/**
	 * Peso da prova.
	 * 
	 * Este peso será utilizado ao calcular a média ponderada das notas no 
	 * Boletim
	 * @return
	 */
	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

	
}
