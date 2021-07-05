import java.util.ArrayList;

/*
 * 날짜: 2021/06/02
 * 내용: 자바의 정석_제한된 지네릭 클래스
 * 이름: 김하린
 * extends로 대입할 타입을 제한
 * 인터페이스의 경우 -> extends 사용
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
//		FruitBox<Grape>grapeBox = new FruitBox<Apple>(); 참조변수 타입과 생성자 타입의 불일치
//		FruitBox<Toy>toyBox = new FruitBox<Toy>(); 제약타입때문에 불가

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
	ArrayList<T> list = new ArrayList<T>(); // item을 저장할 list생성

	void add(T item) {
		list.add(item);
	} // 박스에 item 추가

	T get(int i) {
		return list.get(i);
	} // 박스에서 item 꺼낼 때

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
