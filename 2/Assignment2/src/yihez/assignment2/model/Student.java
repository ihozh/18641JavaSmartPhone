package yihez.assignment2.model;

import java.io.PrintWriter;

import yihez.assignment2.prototype.People;
import yihez.assignment2.prototype.Printer;

public class Student extends People implements Printer {
	private int SID;
	private int scores[] = new int[5];
	public Student() {
	} 
	public void setStudentID(int SID) {
		this.SID = SID;
	}
	public void setScore(int quiz,int score) {
		this.scores[quiz-1] = score;
	}
	public int getStudentID() {
		return this.SID;
	}
	public int getScore(int quiz) {
		return this.scores[quiz-1];
	}
	public int[] getAllScore() {
		return this.scores;
	}
	public void printInfo() {
		for (int i = 0;i<6;i++) {
			if (i == 0) {
				System.out.printf("%-15s",SID);
			} else {
				System.out.printf("%-6s",scores[i-1]);
			}
		}
		System.out.println();	
	}
	public void writeInfo(PrintWriter out) {
		for (int i = 0;i<6;i++) {
			if (i == 0) {
				out.printf("%-15s",SID);
			} else {
				out.printf("%-6s",scores[i-1]);
			}
		}
		out.println();
	}

}
