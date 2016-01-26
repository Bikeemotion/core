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
package com.bikeemotion.common.utils;

public class Constants {

  //Error
  public static int ok = 0;
  public static int unknown = -1;

  //OSGi
  public static int serviceLookupMaxRetries = 3;
  public static int serviceLookupEachSecs = 15;
  public static String serviceLookupMaxRetriesHitMsg = "Max retries count hit and [%s] service was not resolved";
}
