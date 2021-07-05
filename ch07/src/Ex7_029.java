/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_내부 클래스의 제어자와 접근성(3)
 * 이름: 김하린
 */
 class Ex7_029 {
	 private int outerIv = 0;
	 static int outerCv = 0;
	 
	 class InstanceInner2{
		 int iiv = outerIv; //1) 외부 클래스의 private멤버 접근 가능
		 int iiv2 = outerCv;
	 }
	 static class StaticInner2{
//		 int siv = outerIv; static클래스는 외부 클래스의 인스턴스멤버에 접근 x
		 static int scv = outerCv;
	 }
	 void myMethod2() {
		 final int lv = 0;
		 final int LV = 0;  
		 
//		 2) 지역클래스는 외부 클래스의 인스턴스변수, static변수 모두 사용 가능 
		  //지역클래스가 포함된 메서드에 정의된 final변수만 사용 가능 -> 메서드 종료와 상관없이 상수는 사용가능 하기 때문에
		 class LocalInner{ 
			 int liv1 = outerIv;
			 int liv2 = outerCv;
			 
			 int liv3 = lv;
			 int liv4 = LV;
		 }
	 }
		
} 
