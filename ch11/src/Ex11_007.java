import java.util.ArrayList;
import java.util.Iterator;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_Iterator, ListIterator, Enumeration(구 버전)
 * 이름: 김하린
 * 구조에 상관없이 -> 컬렉션에 저장된 데이터를 읽어올 때 사용하는 인터페이스
 * boolean hasNext(): 읽어 올 요소가 남아있는지 확인
 * Object next(): 다음 요소를 읽어 옴 
 * 
 * Iterator: 단방향만(next) 존재
 * ListIterator: 양방향(next, previous) 존재
 * 
 * Map에는 iterator()가 없음, keySet(), entrySet(), values()를 호출해야 함
 * -> Iterator it = map.entrySet().iterator();
 */
public class Ex11_007 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); //1회용으로 반복하고 싶으면, iterator를 다시 얻어와야 함
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println();
		it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}