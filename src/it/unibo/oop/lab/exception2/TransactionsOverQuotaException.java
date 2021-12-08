package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double maxTransactions;
	
	public TransactionsOverQuotaException(double maxTransaction) {
		this.maxTransactions = maxTransaction;
	}
	
	@Override
	public String getMessage() {
		return this.toString();
	}
	@Override
	public String toString() {
		return "You exceeded the maximum transactions amount of" + this.maxTransactions;
	}
	
	

}
