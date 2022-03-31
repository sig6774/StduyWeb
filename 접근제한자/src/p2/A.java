package p2;

/*
접근제한자 제한 범위 
- class 내 : private 
- package 내 : default
- package 외  : public
 */

public class A {
	int v1;
	public int v2;
	private int v3;
	
	void g() {
		System.out.println("A :: g()");
	}
	
	public void h() {
		System.out.println("A ::h()");
	}
	
	private void k() {
		System.out.println("A ::k()");
	}
	
	void r() {
		v3 = 7; 
		k();
		}
	// v3와 k()는 private이지만 private의 특징은 같은 클래스에서 접근가능

}
