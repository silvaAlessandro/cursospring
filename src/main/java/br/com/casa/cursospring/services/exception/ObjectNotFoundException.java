package br.com.casa.cursospring.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1084893569915900702L;
	
	
	
	public ObjectNotFoundException(String msg)
	{
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause)
	{
		super(msg, cause);
	}
	

}