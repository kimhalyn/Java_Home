/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_continue문(1)
 * 이름: 김하린
 * 그 다음 반복문으로 건너뜀
 * */
public class Ex4_027 {

	public static void main(String[] args) {
	
		for(int i=0; i <=10; i++) {
			if(i%3==0) //3의배수, 0 나누기 3도 값이 0이라서 출력안됨
				continue;
			System.out.println(i);
		}//continue문 수행 -> while문 빠져나가는 것 x -> for문으로 다시 이동
	}
}
