/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_정수형간의 형변환(Casting)
 * 이름: 김하린
 * */
public class Ex2_012 {

	public static void main(String[] args) {
		
	int i = 10;
	byte b = (byte)i;
	System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b );
	
	i = 300;
	b = (byte)i;
	System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b );
	
	b = 10;
	i = (int)b;
	System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i );

	b = -2;
	i = (int)b;
	System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i );
	
	System.out.println("i ="+Integer.toBinaryString(i)); //2진 정수로 변환한 문자열
		
	}
	
}
