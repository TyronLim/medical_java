package p0614;

import java.util.Scanner;	// Scanner 시 임포트 필수

public class C0614_08 {

	public static void main(String[] args) {
//		input()
//		java.util.Scanner scan = new java.util.Scanner(System.in);	임포트 안 할 때 Scanner 사용방법
		Scanner scan = new Scanner(System.in);
		
		// 숫자 : nextInt(), nextDouble()
		System.out.println("숫자를 입력하세요");
		//int num = scan.nextInt();
		String num = scan.nextLine();
		System.out.println("숫자2를 입력하세요");
		String num2 = scan.nextLine();
//		System.out.println("입력한 숫자 : "+num+num2);
	
		// 기본형 타입 같은 경우, 형변환
		// String 참조형 타입
		int number = Integer.parseInt(num); // 참조형 문자열 타입을 정수형타입으로 변경
		int number2  = Integer.parseInt(num2);
		System.out.println("입력한 숫자 : "+number+number2);
		
//		System.out.println("문자를 입력하세요!!");
//		String str = scan.next();
//		System.out.println("입력한 문자 : "+str);
//		
//		// 문자열 - next() = 사이띄우기 전까지만 입력받음.
//		// 문자열 - nextline() = 문자 사의띄우기 가능
//		System.out.println("문자2를 입력하세요!!");
//		String str2 = scan.next();
//		System.out.println("입력한 문자2 : "+str2);
//		scan.nextLine();
//	
//		System.out.println("문자3를 입력하세요!!");
//		String str3 = scan.nextLine();
//		System.out.println("입력한 문자3 : "+str3);
//		
		
		
		
		
		
	}

}
