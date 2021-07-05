/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_013 {
	public static void main(String[] args) {
	
	char c1 = 'a';
//	char c2 = c1+1; //c1변수때문에 미리 계산할 수 없어서 컴파일 에러 발생
	char c2 = (char)(c1+1);
	char c3= 'a'+1; //이 자체가 리터럴 간의 연산이라서 컴파일 에러 발생 x 

	
	System.out.println(c2);
	System.out.println(c3);
	
	}
	
}
