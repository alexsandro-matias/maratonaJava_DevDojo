// Aula 66: Polimorfismo pt 03

package br.com.abc.javacore.parte15_polimorfismo.classes;

public class DataBaseDAO implements GenericDAO
{
	@Override public void save()
	{
		System.out.println("Salvando dados no banco de dados com sucesso");
	}
}
