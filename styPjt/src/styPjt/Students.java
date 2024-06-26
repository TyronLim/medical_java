package styPjt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {

	static int count;
	
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		stuNo= "S"+sdf.format(d)+String.format("%04d", ++count);
	}
	
	Students(){}
	Students(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3.0;
	}
	
	
	String stuNo,name;
	int kor,eng,math,total,rank;
	double avg;
	
	
}
