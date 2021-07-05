import java.util.*;
/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_HashMap(2)
 * 이름: 김하린
 * 순서 x, 중복(키x, 값0) (예)아이디와 비밀번호
 * Map인터페이스 구현, 데이터를 키와 값의 쌍으로 저장
 * 만약 순서를 유지하려면, LinkedHashMap클래스를 사용하면 됨
 * 해싱(함수를 이용하여 데이터를 저장/읽어옴)기법으로 데이터를 저장 -> 검색이 빠름 (예)간호사 캐비넷
 * 
 * TreeMap -> 범위 검색과 정렬에 유리한 컬렉션 클래스
 * HashMap보다 데이터 추가/삭제에 시간이 더 걸림
 */
public class Ex11_018 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: "+ e.getKey() +", 점수: "+e.getValue());
		}
		set = map.keySet();
		System.out.println("참가자 명단: "+ set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total = i.intValue();
		}
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ (float)total/set.size());
		System.out.println("최고점수: "+ Collections.max(values));
		System.out.println("최저점수: "+ Collections.min(values));
	}
}