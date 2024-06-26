package p0626;

public class C0626_02 {

	public static void main(String[] args) {

		Buyer b = new Buyer("aaa","1111",2000,0);
		
		// 구매내역
		
//				
		Product t = new Computer(); 
		b.buy(t);// 컴 구매 메소드 호출 (이름 계속 바꿔야함)
		
		// 컴퓨터구매
		Product c = new Computer(); 
		b.buy(c);// 컴 구매 메소드 호출 (이름 계속 바꿔야함)
		
		Product a = new Audio(); 
		b.buy(a);// 오 구매 메소드 호출 (이름 계속 바꿔야함)
	
		Product r = new Refrigerator(); 
		b.buy(r);// 냉 구매 메소드 호출 (이름 계속 바꿔야함)
//		
		
		
		b.buy(new Tv()); // tv 구메 메소드 다른 방법
		b.buy(new Tv()); // tv 구메 메소드 다른 방법
		b.buy(new Tv()); // tv 구메 메소드 다른 방법
		b.buy(new Tv()); // tv 구메 메소드 다른 방법
		b.buy(new Audio()); // audio 구메 메소드 다른 방법
		b.buy(new Audio()); // audio 구메 메소드 다른 방법
		b.buy(new Audio()); // audio 구메 메소드 다른 방법
		
		// b.cart를 출력하시오. (제품명, 가격)
//		int sum = 0;
//		System.out.println("-----------------------");
//		for(int i=0;i<b.count;i++) {
//			System.out.printf("이름 : %s, 가격 : %d\n",b.cart[i].pName,b.cart[i].price);
//			sum += b.cart[i].price;
//		}
//		System.out.printf("총 구매내역 : %d",sum);
		
		// b.list로 읽기
//		int sum = 0;
//		System.out.println("[[구매내역]]");
//		System.out.println("-----------------------");
//		for(int i=0;i<b.list.size();i++) {
//			Product p = (Product)b.list.get(i);
//			System.out.printf("이름 : %s, 가격 : %d\n",p.pName,p.price);
//			sum += p.price;
//		}
//		System.out.printf("총 구매개수 : %d개\n",b.list.size());
//		System.out.printf("총 구매내역 : %d\n",sum);
		
		b.summary();
	
	
	
	}

}
