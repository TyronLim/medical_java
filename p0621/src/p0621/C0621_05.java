package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 입력한 두 수의 더하기,빼기,곱하기,나누기 계산결과값을 출력하시오.
		
		System.out.println("숫자 1을 입력하세요 >>");
		int a = scan.nextInt();
		System.out.println("숫자 2를 입력하세요 >>");
		int b = scan.nextInt();
		
		C0621_05 c = new C0621_05();
		int plus = c.plus(a, b); 
		System.out.println("더하기값 : "+plus);

		int minus = c.minus(a, b); 
		System.out.println("빼기값 : "+minus);
		
		int multi = c.multi(a, b);
		System.out.println("곱하기값 : "+multi);
		
		double divide = c.divide(a, b);
		System.out.println("나누기값 : "+divide);
		
	
		
		
		
	}
	
	int plus(int a, int b) {
		return a+b;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
	
	double divide(double a, double b) {
		return a/b;
	}
	
	
	

}
