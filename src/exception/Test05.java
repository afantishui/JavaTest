package exception;

public class Test05 {

	public static void main(String[] args) throws ClassNotFoundException{
		// 空指针异常 NullPointerException
		//Object obj = null;
		//System.out.println(obj.hashCode());
		
		// 下标越界 ArrayIndexOutOfBoundsException
		//int a[] = new int[6];
		//System.out.println(a[10]);
		
		//计算错误 ArithmeticException
		//int b = 1/0;
		
		// 找不到类 ClassNotFoundException
		Class c = Class.forName("java.lang.奥特曼");
		System.out.println(c);
		
		// 无法解析的编译问题
				try {
					int a = 1/2; //去掉逗号会报无法编译
					System.out.println(a);
				} catch (Exception e) {
					// TODO: handle exception
				}

	}

}
