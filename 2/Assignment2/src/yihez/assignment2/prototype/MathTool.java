package yihez.assignment2.prototype;

import yihez.assignment2.model.Student;

/**
 * 
 * @author zhangyihe
 * @author_id yihez
 * 
 * MathTool is apply some math tools to help analyze score.
 *
 */
public abstract class MathTool {
	public abstract void findLow(Student [] a);
	public abstract void findHigh(Student [] a);
	public abstract void findAvg(Student [] a);

}
