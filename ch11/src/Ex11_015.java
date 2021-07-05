import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_TreeSet(2)
 * 이름: 김하린
 * 이진 탐색 트리, 범위 탐색과 정렬에 유리
 * 모든 노드가 최대 2개의 하위 노드를 가짐
 * 부모보다 작은 값 -> 왼쪽, 큰 값 -> 오른쪽(루트부터 트리를 따라 내려가며 값 비교)
 * 데이터가 많아질수록 추가/삭제에 시간이 더 걸림 
 */
public class Ex11_015 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet(); //정렬, 검색
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from "+ from + " to "+ to);
		System.out.println("result1 : "+ set.subSet(from, to)); //d는 미포함
		System.out.println("result2 : "+ set.subSet(from, to + "zzz"));
	}
}
