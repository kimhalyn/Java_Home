/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(while문)
 * 이름: 김하린
 * */
public class Ex4_021 {

	public static void main(String[] args) {
	
		 int i = 11;
		 
		 System.out.println("카운트 다운을 시작합니다.");
		 
		 while(i--!=0) { //후위형 -> i!=0, i--
			 System.out.println(i);
			 
			 for(int j=0; j<2000; j++) {
				 ; //아무런 내용도 없는 빈 문장
			 }
		 }
		 System.out.println("game over");
	}
}
