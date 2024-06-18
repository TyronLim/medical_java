package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민등록번호 앞자리를 입력받아 봄,여름,가을,겨울인지 출력하시오.
		Scanner scan = new Scanner(System.in);
//		
		System.out.println("주민번호 앞 6자리와 뒤 한개를 입력하세요");
		String birth = scan.nextLine();
		String birthY = birth.substring(0,2);
		String num1 = birth.substring(6,7);
		
		int birthY2 = Integer.parseInt(birthY);

		switch(num1) {
		case "1": case "2": 
			System.out.println(2024-(1900+birthY2));
			break;
			
		case "3": case "4":
			System.out.println(2024-(2000+birthY2));
			break;
		}
			
		
		// 봄여름가을겨울
//		String birthM = birth.substring(2,4);
//		
//		switch(birthM){
//		case "12": case "01": case "02" :
//			System.out.println("겨울");
//			break;
//			
//		case "03": case "04": case "05" :
//			System.out.println("봄");
//			break;
//			
//		case "16": case "07": case "08" :
//			System.out.println("여름");
//			break;
//			
//		case "09": case  "10": case "11":
//			System.out.println("가을");
//			break;			
//		}
		
		
		
		
//		String str = "990123";
//		String birthM = str.substring(2,4);
//		System.out.println(birthM);
		
		
		
		
	}
}
