package objcet;

public class Test03 {
	
	public OutInterface2 action() {
		// 匿名内部类
		return new innerClass2();
//		return new OutInterface2() {
//			private int i = 0;
//			public int getValue() {
//				return i;
//			}
//		} ;
	}
	//接口
	interface OutInterface2{}
	
	class innerClass2 implements OutInterface2{
		private int i = 0;
		public int getValue() {
			return i;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
