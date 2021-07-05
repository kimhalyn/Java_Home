import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_����ȭ Ŭ����(SimpleDateFormat)
 * �̸�: ���ϸ�
 * ��¥�� �ð��� �پ��� �������� ����� �� �ְ� ����
 */
public class Ex10_012 {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015�� 11�� 23��"); //���ڿ� -> ��¥�� ��ȯ
			System.out.println(df2.format(d)); //��¥ -> ���ڿ��� ��ȯ
		}catch (Exception e) {}
	}
}
