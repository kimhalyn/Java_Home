import java.util.Scanner;

/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_������ �迭 Ȱ��(�ܾ� ���߱�)
 * �̸�: ���ϸ�
 * */
public class EX5_018 {

	public static void main(String[] args) {
		
		String[][] words = {
							{"chair", "����"},
							{"computer", "��ǻ��"},
							{"integer", "����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n", words[i][1]);
			}
					
		}
		
	}
}
