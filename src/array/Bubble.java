package array;

public class Bubble {

	public Bubble() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// 冒泡算法
		int[] a={5,45,3,84,6,75,26,10};
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}	
			}
			
		}
		System.out.println("冒泡排序结果");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}

	}

}
