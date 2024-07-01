package p0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class OutputStream {

	public static void main(String[] args) throws Exception {
			// 1byte 씩 저장
			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
			String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n"; // \r : 커서 젤 끝으로
			str+="S0002,유관순,60,60,60,180,60.0,0\r\n";
			byte[] bytes = str.getBytes();
			for(byte b : bytes) { // 단순 for 문
				fos.write(b);
			}
			System.out.println("파일에 글이 저장되었습니다.");		

		
		
		
		
		// try-catch
//		try {
//			// 1byte 씩 저장
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n"; // \r : 커서 젤 끝으로
//			str+="S0002,유관순,50,50,50,150,50.0,0\r\n";
//			byte[] bytes = str.getBytes();
//			for(byte b : bytes) { // 단순 for 문
//					fos.write(b);
//			}
			
//			for(int i=0;i<bytes.length;i++) {
//				fos.write(bytes[i]);
//			}
			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일에 글이 저장되었습니다.");		
		
		
		
		
		
		// 파일생성, 폴더 생성
//		String str = "c:/save1/";
//		File folder = new File(str); // 폴더
//		File f2 = new File(str+"/2.txt"); // 파일
//		try {
//			if (!(folder.isDirectory())) { 				// exists 가능
//				System.out.println("폴더를 생성했습니다.");
//				folder.mkdirs();
//			}
////			f.mkdirs();  // 폴더 생성
//			f2.createNewFile(); // 파일 생성
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("파일이 생성되었습니다.");
//		
		
		
	}
}
