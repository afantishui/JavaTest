package array;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// �����������ַ���
		int a1[]= {4,5,6};
		a1[2]=10;
		System.out.println(a1[2]);
		int a2[]=new int[200];
		System.out.println("a2����ĳ���"+a2.length);
		
		//ѭ����������ÿ�����ж�����
		int day[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<day.length;i++) {
			System.out.println((i+1)+"����"+day[i]+"��");
		}
		//�����
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
		
		//��λ����
		System.out.println("------------��ά����------------");
		//��ά����3�ֶ��巽��
		int tdarr[][]=new int[3][4];
		int tdarr1[][]= {{1,2},{3,4}};
		int tdarr2[][]=new int[][] {{10,20},{33,12}};
		//��ֵ��ʽ
		tdarr[0]=new int[] {1,2,3,4};
		tdarr[1][0]=20;
		tdarr[1][1]=23;
		tdarr[1][2]=25;
		tdarr[1][3]=27;
		
		//��ӡ��ʫ���� ����
		char gushi[][]=new char[4][];
		gushi[0]=new char[] {'��','��','��','��','��'};
		gushi[1]=new char[] {'��','��','��','��','��'};
		gushi[2]=new char[] {'ҹ','��','��','��','��'};
		gushi[3]=new char[] {'��','��','֪','��','��'};
		
		System.out.println("--------���--------");
		for(int i=0;i<gushi.length;i++) {
			for(int j=0;j<gushi[i].length;j++) {
				System.out.print(gushi[i][j]);
			}
			if(i%2==0) {
				System.out.println(",");
			}else {
				System.out.println("��");
			}
		}
		System.out.println("--------����--------");
		for(int j=0;j<gushi[0].length;j++) {
			for(int i=3;i>=0;i--) {
				System.out.print(gushi[i][j]);
			}
			System.out.println();
		}
		System.out.println("��������");
		
		//�������� ˫forѭ�� ��˫foreachѭ��
		System.out.println("˫foreachѭ�����");
		for(char a[]:gushi) {
			for(char b:a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		//���������滻����Ԫ��
		int[] tian=new int[5];
		//���
		Arrays.fill(tian, 1);
		for(int tmp:tian) {
			System.out.println(tmp);
		}
		System.out.println();
		//�����滻tian����1-3λ��
		Arrays.fill(tian, 1, 3, 2);
		for(int tmp:tian) {
			System.out.println(tmp);
		}
		
		//�绰�����滻����
		System.out.println("�绰�����滻����");
		int phone[]= {1,3,4,3,2,6,8,8,4,5,2};
		Arrays.fill(phone, 3, 7, 0);
		for(int i=0;i<phone.length;i++) {
			if(phone[i]==0) {
				System.out.print("*");
			}else {
				System.out.print(phone[i]);
			}
		}
		
		//��������
		System.out.println("��������");
		int a[]=new int[]{4,6,1,9,8};
		//����
		Arrays.sort(a);
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
		
		//��������,b�ı����飬aҲ����ı�(ָ��ͬһ�ڴ��ַ)
		//int b[]=a;
		int b[]=Arrays.copyOf(a, 6);
		b[0]=20;
		b[5]=21;
		System.out.println("\na����");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
		System.out.println("\nb����");
		for(int tmp:b) {
			System.out.print(tmp+" ");
		}
		
		//�������鲿������
		int c[]=Arrays.copyOfRange(b, 1, 4);
		System.out.println("\nc����");
		for(int tmp:c) {
			System.out.print(tmp+" ");
		}
		
		//ð������
		
	}

}
