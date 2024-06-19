package p0619;

import java.util.Arrays;

public class C0619_03 {

	public static void main(String[] args) {
		int[] score = {1,2,3,4,5};
		System.out.println(Arrays.toString(score));
		
		int[] score2 = score; // 얕은 복사 - 주소값만 복사됨.
		System.out.println(Arrays.toString(score2));
		
		int[] score3 = new int[score.length];
		for (int i=0;i<score3.length;i++) {
			score3[i]=score[i];
		}
		score[4] = 0;
		System.out.println(Arrays.toString(score3));
		
		int[] score4 = new int[5];
		score[4] = 5;
		System.arraycopy(score, 3, score4, 1, 2);
		System.out.println(Arrays.toString(score4));
		
		
//		System.out.println(Arrays.toString(score));
//		System.out.println(Arrays.toString(score2));
//		
		
		
		
		
		// 변수를 복사했을 때, 기존의 값이 변경이 된다고 해서 복사한 값이 변경되지 않음.
		int num = 10;
		int num2 = num;
		num = 5;
		System.out.println(num);
		System.out.println(num2);
	}
}
