package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//문자열을 입력받아 2번째의 문자를 출력하시오.
		//문자열 길이가 3칸 미만으로 입력되면 다시 입력하도록
		//x가 입력되면 프로그램 종료
		
		while(true) {
		System.out.println("아무 말이나 입력해주세요.");
		String thing = scan.nextLine();
		if(thing.equalsIgnoreCase("x")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		if(thing.length()<3) {
			System.out.println("3글자 이상으로 입력하세요");
			continue;
		}
		
		System.out.println("3번째 문자 : "+thing.charAt(2));
		
		
		}
	}
}
