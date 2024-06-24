package p0624;

public class C0624_12 {

	public static void main(String[] args) {
		
		//변수선언부분
		Stu_score[] sc = new Stu_score[10];	// 배열 선언	
		Stu_process sp = new Stu_process();
		
		while(true) {
			int choice = sp.screen(); // 화면부분 메소드 호출
			
			switch(choice) {
			case 1:	
				sp.stu_input(sc);// 학생성적 입력 메소드 호출
				break;
					
			case 2:
				sp.stu_output(sc); // 학생성적 출력 메소드 호출
				break;
			
			case 5:
				sp.stu_rank(sc);
				break;
				
				
				}//switch
		}//while
	}//main
}//class
