/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_������ �ʱ�ȭ(��������� �ʱ�ȭ �ñ�� ����)
 * �̸�: ���ϸ�
 */ 
class Document{
	static int count = 0;
	String name;
	
	Document(){ //���� ���� �� �������� �������� �ʾ��� ��
		this("�������"+ ++count);
	}
	Document(String name){
		this.name = name;
		System.out.println("���� "+ this.name +"�� �����Ǿ����ϴ�.");
	}
}
	
public class Ex6_023 {	
	public static void main(String[] args) {

		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
	
}
		

