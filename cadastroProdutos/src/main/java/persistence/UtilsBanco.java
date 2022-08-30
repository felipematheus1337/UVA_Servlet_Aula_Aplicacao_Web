package persistence;

import java.util.GregorianCalendar;

public class UtilsBanco {
	
	public static GregorianCalendar converterData(String data) {
		System.out.println(data);
		String novaData[] = data.split("-");
		String ano = novaData[0];
		String mes = novaData[1];
		String dia = novaData[2];
		
		GregorianCalendar dtgc = new GregorianCalendar(Integer.parseInt(ano),Integer.parseInt(mes) -1,Integer.parseInt(dia));
		return dtgc;
	}

}