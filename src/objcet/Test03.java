package objcet;

public class Test03 {
	
	public OutInterface2 action() {
		// �����ڲ���
		return new innerClass2();
//		return new OutInterface2() {
//			private int i = 0;
//			public int getValue() {
//				return i;
//			}
//		} ;
	}
	//�ӿ�
	interface OutInterface2{}
	
	class innerClass2 implements OutInterface2{
		private int i = 0;
		public int getValue() {
			return i;
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
