package br.com.test;

import org.junit.Test;

import br.com.model.Model1;
import junit.framework.TestCase;

public class Model1Test extends TestCase {

	@Test
	public void testSoma() {

		int x = 5, y = 6;
		int retEsperado = 12;
		int retorno = 0;
		Model1 model = new Model1();
		retorno = model.soma(x, y);

		assertEquals(retEsperado, retorno, 0);

	}

}
