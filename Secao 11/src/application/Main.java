package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}

}
