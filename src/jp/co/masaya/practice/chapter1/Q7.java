package jp.co.masaya.practice.chapter1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q7 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date dt = df.parse("19641010");
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		StringBuffer sb;
		while (Integer.parseInt(df.format(cal.getTime())) <= Integer.parseInt("20200724")) {
//			System.out.println("対象日付 :" + df.format(cal.getTime()));
			sb = new StringBuffer(Integer.toBinaryString(Integer.parseInt(df.format(cal.getTime()))));

			// 逆転して2→10進数変換した日付=日付
			if (Integer.parseInt(String.valueOf(sb.reverse()), 2) == Integer.parseInt(df.format(cal.getTime()))) {
				System.out.println(df.format(cal.getTime()));
			}
			cal.add(Calendar.DATE, 1);
		}
	}
}