package array;

public class BubbleSort {

	public static void main(String[] args) {
		// Ã°ÅÝËã·¨
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
		System.out.println("Ã°ÅÝÅÅÐò½á¹û");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}

}
