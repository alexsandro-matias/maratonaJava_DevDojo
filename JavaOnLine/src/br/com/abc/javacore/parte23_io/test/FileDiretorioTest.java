// Aula 101: IO pt 04 Classe File para diretórios
package br.com.abc.javacore.parte23_io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest
{
	public static void main(String[] args)
	{
		File file = new File("folder");
		// para criação de um diretório
		//
		boolean criandoDiretorio = file.mkdir();
		System.out.println("Diretório criado: " + criandoDiretorio);
		//
		// caso o diretorio já exista, ele não será criado novamente, no caso
		// retorna false
		//
		// Para criar um arquivo dentro desse diretório, faremos da seguinte
		// forma:
		File arhquivo = new File("/home/matias/Desktop/MaratonaJava_DevDojo/JavaOnLine/src");
		boolean
	}
}
