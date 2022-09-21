package persistence;

import java.text.SimpleDateFormat;
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
	
	
	public static String convertDateToDataBase(GregorianCalendar dtgc) {
		String dtFormatada = "";
		if(dtgc != null) {
			SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd");
			dtFormatada =  dt.format(dtgc.getTime());
		}
		
		return dtFormatada;
		
	}
	

}