import java.text.DecimalFormat;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_����ȭ Ŭ����(DecimalFormat)
 * �̸�: ���ϸ�
 * DecimalFormat
 * ���� -> ���ڿ�: format
 * ���ڿ� -> ����: parse
 * 
 * parseInt, parseDouble, parseFloat ...�� -> �޸�(,) �� ����
 */
public class Ex10_009 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89"); //���ڿ� -> ���ڷ� ��ȯ
			System.out.print("1,234,567.89" + " -> " );
			
			double d = num.doubleValue(); //doubleŸ������ ��ȯ
			System.out.print(d + " -> "); 
			
			System.out.print(df2.format(num)); //������������ ��ȯ
		} catch (Exception e) {

		}
	}
}
