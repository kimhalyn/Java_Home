/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_continue��(1)
 * �̸�: ���ϸ�
 * �� ���� �ݺ������� �ǳʶ�
 * */
public class Ex4_027 {

	public static void main(String[] args) {
	
		for(int i=0; i <=10; i++) {
			if(i%3==0) //3�ǹ��, 0 ������ 3�� ���� 0�̶� ��¾ȵ�
				continue;
			System.out.println(i);
		}//continue�� ���� -> while�� ���������� �� x -> for������ �ٽ� �̵�
	}
}
