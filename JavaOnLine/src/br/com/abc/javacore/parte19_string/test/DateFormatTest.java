//Aula 85 - Formatação de datas com DateFormat
package br.com.abc.javacore.parte19_string.test;
//

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		DateFormat[] dataFormatadas = new DateFormat[6];
		dataFormatadas[0] = DateFormat.getInstance();
		dataFormatadas[1] = DateFormat.getDateInstance();
		dataFormatadas[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dataFormatadas[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dataFormatadas[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dataFormatadas[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for (DateFormat dateFormat : dataFormatadas)
		{
			System.out.println(dateFormat.format(c.getTime()));
		}
	}
}
