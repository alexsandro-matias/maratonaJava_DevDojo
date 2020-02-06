//Aula 72 - Tratamento de multiplas exceções pt 06
//Aula 73 - multi-catch exceções pt 07
package br.com.abc.javacore.parte16_excecoes.runtimeexception.test;

import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest
{
	public static void main(String[] args)
	{
		// Tal conceito serve para ambas as duas formas de exceções. Tratamento de
		// múltiplas exceções
		try
		{
			throw new RuntimeException();
			// Caso seja alguma exceção que não está listada abaixo, a JVM apenas vai
			// mostrar qual exceção, já que ela não foi tratada.
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fora da faixa do Array. ");
		}
		catch (IllegalArgumentException e)
		{
		}
		catch (ArithmeticException e)
		{
		}
		catch (RuntimeException e)
		{
			// Neste caso, deixada como último tratamento por que ele é mais geral, caso
			// seja colocada no topo, o restante dos blocos catch jamais serão executados
			// (unreachable), [top - down]
			// já que esse primeiro foi capturado.Isso causará erro de compilação.
			System.out.println("Erro em tempo de execução.");
		}
		// forma antiga.
		// try
		// {
		// talvezLanceException();
		// }
		// catch (SQLException e)
		// {
		// }
		// catch (IOException e)
		// {
		// }
		//
		// Na forma nova:
		try
		{
			talvezLanceException();
		}
		catch (SQLException | IOException e)
		{
			e.printStackTrace();
			// Porém nesse novo tipo, não é possível atribuir uma nova instância.
			// e = new Exception(); - dará um erro de compilação, já que não se sabe se foi
			// um erro SQL ou IO.
			//
			// Outra regra é que não se pode colocar exceções que estejam na mesma linha de
			// herança, já que está sendo tratado pela superclasse.
		}
	}
	
	private static void talvezLanceException() throws SQLException, IOException
	{
	}
}
