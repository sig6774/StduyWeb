package Final;

/*
final 
- 변화불가의 느낌 
- final 변수 : 상태변화 X 
- final 메소드 : 바디의 변화 X(Override X)
- final 클래스 : 상속(포함) X   
 */

class A {
	void g() {
		System.out.println("A :: g()");
	}
	final void e() {
		System.out.println("A :: e()");
	}
	// final 메소드 
}

class B extends A{
	
	@Override
	void g() {
		System.out.println("Extends A class Method g()");
	}
	
//	@Override 
//	void  e() {
//		System.out.println("Not extends A class Method e()");
//	}
	// A클래스의 e()는 final 이므로 override 불가 
}

final class C{}
//class D extends C{}
// C클래스는 final임으로 D클래스는 C클래스를 포함할 수 없음

public class Final_ {

	public static void main(String[] args) {
		int a = 7; a = 12;
		System.out.println(a);
		
		final int b = 8;
		// final 변수 
//		b = 10;
		// b변수는 final로 지정되어 있으므로 변화가 불가능해서 b = 10; 에서 오류 발생  
		
		A a1 = new A();
		a1.e();
		B b1 = new B();
		b1.g();
		b1.e();
		// b1은 A클래스를 상속받았는데 B클래스에서는 e()를 Override할 수 없음 
		// 하지만 e()메소드를 Override 하지않고 그냥 불러오는것은 가능 
				

	}

}
