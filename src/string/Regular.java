package string;

import java.util.Scanner;

public class Regular {

	public Regular() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * 
		 * */
		//[������]@[]����������.[�м���].[��׺]
		String regex="\\w+@+\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String mail1="111";
		String mail2="1@1.com";
		String mail3="dashabi@163.vip.com";
		if(mail1.matches(regex)) {
			System.out.println(mail1+"�ǺϷ�����");
		}
		if(mail2.matches(regex)) {
			System.out.println(mail2+"�ǺϷ�����");
		}
		if(mail3.matches(regex)) {
			System.out.println(mail3+"�ǺϷ�����");
		}
		
		/*��֤��½�ֻ� 11λ ǰ��λ��1����3����0-9��
		 * ��1����5����012356789��
		 * ��1����8����056789��
		 */
		Scanner sc= new Scanner(System.in);
		String regex1="(13[0-9]|15[012356789]|18[056789])\\d{8}";
		while(true) {
			System.out.println("�������ֻ��ţ�");
			String phone=sc.nextLine();
			if (phone.matches(regex1)) {
				System.out.println("����������ֻ���");
			}else {
				System.out.println("������Ĳ����ֻ���");
			}
		}
	}

}
