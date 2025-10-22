package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class HorasAtuais {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Pega Fuso-horario do sistema que está rodando
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate d01 = LocalDate.now();
		System.out.println("Data de hoje: " + fmt1.format(d01));
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Horas atuais: " + fmt2.format(d02));
		
		Instant d03 = Instant.parse("2025-10-22T01:20:44Z");
		System.out.println("Data hora global: " + fmt3.format(d03));
		
		System.out.println("Data hora global ISO: " + fmt5.format(d03));

	}

}
