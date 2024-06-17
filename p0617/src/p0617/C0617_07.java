package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력받기
		// 숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램을 구현하시오.
		
		System.out.println("첫번째 숫자를 입력하세요");
		String num = scan.next();
		System.out.println("두번째 숫자를 입력하세요");
		String num2 = scan.next();
		char ch = num.charAt(0);
		char ch2 = num2.charAt(0);
//		System.out.println((int)ch);
//		System.out.println((int)ch2);
////		
		if ((ch >='0' && ch<='9') && (ch2 >='0' && ch2 <='9')){
			int num3 = ch - '0';
			int num4 = ch2 - '0';
//			int n = Integer.parseInt(ch);
//			int n2 = Integer.parseInt(ch2);
			
//			System.out.println(n+n2);
			System.out.println(num3+num4);
		}else {
			System.out.printf("%c,%c 중 문자가 있습니다.\n",ch,ch2);
		}
		
		
	}
}
