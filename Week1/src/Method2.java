class B{
	B giveB() {
		return new B();
	}
}

class �л�{
	�л� �Ұ���Ű��() {
		return new �л�();
	}
}

class �л�1{
	�л�1 �Ұ���Ű��() {
		�л�1 �ѿ��л� = new �л�1();
		return �ѿ��л�;
	}
	int ����̾�() {
		return 23;
	}
}
// return�� ���ο� ��ü ���� 
public class Method2 {

	public static void main(String[] args) {
		B b1 = new B();
		// ��ü ���� 
		B b3 = b1.giveB();
		System.out.println(b3);
		
		�л� ö�� = new �л�();
		�л� �̻��� = ö��.�Ұ���Ű��();
		// �̻����� ö��.�Ұ���Ű��()��� ���� ����Ŵ
		
		
		
		�л�1 ��ö�� = new �л�1();
		�л�1 �ѿ��� = ��ö��.�Ұ���Ű��(); // ������-�ǹ̷� ¦������
		System.out.println(�ѿ���); 
		System.out.println(�ѿ���.����̾�());
		int �ѿ������� = �ѿ���.����̾�(); // �ϻ����� ¦������
		System.out.println(�ѿ�������);
		
	}
}
