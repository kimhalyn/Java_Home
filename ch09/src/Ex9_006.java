import java.util.StringJoiner;

/*
 * ��¥: 2021/05/19
 * ����: �ڹ��� ����_join()�� StringJoiner
 * �̸�: ���ϸ�
 * join(): ���� ���ڿ� ���̿� �����ڸ� �־ ����
 */
public class Ex9_006 {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		String arr[] = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","<","]");
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}
}