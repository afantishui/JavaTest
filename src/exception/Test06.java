package exception;

public class Test06 {

	public static void main(String[] args) {
		String playerType = "monkey";
		try {
			if(!playerType.equals("human")) {
				//�׳��Զ����쳣
				throw new NoHumansException("�з�����ѡ�֣�"+playerType);
			}
			System.out.println("��ʼ����");
		} catch (NoHumansException e) {
			e.printStackTrace();
		}
	}

}
