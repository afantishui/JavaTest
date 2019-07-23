package objcet;

public class Test02 {

	public Test02() {
		// TODO 自动生成的构造函数存根
	}
	public OutInterface action(String x) {
		class innerClass implements OutInterface{ //局部内部类
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
		// TODO 自动生成的方法存根
		Test02 d =new Test02();
		d.action("局部内部类");

	}

}
