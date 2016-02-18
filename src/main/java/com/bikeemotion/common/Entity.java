package com.bikeemotion.common;

import java.io.Serializable;

public interface Entity<T> extends Serializable {

  T getId();

  Entity<T> setId(T value);
}
