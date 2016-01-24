package yihez.assignment2.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import yihez.assignment2.exception.QuizNumberException;
import yihez.assignment2.exception.QuizScoreException;
import yihez.assignment2.exception.StudentNumberException;
import yihez.assignment2.model.Student;

/**
 * 
 * @author zhangyihe
 * @author_id yihez
 * 
 * Utility class function: read files
 *
 */

public class Util {
	private static final int MAX_STUDENT = 40;
	
	public static Student [] readFile(String filename, Student [] stu) { //Reads the file and builds student array.
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(filename));
			String line = "";
			try {
				int num = 0;    //number of student
				while ((line = bReader.readLine()) != null) {
					if(line.length() == 0) {  //read empty line
						continue;
					}
					if (num < MAX_STUDENT) {
						if(line.matches("(.*)Stud(.*)")) {   //skip first line
							continue;
						}
						line = line.trim();
						StringTokenizer st = new StringTokenizer(line);
						int count = 0;   //data
					
						Student tmpStu = new Student();
						try {
							while (st.hasMoreTokens()) {
								String token = st.nextToken();
								if (count == 0) {
									tmpStu.setStudentID(Integer.parseInt(token));
									count++;
								} else {
									if (Integer.parseInt(token)>100 || Integer.parseInt(token)<0) {
										throw new QuizScoreException("wrong score of student:"+tmpStu.getStudentID());
									}
									tmpStu.setScore(count, Integer.parseInt(token));
									count++;
								}
							}
							if (count != 6) {
								int pos = num+1;
								throw new QuizNumberException("quiz number is wrong at "+pos+"'s line");
							}
						} catch (QuizNumberException e) {
							e.printStackTrace();
						}
						stu[num] = tmpStu;
						num++;
					} else {
						if (line != null) {
							throw new StudentNumberException("Too many students");
						}
					}
				}

			} catch(IOException e) {
				e.printStackTrace();
			} catch (StudentNumberException e) {
				e.printStackTrace();
			} catch (QuizScoreException e) {
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
			stu[i].printInfo();			
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
			stu[i].writeInfo(out);			
		}
		out.println();
	}

}
