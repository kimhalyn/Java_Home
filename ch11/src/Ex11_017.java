import java.util.HashMap;
import java.util.Scanner;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_HashMap(1)
 * 이름: 김하린
 * 순서 x, 중복(키x, 값0) (예)아이디와 비밀번호
 * Map인터페이스 구현, 데이터를 키와 값의 쌍으로 저장
 * 만약 순서를 유지하려면, LinkedHashMap클래스를 사용하면 됨
 * 해싱(함수를 이용하여 데이터를 저장/읽어옴)기법으로 데이터를 저장 -> 검색이 빠름 (예)간호사 캐비넷
 * 
 * TreeMap -> 범위 검색과 정렬에 유리한 컬렉션 클래스
 * HashMap보다 데이터 추가/삭제에 시간이 더 걸림
 */
public class Ex11_017 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // key값이 일치하면 -> value값만 변경

		Scanner s = new Scanner(System.in);

		while (true) { //무한 반복문
			System.out.println("Id와 password를 입력해주세요");
			System.out.println("Id :");
			String id = s.nextLine().trim();

			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) { // containskey(id) -> 입력한 id가 존재하는지 확인
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if (!(map.get(id).equals(password))) { //map.get(id) -> value값 반환
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
}