class 수학{
	// 행동 정의 
	// 행동에 대해서 어떻게 수행할지 자세한 절차를 정의 
	public int 합하다(int 수1, int 수2) {
		// 행동 상세
		int 합 = 0;
		합 = 수1 + 수2;
		return 합;
	}
}

class A {
	 
	public int v;
	// 행동 정의 및 요약
	public void g() {
		v = 7; // 행동 상세
	}
	// 행동 정의 및 요약
	public void h() {
		v = 5; // 행동 상세 
	}
}
public class Method {

	public static void main(String[] args) {
		수학 a = new 수학();
		// 행동 실행 
		// 값 이용 및 변화
		System.out.println(a.합하다(7, 5));
// 값을 어떻게 이용 및 변화시키기 위해서 행동(메소드)를 정의하는 것
// 행동(메소드) 요소 : 행동을 하기 위한 준비물(변수), 행동 순서, 행동 후 결과(반환값)
		
		A a1 = new A();
		a1.g(); 
		System.out.println(a1.v); // 행동 실행
		a1.h(); 
		System.out.println(a1.v); // 행동 실행
// 모든 메소드는 특정 클래스 안에 존재하며 그것들이 객체로 생성되었을때 실행할 수 있음


	}
}

