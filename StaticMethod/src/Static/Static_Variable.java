package Static;

class A1 {
	static int v; // 객체를 만들지 않아도 이미 존재 즉, 객체를 만들어도 모든 객체에 동일하게 존재 
	// 객체가 바뀌어도 값(상태)이 바뀌지 않음 
	int w; // 객체마다 가지는 상태 즉, 객체마다 값(상태)이 바뀔 수 있음 
	
}
public class Static_Variable {

	public static void main(String[] args) {
		A1.v = 3;
		
		A1 a1 = new A1();
		System.out.println(a1.v);
		// 3이 출력 즉, 객체 생성 전에 지정했던 값인 v는 a1이라는 객체를 생성해도 v가 3인채로 나옴 
		
		a1.v = 9;
		A1 a2 = new A1();
		a2.v= 10;
		System.out.println(a1.v);
		// 값이 10이 나옴 왜냐면 v는 static 이므로 모든 객체가 공유되는 변수라서 10이 나옴 
		
		a1.w = 32;
		a2.w = 10;
		System.out.println(a1.w);
		System.out.println(a2.w);
		// w는 객체마다 바뀌는 non static변수라서 값이 매번 달라짐 
	}
}
