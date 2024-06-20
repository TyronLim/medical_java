package p0620;

public class C0620_07 {

	public static void main(String[] args) {
		int hour = 10;
		int minute = 10;
		int second = 10;
		
		int[] h = new int[10];
		int[] m = new int[10];
		int[] s = new int[10];
		
		//배열 선언
		Time[] tt = new Time[10];
		
		//객체 선언
		tt[0] = new Time();
		tt[1] = new Time();
		tt[1].hour = 10;
		tt[1].minute = 10;
		tt[1].second = 10;
//		tt[2].hour = 12;  tt2번은 객체 선언이 안 되어 있음.
		System.out.println(tt[1].hour);
		
		Time t = new Time();
		t.hour = 10;
		t.minute = 10;
		t.second = 10;
		
	}
}
