package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 입력한 숫자를 소수점 2자리 절사하시오.
		System.out.println("소수를 입력하시오");
		double num = scan.nextDouble();
		
		float num2 = (int)(num*100)/100f;  //floor
		float num3 = Math.round(num*100)/100f;  //round
		double num4 = Math.ceil(num*100)/100d;  //ceil
		double num5 = Math.floor(num*100)/100f;  //floor
		System.out.println("결과 : "+num2);
		System.out.println("결과 : "+num3);
		System.out.println("결과 : "+num4);
		System.out.println("결과 : "+num5);
		
	
		
		
		
		
		
//		float pi = 3.141592f;
//		float shortPi = (int)(pi*1000)/1000f;
//		System.out.println(shortPi);
		
		
		
	}
}
