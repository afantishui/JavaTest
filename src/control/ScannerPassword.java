package control;

import java.util.Scanner;

public class ScannerPassword {

	public static void main(String[] args) {
		// 使用do while语句验证密码
		Scanner sc=new Scanner(System.in);
		String pw1="0";
		String pw2="-1";
		do {
			System.out.println("请输入密码:");
			pw1=sc.nextLine();
			System.out.println("请输入密码:");
			pw2=sc.nextLine();
			if(!pw1.equals(pw2)) {
				System.out.println("您输入的密码不一致，请重新输入！");
			}
		}while(!pw1.equals(pw2));
		System.out.println("密码设置完成");

	}

}
