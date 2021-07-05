import java.util.ArrayList;

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_타입변수
 * 이름: 김하린
 */
class computer {}
class Audio {}

public class Ex12_002 {
	
	public static void main(String[] args) {
		
		ArrayList<computer> list = new ArrayList<computer>();
		list.add(new computer());
//		list.add(new Audio()); 타입변수가 Tv로 지정 -> Audio불가
		
//		Tv t = (Tv)list.get(0); list의 첫번째 요소 꺼낼 때 -> 형변환 필요(타입 불일치) (object -> computer)
		computer t = list.get(0); //타입변수 지정으로 타입 일치 -> 형변환 필요없음
		
	}
}
