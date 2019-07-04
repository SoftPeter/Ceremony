package C5_Array;

import java.util.*;

public class UsingArray4 {
	public static void main(String[] args) {
		int[] num = new int[45];
		
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45);
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}
	}
}
