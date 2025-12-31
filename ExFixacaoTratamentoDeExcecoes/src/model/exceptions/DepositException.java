package model.exceptions;

public class DepositException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DepositException(String msg) {
		super(msg);
	}

}
