package br.com.abc.javacore.parte15_polimorfismo.test;

import br.com.abc.javacore.parte15_polimorfismo.classes.ArquivoDAO;

public class DAOTest
{
	public static void main(String[] args)
	{
		ArquivoDAO arquivoDAO = new ArquivoDAO();
		arquivoDAO.save();
		// Mas se quiserssemos salvar no banco de dados. 
		ArquivoDAO arquivoDAO = new ArquivoDAO();
		arquivoDAO.save();
	}
}
