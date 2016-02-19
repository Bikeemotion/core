package com.bikeemotion.common;

import java.io.Serializable;

public interface Identity<T> extends Serializable {

  T getIid();

  Identity<T> setIid(T value);
}
