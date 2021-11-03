package calc.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	//Teste de Adi��o:
	public void testSoma() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(1,3);
		assertEquals(4, soma);
	}
	@Test
	//Teste de Divis�o:
	public void testDivide() {
		Calculadora calc = new Calculadora();
		int divide = calc.divide(12,2);
		assertEquals(6, divide);
	}
	@Test
	//Teste de Subtra��o:
	public void testSubtrai() {
		Calculadora calc = new Calculadora();
		int subtrai = calc.subtrai(9,1);
		assertEquals(8, subtrai);
	}
	@Test
	//Teste de Multiplica��o:
	public void testMultiplica() {
		Calculadora calc = new Calculadora();
		int multiplica = calc.multiplica(1,3);
		assertEquals(3, multiplica);
	}

}
