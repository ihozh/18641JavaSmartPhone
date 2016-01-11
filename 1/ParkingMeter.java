/********************************************************
  > File Name:ParkingMeter.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan 10 11:56:32 2016
 *********************************************************/

public class ParkingMeter {
	//private long parkingMeter;
	private long startTime;
	private long parkingTime;
	private int purchaseTime;
	public ParkingMeter() {
		startTime = System.currentTimeMillis();
	}
	private void calParkingTime() {
		parkingTime = (System.currentTimeMillis()-startTime);
	}

	public int getParkingTime() {
		calParkingTime();
		return (int)parkingTime;
	}
	public void setPurchaseTime(int purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	public int getPurchaseTime() {
		return purchaseTime;
	}
}
