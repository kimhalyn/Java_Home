import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/*
 * ��¥: 2021/06/02
 * ����: �ڹ��� ����_�ֳ����̼� Ÿ�� ����
 * �̸�: ���ϸ�
 * @interface �ֳ����̼� �̸� {
 * Ÿ�� ����̸�();
 * }
 * �ֳ����̼� ��� ��Ģ
 * - �⺻��, String, enum, �ֳ����̼�, Class�� ���
 * - ��ȣ()�ȿ� �Ű����� ���� x
 * - ���� ���� x
 * - ��Ҹ� Ÿ�� �Ű������� ���� x 
 */
@Deprecated
@SuppressWarnings("1111")
@TestInfo(testBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
class Ex12_012 {

	public static void main(String[] args) {

		Class<Ex12_012> cls = Ex12_012.class;

		TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testBy()" + anno.testBy());
		System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
		System.out.println("annno.testDate().hhmmss()=" + anno.testDate().hhmmss());

		for (String str : anno.testTools()) {
			System.out.println("testTools= " + str);

			System.out.println();
		}
		Annotation[] annoArr = cls.getAnnotations();
		{

			for (Annotation a : annoArr)
				System.out.println(a);
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
	int count() default 1;

	String testBy();

	String[] testTools() default {"JUnit, JUnit5"};

	TestType testType() default TestType.FIRST;

	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yymmdd();

	String hhmmss();
}

enum TestType {
	FIRST, FINAL
}
