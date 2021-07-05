import java.util.ArrayList;
import java.util.Collections;

/*
 * 날짜: 2021/05/28
 * 내용: 자바의 정석_ArrayList
 * 이름: 김하린
 */
public class Ex11_002 {

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+ list1);
		System.out.println("list2:"+ list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		기본 길이가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		
//		add -> 값 추가
		list1.add(new Integer(5)); //list1.add(5)와 동일 -> autoboxing에 의해 기본형이 참조형으로 자동 변환
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
//		sort -> 오름차순 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
//		containsAll -> list1이 list2의 모든 요소를 포함하고 있는가
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
//		set -> 값 변경
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
//		indexOf(i)는 i가 저장된 위치(인덱스)를 알려줌
		System.out.println("index= "+ list1.indexOf("1"));
		print(list1, list2);
		
//		retainsAll -> list1에서 list2의 겹치는 부분만 남기고 삭제
		System.out.println("list1.retainAll(list2): "+ list1.retainAll(list2));
		print(list1, list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) //list1에 있는 값인지 판단
				list2.remove(i);
		}
		print(list1, list2);
	}
}
