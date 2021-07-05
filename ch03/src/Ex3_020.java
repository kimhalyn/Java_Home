/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_나머지 연산자
 * 이름: 김하린
 * x/0 -> 에러 발생(무한루프)
 * */
public class Ex3_020 {
	public static void main(String[] args) {
	
		//나누는 수를 음수도 사용가능, 그러나 부호는 무시되므로 절댓값(|-나누는 수|)와 동일
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		
		
	
	}
	
}
