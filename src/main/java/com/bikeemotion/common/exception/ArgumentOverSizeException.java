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

public class ArgumentOverSizeException extends InvalidArgumentException {

  // members
  private int maxSize;

  // public API
  public ArgumentOverSizeException(String message, int maxSize) {
    super(getMessage(message, maxSize));
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, Throwable cause) {
    super(getMessage(message, maxSize), cause);
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, ExceptionErrorCodes code) {
    super(getMessage(message, maxSize), code);
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, ExceptionMeta meta) {
    super(getMessage(message, maxSize), meta);
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(getMessage(message, maxSize), code, meta);
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, Throwable cause, ExceptionErrorCodes code) {
    super(getMessage(message, maxSize), cause, code);
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, Throwable cause, ExceptionMeta meta) {
    super(getMessage(message, maxSize), cause, meta);
    this.maxSize = maxSize;
  }

  public ArgumentOverSizeException(String message, int maxSize, Throwable cause, ExceptionErrorCodes code,
      ExceptionMeta meta) {
    super(getMessage(message, maxSize), cause, code, meta);
    this.maxSize = maxSize;
  }

  // internal API
  private static String getMessage(String message, int maxSize) {
    return message.concat(" Max size:").concat(String.valueOf(maxSize));
  }

  // getters & setters
  public int getMaxSize() {
    return maxSize;
  }
}
