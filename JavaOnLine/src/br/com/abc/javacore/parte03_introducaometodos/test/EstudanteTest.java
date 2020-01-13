package br.com.abc.javacore.parte03_introducaometodos.test;

import br.com.abc.javacore.parte03_introducaometodos.classes.Estudante;

//Aula 35 - Exercício de Métodos.

public class EstudanteTest
{
	public static void main(String[] args)
	{
		// criando uma variável de referência e instanciando um objeto.
		Estudante estudante = new Estudante();
		estudante.idade = 35;
		estudante.nome = "Alexsandro";
		estudante.notas = new double[]
		{ 9, 7, 6 };
		estudante.imprimirAtributos();
		estudante.calculaMedia();
	}
}
