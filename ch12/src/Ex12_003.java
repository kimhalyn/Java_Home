import java.util.*;
/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_���׸��� ���/Ÿ�԰� ������
 * �̸�: ���ϸ�
 * Box<T>: ���׸� Ŭ����, 'T Box'�� ����
 * T: Ÿ�� ���� or Ÿ�� �Ű�����
 * Box: ���� Ÿ��
 * 
 * ���� ������ �����ڿ� ���Ե� Ÿ���� ��ġ�ؾ� ��
 */
class Product {}
class Tv1 extends Product {}
class Audio1 extends Product {}

class Ex12_003 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv1>      tvList = new ArrayList<Tv1>();
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); // ����, Ÿ�Ժ����� �޶�
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. ������(List�� ArrayList ����)

		productList.add(new Tv1()); //product�� �ڼ��� Tv�� Audio ��� ����
		productList.add(new Audio1());

		tvList.add(new Tv1());
		tvList.add(new Tv1());

		printAll(productList);
		// printAll(tvList); // ������ ���� �߻�
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}
