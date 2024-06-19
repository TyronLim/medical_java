package p0619;

import java.util.Scanner;
import java.util.Arrays;

public class C0619_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램 구현
		// 1-45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또 번호
		// 입력한 입력번호 6개
		// 당첨번호 개수 배열, 카운트 변수
		// 모든 배열을 출력
		
		
		// 1. ball 배열 45까지 번호 넣기
		int[] ball = new int[45]; // 0-44
		
		for(int i=0; i<45; i++) {
			ball[i] = i+1; // 1-45
		}
		
		// 2. ball배열 섞기
		int no = 0; 		// 0번째 배열과 바꿀 배열번호
		int t_value = 0;    // 임시적으로 저장하는 공간
		
		for(int i=0; i<300; i++) {
			no = (int)(Math.random()*45); // 0-44
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		
		// 3. my_ball 입력
		// 6개의 로또번호 입력
		int[] my_ball = new int[6];

		for(int i=0; i<6;i++) {
			System.out.printf("%d번째 로또번호를 입력하세요.",i+1);
			my_ball[i] = scan.nextInt();
		}
		
		// 4. my_ball 출력
		System.out.print("입력번호 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%3d",my_ball[i]);
		}
		System.out.println();
		
		
		// 5. ball 출력
		System.out.print("로또번호 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%3d",ball[i]);
		}
		System.out.println();
		
		// 6. 당첨개수
		int cnt = 0;
		int count[] = new int[6];
		for(int i=0;i<6;i++) {
			for(int j=0;j<my_ball.length;j++) {
				if(ball[i]==my_ball[j]) {
					cnt++;
					count[i] = my_ball[j];
					break;
				}
			}
		}
		System.out.printf("%d개 맞히셨습니다.",cnt);
		
		System.out.println();
		// 7. 당첨번호 출력
		if(cnt==0) {
			System.out.println("맞힌 번호가 없습니다.");
		}else {
			System.out.print("맞힌 번호 : ");
//			System.out.println(Arrays.toString(count));
			for(int i=0;i<count.length;i++) {
				if(count[i]==0) { continue;}
				else {
					System.out.print(count[i]+"\t");
				}
			}	
			
				
		}
		
		
		
		
		
//		int arr[][] = new int[5][5];
//
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				arr[i][j] = (i*5)+(j+1);
//			}
//		}
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		int a = '\t';
//		System.out.println(a);
//		
//		
//		String aa = "안녕";
//		System.out.println(aa);
		
		
		
		
	}
}
