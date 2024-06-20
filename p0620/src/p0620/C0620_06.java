package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		
		System.out.println(10+5);
		System.out.println(10-5);
		System.out.println(10*5);
		System.out.println(10/5);
		System.out.println(11+6);
		System.out.println(11-6);
		System.out.println(11*6);
		System.out.println(11/6);
		
		int num = 0;
		int num2 = 10;
		
		num2 = num; //num2 는 0이 됨.
		
		// 객체선언!!
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t2채널 : "+t2.channel);

		t2 = t1;
		t1.channel = 7;
		System.out.println("t2채널 : "+t2.channel);
		
//		Tv t = new Tv();
		
		// 참조변수명.변수명 값을 넣어야 함.
//		t.channel = 7;
//		t.channelUp();
//		System.out.println("현재 채널 : "+t.channel);
//		t.channelDown();
//		t.channelDown();
//		System.out.println("현재 채널 : "+t.channel);
		
	
	}
}
