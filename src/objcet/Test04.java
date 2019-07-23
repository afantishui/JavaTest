package objcet;

public class Test04 {

	int x = 1;
	//静态内部类可以创建main方法
	static class innerClass{
		public static void main(String[] args) {
			System.out.println("我是静态内部类");
		}
	}

}
