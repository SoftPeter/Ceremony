package C5_Array;

import java.util.*;

public class UsingArray7 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int[] count = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*num.length);
			System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			count[num[i]]++;
		}
		
		for(int i=0; i<num.length; i++) {
			
			System.out.println(i + "의 개수 :" + count[i]);
		}
	}
}
