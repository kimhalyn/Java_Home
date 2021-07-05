import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_HashSet(3)
 * �̸�: ���ϸ�
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
		
//		������ ���ϱ� setA.retainAll(setB);
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) { //���� A�� �ִ��� Ȯ��
				setKyo.add(tmp);
			}
		}
//		������ ���ϱ� setA.removeAll(setB);
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) { //����B�� �ִ� ���� �ƴϸ� true
				setCha.add(tmp);
			}
		}
//		������ ���ϱ� setA.addAll(setB); set�� ����, �ߺ� ��� �Ұ��̹Ƿ� -> �˾Ƽ� �ߺ� ���ŵ�
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		System.out.println("A �� B = " +setKyo);
		System.out.println("A �� B = " +setHab);
		System.out.println("A - B = " +setCha);
	}
}

