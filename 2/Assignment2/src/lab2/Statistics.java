package lab2;

import java.io.PrintWriter;

public class Statistics {
	private int [] lowscores = new int [5]; 
	private int [] highscores = new int [5]; 
	private float [] avgscores = new float [5]; 
	public Statistics(Student[] a) {
		findlow(a);
		findhigh(a);
		findavg(a);
	}
	
	private void findlow(Student [] a){
		/*This method will find the lowest score and store it in
		an array names lowscores.*/
		for (int qz = 1; qz < 6; qz++) {
			int lowerst = a[0].getScore(qz);
			for (int i = 1; i<a.length;i++) {
				if(a[i] == null) {
					continue;
				}
				if(a[i].getScore(qz)<lowerst) {
					lowerst = a[i].getScore(qz);
				}
			}
			lowscores[qz-1] = lowerst;
		}
		
	}
	
	private void findhigh(Student [] a){
		/* This method will find the highest score and store it in
		an array names highscores. */
		for (int qz = 1; qz < 6; qz++) {
			int higherst = a[0].getScore(qz);
			for (int i = 1; i<a.length;i++) {
				if(a[i] == null) {
					continue;
				}
				if(a[i].getScore(qz)>higherst) {
					higherst = a[i].getScore(qz);
				}
			}
			highscores[qz-1] = higherst;
		}		
	}
	
	private void findavg(Student [] a){
			/* This method will find avg score for each quiz and 
			 * store it in an array names avgscores. */
		for (int qz = 1; qz < 6; qz++) {
			float sum = 0;
			int count = 0;
			for (int i = 0; i<a.length;i++) {
				if(a[i] == null) {
					continue;
				}
				count++;
				sum = sum + a[i].getScore(qz);
			}
			avgscores[qz-1] = (float)sum/count;
		}
		
	}
	public void print(){
		String[] title = new String[]{"High Score","Low Score","Average"};
		for (int i = 0;i<3;i++) {
			System.out.printf("%-15s",title[i]);
			if (i == 0) {
				for (int j = 0;j<5;j++) {
					System.out.printf("%-6d",lowscores[j]);
				}
				System.out.println();
			} else if (i == 1) {
				for (int j = 0;j<5;j++) {
					System.out.printf("%-6d",highscores[j]);
				}
				System.out.println();	
			} else {
				for (int j = 0;j<5;j++) {
					System.out.printf("%-6.1f",avgscores[j]);
				}
				System.out.println();
			}
		}
	}
	public void printStatistics(PrintWriter out){
		String[] title = new String[]{"High Score","Low Score","Average"};
		for (int i = 0;i<3;i++) {
			out.printf("%-15s",title[i]);
			if (i == 0) {
				for (int j = 0;j<5;j++) {
					out.printf("%-6d",lowscores[j]);
				}
				out.println();
			} else if (i == 1) {
				for (int j = 0;j<5;j++) {
					out.printf("%-6d",highscores[j]);
				}
				out.println();	
			} else {
				for (int j = 0;j<5;j++) {
					out.printf("%-6.1f",avgscores[j]);
				}
				out.println();
			}
		}
	}
	

}
