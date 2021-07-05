import java.util.ArrayList;

/*
 * ��¥: 2021/06/02
 * ����: �ڹ��� ����_���ѵ� ���׸� Ŭ����
 * �̸�: ���ϸ�
 * extends�� ������ Ÿ���� ����
 * �������̽��� ��� -> extends ���
 */

class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String tostString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String tostString() {
		return "Grape";
	}
}

class Toy {
	public String tostString() {
		return "Toy";
	}
}

interface Eatable {
}

class Ex12_006 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape>grapeBox = new FruitBox<Apple>(); �������� Ÿ�԰� ������ Ÿ���� ����ġ
//		FruitBox<Toy>toyBox = new FruitBox<Toy>(); ����Ÿ�Զ����� �Ұ�

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());
		grapeBox.add(new Grape());

		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); // item�� ������ list����

	void add(T item) {
		list.add(item);
	} // �ڽ��� item �߰�

	T get(int i) {
		return list.get(i);
	} // �ڽ����� item ���� ��

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
