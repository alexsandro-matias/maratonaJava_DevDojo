//Aula 82 -  Performance de String
//Aula 83 - StringBuilder and StringBuffer
package br.com.abc.javacore.parte19_string.test;

public class StringPerformanceTest
{
	public static void main(String[] args)
	{
		// Verificando quanto tempo é gasto para concaternar uma determinada quantidade
		// de caracteres.
		long inicio = System.currentTimeMillis();
		concatString(100000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + " milisegundos.");
		// Para escalar o programa, ou seja, já concebê-lo com alta performance.
		//
		// Usando o Stringbuilder:
		inicio = System.currentTimeMillis();
		concatStringBuilder(100000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + " milisegundos.");
		//
		// Usando o Stringbuffer:
		inicio = System.currentTimeMillis();
		concatStringBuffer(100000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + " milisegundos.");
		// Ela basicamente fazem a mesma coisa, porém esta última são sincronizados com
		// os threads. O primeiro é um performático.
	}
	
	private static void concatString(int tamanho)
	{
		String string = "";
		for (int i = 0; i < tamanho; i++)
		{
			string += i;
		}
	}
	
	private static void concatStringBuilder(int tamanho)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tamanho; i++)
		{
			sb.append(i);
		}
	}
	
	private static void concatStringBuffer(int tamanho)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tamanho; i++)
		{
			sb.append(i);
		}
	}
}
