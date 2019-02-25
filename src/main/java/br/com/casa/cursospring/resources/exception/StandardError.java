package br.com.casa.cursospring.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8530262870080112823L;
	private Integer error;
	private String status;
	private Long timeStamp;

	public StandardError(Integer error, String status, Long timeStamp) {
		super();
		this.error = error;
		this.status = status;
		this.timeStamp = timeStamp;
	}

	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
