import java.util.*;
import static java.util.Collections.*; //Collections.를 생략가능하게 해줌

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_collections 요약
 * 이름: 김하린
 */
public class Ex11_021 {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);

		addAll(list, 1, 2, 3, 4, 5);
		System.out.println("addAll="+ list);

		rotate(list, 2); //맨 뒤의 숫자가 맨 앞으로 이동(이를 2번 실행)
		System.out.println("rotate="+list);

		swap(list, 0, 2); //인덱스 번호끼리 교환
		System.out.println("swap="+list);

		shuffle(list);
		System.out.println("shuffle="+list);

		sort(list);
		System.out.println("sort="+list);

		sort(list, reverseOrder());
		System.out.println("sort reverseOrder="+list);
		
		int idx = binarySearch(list, 3); //숫자 3이 어디에 저장되어 있는지 -> 인덱스 번호 출력
		System.out.println("index of 3 = " + idx);

		System.out.println("max=" + max(list));
		System.out.println("min=" + min(list));
		System.out.println("min=" + max(list, reverseOrder()));

		fill(list, 9);
		System.out.println("list=" + list);

		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);

		System.out.println(disjoint(list, newList)); //disjoint: list와 newList의 공통요소가 없으면 -> true 반환

		copy(list, newList); //newList값을 list로 복사
		System.out.println("newList=" + newList);
		System.out.println("list=" + list);

		replaceAll(list, 2, 1); //2를 1로 바꿔라
		System.out.println("list=" + list);

		Enumeration e = enumeration(list); 
		ArrayList list2 = list(e);

		System.out.println("list2=" + list2);
	}
}