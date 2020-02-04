// Aula 66: Polimorfismo pt 03

package br.com.abc.javacore.parte15_polimorfismo.test;

import br.com.abc.javacore.parte15_polimorfismo.classes.DataBaseDAO;
import br.com.abc.javacore.parte15_polimorfismo.classes.GenericDAO;

public class DAOTest
{
	public static void main(String[] args)
	{
		// ArquivoDAO arquivoDAO = new ArquivoDAO();
		// arquivoDAO.save();
		// Mas se quiserssemos salvar no banco de dados.
		// Deixando como forma genérica
		GenericDAO arquivoDAO = new DataBaseDAO(); // basta mudar o objeto para ArquivoDAO()
		arquivoDAO.save(); // totalmente genérica já que a interface não muda, somente o objeto chamado.
	}
}
