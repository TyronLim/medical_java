package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = null;

		Ambulance a = new Ambulance();
		Ambulance a2 = null;

		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		c2 = a; // 업캐스팅
		if(a instanceof Car) {
			System.out.println("가능합니다.");
			c=a;
		}
		
		// 다형성 : 보무의 참조변수로 자손의 객체를 다루는 것
		// 자손의 참조변수로 조상의 객체를 다루는 것 > 불가능
		// 자손참조변수 = 조상의 객체
//		a2 = (Ambulance)c;
		
//		c = a; // 부모의 참조변수에 자손객체를 넣어줌.
//		a2 = (Ambulance) c;
		
		
//		// 형변환 - 자손타입에서 조상타입 : 형변환타입 생략 가능
//		c2 = a; //Ambulance -> Car
//		c2.drive();
////		c2.siren(); // 불
//		
//		a2 = (Ambulance) c2;
//		a2.siren();
//		
//		
//		
////		c2 = (Car)a;
//		a2 = (Ambulance)c2; // Car에서는 타입을 정해줘야 함.
		
		
	}
}
