package br.com.abc.javacore.parte03_introducaometodos.test;

import br.com.abc.javacore.parte03_introducaometodos.classes.Calculadora;

//Aula 27 - métodos
//Aula 29 - retorno nos métodos
public class CalculadoraTest
{
	public static void main(String[] args)
	{
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		calculadora.multiplicaDoisNumeros(5d, 6);
		// variável de referência -> método -> os valores 5 e 6 como argumentos.
		System.out.println(calculadora.divideDoisNumeros(20, 2));
		double quociente = calculadora.divideDoisNumeros(20, 2);
		System.out.println(quociente);
		System.out.println("Continuando a execução");
	}
}
