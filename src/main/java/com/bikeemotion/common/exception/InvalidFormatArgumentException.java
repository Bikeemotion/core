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

public class InvalidFormatArgumentException extends BusinessException {

  // members
  private final String validFormat;

  // public API
  public InvalidFormatArgumentException(String message, String validFormat) {
    super(getMessage(message, validFormat));
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, Throwable cause) {
    super(getMessage(message, validFormat), cause);
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, ExceptionErrorCodes code) {
    super(getMessage(message, validFormat), code);
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, ExceptionMeta meta) {
    super(getMessage(message, validFormat), meta);
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(getMessage(message, validFormat), code, meta);
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, Throwable cause, ExceptionErrorCodes code) {
    super(getMessage(message, validFormat), cause, code);
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, Throwable cause, ExceptionMeta meta) {
    super(getMessage(message, validFormat), cause, meta);
    this.validFormat = validFormat;
  }

  public InvalidFormatArgumentException(String message, String validFormat, Throwable cause, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(getMessage(message, validFormat), cause, code, meta);
    this.validFormat = validFormat;
  }

  // internal API
  private static String getMessage(String message, String format) {

    return message.concat(" Valid format:").concat(format);
  }

  // getters & setters
  public String getValidFormat() {
    return validFormat;
  }
}
