package db;

public class ConectionException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}