// 객체 : 복합적인 것(변수와 메소드)으로 구성된 것 
// 클래스 : 객체에 대한 설명서 
class 자동차 {
	 int 속도 = 0; 
	int 유량 = 0;
	
	// 값 이용 및 변경
	void 주유받다(int 주유량) {
		유량 = 유량 + 주유량;
	}
	 
	// 값 이용 및 변경
	void 가속하다() {
		유량 = 유량 -1;
		속도 = 속도 +10;
	}
	 
	// 값 이용 
	int 속도는() {
		return 속도;
	}
	// 최종적으로 return
	// 메소드는 실제 값을 이용 및 변경
}
public class Method {

	public static void main(String[] args) {
		자동차 내차 = new 자동차();
		// 자동차라는 클래스의 내차라는 객체 생성 
		내차.주유받다(20);
		// 객체가 행동  
		// 주유량을 입력 
		내차.가속하다();
		System.out.println(내차.속도);
		System.out.println(내차.유량);
		System.out.println(내차.속도는());
		}}
		// 값을 이용 및 변화한 값을 출력