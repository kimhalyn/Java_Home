import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_HashSet(1)
 * 이름: 김하린
 * 순서, 중복 x
 * HashSet: Set인터페이스를 구현한 대표적인 컬렉션 클래스
 * 순서를 유지하고 싶다면 -> LinkedHashSet클래스 사용
 * TreeSet: 범위 검색과 정렬에 유리, HashSet보다 데이터 추가/삭제에 시간 더 걸림
 * 
 * containsAll: 부분집합
 * addAll: 합집합
 * retainAll: 교집합
 * removeAll: 차집합
 */
public class Ex11_011 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1; //1~45사이의 난수를 저장
			set.add(new Integer(num));
		}
//		set은 정렬이 불가 -> set을 list로 옮긴 뒤, list를 정렬
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}

