package C10_DateAndTime;

import java.text.*;

public class DecimalFormatEx1 {
	public static void main(String[] args) {
		double number = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println(df.format(number));
	}
}
