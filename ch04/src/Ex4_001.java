/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(if문)
 * 이름: 김하린
 * 조건을 만족할 때만 {}를 수행(0~1번)
 * */
public class Ex4_001 {

	public static void main(String[] args) {
		 int x = 0;
		 System.out.printf("x=%d 일 때 참인 것은%n", x);
		 
		 //조건이 한 문장만 있을 때 -> {}괄호 생략 가능
		 if(x==0) System.out.println("x==0");
		 if(x!=0) System.out.println("x!=0");
		 if(!(x==0)) System.out.println("!(x==0)");
		 if(!(x!=0)) System.out.println("!(x!=0)");
		 
		 x = 1;
		 System.out.printf("x=%d 일 때 참인 것은%n", x);
		 
		 if(x==0) System.out.println("x==0");
		 if(x!=0) System.out.println("x!=0");
		 if(!(x==0)) System.out.println("!(x==0)");
		 if(!(x!=0)) System.out.println("!(x!=0)");
	}
}
