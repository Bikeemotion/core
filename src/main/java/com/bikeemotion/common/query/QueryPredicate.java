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

import static com.bikeemotion.common.query.QueryDirection.ASC;
import static com.bikeemotion.common.query.QueryOperator.AND;
import static com.bikeemotion.common.query.QueryOperator.OR;
import static com.bikeemotion.common.query.QueryPredicateType.EXPRESSION;
import static com.bikeemotion.common.query.QueryPredicateType.OPERATOR;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition of an query predicate, whether it's an expression or an operator
 * (conjunction or disjunction).
 *
 * @param <T>
 * @param <E>
 */
@JsonPropertyOrder(
    {"type", "attribute", "operator", "value", "value2", "childPredicates"})
public class QueryPredicate<T, E extends QueryAttribute> implements Serializable {

  private QueryPredicateType type;
  private E attribute;
  private T value1;
  private T value2; // used only for BETWEEN
  private QueryDirection direction;
  private QueryOperator operator;
  private List<QueryPredicate<T, E>> childPredicates;

  public QueryPredicate() {
    this.direction = ASC;
    this.childPredicates = new ArrayList<>();
  }

  public QueryPredicate(final QueryPredicateType type) {
    this();

    this.type = type;
  }

  public void setType(QueryPredicateType type) {
    this.type = type;
  }

  public void setAttribute(E attribute) {
    this.attribute = attribute;
  }

  public void setValue1(T value1) {
    this.value1 = value1;
  }

  public void setValue2(T value2) {
    this.value2 = value2;
  }

  public void setDirection(QueryDirection direction) {
    this.direction = direction;
  }

  public void setOperator(QueryOperator operator) {
    this.operator = operator;
  }

  public void setChildPredicates(List<QueryPredicate<T, E>> childPredicates) {
    this.childPredicates = childPredicates;
  }

  public QueryPredicateType getType() {
    return type;
  }

  public E getAttribute() {
    return attribute;
  }

  public QueryPredicate attribute(final E attribute) {
    this.attribute = attribute;
    return this;
  }

  public T getValue1() {
    return value1;
  }

  public T getValue2() {
    return value2;
  }

  public QueryPredicate value(final T value) {
    this.value1 = value;
    return this;
  }

  public QueryPredicate betweenValues(final T value, final T value2) {
    this.value1 = value;
    this.value2 = value2;
    return this;
  }

  public QueryDirection getDirection() {
    return direction;
  }

  public QueryPredicate direction(final QueryDirection direction) {
    this.direction = direction == null
        ? ASC
        : direction;
    return this;
  }

  @JsonIgnore
  public QueryOperator getLogicalOperator() {
    return operator;
  }

  /**
   * Set only when {@link QueryPredicate#type} equals to
   * {@link QueryPredicateType#OPERATOR}.
   *
   * @param operator {@link QueryOperator#AND} or {@link QueryOperator#OR}.
   * @return this predicate or null if invalid operation.
   */
  public QueryPredicate logicalOperator(final QueryOperator operator)
      throws
      IllegalArgumentException {
    if (this.type.equals(OPERATOR)) {
      if (operator == AND || operator ==
          OR) {
        this.operator = operator;
      }
      return this;
    }

    throw new IllegalArgumentException("Invalid operator type [" + operator.
        name() + "] for predicate type " + this.type.name());
  }

  @JsonIgnore
  public QueryOperator getComparisonOperator() {
    return operator;
  }

  /**
   * Set only when {@link QueryPredicate#type} equals to
   * {@link QueryPredicateType#EXPRESSION}.
   *
   * @param operator comparison operator.
   * @return this predicate or null if invalid operation.
   */
  public QueryPredicate comparisonOperator(
      final QueryOperator operator) throws IllegalArgumentException {
    if (this.type.equals(EXPRESSION)) {
      if (operator != null && (operator != AND &&
          operator != OR)) {
        this.operator = operator;
      }
      return this;
    }

    throw new IllegalArgumentException("Invalid operator type [" + operator.
        name() + "] for predicate type " + this.type.name());
  }

  public List<QueryPredicate<T, E>> getChildPredicates() {
    return childPredicates;
  }

  public QueryPredicate addChild(
      final QueryPredicate childPredicate) {
    this.childPredicates.add(childPredicate);
    return this;
  }

  public QueryPredicate addChildren(final QueryPredicate<T, E>... children) {
    this.childPredicates.addAll(Arrays.asList(children));
    return this;
  }

  @Override
  public String toString() {
    return "QueryPredicate{" + "type=" + type + ", attribute=" + attribute +
        ", value=" + value1 + ", direction=" + direction + ", operator=" +
        operator + ", childPredicates=" + childPredicates + '}';
  }

}
