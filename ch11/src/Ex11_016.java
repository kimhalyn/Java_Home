import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_TreeSet(3)
 * �̸�: ���ϸ�
 * ���� Ž�� Ʈ��, ���� Ž���� ���Ŀ� ����
 * ��� ��尡 �ִ� 2���� ���� ��带 ����
 * �θ𺸴� ���� �� -> ����, ū �� -> ������(��Ʈ���� Ʈ���� ���� �������� �� ��)
 * �����Ͱ� ���������� �߰�/������ �ð��� �� �ɸ� 
 */
public class Ex11_016 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++) {
			set.add(new Integer(score[i]));
			
			System.out.println("50���� ���� �� : "+ set.headSet(new Integer(50))); //50���� �ȵ�
			System.out.println("50���� ū �� : "+ set.tailSet(new Integer(50))); //50����
			System.out.println("40�� 80������ �� : "+ set.subSet(40, 80));
		}
	}
}
