package string;

import java.util.Date;

public final class StringTest {

	public StringTest() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String d=new String("�Ұ�����С����");
		String a="�����յ���";
		String b="С����Ģ��";
		String c="ʱ����ǽ�Ǯ���ҵ�����";
		System.out.println(a+b);
		System.out.println(c+d);
		
		//�ַ�����ʵ����
		char[] charArray= {'t','i','m','e'};
		String f=new String(charArray);
		System.out.println("�ַ��������л�"+f);
		
		char[] charArray1= {'ʱ','��','��','��','��','Ǯ'};
		//�ַ�������ʵ�������ֽ����飬��ʼλ�ã���ȡ����
		String e=new String(charArray1,3,3);
		System.out.println("�ַ�������ʵ����"+e);
		
		//�ֽ�����ʵ����
		byte[] byteArray= {-60,-6,-70,-61};
		String g=new String(byteArray);
		System.out.println("�ֽ�������"+g);
		
		//�ַ���ƴ��
		String a1="123bABCabcb"+"456";
		String a2="123bABCabcb";
		a2+="456";
		System.out.println("�ַ���ƴ�ӷ���һ"+a1);
		System.out.println("�ַ���ƴ�ӷ�����"+a2);
		
		//��ȡ�ַ�������,length���ȷ��ذ����ո�
		int size=a1.length();
		System.out.println("a1������"+size);
		
		//�ַ�������
		//�ж����ַ����Ƿ���� str.indexOf("")
		if(a1.indexOf("1")>-1) {
			System.out.println("a1��������1");
		};
		
		//��ȡָ�����ַ��� charAt(index) ����λ��
		char ch=a1.charAt(3);
		System.out.println("����a1��3������λ��ĸ"+ch);
		
		//��ȡ��һ�γ������� indexOf(str1)
		int index=a1.indexOf("b");
		System.out.println("a1�ַ���b��һ�γ��ֵ�λ��"+index);
		//��ȡ��һ�γ������� indexOf(str1,index) �ӵڼ�λ��ʼ����
		int index1=a1.indexOf("b",4);
		System.out.println("a1�ַ���������4��ʼb��һ�γ��ֵ�λ��"+index1);
		
		//��ȡ���һ�γ�������lastindexOf(str1)
		int lastindex=a1.lastIndexOf("b");
		System.out.println("a1�ַ���b���һ�γ��ֵ�λ��"+lastindex);
		//��ȡ���һ�γ�������lastindexOf(str1, index) �ӵڼ�λ��ʼ����
		int lastindex1=a1.lastIndexOf('b', 9);
		System.out.println("a1�ַ���������9��ʼb���һ�γ��ֵ�λ��"+lastindex1);
		
		//��ȡ�ַ��� subtring(begin)
		String id=a1.substring(5);
		System.out.println("a1�ӵ�5λ��ʼ��ȡ����"+id);
		//��ȡָ��λ������
		String id1=a1.substring(5, 8);
		System.out.println("a1�ӽ�ȡ5-8������"+id1);
		
		//ȥ����β�ո� 
		String str="   a bc   ";
		System.out.println("["+str+"]");
		String str1=str.trim();
		System.out.println("strʹ��trimȥ���ո��"+"["+str1+"]");
		
		//�滻�ַ������пո�
		String str2=str.replaceAll("\\s", "");
		System.out.println("["+str2+"]");
		
		//�ַ����滻
		/*replace() ���ַ������滻���ַ�����
		*replaceAll() �����ַ����л�������ʽ���ݣ��滻�����ַ���
		*replaceFirst() �滻һ��
		*/
		//�����ַ����滻���µ��ַ���
		String mantou="��ͷһ��һ��";
		String newmantou=mantou.replace("һ", "Ҽ");
		System.out.println("mantou�滻������:"+newmantou);
		
		//�ж��ַ�����׺
		String file="HelloWorld.java";
		boolean bool1=file.endsWith(".java");
		boolean bool2=file.endsWith(".class");
		System.out.println("���file�Ƿ�.java��β��"+bool1);
		System.out.println("���file�Ƿ�.class��β��"+bool2);
		
		//�ж��ļ���ͷ
		boolean bool3=file.startsWith("Hello");
		System.out.println("���file�Ƿ�Hello��ͷ��"+bool3);
		
		//�ж��ַ����Ƿ����
		String file2=new String("HelloWorld.java");
		String file3="HELLOWORLD.JAVA";
		System.out.println("file��file2�Ƿ����:"+file.equals(file2));
		//==�Ƚϵ����ڴ��ַ
		System.out.println("file��file2�Ƿ����:"+(file==file2));
		//���Դ�Сд���бȽ�
		System.out.println("���Դ�Сд���бȽ�file2��file3��"+(file2.equalsIgnoreCase(file3)));
		
		//�ַ���ת����Сд
		//file="HelloWorld.java";String file3="HELLOWORLD.JAVA";
		System.out.println("��fileת���ɴ�д "+file.toUpperCase());
		System.out.println("��file3ת����Сд "+file3.toLowerCase());
		
		//�ַ����ָ�
		String fenArray= "a,b,c,d,e,f";
		String[] fen=fenArray.split(",");
		//���Ʒָ����
		String[] fen1=fenArray.split(",", 2);
		for(String tmp:fen) {
			System.out.println("��fenArray��,���зָ� "+tmp);
		}
		System.out.println();
		for(String tmp:fen1) {
			System.out.println("��fenArray��,���зָ� "+tmp);
		}
		
		//�ַ�����ʽ��
		Date date = new Date();
		String str3=String.format("%tF", date);
		String year=String.format("%tY", date);
		String month=String.format("%tB", date);
		String day=String.format("%td", date);
		String hour=String.format("%tH", date);
		String minute=String.format("%tM", date);
		String second=String.format("%tS", date);
		System.out.println(date);
		System.out.println(str3);
		System.out.println("������"+year+"��"+month+day+"��"+hour+"ʱ"+minute+"��"+second+"��");
	}

}
