import java.util.EmptyStackException;
import java.util.Stack;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_���ð� ť�� Ȱ��_����
 * �̸�: ���ϸ�
 * ������ Ȱ��: ���İ��, ���İ�ȣ�˻�, �������μ����� undo, redo, ���������� �ڷ�/������
 * ť�� Ȱ��: �ֱٻ�빮��, �μ��۾� �����, ����
 */
public class Ex11_005 {

	public static void main(String[] args) {

//		if(args.length!=1) {
//			System.out.println("Usage:java Ex11_005 \"EXPRESSION\"");
//			System.out.println("Example:java Ex11_005 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2";   //args[0];
		
		System.out.println("expression:"+ expression);
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='('){ //���� ��ȣ�̸�
					st.push(ch+"");
				}else if(ch==')') { //�ݴ� ��ȣ�̸�
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			}else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}catch (EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.2");
		}
	}
}
