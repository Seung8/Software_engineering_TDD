public class Dollar {
	public int original;
	public int amount = 10;

	public Dollar(int dollar){
		// 클래스명과 같은 public 변수는 생성자 (클래스와 이름이 같다)
		amount = dollar;
		original = dollar;
	}
	public void times(int multiplier){
		// void 는 리턴 값이 없음을 뜻함
		amount = original * multiplier;

	}
}