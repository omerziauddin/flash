package com.system.time.systemTimedemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class SystemTimeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemTimeDemoApplication.class, args);
	}
	@GetMapping("/time")
	public String time(@RequestParam(value = "name", defaultValue = "World") String name)
	{
		
		GregorianCalendar time = new GregorianCalendar();
		  int hour = time.get(Calendar.HOUR_OF_DAY);
		  int min = time.get(Calendar.MINUTE);
		  int day = time.get(Calendar.DAY_OF_MONTH);
		  int month = time.get(Calendar.MONTH) + 1;
		  int year = time.get(Calendar.YEAR);

		 
  
		  if (hour < 12)
	        return String.format("GOOD MORNING %s!", name);
		  
		  else if (hour < 17 && !(hour == 12))
			  return String.format("GOOD AFTERNOON %s!", name);
		  else if (hour == 12)
			  return String.format("GOOD NOON %s!", name);
		  else
			  return String.format("GOOD EVENING %s!", name);
}
}
