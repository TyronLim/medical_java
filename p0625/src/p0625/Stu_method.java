package p0625;

import java.util.Scanner;

public class Stu_method {
	Scanner scan = new Scanner(System.in);
	
	int screen(){
		System.out.println("학생성적프로그램");
		System.out.println("---------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		return choice;
	}
	
	void input(Stu_score[] sc) {
		System.out.println("학생 성적 입력");
		System.out.println("이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
