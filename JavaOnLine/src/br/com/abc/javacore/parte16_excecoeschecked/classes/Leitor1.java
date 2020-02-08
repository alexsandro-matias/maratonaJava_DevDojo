package br.com.abc.javacore.parte16_excecoeschecked.classes;

public class Leitor1 implements AutoCloseable
{
	public void close() throws Exception
	{
		System.out.println("Fechando leitor1");
	}
}
