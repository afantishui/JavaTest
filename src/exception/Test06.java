package exception;

public class Test06 {

	public static void main(String[] args) {
		String playerType = "monkey";
		try {
			if(!playerType.equals("human")) {
				//抛出自定义异常
				throw new NoHumansException("有非人类选手："+playerType);
			}
			System.out.println("开始比赛");
		} catch (NoHumansException e) {
			e.printStackTrace();
		}
	}

}
