import java.util.ArrayList;

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_지네릭스
 * 이름: 김하린
 * 컴파일시 타입을 체크해주는 기능
 * 객체의 타입 안정성을 높임(형변환 안해도 됨 -> 코드 간결화)
 */
public class Ex12_001 {
	
	public static void main(String[] args) {
//		2. 실행에러 -> 처음부터 Integer만 저장하게 타입정보 제공, 다양한 타입 사용하려면 -> Object삽입
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(10); //list.add(new Integer(10));
		list.add(20);
//		list.add("30"); //String 추가 -> 3. 타입정보 불일치로 에러 
		list.add(30);
		
//		Integer i = (Integer)list.get(2); //1. 컴파일 ok, 실행시 에러발생(java.lang.ClassCastException)
		Integer i = list.get(2); //타입정보를 알고있어서 -> (Integer)생략 가능
		System.out.println(list);
	}
}
