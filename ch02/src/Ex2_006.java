/*
 * ��¥: 2021/05/04
 * ����: �ڹ��� ����_����ȭ�� ���-printf()_������ ���
 * �̸�: ���ϸ�
 */
public class Ex2_006 {

	public static void main(String[] args) {
	byte b = 1;
	short s = 2;
	char c = 'A';
	
	int finger = 10;
	long big = 100_000_000_000L; 
	long hex = 0xFFFF_FFFF_FFFF_FFFFL;
	
	int octNum = 010; //8���� 10, 10������ 8
	int hexNum = 0x10; //16���� 10, 10������ 16
	int binNum = 0b10; //2���� 10, 10������ 2
		
	System.out.printf("b=%d%n", b);
	System.out.printf("s=%d%n", s);
	System.out.printf("c=%c, %d%n", c, (int)c);
	
	System.out.printf("finger=[%5d]%n", finger); //��ü 5ĭ, ������ ����
	System.out.printf("finger=[%-5d]%n", finger); //��ü 5ĭ, ���� ����
	System.out.printf("finger=[%05d]%n", finger); //��ü 5ĭ, ���� 0���� ä��
	
	System.out.printf("big=%d%n", big); 
	System.out.printf("hex=%x%n", hex); //16����
	System.out.printf("hex=%#x%n", hex); //16����, '#'�� ���λ�
	
	System.out.printf("octNum=%o, %d%n", octNum, octNum); //8����, 10����
	System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); //16����, 10����
	System.out.printf("octNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); //2����, 10����
	}
}
