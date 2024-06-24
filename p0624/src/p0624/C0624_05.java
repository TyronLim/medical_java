package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 두 수와 한 개의 사칙연산(+,-,*,/)
		// 입력받아 결과값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[2];
		for(int i=0;i<2;i++) {
			System.out.println("숫자를 입력하세요");
			int x = scan.nextInt();
			num[i] = x;
		}
		System.out.println("연산기호를 입력하세요");
		String str = scan.next();
		
		Calculate f = new Calculate();
//		System.out.println(f.cal(num, str));
		
		
				
		
		
//		System.out.println("숫자를 입력하세요");
//		int x = scan.nextInt();
//		System.out.println("숫자를 입력하세요");
//		int x2 = scan.nextInt();
//		System.out.println("연산기호를 입력하세요");
//		String str = scan.next();
//		
		
//		Calculate f = new Calculate();
//		System.out.println(f.cal(x, x2, str));
		
		
//		int result = 0;
//		
//		switch(str){
//		case "+":
//			result = x+x2;
//			break;
//			
//		case "-":
//			result = x-x2;
//			break;
//			
//		case "*":
//			result = x*x2;
//			break;
//			
//		case "/":
//			result = x/x2;		
//			break;
		
//		}
		
//		System.out.println(result);
		
		
		
		
	}
}
