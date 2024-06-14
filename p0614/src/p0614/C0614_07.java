package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		// printf의 출력
		// 소수점 제한 출력가능, 8진수, 16진수 출력가능
		System.out.println(10.0/3);
		System.out.printf("%.2f \n",10.0/3); 	// 줄단락을 
		int x = 0x1a; // 16진수 표현 1a 값은? 26
		System.out.println(x);
		System.out.printf("%X \n",x); // printf > 16진수 출력가능
		
		long a = 10L;
		
		System.out.printf("%d \n",a);
		int b = 20;
		System.out.printf("%d \n",b);
		
		int age = 14;
		int year = 2014;
		System.out.printf("나이 : %d세\n년도 : %d년 \n",age,year);
		System.out.println("나이 : "+age+"세\n년도 : "+year+"년 \n");
		
		System.out.printf("[%05d]\n",10);
		System.out.printf("[%11.8f]\n",1.234);
		
	}

}
