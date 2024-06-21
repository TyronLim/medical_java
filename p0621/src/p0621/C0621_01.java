package p0621;

public class C0621_01 {

	int i = 2550;
	static int j = 255; 
	
	void add() {
		int i=0;
	}
	
	void add2() {
		int i =0;
	}
	
	public static void main(String[] args) {
		
		C0621_01 k = new C0621_01();
		System.out.println(k.i);
		
		j=10; // 클래스 변수는 같은 클래스 내에서는 클래스명. 을 생략가능
		int j = 100;
		System.out.println(j);
		
		int i = 1;
		for(i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("최종"+i);
		
		
		Time t[] = new Time[3]; // 배열 선언
		t[0] = new Time();      // 배열 내 객체 선언
		t[1] = new Time();      // 배열 내 객체 선언
		t[2] = new Time();      // 배열 내 객체 선언
		
		Time.day = 24;
		t[0].hour = 20;			// 참조변수명.변수명
		t[0].minute = 10;
		t[0].second = 10;
		
		Time.day = 22;
		t[1].hour = 11;
		t[1].minute = 11;
		t[1].second = 11;
		
		System.out.printf("일시 : %d일 %d시 %d분 %d초\n",Time.day,t[0].hour,t[0].minute,t[0].second);
		System.out.printf("일시 : %d일 %d시 %d분 %d초\n",Time.day,t[1].hour,t[1].minute,t[1].second);
		
		Time tt = new Time(); // 객체 선언
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
