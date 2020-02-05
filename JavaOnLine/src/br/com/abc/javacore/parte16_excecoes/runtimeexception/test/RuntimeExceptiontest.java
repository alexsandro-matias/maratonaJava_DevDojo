//Aula 68 -  Exceptions pt 02
//Aula 69 - Exceptions - Exceções checked pt 03
//Aula 70 - Exceptions - lançando Exceções 
package br.com.abc.javacore.parte16_excecoes.runtimeexception.test;

public class RuntimeExceptiontest
{
	public static void main(String[] args)
	{
		// // int a = 10 / 0;
		// // System.out.println(a);
		// // Erro em tempo de execução, já que esse valor nulo poderia ter vindo de um
		// // banco de dados ou digitado pelo usuário e que deve ser tratado.
		// //
		// // Object o = null;
		// // // Erro de uma referência para nenhum objeto
		// // System.out.println(o.toString());
		// //
		// // Fora da faixa do vetor.
		// // int[] a = new int[2];
		// // System.out.println(a[2]);
		// // Exceção gerada
		// // java.lang.ArrayIndexOutOfBoundsException
		// // Colocando dentro um bloco try/catch?
		// try
		// {
		// int[] a = new int[2];
		// System.out.println(a[2]);
		// }
		// // catch (Exception e) // subirá a mesma exceção uma vez que é
		// RuntimeException
		// // é filha de Exception.
		// // {
		// // e.printStackTrace();
		// // }
		// // catch (RuntimeException e) // subirá a mesma exceção uma vez que é
		// // RuntimeException é filha de Exception - Poliformismo.
		// // {
		// // e.printStackTrace(); // ele mostra o mesmo o erro antes de ser lançada a
		// // exceção.
		// // }
		// catch (ArrayIndexOutOfBoundsException e) // Nesse caso se torna melhor, por
		// que é mais específico (subclasse).
		// {
		// e.printStackTrace(); // ele mostra o mesmo o erro antes de ser lançada a
		// exceção. - somente para geração de logs para desenvolvedores.
		// }
		// caso seja usado o bloco try/catch, poderemos usar de outra forma:
		try
		{
			divisao(10, 0);
		}
		catch (RuntimeException e)
		{
			System.out.println(e.getMessage()); // Vai ser mostrado somente a mensagem (retorno de uma String) de
												// Exceção. Mas nítido
		}
	}
	
	private static void divisao(int num1, int num2)
	{
		// if (num2 == 0)
		// {
		// throw new ArithmeticException();
		// }
		// Neste tratamento, não é a melhor maneira por que o segundo argumento pode ser
		// errado. Pra isso existe uma exceção apropriada pra isso.
		// IllegalArgumentException
		if (num2 == 0)
		{
			throw new IllegalArgumentException("Passe um valor diferente de zero para o divisor."); // Essa uma exceção
																									// do tipo Runtime,
																									// ou seja, não
																									// precisamos criar
																									// um tratamento
																									// (bloco try/catch)
																									// para ela.
		}
		int result = num1 / num2;
		System.out.println(result);
		// Temos um problema: Divisão por zero. Inicialmente podemos colocar uma
		// condicional
	}
}
