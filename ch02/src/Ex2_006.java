/*
 * 날짜: 2021/05/04
 * 내용: 자바의 정석_형식화된 출력-printf()_정수값 출력
 * 이름: 김하린
 */
public class Ex2_006 {

	public static void main(String[] args) {
	byte b = 1;
	short s = 2;
	char c = 'A';
	
	int finger = 10;
	long big = 100_000_000_000L; 
	long hex = 0xFFFF_FFFF_FFFF_FFFFL;
	
	int octNum = 010; //8진수 10, 10진수로 8
	int hexNum = 0x10; //16진수 10, 10진수로 16
	int binNum = 0b10; //2진수 10, 10진수로 2
		
	System.out.printf("b=%d%n", b);
	System.out.printf("s=%d%n", s);
	System.out.printf("c=%c, %d%n", c, (int)c);
	
	System.out.printf("finger=[%5d]%n", finger); //전체 5칸, 오른쪽 정렬
	System.out.printf("finger=[%-5d]%n", finger); //전체 5칸, 왼쪽 정렬
	System.out.printf("finger=[%05d]%n", finger); //전체 5칸, 공백 0으로 채움
	
	System.out.printf("big=%d%n", big); 
	System.out.printf("hex=%x%n", hex); //16진수
	System.out.printf("hex=%#x%n", hex); //16진수, '#'은 접두사
	
	System.out.printf("octNum=%o, %d%n", octNum, octNum); //8진수, 10진수
	System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); //16진수, 10진수
	System.out.printf("octNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); //2진수, 10진수
	}
}
