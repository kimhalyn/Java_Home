import java.util.ArrayList;

/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_Ÿ�Ժ���
 * �̸�: ���ϸ�
 */
class computer {}
class Audio {}

public class Ex12_002 {
	
	public static void main(String[] args) {
		
		ArrayList<computer> list = new ArrayList<computer>();
		list.add(new computer());
//		list.add(new Audio()); Ÿ�Ժ����� Tv�� ���� -> Audio�Ұ�
		
//		Tv t = (Tv)list.get(0); list�� ù��° ��� ���� �� -> ����ȯ �ʿ�(Ÿ�� ����ġ) (object -> computer)
		computer t = list.get(0); //Ÿ�Ժ��� �������� Ÿ�� ��ġ -> ����ȯ �ʿ����
		
	}
}
