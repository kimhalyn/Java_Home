/*
 * 날짜: 2021/05/04
 * 내용: 자바의 정석_타입간의 변환방법
 * 이름: 김하린
 * 
 * 문자와 숫자간의 변환 -> 숫자 + '0' = 문자
 *                -> 문자 - '0' = 숫자
 *                
 * 문자열로 변환 -> 숫자 + "" = 문자열
 *           -> 문자 + "" = 문자열
 * 
 * 숫자로 변환 -> Integer.parseInt()
 *          -> Double.parseDouble() 
 * */
public class EX2_010 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); //charAt함수로 문자열 3을 문자로 변환, 문자'3' - '0' = 숫자3
		System.out.println('3' - '0' + 1); // (문자-'0')숫자3 + 1
		System.out.println(Integer.parseInt("3") + 1); //숫자로 변환 + 1
		System.out.println("3" + 1); // 문자 + 1
		System.out.println(3 + '0'); // 숫자 + 0 = 문자 , '0'은 숫자로 48
	}
	
}
