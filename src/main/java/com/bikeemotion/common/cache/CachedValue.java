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

import java.io.Serializable;

public class CachedValue<T> implements Serializable {

  // members
  private T value;
  private long lastUpdatedAt;

  // public API
  public CachedValue() {

  }

  // getters & setters
  public T getValue() {

    return value;
  }

  public CachedValue setValue(T value) {

    this.value = value;
    return this;
  }

  public long getLastUpdatedAt() {

    return lastUpdatedAt;
  }

  public CachedValue setLastUpdatedAt(long lastUpdatedAt) {

    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }
}
