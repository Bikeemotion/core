/**
 * Copyright (C) Bikeemotion
 * 2014
 *
 * The reproduction, transmission or use of this document or its contents is not
 * permitted without express written authorization. All rights, including rights
 * created by patent grant or registration of a utility model or design, are
 * reserved. Modifications made to this document are restricted to authorized
 * personnel only. Technical specifications and features are binding only when
 * specifically and expressly agreed upon in a written contract.
 */
package com.bikeemotion.common.exception;

public class BusinessException extends Exception {

  private ExceptionErrorCodes code = ExceptionErrorCodes.UNKNOWN;

  public BusinessException() {

  }

  public BusinessException(String message) {

    super(message);
  }

  public BusinessException(Throwable cause) {

    super(cause);
  }

  public BusinessException(ExceptionErrorCodes code) {

    super();
    this.code = code;
  }

  public BusinessException(ExceptionErrorCodes code, String message) {

    super(message);
    this.code = code;
  }

  public BusinessException(String message, Throwable cause) {

    super(message, cause);
  }

  public BusinessException(ExceptionErrorCodes code, String message, Throwable cause) {

    super(message, cause);
    this.code = code;
  }

  public int getCode() {

    return this.code == ExceptionErrorCodes.UNKNOWN ?
        BusinessException.getCode(this.getClass()):
        this.code.getValue();
  }

  public static int getCode(Class c) {

    int result = 0;
    for (int i = 0; i < c.getCanonicalName().getBytes().length; i++) {
      result += c.getCanonicalName().getBytes()[i];
    }
    return result;
  }
}
