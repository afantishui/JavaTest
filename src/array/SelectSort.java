package array;

public class SelectSort {

	public static void main(String[] args) {
		// ѡ������
		int a[]= {64,1,82,33,8};
		for(int i=1;i<a.length;i++) {
			int index=0;
			for(int j=1;j<=a.length-i;j++) {
				if(a[index]<a[j]) {
					index=j;
				}
				int tmp=a[a.length-i];
				a[a.length-i]=a[index];
				a[index]=tmp;
			}
		}
		System.out.println("ѡ��������");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}

}
