package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for(int i=0; i<3;i++) {
			System.out.printf("%d번째 숫자를 입력하세요\n",i+1);
			num[i] = scan.nextInt();
		}
		
		
		Cal d = new Cal();
		int result = d.add(num[0],num[1],num[2]);
		
		System.out.println("더하기 합계 : "+result);
//		
		int result2 = d.add2(num);
		System.out.println(result2);
		
		
//		// 두 수를 입력받아, 두 수를 더한 값을 출력하시오.
//		
//		System.out.println("숫자 1을 입력하세요");
//		int a = scan.nextInt();
//		
//		System.out.println("숫자 2을 입력하세요");
//		int b = scan.nextInt();
//	
//		System.out.println("더한 값 : "+(a+b));
		
//		
//		int arr[] = new int[3];
//		for(int i=0; i<3;i++) {
//			System.out.printf("%d번째 숫자를 입력하세요\n",i+1);
//			arr[i] = scan.nextInt();				
//		}
//		
//		System.out.println("합 : "+(arr[0]+arr[1]+arr[2]));
		
	
		
	}
}
