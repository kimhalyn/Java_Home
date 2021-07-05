/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_정수형과 실수형 간의 형변환(Casting)
 * 이름: 김하린
 * 정수형에서 실수형으로 형변환 -> 정밀도의 한계로 오차 발생 가능성 있음
 * float(소수점 아래 6자리)  -> 정밀도가 7자리  -> 8자리 정수 저장 시 오차 발생
 * double(소수점 아래 6자리) -> 정밀도가 15자리 -> 8자리 정수 저장 시 오차없이 변환 가능
 * */
public class Ex2_014 {

	public static void main(String[] args) {

		int i = 91234567;
		float f = (float)i; //int -> float
		int i2 = (int)f; //float -> int
		
		double d = (double)i; //int -> double
		int i3 = (int)d; //double -> int
		
		float f2 = 1.666f;
		int i4 = (int)f2; //float -> int
		
		System.out.printf("i=%d%n", i);
		System.out.printf("f=%f i2=%d%n", f, i2);
		System.out.printf("d=%f i3=%d%n", d, i3);
		System.out.printf("(int)%f=%d%n", f2, i4);
		
		
	}
	
}
