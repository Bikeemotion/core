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
package com.bikeemotion.common.cache;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Cacher {

  public static <T> CachedValue getCachedValue(
      final CachedValue currentValue,
      final Supplier<T> supplier) {

    return getCachedValue(currentValue, supplier, TimeUnit.SECONDS.toMillis(30));
  }

  public static <T> CachedValue getCachedValue(
      final CachedValue currentValue,
      final Supplier<T> supplier,
      long timeout) {

    CachedValue result;
    if (isFresh(currentValue, timeout)) {

      result = currentValue;
    } else {

      result = new CachedValue()
          .setValue(supplier.get())
          .setLastUpdatedAt(System.currentTimeMillis());
    }

    return result;
  }

  public static boolean isFresh(final CachedValue currentValue, long timeout) {

    return currentValue != null && currentValue.getLastUpdatedAt() + timeout > System.currentTimeMillis();
  }
}