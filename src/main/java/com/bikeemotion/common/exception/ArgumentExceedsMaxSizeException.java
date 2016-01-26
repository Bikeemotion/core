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

/**
 * Exception to be thrown when an argument exceeds a pre-defined length.
 */
public class ArgumentExceedsMaxSizeException extends InvalidArgumentException {

  private final int maxSize;

  public ArgumentExceedsMaxSizeException(final String msg, final int maxSize) {
    super(msg + " Max size:" + maxSize);
    this.maxSize = maxSize;
  }

  /**
   * @return the maxSize
   */
  public int getMaxSize() {
    return maxSize;
  }

}
