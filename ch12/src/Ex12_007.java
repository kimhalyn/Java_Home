import java.util.ArrayList;

/*
 * ��¥: 2021/06/02
 * ����: �ڹ��� ����_���ϵ� ī��
 * �̸�: ���ϸ�
 * Ÿ���� �ٸ� ��ü ���� ����
 * <? extends T>: T�� �� �ڼյ鸸 ����
 * <? super T>: T�� �� ����鸸 ����
 * <?>: ���� ����
 */

class Fruit1{public String toString() {return "Fruit";}}
class Apple1 extends Fruit1{public String toString() {return "Apple1";}}
class Grape1 extends Fruit1{public String toString() {return "Grape1";}}

class Juice{
	String name;
	Juice(String name){this.name = name + "Juice";}
	public String toString() {return name;}
}

class Juicer{
	static Juice makeJuice(FruitBox1<? extends Fruit1> box) {
		String tmp = "";
		
		for(Fruit1 f : box.getList()) {
			tmp +=f + " ";
		}
		return new Juice(tmp);
	}
}

class Ex12_007 {

	public static void main(String[] args) {

		FruitBox1<Fruit1> fruitBox1 = new FruitBox1<Fruit1>();
		FruitBox1<Apple1> appleBox1 = new FruitBox1<Apple1>();
		
		fruitBox1.add(new Apple1());
		fruitBox1.add(new Grape1());
		appleBox1.add(new Apple1());
		appleBox1.add(new Apple1());
		
		System.out.println(Juicer.makeJuice(fruitBox1));
		System.out.println(Juicer.makeJuice(appleBox1));
		
	}
}

class FruitBox1<T extends Fruit1> extends Box1<T>{}

class Box1<T>{
	ArrayList<T>list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}