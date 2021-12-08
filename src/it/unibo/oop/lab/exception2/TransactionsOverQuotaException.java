package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double maxTransaction;
	
	public TransactionsOverQuotaException(double maxTransaction) {
		this.maxTransaction = maxTransaction;
	}
	
	@Override
	public String getMessage() {
		return this.toString();
	}
	@Override
	public String toString() {
		return "You exceeded the maximum transaction amount of" + this.maxTransaction;
	}
	
	

}
