/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_���� ������(operator)
 * ++�� ��ġ�� ���� ������, ���������� ����
 * �̸�: ���ϸ�
 * */
public class Ex3_002 {

	public static void main(String[] args) {
		
		int i = 5, j = 0;
		//������
		j = i++; //j=i, i++;�� ����
		System.out.println("j=i++; ���� �� i=" + i +", j =" + j);
		
		i = 5; 
		j = 0;
		
		//������
		j = ++i; //i++, j=i;�� ���� 
		System.out.println("j=++i; ���� �� i=" + i +", j =" + j);
		
	}

	
}
