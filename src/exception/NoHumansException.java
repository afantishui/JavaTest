package exception;

//�Զ����쳣
public class NoHumansException extends Exception{
	String message;
	public NoHumansException(String message) {
		super(message);
		this.message =message;
	}
	
}

