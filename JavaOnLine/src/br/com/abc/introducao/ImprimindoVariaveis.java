package br.com.abc.introducao;

public class ImprimindoVariaveis
{
	// convenções java-JCP->classes- Primeira letra maiuscúla e
	// depois camel
	// case->classes->classes->classes
	//
	// Para ter um programa Java precisamos do método estático Main:
	public static void main(String[] args)
	{
		System.out.println("Dados Impressos");
		// tipos primitivos -> 8 tipos
		// int double sem ser o nome de uma palavra reservada
		// iniciando sempre com a letra minúscula e depois camelCase
		int idade = 10;
		int idadeDosPaisParaCadastro = 10;
		System.out.println(idadeDosPaisParaCadastro); // sem as aspas ele se
														// preocupa com a
														// variável
		// Para concatenar a variável com o texto:
		System.out.println("A idade é " + idade + " anos.");
		// double
		// float
		// boolean
		// char
		// byte
		// short
		// long
	}
	// Este método é de entrada. Mesmo se o programa Desktop tiver várias
	// classes, inicialmente a Main será executada inicialmente.
	// Ou seja, a JVM irá buscar esse método para executar o programa.
	// comentários
	// comentários de uma linha -> //
	// comentário de várias -> /**/
	// cometário de documentação /***/
	/**
	 * @author matias
	 * @param args
	 *            parametros de entradas
	 */
}
