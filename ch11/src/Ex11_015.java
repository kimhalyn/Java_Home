import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_TreeSet(2)
 * �̸�: ���ϸ�
 * ���� Ž�� Ʈ��, ���� Ž���� ���Ŀ� ����
 * ��� ��尡 �ִ� 2���� ���� ��带 ����
 * �θ𺸴� ���� �� -> ����, ū �� -> ������(��Ʈ���� Ʈ���� ���� �������� �� ��)
 * �����Ͱ� ���������� �߰�/������ �ð��� �� �ɸ� 
 */
public class Ex11_015 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet(); //����, �˻�
		
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
		System.out.println("result1 : "+ set.subSet(from, to)); //d�� ������
		System.out.println("result2 : "+ set.subSet(from, to + "zzz"));
	}
}
