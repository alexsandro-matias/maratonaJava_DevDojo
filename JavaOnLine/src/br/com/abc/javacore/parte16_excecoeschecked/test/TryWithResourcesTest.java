//Aula 74  - Exceptions - try-with-resources pt 08
//Aula 75 -  Exceptions customizadas pt 09
package br.com.abc.javacore.parte16_excecoeschecked.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import br.com.abc.javacore.parte16_excecoeschecked.classes.Leitor1;
import br.com.abc.javacore.parte16_excecoeschecked.classes.Leitor2;

public class TryWithResourcesTest
{
	public static void main(String[] args)
	{
		// Testando ler arquivo.
		lerArquivoNovo();
		// Saída
		// Fechando leitor2
		// Fechando leitor1
		// Isso acontece por que ele fecha os recursos em ordem inversa
	}
	
	public static void lerArquivo()
	{
		Reader reader = null;
		try
		{
			reader = new BufferedReader(new FileReader("outroArquivo.txt"));
			// fechando o recurso
			// reader.close(); // Se houvesse um erro aqui antes dessa linha, jamais o
			// arquivo seria fechado.
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			// reader.close(); // Neste caso haveria repetição de código.
		}
		finally
		{
			try
			{
				if (reader != null)
				{
					reader.close(); // outra exceção. E ainda temos que verificar se a variável reader é null
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			} // Neste caso ficará apenas como variável local. Para consertarmos devemos
				// deixá-la como variável global.
		}
		// Até a versão 6 do Java era feita dessa forma. Já no Java 7, é possível deixar
		// que o Java feche os recursos automaticamente
	}
	
	public static void lerArquivoNovo()
	{
		// a leitura do arquivo será feita diretamente no try
		try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2())
		{
			// Porém a interface AUTOCLOSEBLE deve ser implementada.
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
	}
	
	public static void lerArquivoNovoMaisSimplificado() throws IOException
	{
		// a leitura do arquivo será feita diretamente no try
		try (Reader reader = new BufferedReader(new FileReader("outroArquivo.txt")))
		{
			// Porém a interface AUTOCLOSEBLE deve ser implementada.
		}
		// Mais resumido, mas não recomendado.
	}
}
