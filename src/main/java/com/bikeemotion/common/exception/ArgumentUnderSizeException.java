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

public class ArgumentUnderSizeException extends InvalidArgumentException {

  // members
  private int minSize;

  // public API
  public ArgumentUnderSizeException(String message, int minSize) {
    super(getMessage(message, minSize));
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, Throwable cause) {
    super(getMessage(message, minSize), cause);
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, ExceptionErrorCodes code) {
    super(getMessage(message, minSize), code);
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, ExceptionMeta meta) {
    super(getMessage(message, minSize), meta);
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(getMessage(message, minSize), code, meta);
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, Throwable cause, ExceptionErrorCodes code) {
    super(getMessage(message, minSize), cause, code);
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, Throwable cause, ExceptionMeta meta) {
    super(getMessage(message, minSize), cause, meta);
    this.minSize = minSize;
  }

  public ArgumentUnderSizeException(String message, int minSize, Throwable cause, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(getMessage(message, minSize), cause, code, meta);
    this.minSize = minSize;
  }

  // internal API
  private static String getMessage(String message, int minSize) {
    return message.concat(" Min size:").concat(String.valueOf(minSize));
  }

  // getters & setters
  public int getMinSize() {
    return minSize;
  }
}
