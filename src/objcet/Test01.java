package objcet;

// 创建成员内部类
public class Test01 {
	innerClass a = new innerClass();
	public void outf() {
		a.inf();
	}
	class innerClass{
		int y = 0;
		public void inf() {
			System.out.println("内部类方法输出y="+y);
		}
	}

	public static void main(String[] args) {
		Test01 a = new Test01();
		a.outf();
		// 实例化成员内部类方法
		Test01.innerClass b = a.new innerClass();
		b.inf();

	}

}
