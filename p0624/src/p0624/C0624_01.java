package p0624;

public class C0624_01 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		change(d.x);
		
		System.out.println("d.x2 : "+d.x);
				
	}
	
	static void change(int x) { //기본형 매개변수 : 값만 전달됨
		x=1000;
		System.out.println("change x : "+ x);
	}
	
	
}
