/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.analyticsreporting.v4.model;

/**
 * Represents all the details pertaining to an event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventData extends com.google.api.client.json.GenericJson {

  /**
   * Type of interaction with the object. Eg: 'play'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventAction;

  /**
   * The object on the page that was interacted with. Eg: 'Video'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventCategory;

  /**
   * Number of such events in this activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long eventCount;

  /**
   * Label attached with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventLabel;

  /**
   * Numeric value associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long eventValue;

  /**
   * Type of interaction with the object. Eg: 'play'.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventAction() {
    return eventAction;
  }

  /**
   * Type of interaction with the object. Eg: 'play'.
   * @param eventAction eventAction or {@code null} for none
   */
  public EventData setEventAction(java.lang.String eventAction) {
    this.eventAction = eventAction;
    return this;
  }

  /**
   * The object on the page that was interacted with. Eg: 'Video'.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventCategory() {
    return eventCategory;
  }

  /**
   * The object on the page that was interacted with. Eg: 'Video'.
   * @param eventCategory eventCategory or {@code null} for none
   */
  public EventData setEventCategory(java.lang.String eventCategory) {
    this.eventCategory = eventCategory;
    return this;
  }

  /**
   * Number of such events in this activity.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEventCount() {
    return eventCount;
  }

  /**
   * Number of such events in this activity.
   * @param eventCount eventCount or {@code null} for none
   */
  public EventData setEventCount(java.lang.Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }

  /**
   * Label attached with the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventLabel() {
    return eventLabel;
  }

  /**
   * Label attached with the event.
   * @param eventLabel eventLabel or {@code null} for none
   */
  public EventData setEventLabel(java.lang.String eventLabel) {
    this.eventLabel = eventLabel;
    return this;
  }

  /**
   * Numeric value associated with the event.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEventValue() {
    return eventValue;
  }

  /**
   * Numeric value associated with the event.
   * @param eventValue eventValue or {@code null} for none
   */
  public EventData setEventValue(java.lang.Long eventValue) {
    this.eventValue = eventValue;
    return this;
  }

  @Override
  public EventData set(String fieldName, Object value) {
    return (EventData) super.set(fieldName, value);
  }

  @Override
  public EventData clone() {
    return (EventData) super.clone();
  }

}
