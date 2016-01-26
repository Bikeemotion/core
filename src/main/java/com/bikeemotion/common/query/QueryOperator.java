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

/**
 * SQL-alike query operator.
 *
 * TODO
 * Literals and Dates (literal, nullLiteral, currentDate, ...).
 * Paths, navigation and types (get, type).
 * Arithmetic expressions (sum, diff, prod, quot, mod, abs, neg, sqrt).
 * String expressions (like, length, locate, lower, upper, concat, substring,
 * ...).
 * Collection expressions (isEmpty, isNotEmpty, isMember, isNotMember, size).
 * Comparison expressions (equal, notEqual, gt, ge, lt, le, between, isNull,
 * ...)
 * Logical expressions (and, or, not, isTrue).
 *
 */
public enum QueryOperator {

  AND,
  OR,
  LIKE,
  EQUALS,
  NOT_EQUALS,
  IN,
  BETWEEN_LONG,
  BETWEEN_FLOAT,
  IS_TRUE,
  IS_FALSE,
  IS_NULL;
}
