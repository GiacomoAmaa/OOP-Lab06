package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int usrID;
	
	public WrongAccountHolderException(int usrID){
		this.usrID = usrID;
	}

	@Override
	public String getMessage() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "Wrong user id, your id is " + this.usrID;
	}
	
	

}
