package objcet;

public class ClassTest {
	int eggcount;
	public ClassTest(int eggcount) { 
		//���������췽��
		// TODO �Զ����ɵĹ��캯�����
		this.eggcount=eggcount;
		System.out.println("������� "+eggcount+"������");
	}
	public ClassTest() {
		//�ղ������췽��
		//eggcount=1;
		//System.out.println("������� "+eggcount+"������");
		this(2);
	}

	public static void main(String[] args) {
		ClassTest test=new ClassTest(5);
		ClassTest test1=new ClassTest();

	}
	Book book=Book.libraryBorrow();

}
