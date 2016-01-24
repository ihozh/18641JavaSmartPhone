package lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Util {
	public static Student [] readFile(String filename, Student [] stu) { //Reads the file and builds student array.
		//Open the file using FileReader Object.
		//In a loop read a line using readLine method.
		//Tokenize each line using StringTokenizer Object
		//Each token is converted from String to Integer using parseInt method
		//Value is then saved in the right property of Student Object.
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(filename));
			String line = "";
			try {
				int num = 0;    //number of student
				while ((line = bReader.readLine()) != null) {
					if(line.length() == 0) {  //read empty line
						continue;
					}
					if(line.matches("(.*)Stud(.*)")) {
						continue;
					}
					line = line.trim();
					StringTokenizer st = new StringTokenizer(line);
					int count = 0;   //data
					
					Student tmpStu = new Student();
					while (st.hasMoreTokens()) {
						String token = st.nextToken();
						if (count == 0) {
							tmpStu.setStudentID(Integer.valueOf(token));
							count++;
						} else {
							tmpStu.setScore(count, Integer.valueOf(token));
							count++;
						}
					}
					stu[num] = tmpStu;
					num++;
				}

			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return stu;
	}
	public static void printStudent(Student [] stu) {   //print student information
		String[] title = new String[]{"Stud","Qu1","Qu2","Qu3","Qu4","Qu5"};
		for (int i = 0;i<6;i++) {
			if (i == 0) {
				System.out.printf("%-15s",title[i]);
			} else {
				System.out.printf("%-6s",title[i]);
			}
		}
		System.out.println();
		for (int i = 0;i<stu.length;i++) {
			if (stu[i] == null) {
				continue;
			}
			for (int j = 0;j<6;j++) {
				if (j == 0) {
					System.out.printf("%-15s",stu[i].getStudentID());
				} else {
					System.out.printf("%-6s",stu[i].getScore(j));
				}
			}
			System.out.println();
			
		}
		System.out.println();
	}
	public static void writeStudent(PrintWriter out,Student [] stu) {   //print student information
		String[] title = new String[]{"Stud","Qu1","Qu2","Qu3","Qu4","Qu5"};
		for (int i = 0;i<6;i++) {
			if (i == 0) {
				out.printf("%-15s",title[i]);
			} else {
				out.printf("%-6s",title[i]);
			}
		}
		out.println();
		for (int i = 0;i<stu.length;i++) {
			if (stu[i] == null) {
				continue;
			}
			for (int j = 0;j<6;j++) {
				if (j == 0) {
					out.printf("%-15s",stu[i].getStudentID());
				} else {
					out.printf("%-6s",stu[i].getScore(j));
				}
			}
			out.println();
			
		}
		out.println();
	}
	
	//Putting it together in driver class:
	public static void main(String [] args) {
		Student lab2 [] = new Student[40]; //Populate the student array
		lab2 = Util.readFile("Student.txt", lab2);
		//System.out.println(lab2[20].getStudentID());
		Statistics statlab2 = new Statistics(lab2);
		printStudent(lab2);
		statlab2.print();
		try {
			PrintWriter pw;
			pw = new PrintWriter("output.txt","UTF-8");
			writeStudent(pw,lab2);

			statlab2.printStatistics(pw);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
