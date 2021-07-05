import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_TreeSet(1)
 * 이름: 김하린
 * 이진 탐색 트리, 범위 탐색과 정렬에 유리
 * 모든 노드가 최대 2개의 하위 노드를 가짐
 * 부모보다 작은 값 -> 왼쪽, 큰 값 -> 오른쪽(루트부터 트리를 따라 내려가며 값 비교)
 * 데이터가 많아질수록 추가/삭제에 시간이 더 걸림 
 */
public class Ex11_014 {

	public static void main(String[] args) {

		Set set = new TreeSet(); //결과가 정렬되어 나옴
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //set.add(Integer.add(num));
		}
		System.out.println(set);
	}
}
