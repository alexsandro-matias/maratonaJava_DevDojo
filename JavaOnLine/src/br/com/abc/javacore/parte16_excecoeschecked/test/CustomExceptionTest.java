package br.com.abc.javacore.parte16_excecoeschecked.test;

import br.com.abc.javacore.parte16_excecoes.customexception.LoginInvalidoException;

public class CustomExceptionTest
{
	public static void main(String[] args)
	{
		try
		{
			logar();
		}
		catch (LoginInvalidoException e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logar() throws LoginInvalidoException
	{
		String usuarioBancoDeDados = "Goku";
		String senhaBancoDeDados = "123";
		String usuarioDigitado = "Goku";
		String senhaDidigitada = "111";
		if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDidigitada))
		{
			throw new LoginInvalidoException();
		}
		else
		{
			System.out.println("Logado");
		}
	}
}
