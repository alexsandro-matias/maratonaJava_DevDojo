//Aula 99 - IO pt 02 FileWriter e FileReader
//Aula 100 - IO pt 03 BufferedWriter e BufferedReader
package br.com.abc.javacore.parte23_io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest
{
	public static void main(String[] args)
	{
		File file = new File("ArquivoTest.txt");
		// try
		// {
		// FileWriter arquivoSalvo = new FileWriter(file, true);
		// arquivoSalvo.write(" Escrevendo uma mensagem no arquivo\npulando uma linha2
		// ");
		// // Toda vez que trabalhamos com um arquivo, estamos trabalhado com Buffer.
		// Que é
		// // um recurso do sistema operacional que não temos a certeza que tudo ocorreu
		// da
		//  forma correta, chamados de Steam que são vários Bytes. Para garantir que
		// saia
		// // tudo da Steam devemos dar o comando flush
		// arquivoSalvo.flush();
		// arquivoSalvo.close();
		// // Mas para isso essa .close implementa a autocloseble
		// // arquivoLido.write("Escrevendo uma mensagem no arquivo\npulando uma
		// linha2");
		// // Esse arquivo será sobrescristo.
		// // Agora, caso queira incluir no final do arquivo, devemos adicionar no
		// // construtor o parâmetro booleano chamado append, deixando como true o
		// segundo
		// // parâmetro que por padrão é false.
		// //
		// // Para leitura desse arquivo, devemos usar o FileReader
		// FileReader arquivoLido = new FileReader(file);
		// char[] leituraCaracteres = new char[500];
		// int quantidadeCaracteres = arquivoLido.read(leituraCaracteres);
		// System.out.println(quantidadeCaracteres);
		// for (char c : leituraCaracteres)
		// {
		// System.out.print(c);
		// }
		// }
		// catch (IOException e)
		// {
		// e.printStackTrace();
		// }
		// // Uma série de classes ou interfaces são chamandas quando se trabalha com
		// // arquivos.
		// Usando Try with resources
		try (FileWriter arquivoSalvo = new FileWriter(file, true); FileReader arquivoLido = new FileReader(file);)
		{
			arquivoSalvo.write(" Escrevendo uma mensagem no arquivo\npulando uma linha2 ");
			arquivoSalvo.flush();
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
		// arquivos
	}
}
