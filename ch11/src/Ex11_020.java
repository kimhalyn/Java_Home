import java.util.*;

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_HashMap(4)
 * 이름: 김하린
 * 순서 x, 중복(키x, 값0) (예)아이디와 비밀번호
 * Map인터페이스 구현, 데이터를 키와 값의 쌍으로 저장
 * 만약 순서를 유지하려면, LinkedHashMap클래스를 사용하면 됨
 * 해싱(함수를 이용하여 데이터를 저장/읽어옴)기법으로 데이터를 저장 -> 검색이 빠름 (예)간호사 캐비넷
 * 
 * TreeMap -> 범위 검색과 정렬에 유리한 컬렉션 클래스
 * HashMap보다 데이터 추가/삭제에 시간이 더 걸림
 */
public class Ex11_020 {

	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		HashMap map = new HashMap();

		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) {
				int value = (int) map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				map.put(data[i], 1);
			}
		}
		Iterator it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = (int) entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}

}