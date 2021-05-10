package br.com.proway.senior.escola.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BoletimTest{
	
	static Boletim boletim;
	private static int periodoPadrao= 202105;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = periodoPadrao;
		boletim = new Boletim(aluno, periodo);
	}

	@Test
	public void testBoletim() {
		assertNotNull(boletim);
	}

	@Test
	public void testGetAluno() {
		assertNotNull(boletim.getAluno());
	}

	@Test
	public void testGetPeriodo() {
		assertEquals(periodoPadrao, (int) boletim.getPeriodo());
	}
	

	@Test
	public void testGetMedia() {
		assertEquals(0.0, boletim.getMedia(), 0.01);
	}


}
