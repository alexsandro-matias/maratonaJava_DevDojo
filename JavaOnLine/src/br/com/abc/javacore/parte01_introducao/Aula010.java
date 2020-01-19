package br.com.abc.javacore.parte01_introducao;

/***
 *
 * Aula 10 - controle de fluxo
 *
 *
 */
public class Aula010
{
	int idade;

	public static void main(String[] args)
	{
		// idade < 15 - categoria infantil
		// idade >= 15 && idade < 18 - categoria juvenil
		// idade > 18 - categoria adulta
		int idade = 15;
		if (false)
		{
			System.out.println("entrou no true");
		}
		// pegadinha - atribuição e não comparação
		boolean sentenca = false;
		// somente comparação do mesmo tipo
		if (sentenca = true) // retorna um valor booleano
		{
			System.out.println("verdadeiro");
		}
		else
		{
			System.out.println("entrou no else");
		}
		// comparando idades
		if (idade >= 18)
		{
			System.out.println("Pode entrar");
		}
		else
		{
			System.out.println("não pode entrar no clube");
		}
		if (idade < 15)
		{
			System.out.println("categoria infantil");
		}
		else if (idade >= 15 && idade < 18)
		{
			System.out.println("categoria juvenil");
		}
		else
		{
			System.out.println("categoria adulta");
		}
		// Outra possibilidade
		String categoria;
		// caso esta variável é global, caso não seja inicializada teremos um
		// erro compilação, já que há uma possibilidade dela não ter utilizada e inicializada em escopo locais.
		if (idade < 15)
		{
			categoria = "infantil";
		}
		else if (idade >= 15 && idade < 18)
		{
			categoria = "juvenil";
		}
		else
		{
			categoria = "adulta";
		}
		
		System.out.println("Categoria "+categoria);
	}
}
