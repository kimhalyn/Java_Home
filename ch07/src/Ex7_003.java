/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_단일 상속, Object클래스
 * 이름: 김하린
 * 단일 상속: 하나의 부모만 상속
 * 비중이 높은 클래스 -> 상속 관계, 나머지는 포함 관계
 * Object클래스: 모든 클래스의 조상 -> 부모 없는 클래스는 자동적으로 Object클래스를 상속받음 
 */
class Tv1{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class VCR{
	boolean power;
	int counter = 10;
	void power() {power = !power;}
	void play() {/* 내용생략 */}
	void stop() {/* 내용생략 */}
	void rew() {/* 내용생략 */}
	void ff() {/* 내용생략 */}
	
}

public class Ex7_003 extends VCR {

	VCR vcr = new VCR();
		
		void play() {
			vcr.play();
		}
		void stop() {
			vcr.stop();
		}
		void rew() {
			vcr.rew();
		}
		void ff() {
			vcr.ff();
		}
	}
