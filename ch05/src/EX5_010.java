/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_String�迭
 * �̸�: ���ϸ�
 * */
public class EX5_010 {

	public static void main(String[] args) {

		String[] names = {"kim", "lee", "park"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+ i + "]: "+ names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp: "+ tmp);
		names[0] = "Yu"; //�ε��� 0�� ���� "Yu"�� ����
		
		for(String str : names) { //���� for��(�迭�� ��� ����, ����x, ���� ���� �͸� ����)
			System.out.println(str);
		}
	}
		
}
