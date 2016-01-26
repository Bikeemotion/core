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
 * Exception to be thrown when an argument doesn't satisfy a pre-defined length.
 */
public class ArgumentDoesntSatisfyMinSizeException extends
    InvalidArgumentException {

  private final int minSize;

  public ArgumentDoesntSatisfyMinSizeException(final String msg,
      final int minSize) {
    super(msg + " Min size:" + minSize);
    this.minSize = minSize;
  }

  /**
   * @return the minSize
   */
  public int getMinSize() {
    return minSize;
  }

}
