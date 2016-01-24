package yihez.assignment2;

import java.io.PrintWriter;

import yihez.assignment2.model.Statistics;
import yihez.assignment2.model.Student;
import yihez.assignment2.util.Util;

public class Driver {
	public static void main(String [] args) {
		Student lab1 [] = new Student[40]; //Populate the student array
		Student lab2 [] = new Student[40];
		Student lab3 [] = new Student[40];
		Student lab4 [] = new Student[40];
		Student lab5 [] = new Student[40];
		Student lab6 [] = new Student[40];
		Student lab7 [] = new Student[40];
		lab1 = Util.readFile("Student.txt", lab1);     //normal test
		Statistics statlab1 = new Statistics(lab1);
		Util.printStudent(lab1);
		statlab1.printInfo();


		/*lab3 = Util.readFile("Student41.txt", lab3);     //test StudentNumberException

		lab4 = Util.readFile("StudentMore40.txt", lab4);    //test StudentNumberException

		lab6 = Util.readFile("StudentWrongLine2.txt", lab6);    //test QuizNumberException

		lab7 = Util.readFile("StudentScoreWarning.txt", lab7);    //test QuizScoreException*/
		
		try {
			PrintWriter pw;
			pw = new PrintWriter("test_output.txt","UTF-8");
			Util.writeStudent(pw,lab1);

			statlab1.writeInfo(pw);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
