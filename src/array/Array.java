package array;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// 定义数组三种方法
		int a1[]= {4,5,6};
		a1[2]=10;
		System.out.println(a1[2]);
		int a2[]=new int[200];
		System.out.println("a2数组的长度"+a2.length);
		
		//循环数组输入每个月有多少天
		int day[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<day.length;i++) {
			System.out.println((i+1)+"月有"+day[i]+"天");
		}
		//随机数
		Random ra=new Random();
		int[] red= new int[6];
		for(int i=0;i<6;i++) {
			int blue= ra.nextInt(15)+1;
			for(int j=0;j<6;j++) {
				red[j]=ra.nextInt(33)+1;
				//System.out.println(red[j]);
			}
			System.out.println(Arrays.toString(red)+" "+"["+blue+"]");
		}
		
		//二位数组
		System.out.println("------------二维数组------------");
		//二维数组3种定义方法
		int tdarr[][]=new int[3][4];
		int tdarr1[][]= {{1,2},{3,4}};
		int tdarr2[][]=new int[][] {{10,20},{33,12}};
		//赋值方式
		tdarr[0]=new int[] {1,2,3,4};
		tdarr[1][0]=20;
		tdarr[1][1]=23;
		tdarr[1][2]=25;
		tdarr[1][3]=27;
		
		//打印古诗横排 竖排
		char gushi[][]=new char[4][];
		gushi[0]=new char[] {'春','眠','不','觉','晓'};
		gushi[1]=new char[] {'处','处','闻','啼','鸟'};
		gushi[2]=new char[] {'夜','来','风','雨','声'};
		gushi[3]=new char[] {'花','落','知','多','少'};
		
		System.out.println("--------横版--------");
		for(int i=0;i<gushi.length;i++) {
			for(int j=0;j<gushi[i].length;j++) {
				System.out.print(gushi[i][j]);
			}
			if(i%2==0) {
				System.out.println(",");
			}else {
				System.out.println("。");
			}
		}
		System.out.println("--------竖版--------");
		for(int j=0;j<gushi[0].length;j++) {
			for(int i=3;i>=0;i--) {
				System.out.print(gushi[i][j]);
			}
			System.out.println();
		}
		System.out.println("。，。，");
		
		//遍历数组 双for循环 或双foreach循环
		System.out.println("双foreach循环输出");
		for(char a[]:gushi) {
			for(char b:a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		//填充和批量替换数组元素
		int[] tian=new int[5];
		//填充
		Arrays.fill(tian, 1);
		for(int tmp:tian) {
			System.out.println(tmp);
		}
		System.out.println();
		//批量替换tian索引1-3位置
		Arrays.fill(tian, 1, 3, 2);
		for(int tmp:tian) {
			System.out.println(tmp);
		}
		
		//电话号码替换※号
		System.out.println("电话号码替换※号");
		int phone[]= {1,3,4,3,2,6,8,8,4,5,2};
		Arrays.fill(phone, 3, 7, 0);
		for(int i=0;i<phone.length;i++) {
			if(phone[i]==0) {
				System.out.print("*");
			}else {
				System.out.print(phone[i]);
			}
		}
		
		//数组排序
		System.out.println("数组排序");
		int a[]=new int[]{4,6,1,9,8};
		//升序
		Arrays.sort(a);
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
		
		//复制数组,b改变数组，a也跟随改变(指向同一内存地址)
		//int b[]=a;
		int b[]=Arrays.copyOf(a, 6);
		b[0]=20;
		b[5]=21;
		System.out.println("\na数组");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
		System.out.println("\nb数组");
		for(int tmp:b) {
			System.out.print(tmp+" ");
		}
		
		//复制数组部分内容
		int c[]=Arrays.copyOfRange(b, 1, 4);
		System.out.println("\nc数组");
		for(int tmp:c) {
			System.out.print(tmp+" ");
		}
		
		//冒泡排序
		
	}

}
