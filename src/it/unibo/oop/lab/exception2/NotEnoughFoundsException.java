package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double balance; 
	private final double amount;
	
	public NotEnoughFoundsException(double balance, double amount) {
		this.balance = balance;
		this.amount = amount;
	}
	
	@Override
	public String getMessage() {
		return this.toString();
	}
	@Override
	public String toString() {
		return "You only have " + this.balance+ "$ of the " + this.amount 
				+ "you tried to withdraw";
	}
	
	
	
	

}
