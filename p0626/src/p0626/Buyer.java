package p0626;

import java.util.ArrayList;

public class Buyer {

	String userID = "aaa";
	String userPW = "1111";
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10];
	ArrayList list = new ArrayList(); //collection 선언
//	int count;
	
	Buyer(){}
	Buyer(String userID,String userPW,int money,int bonusPoint){
		this.userID = userID;
		this.userPW = userPW;
		this.money = money;
		this.bonusPoint = bonusPoint;
		
	}
	
	// 구매 메소드
	void buy(Product p) {
		if(money < p.price) {
			System.out.printf("잔액이 부족합니다.(보유금액 : %d만원)\n",money);
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // collection에 추가
//		cart[count++] = p; // 구매물품 저장
		System.out.printf("%s 제품 구매완료(보유금액 : %d만원)\n",p.pName,money);
	}
	
	void summary() {
		int sum = 0;
		System.out.println("[[구매내역]]");
		System.out.println("-----------------------");
		for(int i=0;i<list.size();i++) {
			Product p = (Product)list.get(i);
			System.out.printf("이름 : %s, 가격 : %d\n",p.pName,p.price);
			sum += p.price;
		}
		System.out.printf("총 구매개수 : %d개\n",list.size());
		System.out.printf("총 구매내역 : %d\n",sum);
	}
	
//	public String getUserID() {
//		return userID;
//	}
//	
//	public void setUserID(String  userID) {
//		this.userID = userID;
//	}
	
	
}
