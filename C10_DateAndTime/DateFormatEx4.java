package C10_DateAndTime;

import java.util.*;
import java.text.*;

public class DateFormatEx4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc =new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예:2015/12/31");
		
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("재입력하세요");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	}
}
