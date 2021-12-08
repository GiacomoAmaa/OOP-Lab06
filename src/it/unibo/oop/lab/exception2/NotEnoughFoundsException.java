package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double amount;
	
	public NotEnoughFoundsException(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String getMessage() {
		return this.toString();
	}
	@Override
	public String toString() {
		return "You don't have " + this.amount + "$" ;
	}
	
	
	
	

}
