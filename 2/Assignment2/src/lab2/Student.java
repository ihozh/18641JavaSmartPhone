package lab2;

public class Student {
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
	//write public get and set methods for
	//SID and scores
	//add methods to print values of instance variables.

}
