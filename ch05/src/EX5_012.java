/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_String클래스
 * 이름: 김하린
 * String클래스 = char[] + 메서드(기능, 함수)
 * String클래스는 내용을 변경할 수 없음(Read Only)
 * charAt(index): 문자열에서 특정 index값 반환
 * length(): 문자열 길이 반환
 * substring(from, to-1): 문자열에서 해당 범위에 있는 값 반환
 * equals(): 문자열의 내용이 같은지 판별(true, false), 대소문자 구분
 * equals.IgnoreCase(): 대소문자 구분 없이 -> 내용의 일치여부 판별
 * */
public class EX5_012 {

	public static void main(String[] args) {
		
		String src = "ABCDE";
		
		//charAt
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("scr.charAt("+ i +") :"+ ch);
		}
		
		//substring
		String str2 = src.substring(1,4); //인덱스 1~3까지 추출
		System.out.println("str2:"+ str2);
		
		String str3 = src.substring(2); //인덱스 2부터 끝까지 추출(2, str.length())
		System.out.println("str3:"+ str3);
		
		//char[] tochararray
		char[] chArr = src.toCharArray(); //문자열을 문자배열로 변환
		System.out.println(chArr);
			
	}
		
}
