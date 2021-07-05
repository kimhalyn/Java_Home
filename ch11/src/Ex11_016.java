import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_TreeSet(3)
 * 이름: 김하린
 * 이진 탐색 트리, 범위 탐색과 정렬에 유리
 * 모든 노드가 최대 2개의 하위 노드를 가짐
 * 부모보다 작은 값 -> 왼쪽, 큰 값 -> 오른쪽(루트부터 트리를 따라 내려가며 값 비교)
 * 데이터가 많아질수록 추가/삭제에 시간이 더 걸림 
 */
public class Ex11_016 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++) {
			set.add(new Integer(score[i]));
			
			System.out.println("50보다 작은 값 : "+ set.headSet(new Integer(50))); //50포함 안됨
			System.out.println("50보다 큰 값 : "+ set.tailSet(new Integer(50))); //50포함
			System.out.println("40과 80사이의 값 : "+ set.subSet(40, 80));
		}
	}
}
