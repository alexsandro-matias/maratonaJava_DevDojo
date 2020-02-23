package br.com.abc.javacore.parte20_datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest
{
	public static void main(String[] args)
	{
		Locale locale = new Locale("pt");
		Locale locale2 = new Locale("en", "US");
		// Língua ou Língua+país
		Calendar calendario = Calendar.getInstance();
		calendario.set(2020, Calendar.DECEMBER, 30);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
		System.out.println(dateFormat.format(calendario.getTime()));
		System.out.println(dateFormat2.format(calendario.getTime()));
	}
}
