package day5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Dateworks {
public static void main(String[] args) {
	//Date d =new Date();
	//it is a hurdle that date is in util and sql package so confusion what to use 
	//for that we have localdate
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	LocalTime lt=LocalTime.now();
	System.out.println(lt);
	LocalDate dob=LocalDate.of(1998, 05, 25);
	System.out.println(dob);
	LocalDate dob2=LocalDate.parse("2021-08-14");
	System.out.println(dob2);
	DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate dob3=LocalDate.parse("21-11-2001",df);
	//df above is mm-day-year there can be many	
	System.out.println(dob3);
	ZonedDateTime zd=ZonedDateTime.now();
	System.out.println(zd);
	for(String z:ZoneId.getAvailableZoneIds()) {
		System.out.println(z);
	}
	LocalTime lc=LocalTime.now(ZoneId.of("America/St_Kitts"));
	System.out.println(lc);
	}
}
