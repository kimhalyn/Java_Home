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
public class Ex11_010 {

	public static void main(String[] args) {

		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인
			System.out.println(it.next()); //요소 하나씩 꺼내오기
		}
	}
}

