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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class GeoPolygon extends GeoShape implements Serializable/*, JsonSerializable*/ {
  // members
  private List<GeoPoint> points;

  // getters & setters
  public List<GeoPoint> getPoints() {
    return points;
  }

  public void setPoints(List<GeoPoint> points) {
    this.points = points;
  }

  // public API
  public GeoPolygon() {
  }

  public GeoPolygon(List<GeoPoint> points) {
    this.points = points;
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
//  // internal API
//  private String toWKT() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("POLYGON ((");
//    for (int i = 0; i < this.points.size(); i++) {
//      sb.append(this.points.get(i).getLongitude().toString());
//      sb.append(" ");
//      sb.append(this.points.get(i).getLatitude().toString());
//      if (i < this.points.size() - 1) {
//        sb.append(",");
//      }
//    }
//    sb.append("))");
//
//    return sb.toString();
//  }
}
