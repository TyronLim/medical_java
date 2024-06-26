package p0626;

import java.util.ArrayList;

public class Stu_main {

	public static void main(String[] args) {
		Stu_process sp = new Stu_process();
		ArrayList list = new ArrayList();
		// 일단 넣어놓기
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",89,99,91));
		list.add(new Students("이순신",89,96,91));
		
		int s_count = 0; //입력된 학생수
		
		loop1:while(true) {
			int choice = sp.screen(list);
		
			switch(choice) {
			case 1:
				sp.Stu_input(list);
				
			case 2:
				sp.Stu_output(list);
				break;

			case 3:
				sp.Stu_update(list);
				break;
			
			case 4:
				sp.Stu_delete(list);
				break;

			case 5:
				sp.Stu_search(list);
				break;

			case 6:
				sp.Stu_rank(list);
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
				
			
				
				
			}
		
		}// while
		
	}
		
}
