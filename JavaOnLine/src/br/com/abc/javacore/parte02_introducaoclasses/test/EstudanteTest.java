package br.com.abc.javacore.parte02_introducaoclasses.test;

import br.com.abc.javacore.parte02_introducaoclasses.classes.Estudante;

public class EstudanteTest
{
	public static void main(String[] args)
	{
		// antes tínhamos tipos primitivos, nesta etapa, serão usados objetos
		// com o nome das classes.
		Estudante joao = new Estudante();
		// Na memória, teremos uma variável de referência chamada Joao que faz
		// referência para um objeto do tipo estudante.
		joao.idade = 15;
		joao.nome = "João";
		joao.matricula = "1212";
		System.out.println(joao.idade);
		// baixa coesão (indesejável) pode ser feita no supermercado, que tem
		// uma variedade grande de produtos e procurar uma marca específica de
		// chocolate de torna difícil (muitas coisas num só lugar). Já numa loja
		// de chocolates, onde uma marca de chocolates, ela é altamente coesa,
		// por que somente vende chocolates.
	}
}
