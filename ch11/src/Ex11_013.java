import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_HashSet(3)
 * 이름: 김하린
 */
public class Ex11_013 {

	public static void main(String[] args) {

		HashSet setA 	= new HashSet();
		HashSet setB 	= new HashSet();
		HashSet setHab 	= new HashSet();
		HashSet setKyo 	= new HashSet();
		HashSet setCha 	= new HashSet();
		
		setA.add("1"); 
		setA.add("2"); 
		setA.add("3"); 
		setA.add("4"); 
		setA.add("5");
		System.out.println("A = "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);
		
//		교집합 구하기 setA.retainAll(setB);
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) { //집합 A에 있는지 확인
				setKyo.add(tmp);
			}
		}
//		차집합 구하기 setA.removeAll(setB);
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) { //집합B에 있는 것이 아니면 true
				setCha.add(tmp);
			}
		}
//		합집합 구하기 setA.addAll(setB); set이 순서, 중복 허용 불가이므로 -> 알아서 중복 제거됨
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		System.out.println("A ∩ B = " +setKyo);
		System.out.println("A ∪ B = " +setHab);
		System.out.println("A - B = " +setCha);
	}
}

