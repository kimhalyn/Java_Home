/*
 * 날짜: 2021/05/19
 * 내용: 자바의 정석_StringBuffer클래스
 * 이름: 김하린
 * 문자형 배열 char[]을 내부적으로 가지고 있음
 * String과 달리 내용을 변경할 수 있음
 * equals()가 오버라이딩 되어있지 않음(주소비교 이루어짐)
 * -> StringBuffer를 String으로 변환 후 equals() 비교 
 */
public class Ex9_008 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
//		equals()가 오버라이딩 되어 있지 않아 모든 값이 false반환
		System.out.println("sb == sb2 ? "+ (sb == sb2));
		System.out.println("sb.equals(sb2) ? "+ sb.equals(sb2));
	
		System.out.println();
		
//		String으로 변환 후 equals() 비교
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? "+ s.equals(s2));
	}
}