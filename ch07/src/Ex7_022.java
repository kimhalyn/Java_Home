/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�������̽�
 * �̸�: ���ϸ�
 * �������̽�: �߻� �޼����� ����, ������ ���� �ϳ��� ���� ���赵, ��� ����� public(���, static�޼���, ����Ʈ �޼��� ����)
 * cf) �߻� Ŭ����: �߻� �޼��带 �����ϰ� �ִ� Ŭ����, Ŭ������ �Ϻΰ� �������� ���� ��
 * 
 * �������̽� ���: �������̽��� ����(Object�� �ְ����� x), ���� ��� ����(������ ���� ��) -> ������ ��ü�� ����
 * cf) Ŭ������ ���� ��Ӹ� ���� -> �޼��� ����ΰ� ���� �����ΰ� �ٸ� ��� �ڽ��� ��� ���� ��ӹ����� ������ �� ����
 * 
 * �������̽� ����: �������̽��� ���ǵ� �߻� �޼��带 �ϼ��ϴ� ��, �� �޼����� �����θ� �ϼ��ϴ� ��(class Ŭ���� �̸� implements �������̽� �̸�{})
 * ���� �Ϻθ� �����ϴ� ���, Ŭ���� �տ� abstract�� ����
 * 
 * �߻� Ŭ������ �������̽��� ������: �߻� �޼��带 ����, ������: �������̽��� iv�� ���� �� ����
 */
class Units{
	int currentHP;
	int x;
	int y;
}
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Units u);
}
interface Fightable extends Movable, Attackable{}
class Fighter extends Units implements Fightable{
	public void move(int x, int y) {}
	public void attack(Units u) {}
}

public class Ex7_022 {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		
		if(f instanceof Units) //instanceof: �ڽŰ� ���� ���� �׻� true ��ȯ
			System.out.println("f�� UnitsŬ������ �ڼ��Դϴ�");
		if(f instanceof Fightable)
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�");
		if(f instanceof Movable)
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�");
		if(f instanceof Attackable)
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�");
		if(f instanceof Object)
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�");
		
	}
} 
