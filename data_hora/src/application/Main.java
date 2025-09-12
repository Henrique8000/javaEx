package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		/*
		 https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 */
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDate d01 = LocalDate.now();
		
		LocalDateTime d02 = LocalDateTime.now();
				
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-07-12");
		
		LocalDateTime d05 = LocalDateTime.parse("2025-07-30T14:34:44");
		
		Instant d06 = Instant.parse("2025-04-13T19:30:40Z");
		
		Instant d07 = Instant.parse("2025-04-13T01:30:40-03:00");
		
		LocalDate d08 = LocalDate.parse("02/04/2025", fmt1);
		
		LocalDateTime d09 = LocalDateTime.parse("02/04/2025 01:30:34", fmt2);
		
		LocalDate d10 = LocalDate.of(2005, 3, 16);
		
		LocalDateTime d11 = LocalDateTime.of(2025, 9, 20, 1, 4);
		
		System.out.println("d01 = " + d01);
		System.out.println("\nd02 = " + d02);
		System.out.println("\nd03 = " + d03);
		System.out.println("\nd04 = " + d04);
		System.out.println("\nd05 = " + d05);
		System.out.println("\nd06 = " + d06);
		System.out.println("\nd07 = " + d07);
		System.out.println("\nd08 = " + d08);
		System.out.println("\nd09 = " + d09);
		System.out.println("\nd10 = " + d10);
		System.out.println("\nd11 = " + d11);
	}
}
