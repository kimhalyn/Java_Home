/*
 * ��¥: 2021/05/04
 * ����: �ڹ��� ����_Ÿ�԰��� ��ȯ���
 * �̸�: ���ϸ�
 * 
 * ���ڿ� ���ڰ��� ��ȯ -> ���� + '0' = ����
 *                -> ���� - '0' = ����
 *                
 * ���ڿ��� ��ȯ -> ���� + "" = ���ڿ�
 *           -> ���� + "" = ���ڿ�
 * 
 * ���ڷ� ��ȯ -> Integer.parseInt()
 *          -> Double.parseDouble() 
 * */
public class EX2_010 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); //charAt�Լ��� ���ڿ� 3�� ���ڷ� ��ȯ, ����'3' - '0' = ����3
		System.out.println('3' - '0' + 1); // (����-'0')����3 + 1
		System.out.println(Integer.parseInt("3") + 1); //���ڷ� ��ȯ + 1
		System.out.println("3" + 1); // ���� + 1
		System.out.println(3 + '0'); // ���� + 0 = ���� , '0'�� ���ڷ� 48
	}
	
}
