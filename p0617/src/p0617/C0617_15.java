package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		
//		// 1~100까지의 숫자를 랜덤으로 생성해서 출력하시오.
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
//		
//		// 1부터 3까지 랜덤숫자 생성해서 출력하시오.
//		int num2 = (int)(Math.random()*3)+1;
//		System.out.println(num2);
//		
		// 1부터 45까지 랜덤숫자 생성
		int lotto = (int)(Math.random()*45)+1;
		System.out.println(lotto);
		// 숫자 1개 입력받아
		// 같으면 당첨, 다르면 꽝
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요");
		int pickNum = scan.nextInt();
		
		if (pickNum == lotto) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		
		
//		System.out.println(Math.random());
		
//		Math.random(); //0<= x <1
//		System.out.println(Math.random());
//		
//		Math.round(0);
//		Math.max(10.5, 5);
//		
//		//1~10 까지 랜덤 숫자 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//	
//		int num2 = (int)(Math.random()*100)+1;
//		System.out.println(num2);
//		
//		int num3 = (int)(Math.random()*4)+1;
//		System.out.println(num3);
//
//		int num4 = (int)(Math.random()*19)+1;
//		System.out.println(num4);
//		
//		//0~9까지
//		int num5 = (int)(Math.random()*10);
//		System.out.println(num5);
//	
//		//0~10까지
//		int num6 = (int)(Math.random()*11);
//		System.out.println(num6);
//	
//		//2~10까지
//		int num7 = (int)(Math.random()*9)+2;
//		System.out.println(num7);
		
		
		
		
		
	
	}
}
