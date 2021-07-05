import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 날짜: 2021/05/28
 * 내용: 자바의 정석_LinkedList
 * 이름: 김하린
 * <배열>
 * 장점: 배열 구조가 간단, 데이터를 읽는데 걸리는 시간이 짧음
 * 단점: 크기 변경 불가, 비순차적인 데이터의 추가/삭제에 시간이 많이 걸림
 * 
 * LinkedList
 * 불연속적으로 존재하는 데이터를 연결
 * 연결리스트, 데이터 접근성이 나쁨
 * 
 * <비교>
 * 순차적 데이터 추가/삭제: arrayList(배열기반)
 * 비순차적 데이터 추가/삭제: linkedList(연결기반)
 * 접근시간 좋음: arrayList
 */
public class Ex11_003 {

	public static void add(List list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i + "");
		}
	}

	public static long access(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("= 접근시간테스트 =");
		System.out.println("ArrayList :"+ access(al));
		System.out.println("linkedList :"+ access(ll));
	}
}
