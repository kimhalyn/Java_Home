/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_����ó��, try-catch(1)
 * �̸�: ���ϸ�
 * try{
 *		���ܰ� �߻��� ���ɼ��� �ִ� ����� (ex. ����)
 *} catch(Exception1 e1){
 *		Exception1�� �߻����� ��, �̸� ó���ϱ� ���� ���� (ex. ���� ����)
 *} catch(Exception2 e2){
 *		Exception2�� �߻����� ��, �̸� ó���ϱ� ���� ���� (ex. ��� ����)
 *}	catch(Exception3 e3){
 *		Exception3�� �߻����� ��, �̸� ó���ϱ� ���� ���� (ex. ���� ���)
 *}
 */
public class Ex8_002 {

	public static void main(String[] args) {
			System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch(Exception e) {
			System.out.println(4); //���ܰ� �߻����� ���� ����, ���ܾ��� �� -> catch�� ���
		} //try-catch ����
		System.out.println(5);
	}
}
