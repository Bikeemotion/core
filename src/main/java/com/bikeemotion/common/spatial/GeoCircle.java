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
package com.bikeemotion.common.spatial;

import java.io.Serializable;

public class GeoCircle extends GeoShape implements Serializable {
  // members
  private Double latitude;

  private Double longitude;

  private Double radius;

  // getters & setters
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  // public API
  public GeoCircle() {
  }

  public GeoCircle(Double longitude, Double latitude, Double radius) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.radius = radius;
  }

}
