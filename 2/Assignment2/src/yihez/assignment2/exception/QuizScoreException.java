package yihez.assignment2.exception;
/**
 * 
 * @author zhangyihe
 * @author_id yihez
 * if quiz score is out of 0-100, throw a warning.
 */
public class QuizScoreException extends Exception {

	/**
	 * add default serial version id
	 */
	private static final long serialVersionUID = 1L;
	public QuizScoreException(String msg){
		super(msg);
	}

}
