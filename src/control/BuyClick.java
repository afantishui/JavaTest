/**
 * 
 */
package control;

/**
 * @author Administrator
 */
public class BuyClick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *  ��Ԫ��ټ�,����һֻ���ģ�ĸ��һֻ���ģ�С����ֻһ��
		 *һ���Ŀɸ���ֻ������ ĸ�� ����ֻС��
		 */
		int cock,hen,chick;
		for(cock=1;cock<=20;cock++) {
			for(hen=1;hen<=33;hen++) {
				for(chick=3;chick<=99;chick+=3) {
					if(cock*5+hen*3+chick/3==100) {
						if(cock+hen+chick==100) {
							System.out.println("������:"+cock+"ֻ ĸ����:"+hen+"ֻ С����:"+chick);
						}
					}
				}
			}
		}

	}

}
