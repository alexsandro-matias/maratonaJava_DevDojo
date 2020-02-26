//Aula 98 - IO pt 01 Classe File para arquivos
package br.com.abc.javacore.parte23_io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest
{
	public static void main(String[] args)
	{
		//
		// IO - entrada e saída de dados com Java
		// File - Criar arquivos
		// FileReader - Criar arquivos e ler o conteúdo desses arquivos.
		// BufferedReader - Otimização da FileReader com arquivos maiores.
		// BufferedWriter - Mesma ideia da otimização para escrita
		// projeto.
		// File file = new
		// File("/run/media/matias/arquivos/MarotonaJava_DevDojo/JavaOnLine/Arquivo.txt");
		// // Este arquivo
		File file = new File("Arquivo.txt"); // será criado dentro diretório
												// digitado. Neste momento não
												// há a criação do arquivo, mas
												// sim um objeto do tipo File.
												// Realizando o comando abaixo
		try
		{
			boolean newFile = file.createNewFile();
			// System.out.println(newFile);
			// Na segunda vez que é executado esse comando, o retorno será
			// false, uma vez que o arquivo já existe. Outra forma, mais é
			// através:
			System.out.println(file.createNewFile());
			boolean fileExist = file.exists();
			// Para testar se o arquivo existe.
			// System.out.println(file.exists());
			System.out.println("Permissão de leitura: " + file.canRead());
			System.out.println("Local do arquivo: " + file.getPath());
			System.out.println("É um Diretório: " + file.isDirectory());
			System.out.println("O arquivo é oculto: " + file.isHidden());
			System.out.println("Última vez que o arquivo foi modificado: " + new Date(file.lastModified()));
			System.out.println("Local do completo do arquivo: " + file.getAbsolutePath());
			if (fileExist)
			{
				System.out.println("Arquivo deletado? " + file.delete());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		// Mas para isso, é necessário um tratamento de excessão, uma vez que o
		// local do arquivo pode não existir, ou o disco tem apenas a permissão
		// de leitura.
	}
}
