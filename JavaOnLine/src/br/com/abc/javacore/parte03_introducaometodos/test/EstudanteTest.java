package br.com.abc.javacore.parte03_introducaometodos.test;

import br.com.abc.javacore.parte03_introducaometodos.classes.Estudante;

//Aula 35 - Exercício de Métodos.
//Aula 36 - Modificado de acesso private, getters e setters.
//Aula 37 - Modificado de acesso private, getters e setters.
public class EstudanteTest
{
	public static void main(String[] args)
	{
		// criando uma variável de referência e instanciando um objeto.
		Estudante estudante = new Estudante();
		// antes do empasulamento o atributo é passado diretamente para a variável.
		// estudante.idade = 35;
		// estudante.nome = "Alexsandro";
		// estudante.notas = new double[]
		// { 9, 7, 0 };
		//
		// Depois do encapsulamento, os valores são passados como parâmetros dos
		// métodos.
		estudante.setIdade(35);
		estudante.setNome("Alexsandro");
		estudante.setNotas(new double[]
		{ 9, 7, 10 });
		System.out.println(estudante.getIdade());
		estudante.calculaMedia();
		System.out.println("Status do aluno: " + estudante.isAprovado());
		// Essa declaração se torna errada quando declarada da seguinte forma:
		// double[] notas;
		// estudante.notas = {7,7,7};
		// isso acontece devido à uma especificação da linguagem Java, que diz que a
		// declaração somente pode ser feita no momento da declaração, pela ambiguidade
		// em relação a outros tipos de objetos. No caso acima, não tem como o Java
		// saber se o dado é do tipo correto sem declaração explícita na atribuição.
		// estudante.imprimirAtributos();
	}
}
