/********************************************************
  > File Name:ParkedCar.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan 10 11:53:11 2016
 *********************************************************/

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String licenseNum;
	private int parkingTime;
	private ParkingMeter parkingMeter;
	public ParkedCar(){

	};
	public ParkedCar(String make,String model,String color,String licenseNum,int parkingTime) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNum = licenseNum;
		parkingMeter = new ParkingMeter();
		parkingMeter.setPurchaseTime(parkingTime);
	}
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public String getLicenseNum() {
		return this.licenseNum;
	}
	public int getParkingTime() {
		parkingTime = parkingMeter.getParkingTime();
		return this.parkingTime;
	}
	public int getPurchaseTime() {
		return parkingMeter.getPurchaseTime();
	}
}
