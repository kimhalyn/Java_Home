/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_break��
 * �̸�: ���ϸ�
 * �ڽ��� ���Ե� �ϳ��� �ݺ����� �����
 * */
public class Ex4_026 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i = 0;
		
		while(true) { //���ѹݺ��� cf) for(;; or ;true;){}�� �ۼ�
			if(sum > 100)
				break; 
			++i;
			sum += i;
		} //break�� ���� -> while�� ������ ��������

		System.out.println("i=" +i);
		System.out.println("sum=" +sum);
		
	}
}
