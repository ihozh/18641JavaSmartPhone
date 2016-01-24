# Assignment2  Object relationship And File IO

## Platform
Operating System: OS X Yosemite 10.11.2
Eclipse Version: Java EE IDE Mars Release(4.5.1)
Java Version: JavaSE-1.8

##File Description

Eclipse Project
	bin
	src
Class Diagram
	class_diagram.jpg
Test Output
	output.txt    //command line print output
	test_output.txt   //write file output
Test Files
	Student.txt: the test data given by the assignment
	Student40.txt: this file has 40 students
	Student41.txt: this file has 41 students
	StudentMore40.txt; this file has students much more than 40
	StudentWrongLine1.txt: there are 6 quiz records for student 2134
	StudentWrongLine2.txt: there are only 4 quiz records for student 3124
	StudentScoreWarning.txt:  some quiz scores are more than 100 or less than 0
Readme
	
## Code design
I follow the instruction given by the assignment.
there are five packages in this project:
1. (package)yihez.assignment2: main method class.
2. (package)yihez.assignment2.exception: classes for custom exception, I consider 3 different exceptions.
3. (package)yihez.assignment2.model: classes for Student and Statistics, they both implement the interface Printer and inherit abstract class People or MathTool.
4. (package)yihez.assignment2.prototype: abstract class and interface, including People MathTool and Printer.
5. (package)yihez.assignment2.util: util function apply functions for reading data and printing data.

## instruction
1. three exception:
	QuizScoreException: if the quiz score out of 0-100, throw this exception
	QuizNumberException: if quiz number less or more than 5 times, throw this exception
	StudentNumberException: if Student number more than 40, throw this exception
2. for prototype
	People.java is an abstract class. new class related to people inherit this class.
	MathTool.java is an abstract class. new class related to math statics inherit this class. This class apply three functions findlow/findhigh/findavg.
	Printer.java is an print interface. This function apply two function printInfo and writeInfo.

3. Util.java apply three functions:
	readFile, printStudent, writeStudent
4.'Student' class inherits the abstract 'People' class and implements the interface defined in 'Printer'.
'Statistics' class inherits the abstract ‘MathTool’ class and implements the interface defined in 'Printer'.
5. I designed 7 different test cases to trigger the exception.
	Student.txt: the test data given by the assignment
	Student40.txt/Student41.txt/StudentMore40.txt: test StudentNumberException.
	StudentWrongLine1.txt/StudentWrongLine2.txt: test QuizNumberException.
	StudentScoreWarning.txt: test QuizScoreException.