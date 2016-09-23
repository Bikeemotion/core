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
import java.util.ArrayList;
import java.util.List;

public class GeoPolygon extends GeoShape implements Serializable/*, JsonSerializable*/{

  // members
  private List<GeoPoint> points;

  // public API
  public GeoPolygon() {

  }

  public GeoPolygon(List<GeoPoint> points) {
    this.points = points;
  }

  private String toWKT() {

    ArrayList<GeoPoint> copy = new ArrayList<>(points);
    copy.sort((e1, e2) -> e1.toWkt().compareTo(e2.toWkt()));

    StringBuilder sb = new StringBuilder();
    sb.append("POLYGON ((");
    for (int i = 0; i < copy.size(); i++) {
      sb.append(copy.get(i).getLongitude().toString());
      sb.append(" ");
      sb.append(copy.get(i).getLatitude().toString());
      if (i < copy.size() - 1) {
        sb.append(",");
      }
    }
    sb.append("))");

    return sb.toString();
  }

  @Override
  public boolean equals(Object obj) {

    if (obj instanceof GeoPolygon) {

      GeoPolygon p = (GeoPolygon) obj;
      if (p.points == this.points) {
        return true;
      }

      if (p.toWKT().equals(toWKT())) {
        return true;
      }
    }

    return false;
  }

  //  public void serialize(JsonGenerator jsonGenerator,
  //      SerializerProvider serializerProvider) throws IOException {
  //    serializeWithType(jsonGenerator, serializerProvider, null);
  //  }
  //
  //  public void serializeWithType(JsonGenerator jsonGenerator,
  //      SerializerProvider provider, TypeSerializer typeSer) throws IOException {
  //    jsonGenerator.writeString(toWKT());
  //  }
  //

  // getters & setters
  public List<GeoPoint> getPoints() {
    return points;
  }

  public void setPoints(List<GeoPoint> points) {
    this.points = points;
  }
}
