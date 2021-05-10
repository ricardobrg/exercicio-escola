package utils;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.escola.utils.Validators;

public class ValidatorsTest {

	@Test
	public void testOnlyChars() {
		assertTrue(Validators.onlyValidChars("dbsjirfeguwirtbewuigfbreio"));
	}
	
	@Test
	public void testOnlyCharsRecebendoNumeros() {
		assertFalse(Validators.onlyValidChars("dsadsa12233"));
	}

	@Test
	public void testOnlyCharsRecebendoCaracteresEspeciais() {
		assertFalse(Validators.onlyValidChars("fndui..;/.;/"));
	}
	
}
