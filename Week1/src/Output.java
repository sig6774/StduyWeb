class ����{

	public int g() {
		return 8;
	}
	// g()������ ����� 8�� ¦�����
	
	public int g1() {
		int a = 6;
		return a + 3;
	}
	// g1()���� = a+3�� ���� 
	
	public int g2(int a, int b) {
		return a + b;
	}
	// g2(int a, int b)���� = a+ b 

}

class A1{
	public int d() {
		System.out.println("d");
		return 7;
	}
	public float h() {
		float p = 3.14F; // �Ǽ����̸� ���ڿ� F �ۼ� 
		System.out.println("h");
		return p;
	}
	public String k() {
		System.out.println("k");
		return "Seoul";
	}
}

class Math{
	public int sum1(int a, int b) {
		return a+b;
	}
	public int sum2(int a, int b) {
		int total = a+b;
		return total;
		
	}

}

class Bo{
	public int g(int a, int b) {
		return a + b;
	}
	public String h(String city) {
		return city + "!";
	}
	public float k() {
		return 3.14F;
	}
}
public class Output {

	public static void main(String[] args) {
		���� as = new ����();
		System.out.println(as.g2(as.g(), as.g1()));

		A1 a1 = new A1();
		System.out.println(a1.d());
		System.out.println(a1.h());
		System.out.println(a1.k());
		
		Math m = new Math();
		System.out.println(m.sum1(20, 30));
		System.out.println(m.sum2(30, 20));
		
		Bo bo = new Bo();
		System.out.println(bo.g(30, 20));
		System.out.println(bo.h("Busan"));
		System.out.println(bo.k());
		
	}
}
