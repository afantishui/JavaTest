package control;

import java.util.Scanner;

public class ScannerPassword {

	public static void main(String[] args) {
		// ʹ��do while�����֤����
		Scanner sc=new Scanner(System.in);
		String pw1="0";
		String pw2="-1";
		do {
			System.out.println("����������:");
			pw1=sc.nextLine();
			System.out.println("����������:");
			pw2=sc.nextLine();
			if(!pw1.equals(pw2)) {
				System.out.println("����������벻һ�£����������룡");
			}
		}while(!pw1.equals(pw2));
		System.out.println("�����������");

	}

}
