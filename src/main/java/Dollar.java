public class Dollar {
	public int original;
	// amount = amount * multiplier이 계속 반복되므로
	// 반복을 피하기 위해 오리지날을 정의
	public int amount = 10;

	public Dollar(int dollar){
		// 클래스명과 같은 public 변수는 생성자 (클래스와 이름이 같다)
		amount = dollar;
		original = dollar;
	}
	public Dollar times(int multiplier){
		// void 는 리턴 값이 없음을 뜻함
		amount = original * multiplier;
		return null;
	}
}