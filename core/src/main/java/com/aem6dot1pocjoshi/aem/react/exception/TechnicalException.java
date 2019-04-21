package com.aem6dot1pocjoshi.aem.react.exception;

public class TechnicalException extends RuntimeException {

	private static final long serialVersionUID = 3287666209672379245L;

	public TechnicalException (String msg, Throwable cause) {
		super(msg, cause);
	}

  public TechnicalException(String msg) {
    super(msg);
  }

}
