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

public class BoundingBox {

  // members
  private double topLeftLat;
  private double topLeftLon;
  private double bottomRightLat;
  private double bottomRightLon;

  // public API
  private BoundingBox() {}

  public BoundingBox(double topLeftLat, double topLeftLon, double bottomRightLat, double bottomRightLon) {

    this.topLeftLat = topLeftLat;
    this.topLeftLon = topLeftLon;
    this.bottomRightLat = bottomRightLat;
    this.bottomRightLon = bottomRightLon;
  }

  // getters & setters
  public double getTopLeftLat() {
    return topLeftLat;
  }

  public double getTopLeftLon() {
    return topLeftLon;
  }

  public double getBottomRightLat() {
    return bottomRightLat;
  }

  public double getBottomRightLon() {
    return bottomRightLon;
  }
}
