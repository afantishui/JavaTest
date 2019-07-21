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
		 *  百元买百鸡,公鸡一只五文，母鸡一只三文，小鸡三只一文
		 *一百文可各买几只公鸡、 母鸡 、几只小鸡
		 */
		int cock,hen,chick;
		for(cock=1;cock<=20;cock++) {
			for(hen=1;hen<=33;hen++) {
				for(chick=3;chick<=99;chick+=3) {
					if(cock*5+hen*3+chick/3==100) {
						if(cock+hen+chick==100) {
							System.out.println("公鸡有:"+cock+"只 母鸡有:"+hen+"只 小鸡有:"+chick);
						}
					}
				}
			}
		}

	}

}
