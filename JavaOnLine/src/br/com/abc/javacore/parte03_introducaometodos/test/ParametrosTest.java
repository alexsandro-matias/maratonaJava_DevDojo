package br.com.abc.javacore.parte03_introducaometodos.test;

//Aula 31 - Métodos com parâmetros tipo reference
import br.com.abc.javacore.parte03_introducaometodos.classes.Calculadora;

public class ParametrosTest
{
	public static void main(String[] args)
	{
		Calculadora calculadora = new Calculadora();
		int num1 = 5;
		int num2 = 10;
		calculadora.mudaDoisNumeros(num1, num2);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("Dentro do parametrosTest");
		//
		// Saída:
		// num1: 30
		// num2: 40
		// Dentro do muda dois números
		// num1: 5
		// num2: 10
		// Dentro do parametrosTest
		//
		// As variáveis não ficam alteradas, uma vez que no Java as passagem de
		// parâmetros de tipos primitivos é feita por cópia de valores e não por
		// referência.
	}
}
