package p0624;

import java.util.Scanner;

public class Stu_pro {
	Scanner scan = new Scanner(System.in);
	int s_count = 0;
	
	int stu_screen(){
		System.out.println("[ 학생성적 프로그램 ]");
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
		scan.nextLine(); //enter키 때문
		return choice;
	} // stu_screen
	
	void stu_input(stu_score[] sc) {
		while(true) {
		s_count = Stu_score.count;
		System.out.println("학생 성적 입력");
		System.out.println("학생의 이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = scan.nextInt();
		
		ss[s_count]= new Stu_score()
		
		
		}//while
	}//stu_input
	
	
	
	
	
	
} //class
