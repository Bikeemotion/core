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

import java.util.List;

/**
 * This class holds paginate operation results, namely the total of records to
 * paginate and a user-predetermined subset.
 */
public class PaginatedResult<T> {

  private final long totalRecordsInBd;
  private final List<T> results;

  public PaginatedResult(final long totalRecordsInDb, final List<T> results) {
    this.totalRecordsInBd = totalRecordsInDb;
    this.results = results;
  }

  public long getTotalRecordsInDb() {
    return totalRecordsInBd;
  }

  public List<T> getResults() {
    return results;
  }

}
