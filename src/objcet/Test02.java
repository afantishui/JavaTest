package objcet;

public class Test02 {

	public Test02() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public OutInterface action(String x) {
		class innerClass implements OutInterface{ //�ֲ��ڲ���
			public innerClass(String s) {
				s=x;
				System.out.println(s);
			}
		}
		return new innerClass("do");
	}
	interface OutInterface{
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Test02 d =new Test02();
		d.action("�ֲ��ڲ���");

	}

}
