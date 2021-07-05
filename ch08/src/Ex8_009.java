import java.io.File;

/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_�޼��� ���ܼ���(2)
 * �̸�: ���ϸ�
 * ���� ó�� ��� 1)try-catch 2)���� ����(=���� ���ѱ��) 3)����
 * void method() throws Exception1, Exception2, ....ExceptionN{�޼��� ����}
 * void method() throws Exception{�޼��� ����}
 */
class Ex8_009 {

	public static void main(String[] args) { 

		try {
			File f = createFile(args[0]); //Runconfigurations -> arguments�� �Է� 
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�");
		}catch(Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է��� �ֽñ� �ٶ��ϴ�");
		}
	}	
		
		static File createFile(String fileName)throws Exception{
			if(fileName==null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�");
			File f = new File(fileName);
			f.createNewFile();
			return f;
		}
	}
