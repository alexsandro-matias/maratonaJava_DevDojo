package br.com.abc.javacore.parte16_excecoes.customexception;

public class LoginInvalidoException extends Exception // Com essa implementação, estaremos personalizando noss exceção.
{
	// Exceção do tipo checked, uma vez que é filha de Exception.
	public LoginInvalidoException()
	{
		super("Login ou senha inválidos.");
		// Não deve haver nenhum método para tratamento de exceções nesta classe.
	}
}
