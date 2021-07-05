/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_break문
 * 이름: 김하린
 * 자신이 포함된 하나의 반복문을 벗어난다
 * */
public class Ex4_026 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i = 0;
		
		while(true) { //무한반복문 cf) for(;; or ;true;){}로 작성
			if(sum > 100)
				break; 
			++i;
			sum += i;
		} //break문 수행 -> while문 완전히 빠져나옴

		System.out.println("i=" +i);
		System.out.println("sum=" +sum);
		
	}
}
