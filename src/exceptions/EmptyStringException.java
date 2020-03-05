package exceptions;

public class EmptyStringException extends Exception{

	public EmptyStringException(String msg) {
		super(msg);
		System.err.println(msg);
	}
	
}
