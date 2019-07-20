package string;

import java.util.Date;

public final class StringTest {

	public StringTest() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String d=new String("我爱清汤小肥羊");
		String a="锄禾日当午";
		String b="小鸡炖蘑菇";
		String c="时间就是金钱，我的朋友";
		System.out.println(a+b);
		System.out.println(c+d);
		
		//字符数组实例化
		char[] charArray= {'t','i','m','e'};
		String f=new String(charArray);
		System.out.println("字符数组序列化"+f);
		
		char[] charArray1= {'时','间','就','是','金','钱'};
		//字符串数组实例化，字节数组，起始位置，获取个数
		String e=new String(charArray1,3,3);
		System.out.println("字符串数组实例化"+e);
		
		//字节数组实例化
		byte[] byteArray= {-60,-6,-70,-61};
		String g=new String(byteArray);
		System.out.println("字节数据组"+g);
		
		//字符串拼接
		String a1="123bABCabcb"+"456";
		String a2="123bABCabcb";
		a2+="456";
		System.out.println("字符串拼接方法一"+a1);
		System.out.println("字符串拼接方法二"+a2);
		
		//获取字符串长度,length长度返回包括空格
		int size=a1.length();
		System.out.println("a1长度是"+size);
		
		//字符串查找
		//判断子字符串是否存在 str.indexOf("")
		if(a1.indexOf("1")>-1) {
			System.out.println("a1存在数字1");
		};
		
		//获取指定的字符串 charAt(index) 索引位置
		char ch=a1.charAt(3);
		System.out.println("索引a1第3个索引位字母"+ch);
		
		//获取第一次出现索引 indexOf(str1)
		int index=a1.indexOf("b");
		System.out.println("a1字符串b第一次出现的位置"+index);
		//获取第一次出现索引 indexOf(str1,index) 从第几位开始查找
		int index1=a1.indexOf("b",4);
		System.out.println("a1字符串从索引4开始b第一次出现的位置"+index1);
		
		//获取最后一次出现索引lastindexOf(str1)
		int lastindex=a1.lastIndexOf("b");
		System.out.println("a1字符串b最后一次出现的位置"+lastindex);
		//获取最后一次出现索引lastindexOf(str1, index) 从第几位开始查找
		int lastindex1=a1.lastIndexOf('b', 9);
		System.out.println("a1字符串从索引9开始b最后一次出现的位置"+lastindex1);
		
		//截取字符串 subtring(begin)
		String id=a1.substring(5);
		System.out.println("a1从第5位开始截取内容"+id);
		//截取指定位置内容
		String id1=a1.substring(5, 8);
		System.out.println("a1从截取5-8的内容"+id1);
		
		//去除首尾空格 
		String str="   a bc   ";
		System.out.println("["+str+"]");
		String str1=str.trim();
		System.out.println("str使用trim去除空格后"+"["+str1+"]");
		
		//替换字符串所有空格
		String str2=str.replaceAll("\\s", "");
		System.out.println("["+str2+"]");
		
		//字符串替换
		/*replace() 旧字符序列替换新字符序列
		*replaceAll() 将旧字符序列或正则表达式内容，替换成新字符串
		*replaceFirst() 替换一次
		*/
		//将旧字符串替换成新的字符串
		String mantou="馒头一文一个";
		String newmantou=mantou.replace("一", "壹");
		System.out.println("mantou替换后内容:"+newmantou);
		
		//判断字符串后缀
		String file="HelloWorld.java";
		boolean bool1=file.endsWith(".java");
		boolean bool2=file.endsWith(".class");
		System.out.println("检查file是否.java结尾："+bool1);
		System.out.println("检查file是否.class结尾："+bool2);
		
		//判断文件开头
		boolean bool3=file.startsWith("Hello");
		System.out.println("检查file是否Hello开头："+bool3);
		
		//判断字符串是否相等
		String file2=new String("HelloWorld.java");
		String file3="HELLOWORLD.JAVA";
		System.out.println("file与file2是否相等:"+file.equals(file2));
		//==比较的是内存地址
		System.out.println("file与file2是否相等:"+(file==file2));
		//忽略大小写进行比较
		System.out.println("忽略大小写进行比较file2与file3："+(file2.equalsIgnoreCase(file3)));
		
		//字符串转换大小写
		//file="HelloWorld.java";String file3="HELLOWORLD.JAVA";
		System.out.println("把file转换成大写 "+file.toUpperCase());
		System.out.println("把file3转换成小写 "+file3.toLowerCase());
		
		//字符串分割
		String fenArray= "a,b,c,d,e,f";
		String[] fen=fenArray.split(",");
		//限制分割次数
		String[] fen1=fenArray.split(",", 2);
		for(String tmp:fen) {
			System.out.println("把fenArray用,进行分割 "+tmp);
		}
		System.out.println();
		for(String tmp:fen1) {
			System.out.println("把fenArray用,进行分割 "+tmp);
		}
		
		//字符串格式化
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
		System.out.println("现在是"+year+"年"+month+day+"日"+hour+"时"+minute+"分"+second+"秒");
	}

}
