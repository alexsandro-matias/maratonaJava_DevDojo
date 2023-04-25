//Aula 77 - Assertivas
package br.com.abc.javacore.parte18_wrappers.test;

public class AssertivasTest {
	// Assertivas é para que valores sejam verificados e caso esse valor não
	// esperado será lançado um erro. Um exemplo seria um valor negativo para
	// salário. O assert sempre vai garantir que o valor esperado seja utilizado.
	// Ele é ignorado, para que funcione é necessário que seja ativado.
	public static void main(String[] args) {
		calculaSalario(-2000);
	}

	private static void calculaSalario(double salario)
	// esse método deve ser privado para que somente a equipe possa
	// escolher tais valores.
	{
		assert (salario > 0) : "Valor de salário negativo" + salario;
		// Não é mais necessário o if/else
		//
		// if (salario > 0)
		// {
		// // Cálculo qualquer.
		// }
		// else
		// {
		// // Não deveria existir
		// }
	}
	//
	// Caso queira fazer tratamento

	public static void calcularSalario(double salario) {
		if (salario < 0) {
			throw new IllegalArgumentException();
		}
	}

	public static void diasDaSemana(int dia) {
		switch (dia) {
		case 1:
			break;
		default:
			assert false;
			// System.out.println("Dia um inválido");
			// break;
		}
	}
}
