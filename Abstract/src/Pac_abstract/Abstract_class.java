package Pac_abstract;

abstract class A {
	
	// abstract메소드를 적기 위해서는 클래스앞에 abstract를 넣어야함 
	abstract void g();
	// 메소드의 바디가 없는 추상적인 메소드 작성
	void h() {
		System.out.println("h() method of A class.");
	}
}

class B extends A {
	// implements는 interface의 메소드를 Override할 가능성이 있는 경우만 사용 
	@Override
	void g() {
		System.out.println("B class is extended A class of g method.");
	}
	// A클래스의 추상적인 메소드를 Override하여 구체화 
}
public class Abstract_class {
	
	public static void main(String[] args) {
//		new A();
		// abstract class라서 객체가 생성 X 
		
		B b1 = new B();
		b1.g();
		b1.h();
	}
}
