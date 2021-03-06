/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.schemaorg.core;

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.org/LodgingReservation}">http://schema.org/LodgingReservation}</a>.
 */
public interface LodgingReservation extends Reservation {

  /**
   * Builder interface of <a
   * href="http://schema.org/LodgingReservation}">http://schema.org/LodgingReservation}</a>.
   */
  public interface Builder extends Reservation.Builder {

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property bookingAgent. */
    Builder addBookingAgent(Organization value);

    /** Add a value to property bookingAgent. */
    Builder addBookingAgent(Organization.Builder value);

    /** Add a value to property bookingAgent. */
    Builder addBookingAgent(Person value);

    /** Add a value to property bookingAgent. */
    Builder addBookingAgent(Person.Builder value);

    /** Add a value to property bookingAgent. */
    Builder addBookingAgent(String value);

    /** Add a value to property bookingTime. */
    Builder addBookingTime(DateTime value);

    /** Add a value to property bookingTime. */
    Builder addBookingTime(String value);

    /** Add a value to property broker. */
    Builder addBroker(Organization value);

    /** Add a value to property broker. */
    Builder addBroker(Organization.Builder value);

    /** Add a value to property broker. */
    Builder addBroker(Person value);

    /** Add a value to property broker. */
    Builder addBroker(Person.Builder value);

    /** Add a value to property broker. */
    Builder addBroker(String value);

    /** Add a value to property checkinTime. */
    Builder addCheckinTime(DateTime value);

    /** Add a value to property checkinTime. */
    Builder addCheckinTime(String value);

    /** Add a value to property checkoutTime. */
    Builder addCheckoutTime(DateTime value);

    /** Add a value to property checkoutTime. */
    Builder addCheckoutTime(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property lodgingUnitDescription. */
    Builder addLodgingUnitDescription(Text value);

    /** Add a value to property lodgingUnitDescription. */
    Builder addLodgingUnitDescription(String value);

    /** Add a value to property lodgingUnitType. */
    Builder addLodgingUnitType(QualitativeValue value);

    /** Add a value to property lodgingUnitType. */
    Builder addLodgingUnitType(Text value);

    /** Add a value to property lodgingUnitType. */
    Builder addLodgingUnitType(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property modifiedTime. */
    Builder addModifiedTime(DateTime value);

    /** Add a value to property modifiedTime. */
    Builder addModifiedTime(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property numAdults. */
    Builder addNumAdults(Integer value);

    /** Add a value to property numAdults. */
    Builder addNumAdults(QuantitativeValue value);

    /** Add a value to property numAdults. */
    Builder addNumAdults(QuantitativeValue.Builder value);

    /** Add a value to property numAdults. */
    Builder addNumAdults(String value);

    /** Add a value to property numChildren. */
    Builder addNumChildren(Integer value);

    /** Add a value to property numChildren. */
    Builder addNumChildren(QuantitativeValue value);

    /** Add a value to property numChildren. */
    Builder addNumChildren(QuantitativeValue.Builder value);

    /** Add a value to property numChildren. */
    Builder addNumChildren(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property priceCurrency. */
    Builder addPriceCurrency(Text value);

    /** Add a value to property priceCurrency. */
    Builder addPriceCurrency(String value);

    /** Add a value to property programMembershipUsed. */
    Builder addProgramMembershipUsed(ProgramMembership value);

    /** Add a value to property programMembershipUsed. */
    Builder addProgramMembershipUsed(ProgramMembership.Builder value);

    /** Add a value to property programMembershipUsed. */
    Builder addProgramMembershipUsed(String value);

    /** Add a value to property provider. */
    Builder addProvider(Organization value);

    /** Add a value to property provider. */
    Builder addProvider(Organization.Builder value);

    /** Add a value to property provider. */
    Builder addProvider(Person value);

    /** Add a value to property provider. */
    Builder addProvider(Person.Builder value);

    /** Add a value to property provider. */
    Builder addProvider(String value);

    /** Add a value to property reservationFor. */
    Builder addReservationFor(Thing value);

    /** Add a value to property reservationFor. */
    Builder addReservationFor(Thing.Builder value);

    /** Add a value to property reservationFor. */
    Builder addReservationFor(String value);

    /** Add a value to property reservationId. */
    Builder addReservationId(Text value);

    /** Add a value to property reservationId. */
    Builder addReservationId(String value);

    /** Add a value to property reservationStatus. */
    Builder addReservationStatus(ReservationStatusType value);

    /** Add a value to property reservationStatus. */
    Builder addReservationStatus(String value);

    /** Add a value to property reservedTicket. */
    Builder addReservedTicket(Ticket value);

    /** Add a value to property reservedTicket. */
    Builder addReservedTicket(Ticket.Builder value);

    /** Add a value to property reservedTicket. */
    Builder addReservedTicket(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property totalPrice. */
    Builder addTotalPrice(Number value);

    /** Add a value to property totalPrice. */
    Builder addTotalPrice(PriceSpecification value);

    /** Add a value to property totalPrice. */
    Builder addTotalPrice(PriceSpecification.Builder value);

    /** Add a value to property totalPrice. */
    Builder addTotalPrice(Text value);

    /** Add a value to property totalPrice. */
    Builder addTotalPrice(String value);

    /** Add a value to property underName. */
    Builder addUnderName(Organization value);

    /** Add a value to property underName. */
    Builder addUnderName(Organization.Builder value);

    /** Add a value to property underName. */
    Builder addUnderName(Person value);

    /** Add a value to property underName. */
    Builder addUnderName(Person.Builder value);

    /** Add a value to property underName. */
    Builder addUnderName(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article.Builder value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(String value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification.Builder value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(String value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

    /** Build a {@link LodgingReservation} object. */
    LodgingReservation build();
  }

  /**
   * Returns the value list of property checkinTime. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getCheckinTimeList();

  /**
   * Returns the value list of property checkoutTime. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getCheckoutTimeList();

  /**
   * Returns the value list of property lodgingUnitDescription. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getLodgingUnitDescriptionList();

  /**
   * Returns the value list of property lodgingUnitType. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getLodgingUnitTypeList();

  /**
   * Returns the value list of property numAdults. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getNumAdultsList();

  /**
   * Returns the value list of property numChildren. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getNumChildrenList();
}
