package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 구구단 출력 시 2-9단까지 출력하는데, 1,3,5,7,9 홀수단 출력하시오.
		for(int i=1;i<=9;i++) {
			System.out.println("\n");
			for(int j=3;j<=9;j = j+2) {
				System.out.printf("%d*%d=%d \t",j,i,(i*j));
			}
		}
		
//		for(int i=3;i<=9;i=i+2) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d*%d=%d \n",i,j,(i*j));
//			}
//		}
//		
		
		
		
		
//		// 1-10까지 합
//		int sum = 0;
//		int i = 0;
//		for(i=1;i<=10;i++) {
//			sum=sum+i;
//		}
//		System.out.println((i-1)+"까지의 합 :"+sum);
		
//		// 1-100까지 합 구하는데, sum값이 150을 넘었을 때 i,sum 값을 출력하시오.
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			sum = sum+i;
//			if (sum >=150) {
//				System.out.println("i의 값"+i);
//				System.out.println("sum의 값"+sum);
//				break;
//			}
//		}
		
		
		
//		//구구단 중첩for문 사용
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}
//		
		
//		for(int i=1;i<=9;i++) {
//			System.out.println("\n");
//			for(int j=2;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",j,i,(i*j));
//			}
//		}
		
		
//		// 10번 입력받을 때마다 합계를 출력하시오.
//		int sum = 0;
//		for(int i=1; i<=10;i++) {
//			System.out.println("숫자를 입력하세요");
//			int input = scan.nextInt(); 
//			sum = sum + input;
//			if (input%10==0) System.out.println(sum);
//		}
		
		
		
		
//		// 1-100까지 홀수만 더해서 최종값을 출력하시오.
//		int sum = 0;
//		for(int i=1;i<=100;i=i+2) {
//			sum = sum+i;
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("최종sum : "+sum);
//		
		
		
		
		
		// 1-100까지 더해서 최종값을 출력하시오.
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			sum = sum+i;
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("최종sum : "+sum);
		
		
		
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum = sum+i;
//			System.out.println("i :"+i);
//			System.out.println("sum :"+sum);
//		}
//		
//		System.out.println("최종 sum :"+sum);
		
		
		
		
		
		
		
	}
}
