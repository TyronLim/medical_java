package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STU = 20;
		String[] stuNo = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int[STU][4]; // 합계까지
		double[] avg = new double[STU];
		int[] rank = new int[STU];
		String title[] = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int stu_cnt = 0;
		
		
		loop1:while(true) {
			System.out.println("[학생성적입력 프로그램");
			System.out.println("----------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 전체출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("0. 종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요");
			int input = scan.nextInt();
			scan.nextLine();
			
			switch(input) {
			case 1:
				System.out.println("학생성적 입력");
				System.out.println("----------------------------");
				String no = "S"+String.format("%04d", stu_cnt+1);
				System.out.println("학번 자동부여 : "+no);
				stuNo[stu_cnt] = no;
				
				System.out.println("이름을 입력하세요 (0:종료)");
				String temp = scan.nextLine();
				name[stu_cnt] = temp;
				if(temp=="0") {
					System.out.println("성적입력을 종료합니다.");
					break;//case1
				}
				for(int i=0;i<3;i++) {
				System.out.printf("%s점수를 입력하세요",title[i+2]);
				score[stu_cnt][i] = scan.nextInt();
				}//for
				
				score[stu_cnt][3] = score[stu_cnt][0]+score[stu_cnt][1]+score[stu_cnt][2];
				avg[stu_cnt] = score[stu_cnt][3]/3.0;
				
				System.out.println("=============================================================");
				System.out.print("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				System.out.print(stuNo[stu_cnt]+"\t"+name[stu_cnt]);
				System.out.printf("\t%d\t%d\t%d\t%d\t",score[stu_cnt][0],score[stu_cnt][1],score[stu_cnt][2],score[stu_cnt][3]);
				System.out.printf("%.2f\t%d",avg[stu_cnt],rank[stu_cnt]);
				System.out.println();
				System.out.println("=============================================================");
				stu_cnt++;
				break;
				
			case 2:
				System.out.println("학생성적 전체출력");
				System.out.println("=============================================================");
				System.out.print("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				for(int i=0;i<stu_cnt;i++) {
					System.out.print(stuNo[i]+"\t"+name[i]);
					System.out.printf("\t%d\t%d\t%d\t%d\t",score[i][0],score[i][1],score[i][2],score[i][3]);
					System.out.printf("%.2f\t%d",avg[i],rank[i]);
					System.out.println();
				}
				System.out.println("=============================================================");
				
				
				break;
			case 3:
				System.out.println("학생성적 수정");
				//우선 검색
				System.out.println("-------------------------------------------------------------");
				System.out.println("수정할 학생의 이름을 입력하세요.");
				String search = scan.nextLine();
				
				int temp_no = -1;
				
				for(int i=0;i<stu_cnt;i++) {
					if(name[i].equals(search)) {
						System.out.println(search+"학생에 대한 정보가 있습니다.");
						temp_no = i;
					}//if
					
				}//for
				if(temp_no==-1) {
					System.out.println("찾는 학생이 없습니다. 다시 입력하세요.");
				}else {
					System.out.printf("            [ %s 성적수정 ]\n",name[temp_no]);
					System.out.println("-----------------------------------");
					System.out.println("1.국어점수 수정");
					System.out.println("2.영어점수 수정");
					System.out.println("3.수학점수 수정");
					System.out.println("-----------------------------------");
					System.out.println("원하는 번호를 입력하세요 >> ");
					int choice = scan.nextInt();
					switch(choice) {
					case 1:
						System.out.printf("%s점수 수정을 선택하셨습니다.\n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d\n",title[choice+1],score[temp_no][choice-1]);
						System.out.printf("변경할 %s점수를 입력해주세요.\n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("%s점수가 변경되었습니다.\n",title[choice+1]);
						System.out.printf("변경한 %s 점수 : %d\n",title[choice+1],score[temp_no][choice-1]);
						
						break;
					case 2:
						System.out.printf("%s점수 수정을 선택하셨습니다.\n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d\n",title[choice+1],score[temp_no][choice-1]);
						System.out.printf("변경할 %s점수를 입력해주세요.\n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("%s점수가 변경되었습니다.\n",title[choice+1]);
						System.out.printf("변경한 %s 점수 : %d\n",title[choice+1],score[temp_no][choice-1]);
						
						break;
					case 3:
						System.out.printf("%s점수 수정을 선택하셨습니다.\n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d\n",title[choice+1],score[temp_no][choice-1]);
						System.out.printf("변경할 %s점수를 입력해주세요.\n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("%s점수가 변경되었습니다.\n",title[choice+1]);
						System.out.printf("변경한 %s 점수 : %d\n",title[choice+1],score[temp_no][choice-1]);
						break;
					}
					
					
					
					
					
					
					
				}
				break;
				
			case 0:
				System.out.println("프로그램 종료");
				break loop1;
				
			}//switch
			
			
			
			
			
			
		}// while
		
		
		
		
		
		
		
	}
}
