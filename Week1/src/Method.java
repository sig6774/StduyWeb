class ����{
	// �ൿ ���� 
	// �ൿ�� ���ؼ� ��� �������� �ڼ��� ������ ���� 
	public int ���ϴ�(int ��1, int ��2) {
		// �ൿ ��
		int �� = 0;
		�� = ��1 + ��2;
		return ��;
	}
}

class A {
	 
	public int v;
	// �ൿ ���� �� ���
	public void g() {
		v = 7; // �ൿ ��
	}
	// �ൿ ���� �� ���
	public void h() {
		v = 5; // �ൿ �� 
	}
}
public class Method {

	public static void main(String[] args) {
		���� a = new ����();
		// �ൿ ���� 
		// �� �̿� �� ��ȭ
		System.out.println(a.���ϴ�(7, 5));
// ���� ��� �̿� �� ��ȭ��Ű�� ���ؼ� �ൿ(�޼ҵ�)�� �����ϴ� ��
// �ൿ(�޼ҵ�) ��� : �ൿ�� �ϱ� ���� �غ�(����), �ൿ ����, �ൿ �� ���(��ȯ��)
		
		A a1 = new A();
		a1.g(); 
		System.out.println(a1.v); // �ൿ ����
		a1.h(); 
		System.out.println(a1.v); // �ൿ ����
// ��� �޼ҵ�� Ư�� Ŭ���� �ȿ� �����ϸ� �װ͵��� ��ü�� �����Ǿ����� ������ �� ����


	}
}

