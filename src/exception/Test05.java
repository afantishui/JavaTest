package exception;

public class Test05 {

	public static void main(String[] args) throws ClassNotFoundException{
		// ��ָ���쳣 NullPointerException
		//Object obj = null;
		//System.out.println(obj.hashCode());
		
		// �±�Խ�� ArrayIndexOutOfBoundsException
		//int a[] = new int[6];
		//System.out.println(a[10]);
		
		//������� ArithmeticException
		//int b = 1/0;
		
		// �Ҳ����� ClassNotFoundException
		Class c = Class.forName("java.lang.������");
		System.out.println(c);
		
		// �޷������ı�������
				try {
					int a = 1/2; //ȥ�����Żᱨ�޷�����
					System.out.println(a);
				} catch (Exception e) {
					// TODO: handle exception
				}

	}

}
