package 상속;

class A{
	public int v1;
	public void g() {
		System.out.println("A::g()");
	}
}

class B extends A{
	// B는 A의 내용을 포함하고 있다 => 이것이 상속(extends)이라고 불림  
	public int v2;
	public void h() {
		System.out.println("B::h()");
	}
	// B는 결국 v1, v2, g(), h()의 내용을 포함하고 있다
}
public class App {

	public static void main(String[] args) {
		B b1 = new B();
		b1.g();
		// B클래스는 A의 기능도 포함하고 있으므로 A 클래스의 상태와 행동을 가져올 수 있음
		b1.v1 = 9;
		System.out.println(b1.v1);
		b1.v2 = 8;
		b1.h();
		System.out.println(b1.v2);
	}
}
