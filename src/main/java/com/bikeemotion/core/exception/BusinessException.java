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
package com.bikeemotion.core.exception;

public class BusinessException extends Exception {

  // members
  private ErrorCodes code = null;
  private ExceptionMeta meta;

  // public API
  public BusinessException() {

  }

  public BusinessException(String message) {

    super(message);
  }

  public BusinessException(Throwable cause) {

    super(cause);
  }

  public BusinessException(String message, Throwable cause) {

    super(message, cause);
  }

  public BusinessException(String message, ErrorCodes code) {

    this(message);
    this.code = code;
  }

  public BusinessException(String message, ExceptionMeta meta) {

    super(message);
    this.meta = meta;
  }

  public BusinessException(String message, ErrorCodes code, ExceptionMeta meta) {

    this(message);
    this.code = code;
    this.meta = meta;
  }

  public BusinessException(String message, Throwable cause, ErrorCodes code) {

    this(message, cause);
    this.code = code;
  }

  public BusinessException(String message, Throwable cause, ExceptionMeta meta) {

    this(message, cause);
    this.meta = meta;
  }

  public BusinessException(String message, Throwable cause, ErrorCodes code, ExceptionMeta meta) {

    this(message, cause, code);
    this.meta = meta;
  }

  // internal API
  public static int getCode(final Class clazz) {

    int result = 0;
    for (int i = 0; i < clazz.getCanonicalName().getBytes().length; i++) {
      result += clazz.getCanonicalName().getBytes()[i];
    }
    return result;
  }

  // getters & setters
  public int getCode() {

    return code == null
        ? getCode(getClass())
        : code.getValue();
  }

  public BusinessException setCode(ErrorCodes code) {
    this.code = code;
    return this;
  }

  public ExceptionMeta getMeta() {

    return meta;
  }

  public <T extends BusinessException> T setMeta(ExceptionMeta meta) {

    this.meta = meta;
    return (T) this;
  }

}
