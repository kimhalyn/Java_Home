/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_추상 클래스
 * 이름: 김하린
 * 추상 메서드(=미완성 메서드)를 갖고 있는 클래스(abstract 리턴타입 메서드이름();)
 * 추상 메서드(선언부+구현부)는 메서드 구현부{}가 없음 -> 
 * 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 사용
 * 추상 클래스: 다른 클래스 작성에 도움을 주기 위한 것 -> 상속을 통해 추상 클래스를 완성하고 인스턴스 생성
 * 
 * 그냥 빈 구현부 만들어서 사용하면 안되나? -> 필수/강제의 느낌이 사라짐
 */
abstract class Player{ //추상 클래스(=미완성 클래스/설계도)
	abstract void play(int pos); //추상 메서드(=미완성 메서드)
	abstract void stop(); //추상 메서드(선언부만 있고 구현부가 없는 메서드)
}
//추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos +" 위치부터 play합니다");}
	void stop() {System.out.println("재생을 멈춥니다");}
}
public class Ex7_020 {

	public static void main(String[] args) {

//		Player p = new Player(); 에러 -> 추상 클래스라서 객체 생성이 불가
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); //다형성때문에 가능
		ap.play(100);
		ap.stop();
	}
} 
