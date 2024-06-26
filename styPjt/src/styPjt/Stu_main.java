package styPjt;

import java.util.ArrayList;

public class Stu_main {

	public static void main(String[] args) {
		Stu_process sp = new Stu_process();
		ArrayList s_list = new ArrayList();
		s_list.add(new Students("홍길동",97,93,88));
		s_list.add(new Students("이순신",98,94,89));
		s_list.add(new Students("김구",61,73,71));
		s_list.add(new Students("장발장",97,98,100));
		
		
		while(true) {
			int choice = sp.Stu_screen();
			
			switch(choice) {
			case 1:
				sp.Stu_input(s_list);
				
			case 2:
				sp.Stu_print(s_list);
				break;
				
			case 3:
				sp.Stu_update(s_list);
				break;
				
			case 4:
				sp.Stu_delete(s_list);
				break;
			}
			
			
			
		}
		
		
	}
}
