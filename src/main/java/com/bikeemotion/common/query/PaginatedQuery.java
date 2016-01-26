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
package com.bikeemotion.common.query;

import java.io.Serializable;


/**
 * This class holds paginated query request, namely the attributes names and
 * values, and ordering to be used in the queries.
 */

public class PaginatedQuery implements Serializable{

  private int offset;
  private int limit;
  private QueryPredicate predicate;

  public PaginatedQuery() {
    this.offset = 0;
    this.limit = 0;
    this.predicate = new QueryPredicate();
  }
  
  /**
   *
   * @param offset the offset of the row to start the query from.
   * @param limit the limit number of results to return from the query.
   * @param predicate a predicate expression or a predicate tree.
   */
  public PaginatedQuery(final int offset, final int limit,
      final QueryPredicate predicate) {
    this.offset = offset;
    this.limit = limit;
    this.predicate = predicate;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public void setPredicate(QueryPredicate predicate) {
    this.predicate = predicate;
  }

  public int getOffset() {
    return offset;
  }

  public int getLimit() {
    return limit;
  }

  public QueryPredicate getPredicate() {
    return predicate;
  }

  @Override
  public String toString() {
    return "PaginatedQuery{" + "offset=" + offset + ", limit=" + limit +
         ", predicate=" + predicate + '}';
  }

}
