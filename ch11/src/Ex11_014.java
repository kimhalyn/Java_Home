import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_TreeSet(1)
 * �̸�: ���ϸ�
 * ���� Ž�� Ʈ��, ���� Ž���� ���Ŀ� ����
 * ��� ��尡 �ִ� 2���� ���� ��带 ����
 * �θ𺸴� ���� �� -> ����, ū �� -> ������(��Ʈ���� Ʈ���� ���� �������� �� ��)
 * �����Ͱ� ���������� �߰�/������ �ð��� �� �ɸ� 
 */
public class Ex11_014 {

	public static void main(String[] args) {

		Set set = new TreeSet(); //����� ���ĵǾ� ����
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //set.add(Integer.add(num));
		}
		System.out.println(set);
	}
}
