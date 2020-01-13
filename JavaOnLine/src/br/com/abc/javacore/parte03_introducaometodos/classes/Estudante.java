package br.com.abc.javacore.parte03_introducaometodos.classes;
//Aula 35 - Exercício de Métodos

public class Estudante
{
	public String nome;
	public int idade;
	public double[] notas;

	public void imprimirAtributos()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		for (double d : notas)
		{
			System.out.println(d + " ");
		}
	}

	public void calculaMedia()
	{
		double soma = 0, media = 0;
		for (double nota : notas)
		{
			soma += nota;
		}
		media = soma / notas.length;
		if (media > 6)
		{
			System.out.println("Aluno aprovado.");
		}
		else
		{
			System.out.println("Aluno reprovado.");
		}
	}
}
