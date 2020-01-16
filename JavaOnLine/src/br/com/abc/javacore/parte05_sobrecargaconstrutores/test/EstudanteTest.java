package br.com.abc.javacore.parte05_sobrecargaconstrutores.test;

import br.com.abc.javacore.parte05_sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest
{
	public static void main(String[] args)
	{
		Estudante estudante = new Estudante("20161y6-Rc0050", "Alexsandro Matias", new double[]
		{ 7, 9, 4 }, "13/04/2019");
		estudante.imprime();
	}
}
