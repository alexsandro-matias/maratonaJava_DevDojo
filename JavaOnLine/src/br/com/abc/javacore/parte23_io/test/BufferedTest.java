//Aula 100 - IO pt 03 BufferedWriter e BufferedReader
package br.com.abc.javacore.parte23_io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest
{
	public static void main(String[] args)
	{
		File file = new File("ArquivoTest.txt");
		try
		{
			FileWriter arquivoSalvo = new FileWriter(file, true);
			// Deve-se passar como parâmetro um FileWriter.
			BufferedWriter br = new BufferedWriter(arquivoSalvo);
			br.write("Escrevendo num arquivo de Buffer.");
			br.newLine();
			br.write("Pulando uma linha");
			br.flush();
			br.close();
			FileReader arquivoLido = new FileReader(file);
			char[] leituraCaracteres = new char[500];
			int quantidadeCaracteres = arquivoLido.read(leituraCaracteres);
			System.out.println(quantidadeCaracteres);
			for (char c : leituraCaracteres)
			{
				System.out.print(c);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		// Uma série de classes ou interfaces são chamandas quando se trabalha com
		// arquivos.
	}
}
