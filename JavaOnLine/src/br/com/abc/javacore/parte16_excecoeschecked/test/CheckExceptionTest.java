//Aula 69 -   Exceptions -  Exceções checked pt 03
//Aula 70 - Exceptions - lançando Exceções 
//Aula 71 - Exceptions - bloco finally pt 05
//Aula 72 - Tratamento de multiplas exceções pt 06
package br.com.abc.javacore.parte16_excecoeschecked.test;

import java.io.File;
import java.io.IOException;

public class CheckExceptionTest
{
	public static void main(String[] args)
	{
		// Provavelmente as classes que trabalham com arquivos, lançam exceções de algum
		// tipo. Um exemplo é FILE da JVM - com um método createNewFile(), pois existe
		// uma possibilidade uma de ser gerada uma exceção.
		//
		// Sendo realizado o tratamento diretamente no main()
		// try
		// {
		// criarArquivo();
		// }
		// catch (IOException e)
		// {
		// e.printStackTrace();
		// }
		abrindoArquivo();
	}
	
	public static void criarArquivo() throws IOException // podemos passar a resposabilidade para quem está chamando o
															// método. Isso dará um erro lá.
	{
		File file = new File("Teste.txt");
		// file.createNewFile(); - Erro de compilação - Assim somos obrigado a tratar
		// essa exceção.
		file.createNewFile();
		System.out.println("Arquivo criado com sucesso.");
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
		//
		// Se tiver recursos abertos sejam na forma de banco de dados ou arquivos, as
		// boas práticas dizem para se fechar esses recursos. Se forem abertas 1000
		// conexões de banco de dados, deverão ficar abertas as 1000 sendo abertas ainda
		// mais ??? Então finalizado o recurso, este deve ser fechado.? Da mesma forma
		// se o arquivo estiver aberto, e este não é fechado, estamos consumindo
		// recursos do sistema operacional. Logo, precisamos fechar os arquivos.
	}
	
	public static void abrindoArquivo()
	{
		try
		{
			System.out.println("Abrindo arquivo.");
			System.out.println("Executando a leitura arquivo.");
			throw new Exception(); // simulando uma execeção na leitura do arquivo.
			// System.out.println("Escrevendo no arquivo.");
			// Se alguma coisa acontecer (erro/Exceção) antes do fechamento do arquivo, essa
			// linha nunca irá ocorrer. Por isso se o código entrar no try, ou se lançar uma
			// exceção ou até mesmo se tiver um retorno.
			//
			// Se tiver recursos abertos sejam na forma de banco de dados ou arquivos, as
			// boas práticas dizem para se fechar esses recursos. Se forem abertas 1000
			// conexões de banco de dados, deverão ficar abertas as 1000 sendo abertas ainda
			// mais ??? Então finalizado o recurso, este deve ser fechado.? Da mesma forma
			// se o arquivo estiver aberto, e este não é fechado, estamos consumindo
			// recursos do sistema operacional. Logo, precisamos fechar os arquivos.
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Fechando o arquivo.");
		}
		//
		// O bloco finally sempre será executado, mesmo o método tendo retorno. esse
		// valor será usando antes de retornar o valor para o método. Ele pode vir numa
		// TRY-CATCH-FINALLY ou TRY-FINALLY>
	}
}
