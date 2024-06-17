package p0617;

import java.util.Scanner;

public class C0617_13 {

	public static void main(String[] args) {
		// if, switch
		// 두 수를 입력받아, 사칙연산 프로그램 구현
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		int n2 = scan.nextInt();
		
		System.out.println(" 1.더하기(+)  2.빼기(-)  3.곱하기(*)  4.나누기(/) ");
		System.out.println("사칙연산 중 원하는 연산기호를 입력하세요.");
		
//		int choice = scan.nextInt();
		String choice = scan.next();
	
		
		switch(choice) {
		
		case "+":
			System.out.println("더하기 : "+(n+n2));
			break;
		case "-":
			System.out.println("빼기 : "+(n-n2));
			break;
		case "*":
			System.out.println("곱하기 : "+(n*n2));
			break;
		case "/":
			System.out.println("나누기 : "+(n/n2));
			break;
		default:
			System.out.println("번호를 잘 못 입력하셨습니다.");
			break;
			
			
			
		}
		
	}
}
