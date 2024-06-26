package p0626;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {
	Scanner scan = new Scanner(System.in);
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo,name;
	int kor,eng,math,total,rank;
	double avg;
	int choice;
	
	int screen(ArrayList list) {
		//screen
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("현재 입력된 학생 수 : "+list.size()+"명");
		System.out.println("---------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("7. 학생성적정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		scan.nextLine(); //enter키 때문
		
		return choice;
	}
	
	void Stu_input(ArrayList list) {
		while(true) {
			System.out.println("[[학생성적입력]]");
			System.out.println((list.size()+1)+"번째 학생의 이름을 입력하세요.(0:이전페이지 이동)");
			name = scan.nextLine();
			if(name.equals("0")) {
				System.out.println("이전 화면으로 이동합니다.");
				break;
			}
			System.out.printf("%s 점수를 입력하세요\n",title[2]);
			kor = scan.nextInt();
			System.out.printf("%s 점수를 입력하세요\n",title[3]);
			eng = scan.nextInt();
			System.out.printf("%s 점수를 입력하세요\n",title[4]);
			math = scan.nextInt();
			scan.nextLine();
			
			//list 저장
			list.add(new Students(name,kor,eng,math));
			
			System.out.printf("%s 학생의 정보가 입력되었습니다.\n",name);
			
			
		}
	}//input
		
	void Stu_output(ArrayList list) {
		System.out.println("[[학생성적전체출력]]");
		System.out.println("=========================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t순위");
		System.out.println("---------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Students sm = (Students)list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
				sm.stuNo,sm.name,sm.kor,sm.eng,sm.math,sm.total,sm.avg,sm.rank);
		}
		System.out.println("=========================================================");
	}//output
	
	
	void Stu_update(ArrayList list) {
		int temp_no = Sub_search(list);
		
		if(temp_no!=-1) {
			System.out.println("수정을 원하는 과목을 선택해주세요.");
			System.out.println("---------------------------");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
		}
		
		Students s = (Students)list.get(temp_no);
		switch(choice) {
		case 1:
			s.kor = subject_update(s,s.kor);
			break;
			
		case 2:
			s.eng = subject_update(s,s.eng);
			break;
			
		case 3:
			s.math = subject_update(s,s.math);
			break;
		}
		
		System.out.println();
		
	}//update
	
	
	int subject_update(Students s,int score) {
		
		System.out.printf("%s점수 수정을 선택하셨습니다.\t",title[choice+1]);
		System.out.printf("현재 %s 점수 : %s\t",title[choice+1],s.kor);
		System.out.printf("수정할 %s점수를 입력해주세요.",title[choice+1]);
		score = scan.nextInt();
		
		if(choice==1) {
			s.kor=score;
		}else if(choice==2) {
			s.eng=score;
		}else if(choice==3) {
			s.math=score;
		}
		
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		System.out.printf("%s학생의 점수가 %d로 수정되었습니다.\n",s.name,score);
		System.out.println("==========================================");
		return score;
	}//subject_update
	
	
	
	void Stu_delete(ArrayList list) {
		
		int temp_no = Sub_search(list);
		
		if(temp_no!=-1){
			System.out.println("학생을 삭제하시겠습니까?(1.삭제 / 0.취소");
			choice = scan.nextInt();
		}
		String name = ((Students)list.get(temp_no)).name;
		
		switch(choice) {
		case 1:
			list.remove(temp_no);
			System.out.printf("%s 학생이 삭제되었습니다.\n",name);
			break;
		case 0:
			System.out.println("삭제를 취소합니다.");
			break;
		}
		
	}// stu_delete
	
	
	
	int Sub_search(ArrayList list) {
		System.out.println("삭제할 학생의 이름을 입력해주세요");
		String search = scan.nextLine();
		
		// 검색
		int temp_no = -1;
		for(int i=0;i<list.size();i++) {
			Students s = (Students) list.get(i);
			if(s.name.equals(search)) {
				temp_no=i;
				Students sm = (Students)list.get(temp_no);
				
				System.out.printf("%s학생에 대한 정보가 있습니다.\n",search);
				System.out.println("==========================================");
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t순위\t총점");
				System.out.println("---------------------------------------------------------");
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						sm.stuNo,sm.name,sm.kor,sm.eng,sm.math,sm.total,sm.avg,sm.rank);
			}
		}
		if(temp_no==-1) {
			System.out.println("찾고자 하는 학생이 없습니다.");
		}
		return temp_no;
	} // sub_search
	
	// 학생검색 메소드
	void Stu_search(ArrayList list) {
		
		System.out.println("[ 학생검색 ]");
		System.out.println("----------------------------");
		System.out.println("1. 학생이름 검색");
		System.out.println("2. 합계점수 검색");
		System.out.println("3. 평균점수 검색");
		System.out.println("0. 이전 페이지로 돌아가기");
		System.out.println("----------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		scan.nextLine();
		int cnt = 0; //학생을 찾았는지 확인 변수
		switch(choice) {
		case 1: // 이름으로 검색
			System.out.println("학생 이름을 입력하세요");
			String t_name = scan.nextLine();
			ArrayList searchList = new ArrayList();
			
			for(int i=0;i<list.size();i++) {
				Students s = (Students)list.get(i);
				if(s.name.contains(t_name)) {
					searchList.add(s);
					cnt++;
				}
			}
				
			if(cnt ==0) {
				System.out.printf("검색어 %s에 대한 학생 정보가 없습니다.\n",t_name);
			}else {
				System.out.printf("검색하신 %s이 포함된 학생 정보입니다.\n",t_name);
				Stu_output(searchList);
				}
			break;
			
		case 2: // 합계점수로 검색
			System.out.println("검색할 총점을 입력하세요(이상)");
			int t_score = scan.nextInt();
			ArrayList scoreList = new ArrayList();
			
			for(int i=0;i<list.size();i++) {
				Students s = (Students)list.get(i);
				if(s.total>t_score) {
					scoreList.add(s);
					cnt++;
				}
			}
			
			if(cnt ==0) {
				System.out.printf("검색점수 %s보다 높은 학생의 정보가 없습니다.\n",t_score);
			}else {
				System.out.printf("검색하신 총점 %s 이상의 학생 정보입니다.\n",t_score);
				Stu_output(scoreList);
				}
			break;
		
		case 3: // 평균점수로 검색
			System.out.println("검색할 평균점수를 입력하세요(이상)");
			int t_avg = scan.nextInt();
			ArrayList avgList = new ArrayList();
			
			for(int i=0;i<list.size();i++) {
				Students s = (Students)list.get(i);
				if(s.total>t_avg) {
					avgList.add(s);
					cnt++;
				}
			}
			
			if(cnt ==0) {
				System.out.printf("검색점수 %s보다 높은 학생의 정보가 없습니다.\n",t_avg);
			}else {
				System.out.printf("검색하신 총점 %s 이상의 학생 정보입니다.\n",t_avg);
				Stu_output(avgList);
				}
			break;
		
		case 0:
			System.out.println("이전 페이지로 돌아갑니다.");
			break;
		}
	} //stu_search
	
	
	void Stu_rank(ArrayList list) {
		
		for(int i=0;i<list.size();i++) {
			int rank_count = 1;
			Students li = (Students)list.get(i);
			for(int j=0;j<list.size();j++) {
				Students li2 = (Students)list.get(j);
				if(li.total<li2.total) {
					rank_count++;
				}
				li.rank = rank_count;
			}
		}
	} //Stu_rank
	
	
	
	
	
}
