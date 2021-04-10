//Aula 78 -  Classes Wrapper pt 01
//Aula 79 -  Classes Wrapper pt 02
package br.com.abc.javacore.parte17_assertivas.test;

public class WrappersTest
{
	public static void main(String[] args)
	{
		// Temos 8 tipos de variáveis
		// primitivas:
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 1;
		long longPrimitivo = 10L; // número
									// inteiro
									// com
									// mais
									// memória.
		float floatPrimitivo = 10F;
		double doublePrimitivo = 10D;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		// Classes Wrapper são chamadas
		// com letra maiúscula que
		// encapsulam esses tipos
		// primitivos. Autoboxing é o um
		// tipo primitivo sendo
		// atribuído à uma classe
		// Wrapper
		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer intWrapper = 1;
		Long longWrapper = 10L;
		// Long longWrapper = 10; //
		// erro por que estamos tentando
		// passar uma classe
		// Integer para um Long
		//
		// // Qualquer uma das formas
		// para devolver um Wrapper.
		// Long longWrapper2 =
		// Long.valueOf(10L);
		// Long longWrapper2 =
		// Long.valueOf("10L");
		Float floatWrapper = 10F;
		Double doubleWrapper = 10D;
		Character charWrapper = 'A';
		Boolean booleanWrapper = true;
		// E não será aplicado como
		// tipos primitivos, e sim
		// classes. Então regras de
		// polimorfismo e herança
		// funcionam aqui.
		//
		// Unboxing acontece desde o
		// Java 5.
		// int i =
		// intWrapper.intValue(); -
		// antigamente era dessa forma
		// para devolver um
		// valor int. Na forma
		// simplificada:
		int i = intWrapper;
		//
		// Outra forma é através da
		// criação de objetos:
		int inteiro = new Integer("10"); // que
											// aceita
											// o
											// valor
											// de
											// uma
											// String
											// fazendo
											// a
											// conversão.
		// No caso de um valor Boolean,
		// ela não é case sensitive.
		Boolean testBooleano = new Boolean("TrUE");
		System.out.println(testBooleano); // Saída
											// true
		//
		String valor = "10";
		// fazendo a conversão para
		// float (Parsing)
		Float flutuante = Float.valueOf(valor);
		System.out.println(flutuante);
		//
		// Character
		Character.isDigit(charPrimitivo); // Como
											// não
											// é
											// um
											// número
											// retorna
											// false.
		// Como se tornaria muito
		// complicada ou demorada a
		// implementação desses métodos,
		// elas classes são chamadas de
		// utilitárias.
		//
		// Transformando de maiúsculo
		// para minúsculo.
		System.out.println(Character.toLowerCase(charPrimitivo));
	}
}
