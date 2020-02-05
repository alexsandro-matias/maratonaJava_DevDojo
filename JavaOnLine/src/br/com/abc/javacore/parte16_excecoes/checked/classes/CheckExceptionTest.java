//Aula 69 -   Exceptions -  Exceções checked pt 03
package br.com.abc.javacore.parte16_excecoes.checked.classes;

import java.io.File;
import java.io.IOException;

public class CheckExceptionTest
{
	public static void main(String[] args)
	{
		// Provavelmente as classes que trabalham com arquivos, lançam exceções de algum
		// tipo. Um exemplo é FILE da JVM - com um método createNewFile(), pois existe
		// uma possibilidade uma de ser gerada uma exceção.
		criarArquivo();
	}
	
	public static void criarArquivo()
	{
		File file = new File("Teste.txt");
		// file.createNewFile(); - Erro de compilação - Assim somos obrigado a tratar
		// essa exceção.
		try
		{
			file.createNewFile();
			System.out.println("Arquivo criado com sucesso.");
			// Se não tivesse nenhum bloco de código, somos obrigados a deixar no bloco
			// catch a variável do tipo Exception.
			// Leitura: TENTE executar código, caso não consiga, CAPTURE essa exceção.
		}
		catch (IOException e) // Um variável de referência do tipo IOException
		{
			e.printStackTrace(); // variável de referência que mostra tudo o ocorreu antes dessa exceção ser
									// chamada.
		}
	}
}
