package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		// 클래스는 묶음이다!.
		
		//변수 선언
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		String str = new String("aaa");
		
		Tv t1 = new Tv();
		t1.color = "white";
		t1.power = false;
		t1.channel = 0;
		
		Tv t2 = new Tv();
		t2.color = "white";
		t2.power = false;
		t2.channel = 0;
		
		// 타입
		int a = 0;
		// 객체선언
		// 클래스타입 참조변수명 = new 클래스타입()
		Tv tv1; // 객체를 다루기 위한 참조변수가 선언
		tv1 = new Tv(); // 객체생성 후 생성된 객체의 주소를 참조변수에 저장시킴.
		
		Tv tv2 = new Tv();
		
		int[] num2; // 배열을 다루기 위한 참조변수가 선언
		num2 = new int[5]; // 배열 생성 후 생성된 배열의 주소를 참조변수에 저장시킴.
		
		
//		String color = "white";
//		boolean power = false;
//		int channel = 0;
		//volume,size,....
		
		
		
		
		while(true) {
			System.out.println("1. TV 켜기");
			System.out.println("2. TV 끄기");
			System.out.println("---------");
			System.out.println("TV 상태를 선택하세요");
			int choice = scan.nextInt();
			
			
		}
		
		
		
	}
}
