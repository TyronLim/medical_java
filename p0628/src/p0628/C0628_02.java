package p0628;

import java.util.Arrays;

public class C0628_02 {

	public static void main(String[] args) {
		
	String str = "Hello, world!!";
	// charAt
	char ch = str.charAt(0); // charAt : 위치의 문자 하나 가져 옴.
	System.out.println(ch);
	
	//concat
	String s = "안녕하세요";
	String s2 = "홍길동입니다.";
	System.out.println(s+s2);
	System.out.println(s.concat(s2)); // 문자열 합치기
	
	//contains
	System.out.println(s.contains("슈")); // 문자열에 문자가 포함되어 있는지 확인
	
	//endwidth
	String e = "abc.txt";
	System.out.println(e.endsWith("txt")); // 지정된 문자열로 끝나는 지 확인해줌.
	
	//length
	String k = "안녕하세요. 반갑습니다아.";
	System.out.println(k.length());
	
	//replace
	String f = "파이썬이 더 쉽군요. 자바꺼지세요.";
	String f2 = f.replace("꺼지"," 어서 오"); // 문자열 중 해당 문자열을 다른 문자열로 개체
	
	System.out.println(f);
	System.out.println(f2);
	
	//indexOf 
	String r = "캐글 1등하고 싶다. f1스코어 0.0004만 올리면 1등인데 그게 안 올라가네.";
	System.out.println(r.indexOf("스코어"));  // 해당 문자열이 있으면 위치값 리턴, 없으면 -1 리턴
	
	//subString
	String sub = "매일 아침 두유를 먹고 시작합니다. 이는 나의 아침건강을 좋게 할까요?";
	System.out.println(sub.length()); // 길이
	System.out.println(sub.substring(13,19));	// 슬라이싱
	System.out.println(sub.substring(13));	// 슬라이싱
	
	//split
	
	String sp = "국어,영어,수학,합계";
	String[] spArr = sp.split(","); //분리자로 나누어 배열로 리턴
	System.out.println(Arrays.toString(spArr));
	String sp2 = "국어/영어/수학/합계";
	String[] spArr2 = sp.split("/"); //분리자로 나누어 배열로 리턴
	System.out.println(Arrays.toString(spArr2));
	
	//trim
	String tr = "      안녕하세요. 반갑습니다.    ";
	System.out.println(tr.trim()); // 문자열 앞뒤로 공백제거
	System.out.println(tr.replace(" ", "")); // 사이에 있는 공백까지 모든 공백제거
	
	//String.valueOf
	int num=0;
	String str2 = ""+num;
	System.out.println(str2);
	String str3 = String.valueOf(num);
	
	}
}
