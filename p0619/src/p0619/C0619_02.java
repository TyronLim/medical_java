package p0619;

import java.util.Arrays;

public class C0619_02 {

	public static void main(String[] args) {
		
		// 1-25 까지 넣고 [5,5]출력하시오
		int[][] arr = new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = (i*5)+(j+1);
			}
		}
		
		int a = 0;
		for(int i=0;i<300;i++) {
			int b = (int)(Math.random()*5);
			int c = (int)(Math.random()*5);
			a = arr[0][0];
			arr[0][0] = arr[b][c];
			arr[b][c] = a;
		}

		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// 1-25까지 랜덤 배열을 생성 후 [5][5]에 넣으시오.
		
		
		
		
		
		
		
		
		// 1-45까지 로또 번호를 생성해서, 랜덤으로 섞은 후 출력하시오.
	
//		int[] ball = new int[45];
//		
//		for (int i=0;i<45;i++) {
//			ball[i] = i+1;
//		}
//
//		
//		int b = 0;
//		for(int i=0;i<300;i++) {
//			int a = (int)(Math.random()*45);
//			b = ball[0];
//			ball[0] = ball[a];
//			ball[a] = b;
//		}
//		
//		System.out.println(Arrays.toString(ball));
//		
		
		
		
	}
}
