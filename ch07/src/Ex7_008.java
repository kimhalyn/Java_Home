/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_import�� ����
 * �̸�: ���ϸ�
 * ctrl + shift + o(������): �ڵ����� import�� ����
 * ��Ű�� -> ����Ʈ -> Ŭ���� ������ �۾�
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex7_008 {

	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("���� ��¥�� "+ date.format(today));
		System.out.println("���� �ð��� "+ time.format(today));
	}
	
} 
