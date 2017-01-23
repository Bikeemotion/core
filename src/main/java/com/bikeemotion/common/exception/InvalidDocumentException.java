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

public class InvalidDocumentException extends BusinessException {

  public InvalidDocumentException() {}

  public InvalidDocumentException(String message) {
    super(message);
  }

  public InvalidDocumentException(Throwable cause) {
    super(cause);
  }

  public InvalidDocumentException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidDocumentException(String message, ExceptionErrorCodes code) {
    super(message, code);
  }

  public InvalidDocumentException(String message, ExceptionMeta meta) {
    super(message, meta);
  }

  public InvalidDocumentException(String message, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(message, code, meta);
  }

  public InvalidDocumentException(String message, Throwable cause, ExceptionErrorCodes code) {
    super(message, cause, code);
  }

  public InvalidDocumentException(String message, Throwable cause, ExceptionMeta meta) {
    super(message, cause, meta);
  }

  public InvalidDocumentException(String message, Throwable cause, ExceptionErrorCodes code, ExceptionMeta meta) {
    super(message, cause, code, meta);
  }
}
