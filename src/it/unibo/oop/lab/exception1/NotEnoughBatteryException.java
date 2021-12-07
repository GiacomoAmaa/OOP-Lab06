package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8854849858804077721L;
	private final int x;
    private final int y;
	private final double batteryLevel ; 
	
	public NotEnoughBatteryException (double batteryLevel,final int initX, final int initY) {
		this.x = initX;
		this.y = initY;
		this.batteryLevel = batteryLevel;
	}

	@Override
	public String getMessage() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "Can not move to pos(" + this.x + ", "
	             + this.y + "), battery at" + batteryLevel;
		
	}
	


}
