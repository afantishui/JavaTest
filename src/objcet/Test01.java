package objcet;

// ������Ա�ڲ���
public class Test01 {
	innerClass a = new innerClass();
	public void outf() {
		a.inf();
	}
	class innerClass{
		int y = 0;
		public void inf() {
			System.out.println("�ڲ��෽�����y="+y);
		}
	}

	public static void main(String[] args) {
		Test01 a = new Test01();
		a.outf();
		// ʵ������Ա�ڲ��෽��
		Test01.innerClass b = a.new innerClass();
		b.inf();

	}

}
