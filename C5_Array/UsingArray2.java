package C5_Array;

import java.util.*;

public class UsingArray2 {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int min = score[0];
		int max = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(min > score[i])
				min = score[i];
			else if(max < score[i])
				max = score[i];
		}
		
		System.out.println("최대값 :" + max + "\n" + "최소값 :" + min);
	}
}
