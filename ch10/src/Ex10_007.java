import java.util.Calendar;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_��¥�� �ð� & ����ȭ(add())
 * �̸�: ���ϸ�
 * Run Configuration
 */
public class Ex10_007 {

	public static void main(String[] args) {

//		if(args.length != 2) {
//			System.out.println("Usage : java CalrendarEx10_007 2021 5");
//			return;
//		}
		
		int year = Integer.parseInt(args[0]); //2021
		int month = Integer.parseInt(args[1]); //5
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDAy = Calendar.getInstance(); //������
		Calendar eDAy = Calendar.getInstance(); //������
	
		sDAy.set(year, month-1, 1); //month�� 0���� �����ϴϱ� 5�� ��µǷ��� -> 4�� ���� ��
		eDAy.set(year, month, 1);
		
		eDAy.add(Calendar.DATE, -1); //�� ���� ������ �� ���
		
		// ù ��° ������ ���� �������� �˾Ƴ�
		START_DAY_OF_WEEK = sDAy.get(Calendar.DAY_OF_WEEK); 
		END_DAY = eDAy.get(Calendar.DATE);
		
		System.out.println("      " + year + "�� "+ month +"��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//�ش� ���� 1���� ��� ���������� ���� ���� ���
		for(int i=1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		for(int i=1, n=START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i<10) ? "  "+ i : " "+ i); //���� �����
			if(n%7==0) System.out.println(); //������� �� ������ �ٹٲ�
		}
	}
}
