package br.com.proway.senior.escola.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlunoTest {

	@Test(expected = Exception.class)
	public void testSetNomeComNumero() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setNome("Ricardo123");
	}

	@Test(expected = Exception.class)
	public void testSetNomeComCaractereProibido() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setNome("Ricardo.");
	}
	

	
	@Test
	public void testSetNomeSemNumero() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setNome("Ricardo");	
		assertNotNull(aluno.getNome());
	}
	
	
	@Test(expected = Exception.class)
	public void testSetSobrenomeComNumero() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setSobrenome("Gonçalves123");
	}

	@Test(expected = Exception.class)
	public void testSetSobrenomeComCaractereProibido() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setSobrenome("Gonçalves.");
	}
	

	
	@Test
	public void testSetSobrenomeSemNumero() {
		Aluno aluno = new Aluno();
		try {
			aluno.setSobrenome("Gonçalves");	
		}catch(Exception e) {
			fail(e.getMessage());
		}
		
		assertNotNull(aluno.getSobrenome());
	}
	
	@Test(expected = Exception.class)
	public void testSetIdadeNegativa() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setIdade(-10);
	}
	
	@Test (expected = Exception.class)
	public void testSetIdadeMaiorQue130() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setIdade(131);
	}
	@Test 
	public void testSetIdadeValida() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setIdade(20);
		assertEquals(20, (int) aluno.getIdade());
	}
	

}
