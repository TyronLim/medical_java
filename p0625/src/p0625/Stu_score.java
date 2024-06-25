package p0625;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {

	static int count = 0;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String stuNo = "S"+sdf.format(d)+String.format("03d", count);
	}
	
	Stu_score(){
		
	}
	
	Stu_score(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	
}
