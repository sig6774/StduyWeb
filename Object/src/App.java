
class B {
	int v1;
}

class C{
	int v2;
}
class A{
	 Object o;
	
	void addObject(String name, Object o1) {
		this.o = o1;
	}
	Object getAttribute(String name) {return this.o;}
	
}
class generic<TYPE>{
	TYPE  t;
	TYPE g(TYPE v) { return v;     }
}

class ex<integer>{
	int t;
	int g(int v) {return v;}
}
// generic의 형태는 마치 ex와 같음 

public class App {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1.addObject("aaa", b1);
		// a1을 Object로 바꿈  
		B c1 = (B) a1.getAttribute("aaa");
		// 형변환(cast) : Object형을 B형으로 바꿈  
		System.out.println(c1);
		c1.v1 = 3;
		// c1은 B로 바뀐것을 볼 수 있음
		
		
	}
	

}
