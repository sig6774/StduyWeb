package 생성자;

import p1.A;
import p1.B;

public class App {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A("Seoul");
		A a4 = new A(3, "Busan");
		// 생성자를 만들때 매개변수를 넣어서 만들 수 있음
		
		B b1 = new B();
		
		
	}

}
