package exception;

//自定义异常
public class NoHumansException extends Exception{
	String message;
	public NoHumansException(String message) {
		super(message);
		this.message =message;
	}
	
}

