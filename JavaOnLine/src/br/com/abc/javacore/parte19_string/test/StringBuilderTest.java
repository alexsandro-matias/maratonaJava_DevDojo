//Aula 83 - StringBuilder and StringBuffer
package br.com.abc.javacore.parte19_string.test;

public class StringBuilderTest
{
	public static void main(String[] args)
	{
		// Essa classe não cria um String no pool de String no HEAP.
		String string = "Uma frase comum";
		// StringBuilder stringBuilder = string; - um erro de compilação
		// Por isso a passagem de parâmetro deve ser de um número inteiro.
		StringBuilder stringBuilder = new StringBuilder(16);
		// Na linha abaixo dará um erro de compilação. já que não se trata mais de
		// String comum;
		// stringBuilder += stringBuilder;
		string.concat("teste");
		System.out.println(string);
		// A classe Stringbuilder tem um método sobrecarregado chamando APPEND que foi
		// usando na aula anterior.
		stringBuilder.append("uma frase comum");
		System.out.println(stringBuilder);
	}
}
