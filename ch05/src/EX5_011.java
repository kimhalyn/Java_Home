import java.util.Arrays;

/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_String�迭
 * �̸�: ���ϸ�
 * */
public class EX5_011 {

	public static void main(String[] args) {

		String[] strArr = {"����", "����", "��"};
		System.out.println(Arrays.toString(strArr)); //[]���ڿ��� ���
		
		for(int i=0; i<strArr.length; i++) {
			int tmp = (int)(Math.random() * strArr.length);
			System.out.println(strArr[tmp]);
		}
	}
		
}
