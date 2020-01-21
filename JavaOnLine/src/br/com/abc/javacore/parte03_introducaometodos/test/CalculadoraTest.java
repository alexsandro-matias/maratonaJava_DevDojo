package br.com.abc.javacore.parte03_introducaometodos.test;

import br.com.abc.javacore.parte03_introducaometodos.classes.Calculadora;

//Aula 27 - métodos
//Aula 29 - retorno nos métodos
//Aula 33 - Métodos com parâmetros tipo varargs

public class CalculadoraTest
{
	public static void main(String[] args)
	{
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		calculadora.multiplicaDoisNumeros(5d, 6);
		// variável de referência -> método -> os valores 5 e 6 como argumentos.
		System.out.println(calculadora.divideDoisNumeros(20, 2)); // se fosse
																	// void,
																	// daria um
																	// erro de
																	// compilação,
																	// já que
																	// esperado
																	// um
																	// retorno.
		double quociente = calculadora.divideDoisNumeros(20, 2);
		System.out.println(quociente);
		System.out.println("Continuando a execução");
		int[] numeros =
		{ 1, 2, 3, 4, 5 };
		calculadora.somaArray(numeros);
		calculadora.somaVarargs(numeros); // passando um array
		calculadora.somaVarargs(1,2,3,4,5); // passando os valores separados por vírgula
	}
}
