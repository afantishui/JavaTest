package objcet;

public class Book {

//	public Book() {
//		// TODO 自动生成的构造函数存根
//	}
	
	private Book() {
		
	}
	static public Book libraryBorrow() { //创建静态方法，返回本类实例对象
		return new Book();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
