/********************************************************
  > File Name:CarTest.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Mon Jan 11 00:10:50 2016
 *********************************************************/

public class CarTest {
	public static void main(String[] args) {
		CarTest carTest = new CarTest();
		ParkedCar cara = new ParkedCar("A","b","r","001",5);
		//ParkedCar carb = new ParkedCar("B","b","b","002",8);
		PoliceOfficer wr = new PoliceOfficer("dick","001");
		for(int i=0;i<5000000;i++){

		}
		ParkingTicket ticketa = new ParkingTicket();
		if (wr.checkStatus(cara) != null) {
			ticketa = wr.checkStatus(cara);
		}
		for(int i=0;i<5000000;i++) {
			for(int j = 0;j<5000000;j++) {

			}
		}
		if (wr.checkStatus(cara) != null) {
			ticketa = wr.checkStatus(cara);
			carTest.reportTicket(ticketa);
		}
	}
	public void reportTicket(ParkingTicket ticket) {
		System.out.println(ticket.reportMake()+" "+ticket.reportModel()+" "+ticket.reportColor()+ticket.reportLicenseNum());
		System.out.println("Over time "+ticket.reportOverTime());
		System.out.println(ticket.reportName()+" "+ticket.reportBadgeNum());
	}
}
