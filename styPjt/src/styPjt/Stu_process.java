package styPjt;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {
	Scanner scan = new Scanner(System.in);
	
	String[] title = {"학번","이름","국어","영어","수학","총점","평균","등수"};
	String stuNo,name;
	int kor,eng,math,total,rank;
	double avg;
	int choice;
	int count = -1;
	
	int Stu_screen(){
		System.out.println("[[학생성적입력프로그램]]");
		System.out.println("============================================");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 전체출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 삭제");
		System.out.println("5. 학생성적 검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("============================================");
		System.out.println("원하시는 번호를 선택해주세요.");
		choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
	} //Stu_screen
	
	void Stu_input(ArrayList sp) {
		while(true) {
			System.out.println("[[학생성적 입력]]");
			System.out.println((sp.size()+1)+"번째 학생의 이름을 입력하세요.(0:이전페이지 이동)");
			name = scan.nextLine();
			if(name.equals("0")) {
				System.out.println("이전 화면으로 이동합니다.");
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			scan.nextLine();
			
			Students sn = new Students(name,kor,eng,math);
			sp.add(sn);
			
			System.out.println("학생 성적이 입력되었습니다.");
			System.out.println("학번\t\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
			System.out.println("----------------------------------------------------------------");
			for(int i=0;i<sp.size();i++) {
				Students s = (Students)sp.get(i);
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
			}
			
		}//while
	}//Stu_input
	
	void Stu_print(ArrayList sp) {
		System.out.println("[[학생성적 출력]]");
		System.out.println("====================================================================");
		System.out.println("학번\t\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
		System.out.println("--------------------------------------------------------------------");
		for(int i=0;i<sp.size();i++) {
			Students s = (Students)sp.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
			
		}
		
	}//Stu_print
	
	void Stu_update(ArrayList sp) {
		Stu_subsearch(sp);
		if(count!=-1) {
			Students s = (Students)sp.get(count);
			System.out.println("====================================================================");
			System.out.println("학번\t\t이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
			System.out.println("--------------------------------------------------------------------");
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
			System.out.println("====================================================================");
			System.out.println();
			System.out.println("1. 국어점수 수정");
			System.out.println("2. 영어점수 수정");
			System.out.println("3. 수학점수 수정");
			System.out.println("수정할 점수를 선택해주세요.");
			choice = scan.nextInt();
		
			switch(choice) {
			case 1:
				System.out.println("국어점수 수정을 선택하셨습니다.");
				System.out.println("수정할 국어 점수를 입력해주세요.");
				s.kor = scan.nextInt();
				scan.nextLine();
				System.out.printf("국어점수가 %d로 변경되었습니다.",s.kor);
				s.total = s.kor+s.eng+s.math;
				s.avg = s.total/3.0;
				break;
				
			case 2:
				System.out.println("영어점수 수정을 선택하셨습니다.");
				System.out.println("수정할 영어 점수를 입력해주세요.");
				s.eng = scan.nextInt();
				scan.nextLine();
				System.out.printf("영어점수가 %d로 변경되었습니다.",s.kor);
				s.total = s.kor+s.eng+s.math;
				s.avg = s.total/3.0;
				break;
				
			case 3:
				System.out.println("수학점수 수정을 선택하셨습니다.");
				System.out.println("수정할 수학 점수를 입력해주세요.");
				s.math = scan.nextInt();
				scan.nextLine();
				System.out.printf("수학점수가 %d로 변경되었습니다.",s.kor);
				s.total = s.kor+s.eng+s.math;
				s.avg = s.total/3.0;
				break;
			}
		
		}//else
	}// Stu_update
	
	void Stu_delete(ArrayList sp) {
		Stu_subsearch(sp);
		
	}
	
	
	
	
	
	
	
	
	
	void Stu_subsearch(ArrayList sp) {
		System.out.println("[[학생성적 수정]]");
		System.out.println("====================================================================");
		System.out.println("수정할 학생의 이름을 입력하세요");
		String search = scan.nextLine();
		for(int i=0;i<sp.size();i++) {
			Students s = (Students) sp.get(i);
			if(s.name.equals(search)) {
				count = i;
				System.out.printf("검색하신 %s 학생에 대한 정보가 있습니다.\n",search);
			}
		}
		
		if(count == -1) {
			System.out.printf("검색하신 %s 학생에 대한 정보가 없습니다. 다시 시도해주세요.\n",search);
			return;
		}
	}
	
}
