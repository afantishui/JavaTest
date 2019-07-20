package string;

import java.util.Scanner;

public class Regular {

	public Regular() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 
		 * */
		//[邮箱名]@[]服务器名称.[中间名].[后缀]
		String regex="\\w+@+\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String mail1="111";
		String mail2="1@1.com";
		String mail3="dashabi@163.vip.com";
		if(mail1.matches(regex)) {
			System.out.println(mail1+"是合法邮箱");
		}
		if(mail2.matches(regex)) {
			System.out.println(mail2+"是合法邮箱");
		}
		if(mail3.matches(regex)) {
			System.out.println(mail3+"是合法邮箱");
		}
		
		/*验证大陆手机 11位 前三位【1】【3】【0-9】
		 * 【1】【5】【012356789】
		 * 【1】【8】【056789】
		 */
		Scanner sc= new Scanner(System.in);
		String regex1="(13[0-9]|15[012356789]|18[056789])\\d{8}";
		while(true) {
			System.out.println("请输入手机号：");
			String phone=sc.nextLine();
			if (phone.matches(regex1)) {
				System.out.println("你输入的是手机号");
			}else {
				System.out.println("你输入的不是手机号");
			}
		}
	}

}
