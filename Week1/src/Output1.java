/*
 - ����� ���� �ൿ(�޼ҵ�)�� �ڹٿ����� void()�� ���� 
 - �ൿ(�޼ҵ�)�ȿ� ���ϵ��� ���������� ¦������ ���� ���� 
 - ö���� ���������� �� ö��.����������()
    - ���� ������ ���� �������� �� �����ؾ� �Ѵٸ� ö��.����������()�� �������� ������ �� ����
- �л��� �������Դ´� �� �л�.�������Դ´�()
    - ���� ������ ������ �������� �� �����ؾ� �Ѵٸ� �л�.�������Դ´�()�� ���������� ������ �� ����
 */

class A{
	public void g() {
		System.out.println("����1");
		System.out.println("����2");
		System.out.println("����3");
	}
}

class A1{
	public void h() {
		System.out.println("7");
	}
}

//class A2{
//	public int k() {
//		System.out.println("����");
//	}
//}
//// ��ȯ(return)�� ���� �־���ϴµ� �����Ƿ� ������ �� 
//
//class A3{
//	public void m() {
//		System.out.println("����");
//		return 8;
//	}
//}
// void�� �ִµ� return�� �־ ������ �� 

class A4{
	public int g() {
		return 7;
	}
	
	
	public int h() {
		int v = 7;
		return v;
	}
	
	public int k() {
		int t = 7;
		return t + 4;
	}
	
	public String m() {
		return "Seoul";
	}
//	public int[] de() {
//		int[][] de = null;
//		return de[0];
//	}
}

public class Output1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.g();
		// ����� ����(void) Ŭ�������� ��ü�� �����Ͽ����Ƿ� ����� �ƹ��͵� ����
		
		A1 a2 = new A1();
//		int v = A1.h();
		// return�� ���� void�ε� int v�� �������� �ϴϱ� ������ �� 

		A4 a3 = new A4(); 
		System.out.println(a3.g());
		System.out.println(a3.h());
		System.out.println(a3.k());
		System.out.println(a3.m());
//		System.out.println(a3.de());
		
	}


}
