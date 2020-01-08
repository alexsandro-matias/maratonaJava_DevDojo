package br.com.abc.javacore.parte01_introducao;

//Aula 10 -	Estruturas condicionais if e else
public class Aula010_2
{
	public static void main(String[] args)
	{
		// idade < 15 - infatil
		// idade >= 15 && idade < 18 - juveil
		// idade > 18 - adulto
		//
		int idade = 18;
		float salario = 2000;
		boolean testeLogico = false;
		// nos parantesis sempre um valor lógico(booleano) deve ser comparado.
		//
		if (idade < 15)
		{
			System.out.println("Categoria Infatil.");
		}
		else if (idade >= 15 && idade < 18)
		{
			System.out.println("Categoria Juvenil");
		}
		//
		// Ou else if(idade > 18)
		else
		{
			System.out.println("Categoria Adulto");
		}
		if (testeLogico = true) // nesse caso será uma atribuição, e não uma
								// comparação.
		{
			System.out.println("Ele entrou no clube.");
		}
		// caso haja apenas uma instrução, não são necessárias chaves. Porém é
		// uma boa prática deixá-las para manuntenção do código.
	}
}
