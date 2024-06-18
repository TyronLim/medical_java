package p0618;

import java.util.Arrays;

public class C0618_06 {

	public static void main(String[] args) {
		
		// int 배열 10개를 선언해서 1,3,5,7,9.... 10개 입력해서 출력하시오.
		
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = ((i+1)*2)-1;
			System.out.println(arr[i]);
		}
		
		
		int arr2[] = new int[10];
		int j = 0;
		while(true) {
			if (j == 10) break;
			arr2[j] = ((j+1)*2)-1;
			System.out.println(arr2[j]);
			j++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		
		// 배열선언1
//		int[] score = new int[5];
//		int score[] = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		// 배열선언2
//		int sc[] = {1,2,3,4,5};
//		// 배열선언3
//		int sc2[] = new int[] {1,2,3,4,5};
//		// 배열선언4
//		int s[] = new int[5];
//		for(int i=0;i<5;i++) {
//			s[i] = i+1;
//		}
//		System.out.println(s[3]);
//		System.out.println(score[4]);
//		
	}
}
