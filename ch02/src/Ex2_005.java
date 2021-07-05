/*
 * 날짜: 2021/05/04
 * 내용: 자바의 정석_형식화된 출력-printf()
 * 이름: 김하린
 */
public class Ex2_005 {

	public static void main(String[] args) {
		System.out.println(10.0/3); //나누셈의 결과를 실수를 얻기 위해서 10.0로 입력
		
		System.out.printf("%d%n", 15); //'%d'는 10진수, '%n'은 개행(OS마다 개행문자가 다를 수 있으므로 \n보다 %n이 안전) 
		System.out.printf("%#o%n", 15); //'%o' 8진수, '#' 접두사
		System.out.printf("%#x%n", 15); //'%X' 16진수
		System.out.printf("%s%n", Integer.toBinaryString(15)); //정수를 2진수로 변환해서 문자열로 반환하므로 '%s'사용
		
		float f = 123.456789f;
		System.out.printf("%f%n", f); // float는 정밀도가 7자리
		
		double d = 123.456789;
		System.out.printf("%f%n", d); // double은 정밀도가 15자리
		System.out.printf("%e%n", d); //지수 형식으로 출력
		
	}
}
