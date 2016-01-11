/********************************************************
  > File Name:ParkingTicket.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan 10 21:39:16 2016
 *********************************************************/

public class ParkingTicket {
	private ParkedCar parkedCar;
	//private PoliceOfficer policeOfficer;
	private String name;
	private String badgeNum;
	private int overTime;
	private int fine = 25;
	public ParkingTicket() {
		parkedCar = new ParkedCar();
	}
	public void addCarToTicket(ParkedCar parkedCar,String name,String badgeNum) {
		this.parkedCar = parkedCar;
		this.name = name;
		this.badgeNum = badgeNum;
	}
	public String reportMake() {
		return parkedCar.getMake();
	}
	public String reportModel() {
		return parkedCar.getModel();
	}
	public String reportColor() {
		return parkedCar.getColor();
	}
	public String reportLicenseNum() {
		return parkedCar.getLicenseNum();
	}
	public String reportName() {
		return name;
	}
	public String reportBadgeNum() {
		return badgeNum;
	}
	public int reportOverTime() {
		return parkedCar.getParkingTime()-parkedCar.getPurchaseTime();
	}
	public int calFine() {
		overTime = parkedCar.getParkingTime()-parkedCar.getPurchaseTime();
		if(overTime<=60) {
			return fine;
		} else {
			while(overTime>60){
				fine = fine+10;
				overTime = overTime-60;
			}
			return fine;
		}
	}
}
