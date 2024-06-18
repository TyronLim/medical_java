package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요. (- 제외)");
		String num = scan.nextLine();
		String birthY = num.substring(0,2);
		String num2 = num.substring(6,7);
		
//		System.out.println(num2);
//		int age = 0;
		if (num2.equals("1") || num2.equals("2")) {
			System.out.println(2024 - Integer.parseInt("19"+birthY));
			
		}else if(num2.equals("3") || num2.equals("4")) {
			System.out.println(2024 - Integer.parseInt("20"+birthY));
			
		}else {
			System.out.println("올바른 주민번호를 입력하세요.");
		}
		
		
	}
}
