package p0626;

import java.util.ArrayList;
import java.util.Arrays;

public class C0626_03 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,97,90));
		list.add(new Students("유관순",89,87,99));
		list.add(new Students("이순신",90,94,93));
		list.add(new Students("임태균",100,100,100));
		
		list.remove(1);
		
		System.out.println("입력된 개수 : "+list.size());
		
		// 전체출력
		for(int i=0;i<list.size();i++) {
			Students s = (Students)list.get(i);
			System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d\n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
		}
		
//		int[] arr = {1,2,3,4,5};
		
//		arr[2] = 0;	// 삭제 (공간 삭제는 불가)
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}

}
