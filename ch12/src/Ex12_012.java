import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/*
 * 날짜: 2021/06/02
 * 내용: 자바의 정석_애너테이션 타입 정의
 * 이름: 김하린
 * @interface 애너테이션 이름 {
 * 타입 요소이름();
 * }
 * 애너테이션 요소 규칙
 * - 기본형, String, enum, 애너테이션, Class만 허용
 * - 괄호()안에 매개변수 선언 x
 * - 예외 선언 x
 * - 요소를 타입 매개변수로 정의 x 
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
