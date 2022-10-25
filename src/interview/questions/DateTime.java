package interview.questions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {

		String date = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(Calendar.getInstance().getTime());
		System.out.println(date);

		System.out.println("---------------------------");

		Date date1 = new Date(System.currentTimeMillis());
		System.out.println(date1);

		System.out.println("---------------------------");

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		System.out.println("---------------------------");

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

	}

}
