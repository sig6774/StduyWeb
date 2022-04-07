package Static;

/*
static
- 객체를 만들지 않아도 이미 계속 존재한다. -> 프로그램의 시작때부터 프로그램이 끝날때까지 계속 존재 
 */

class A{
	public void g() {
		System.out.println("ggggg");
	}
	public static void h() {
		System.out.println("A의 h");
	}
}

class B{
	public static void h() {
		System.out.println("B의 h");
	}
}

class 수학자{
	int a; int b;
	
	int 합하다() {
		return a+ b;
	}
	
	static int 합하다(int a, int b) {
		return a +b;
	}
}
public class Static_Method {
	
	public static void main(String[] args) {
//		A.g(); 
		// g()는 A클래스의 객체가 만들어져야 생성되는데 
		// h()는 A클래스의 객체가 생성이 되지 않아도 프로그램이 실행되면서부터 만들어져 있는것 
		A  A1 = new A();
		A1.h();
		A.h();
		// 위의 h()두개는 같은 h()이다. 
		
		// 즉, static은 객체로 만들지 않아도 이미 준비되어 있다고 생각하자
		A1.g();
		B.h();
		System.out.println(수학자.합하다(30, 20));
		// static 합하다()는 수학자클래스의 객체를 만들어서 a,b의 상태를 이용해서 값을 만들지 않음 
		
		수학자 한수학자 = new 수학자();
		한수학자.a = 20; 한수학자.b = 10;
		System.out.println(한수학자.합하다());
		// 한수학자라는 객체를 만들어 a,b의 상태를 입력하고 그 상태들을 이용해서 값을 만듬 
		// a,b의 값을 한수학자가 유지될동안 기억하고 있음 
		// 이런 상황에서는 계산이 끝나면 a,b가 어디에 활용되지 않으므로 굳이 a,b를 기억하고 있어야할 필요가 없으므로 static 합하다()가 더 좋음 
	}
}
