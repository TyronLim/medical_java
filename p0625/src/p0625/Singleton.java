package p0625;

public class Singleton {

	private int hour;
	private static Singleton s = new Singleton();
	
	private Singleton(){} // 기본생성자
	
	
	// 클래스메소드 - 객체선언없이 클래스명.메소드명
	public static Singleton getInstance() {
//		if(s==null) {
//			s = new Singleton();
//		}
		return s;
		
	}
}
