package yihez.assignment2.exception;

/**
 * 
 * @author zhangyihe
 * @author_id yihez
 * if quiz number is not five, throw this exception
 */
public class QuizNumberException extends Exception {

	/**
	 * add default serial version id
	 */
	private static final long serialVersionUID = 1L;
	
	public QuizNumberException(String msg){
		super(msg);
	}

	

}
