/********************************************************
  > File Name:PoliceOfficer.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan 10 23:08:35 2016
 *********************************************************/

public class PoliceOfficer {
	private String name;
	private String badgeNum;
	private ParkingTicket parkingTicket;
	private boolean timeOut = false;
	public PoliceOfficer(String name,String badgeNum) {
		this.name = name;
		this.badgeNum = badgeNum;
		//parkingTicket = new ParkingTicket();
	}
	public ParkingTicket checkStatus(ParkedCar parkedCar) {
		if(parkedCar.getParkingTime()>parkedCar.getPurchaseTime()) {
			timeOut = true;
			parkingTicket = new ParkingTicket();
			parkingTicket.addCarToTicket(parkedCar);
			//System.out.println("Ticket out");
		} else {
			timeOut = false;
			//System.out.println("notOut");
			parkingTicket = null;
		}
		return parkingTicket;
	}
}
