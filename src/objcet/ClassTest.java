package objcet;

public class ClassTest {
	int eggcount;
	public ClassTest(int eggcount) { 
		//带参数构造方法
		// TODO 自动生成的构造函数存根
		this.eggcount=eggcount;
		System.out.println("这个饼有 "+eggcount+"个鸡蛋");
	}
	public ClassTest() {
		//空参数构造方法
		//eggcount=1;
		//System.out.println("这个饼有 "+eggcount+"个鸡蛋");
		this(2);
	}

	public static void main(String[] args) {
		ClassTest test=new ClassTest(5);
		ClassTest test1=new ClassTest();

	}
	Book book=Book.libraryBorrow();

}
