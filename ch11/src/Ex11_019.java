import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_HashMap(3)
 * 이름: 김하린
 * 순서 x, 중복(키x, 값0) (예)아이디와 비밀번호
 * Map인터페이스 구현, 데이터를 키와 값의 쌍으로 저장
 * 만약 순서를 유지하려면, LinkedHashMap클래스를 사용하면 됨
 * 해싱(함수를 이용하여 데이터를 저장/읽어옴)기법으로 데이터를 저장 -> 검색이 빠름 (예)간호사 캐비넷
 * 
 * TreeMap -> 범위 검색과 정렬에 유리한 컬렉션 클래스
 * HashMap보다 데이터 추가/삭제에 시간이 더 걸림
 */
public class Ex11_019 {

	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
		
		printList();
	}

//	그룹 추가 메서드
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}

//	그룹에 전화번호 추가 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}

	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

//	전화번호부 전체 출력 메서드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();

			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}
}