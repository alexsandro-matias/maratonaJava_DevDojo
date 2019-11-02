package br.com.abc.javacore.introducao;

//Aula 10 -	Estruturas condicionais if e else
public class ControleDeFluxo1
{
	public static void main(String[] args)
	{
		// idade < 15 - infatil
		// idade >= 15 && idade < 18 - juveil
		// idade > 18 - adulto
		int idade = 15;
		float salario = 2000;
		boolean testeLogico = false;
		if (idade > 18) // nos parantesis sempre um valor lógico(booleano) deve
						// ser comparado.
		{
			System.out.println("Ele entrou no clube.");
		}
		else // senao
		{
			System.out.println("Não pode entrar no clube");
		}
		if (testeLogico = true) // nesse caso será uma atribuição, e não uma
								// comparação.
		{
			System.out.println("Ele entrou no clube.");
		}
		// caso haja apenas uma instrução, não são necessárias chaves. Porém é
		// uma boa prática deixá-las para manuntenção do código.
		else
		{
		}
	}
}
