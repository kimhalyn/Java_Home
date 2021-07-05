import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_comparator와 comparable
 * 이름: 김하린
 * <객체 정렬에 필요한 메서드>
 * comparable: 기본 정렬기준(default: 정렬기준이 없을 때 사용)
 * comparator: 기본 정렬기준 외 정렬
 * 0: 같다, 양수: 왼쪽이 큼, 음수: 오른쪽이 큼
 * compareTo: 주어진 객체를 자신(this)와 비교
 */
public class Ex11_009 {

	public static void main(String[] args) {

		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // 대문자가 소문자보다 앞에 위치함
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); //내림차순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // (*-1) -> 기본 정렬방식 역으로 변경
		}
		return -1;
	}
}
