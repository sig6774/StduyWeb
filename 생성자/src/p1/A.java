package p1;

/*
생성자 
- 클래스 이름과 같은 행동(메소드)을 생성자라고 하며 짝지어진 것(자료형 등)이 없음
- 객체가 준비될때 해야 할 일들이 적힌 행동(메소드)
- 따로 사용자가 생성자를 지정하지 않으면 생성자는 숨겨져 있음
- 다양한 준비방식을 지원하기 위한 표현 
- 아무 생성자가 없으면 기본 생성자가 자동 삽입 
 */
 
public class A {
	
	public A() {
		// 생성자 생성 
		System.out.println("생성자 생성완료");
	}
	public A(int v){
		System.out.println("A(int : " +  v + ") "  );
	}
	public A(String v) {
		System.out.println("A(String : " + v + ") ");
	}
	public A(int v, String v1) {
		System.out.println("여러개 매개변수 넣어도 가능" + v +"  "+ v1);
	}

}
