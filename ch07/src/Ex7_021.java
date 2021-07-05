/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�߻� Ŭ���� �ۼ�
 * �̸�: ���ϸ�
 * ���� Ŭ������ ���������� ���� �� �ִ� �߻� Ŭ������ �ٷ� �ۼ��ϰų�
 * ���� Ŭ������ ���� �κ��� �̾Ƽ� �߻� Ŭ������ ����
 */
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}
class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x="+ x +", y=" + y +"]");
	}
	void stimPack() {}
}
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x="+ x +", y=" + y +"]");
	}
	void changeMode() {}
}
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x="+ x +", y=" + y +"]");
	}
	void load() {}
	void unload() {}
}
public class Ex7_021 {

	public static void main(String[] args) {

//		Object[] group = new Object[3]; ObjectŬ������ �ְ��������� ��ü ���� ����(������)  
//		Unit[] group = new Unit[3];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for(int i=0; i<group.length; i++) { //ObjectŬ�������� move�޼��尡 �������� �����Ƿ� �����߻�
			group[i].move(100, 200); //���� ������ �� Ŭ������ �޼��� ȣ�� 
		}
	}
} 
