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

import java.util.HashMap;
import java.util.Map;

public enum ExceptionErrorCodes {

  UNKNOWN(-1),

  CYCLE_OUT_OF_SERVICE(1001),
  CYCLE_IN_TRANSIT(1002),
  CYCLE_STOLEN(1003),
  CYCLE_MAINTENANCE(1004),
  CYCLE_IN_USE(1005),
  CYCLE_IN_INTERMEDIATE_STOP(1006),

  CYCLE_NOT_LIVE(1101),

  USER_NOT_ACTIVE(2001),
  USER_CAN_NOT_TAKE_MORE_CYCLE(2002),
  USER_HAS_TO_WAIT_BEFORE_UNLOCK(2003),
  USER_MEMBERSHIP_NOT_ACTIVE(2004),
  USER_MEMBERSHIP_EXPIRED(2005),

  CARD_NOT_ACTIVE(3001),
  CARD_EXPIRED(3002),
  CARD_NOT_FOUND(3003),

  STATION_CLOSED(4001),

  SYSTEM_CLOSED(5001),

  ROUTE_ALREADY_LOCKED(6001);

  // members
  private int value;
  private static final Map<Integer, ExceptionErrorCodes> lookup;

  // initializer
  static {

    lookup = new HashMap<>();

    for (ExceptionErrorCodes attr : ExceptionErrorCodes.values()) {
      lookup.put(attr.getValue(), attr);
    }
  }

  // API
  ExceptionErrorCodes(int value) {

    this.value = value;
  }

  public int getValue() {

    return this.value;
  }

  public static ExceptionErrorCodes get(int code) {

    return lookup.get(code);
  }
}
