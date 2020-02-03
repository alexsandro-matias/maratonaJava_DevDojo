// Aula 66: Polimorfismo pt 03

package br.com.abc.javacore.parte15_polimorfismo.classes;

public class ArquivoDAO implements GenericDAO
{
	@Override public void save()
	{
		System.out.println("Arquivo salvo com sucesso");
	}
}
