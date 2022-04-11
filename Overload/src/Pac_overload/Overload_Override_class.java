package Pac_overload;

class 사람{
	void 넣다() {
		System.out.println("아무것도 안넣다.");
	}
	void 넣다(int 숫자) {
		System.out.println("숫자 넣다.");
	}
	void 넣다(String 문자) {
		System.out.println("문자 넣다.");
	}
	void 넣다(int 숫자, String 문자) {
		System.out.println("숫자와 문자를 넣다.");
	}
}
// 메소드 오버로드 
// 매개변수의 타입이나 개수를 다르게 할 수 있음 

class A1{
	public void g() {
	}
}
class B1 extends A1{
	public void g(int a) {
	}
}
// 메소드 오버로드

class C{
	C() {}
	C(int v){}
	C(int v, String s){}
}
// 생성자 오버로드 
// 매개변수의 타입과 개수를 다르게 할 수 있음 

// Override 예시
class 조부모때식당{
	void 순대국을만들다() {
		System.out.println("내장순대국을 만들다.");
	}
}

class 부모때식당 extends 조부모때식당{
	@Override
	void 순대국을만들다() {
		System.out.println("고기순대국을 만들다.");
	}
	 void 족발을만들다() {
		System.out.println("족발을 만들다.");
	}
}
public class Overload_Override_class {

	public static void main(String[] args) {
		조부모때식당 조부모때식당손님 = new 조부모때식당();
		조부모때식당손님.순대국을만들다();
		
		부모때식당 부모때식당손님 = new 부모때식당();
		부모때식당손님.순대국을만들다();
		부모때식당손님.족발을만들다();
		// 부모때식당손님은 조부모때 순대국과 다르게 내장순대국이 아니라 고기순대국을 먹음 
		
		조부모때식당 예전조부모때식당단골손님 = new 부모때식당();
		예전조부모때식당단골손님.순대국을만들다();
		// 예전 내장순대국이 아니라 고기순대국으로 바뀜 
		// 즉, Override는 새롭게 변화를 주는 것 
		// 조부모때식당으로 바라본 순대국이 부모때식당의 순대국으로 새롭게 변화 
	}

}
