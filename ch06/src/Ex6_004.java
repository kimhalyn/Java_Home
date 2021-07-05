/*
 * 날짜: 2021/05/09
 * 내용: 자바의 정석_객체 배열
 * 이름: 김하린
 * 객체 배열 == 참조변수 배열
 * 많은 수의 객체를 다뤄야 할 때 사용, 객체의 주소가 저장됨
 * */

	
	class Tv { //참조변수 Tv, 객체 color, power, channel
		String color; 
		boolean power; 
		int channel; 
		
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	} 
	
public class Ex6_004 {	

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length; i++) { //tvArr.length = 3
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
	}
}
