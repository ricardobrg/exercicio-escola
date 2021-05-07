package br.com.proway.senior.escola.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class ProvaTest {
	
	static Prova prova;
	static int periodoParam = 202105;

	@BeforeClass
	public static void createProva(){
		Integer periodo = periodoParam;
		Materia materia = new Materia();
 		Aluno aluno = new Aluno(); 
		prova = new Prova(periodo, aluno, materia);
	}
	
	@Test
	public void testProva() {
		assertNotNull(prova);
	}

	@Test
	public void testSetGetNotaCorreto() {
		try{
			prova.setNota(10.0);
		}catch(Exception e) {
			fail(e.getMessage());
		}
		assertEquals(10.0, (double) prova.getNota(), 0.1);
	}
	
	@Test(expected = Exception.class)
	public void testSetGetNotaInCorreto() throws Exception {
		prova.setNota(-10.0);
	}
	
	@Test
	public void testGetPeriodo() {
		assertEquals(periodoParam, (int) prova.getPeriodo());
	}

	@Test
	public void testGetAluno() {
		assertNotNull(prova.getAluno());
	}

	@Test
	public void testGetMateria() {
		assertNotNull(prova.getMateria());
	}

}
