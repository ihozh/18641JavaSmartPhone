package yihez.assignment2.exception;

/**
 * 
 * @author zhangyihe
 * @author_id yihez
 * 
 * if the student number is more than 40, throw this exception
 *
 */
public class StudentNumberException extends Exception {

	/**
	 * add default serial version id
	 */
	private static final long serialVersionUID = 1L;

	public StudentNumberException(String msg){
		super(msg);
	}
	


	

}
