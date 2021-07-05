import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_���ð� ť�� Ȱ��_ť
 * �̸�: ���ϸ�
 * ������ Ȱ��: ���İ��, ���İ�ȣ�˻�, �������μ����� undo, redo, ���������� �ڷ�/������
 * ť�� Ȱ��: �ֱٻ�빮��, �μ��۾� �����, ����
 */
public class Ex11_006 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue�� �ִ� 5�������� ����ǵ��� ��

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.println(">>");
			try {
				
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0); //���α׷� ����
					
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ "+ MAX_SIZE +"�� �����ݴϴ�.");
					
				}else if(input.equalsIgnoreCase("history")) {
					save(input); //�Է¹��� ��ɾ� ����
					
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				}else {
					save(input);
					System.out.println(input);
				}
			}catch (Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}
	}

	public static void save(String input) {
		if (!"".equals(input)) { //�� ���ڿ��� �ƴ� ��
			q.offer(input);
		}
//		�ִ� ũ�⸦ ������, ���� ó�� �Էµ� ���� ������
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}