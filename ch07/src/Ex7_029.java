/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� Ŭ������ �����ڿ� ���ټ�(3)
 * �̸�: ���ϸ�
 */
 class Ex7_029 {
	 private int outerIv = 0;
	 static int outerCv = 0;
	 
	 class InstanceInner2{
		 int iiv = outerIv; //1) �ܺ� Ŭ������ private��� ���� ����
		 int iiv2 = outerCv;
	 }
	 static class StaticInner2{
//		 int siv = outerIv; staticŬ������ �ܺ� Ŭ������ �ν��Ͻ������ ���� x
		 static int scv = outerCv;
	 }
	 void myMethod2() {
		 final int lv = 0;
		 final int LV = 0;  
		 
//		 2) ����Ŭ������ �ܺ� Ŭ������ �ν��Ͻ�����, static���� ��� ��� ���� 
		  //����Ŭ������ ���Ե� �޼��忡 ���ǵ� final������ ��� ���� -> �޼��� ����� ������� ����� ��밡�� �ϱ� ������
		 class LocalInner{ 
			 int liv1 = outerIv;
			 int liv2 = outerCv;
			 
			 int liv3 = lv;
			 int liv4 = LV;
		 }
	 }
		
} 
