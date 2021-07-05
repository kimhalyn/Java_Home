/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_조건 연산자(삼항 연산자)
 * 이름: 김하린
 * 조건식 ? 식1:식2
 * -> 조건식이 참이면 식1, 거짓이면 식1
 * */
public class Ex3_028 {
	public static void main(String[] args) {
	
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; 
		absY = y >= 0 ? y : -y; 
		absZ = z >= 0 ? z : -z; 
		
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
		
	}
	
}
