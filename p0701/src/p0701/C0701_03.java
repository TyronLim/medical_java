package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class C0701_03 {

	public static void main(String[] args) {
//		// Card list 가져오기
		Process p = new Process();
//		p.clistAdd();
//		for(int i=0;i<p.clist.size();i++) {
//			Card c = p.clist.get(i);
//			System.out.println(c);
//			
//		}
//		
//		// Students list 가져와서 출력
//		p.slistAdd();
//		for(int i=0;i<p.slist.size();i++) {
//			Students s = p.slist.get(i);
////			System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d\n",
////					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
//			System.out.println(s);
//		}
//		
		// 2개 모두 가져와서 출력
		HashMap<String, Object> map = p.listAdd();
		ArrayList<Card> clist = (ArrayList<Card>) map.get("clist");
		for(int i=0;i<clist.size();i++) {
			Card c = clist.get(i);
			System.out.println(c);
		}
		
		ArrayList<Students> slist = (ArrayList<Students>) map.get("slist");
		for(int i=0;i<slist.size();i++) {
			Students s = slist.get(i);
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}
