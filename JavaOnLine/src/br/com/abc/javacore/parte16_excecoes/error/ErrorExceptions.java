//Aula 67 -  Exceptions pt 01
//Aula 68 -  Exceptions pt 02
package br.com.abc.javacore.parte16_excecoes.error;

public class ErrorExceptions
{
	public static void main(String[] args)
	{
		stackOverFlow();
	}
	// Para exemplificar o estouro de memória. Teremos um erro, não uma exceção. Uma
	// pilha de chamada de métodos. O método main() que chamou o stackOverFlow() e
	// assim por diante. Dizemos um erro ou exceção foram lançados.
	
	public static void stackOverFlow()
	{
		stackOverFlow();
	}
}
