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

package com.google.api.services.managedidentities.v1.model;

/**
 * Configure the schedule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Schedule extends com.google.api.client.json.GenericJson {

  /**
   * Allows to define schedule that runs specified day of the week.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String day;

  /**
   * Output only. Duration of the time window, set by service producer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Time within the window to start the operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay startTime;

  /**
   * Allows to define schedule that runs specified day of the week.
   * @return value or {@code null} for none
   */
  public java.lang.String getDay() {
    return day;
  }

  /**
   * Allows to define schedule that runs specified day of the week.
   * @param day day or {@code null} for none
   */
  public Schedule setDay(java.lang.String day) {
    this.day = day;
    return this;
  }

  /**
   * Output only. Duration of the time window, set by service producer.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Output only. Duration of the time window, set by service producer.
   * @param duration duration or {@code null} for none
   */
  public Schedule setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Time within the window to start the operations.
   * @return value or {@code null} for none
   */
  public TimeOfDay getStartTime() {
    return startTime;
  }

  /**
   * Time within the window to start the operations.
   * @param startTime startTime or {@code null} for none
   */
  public Schedule setStartTime(TimeOfDay startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public Schedule set(String fieldName, Object value) {
    return (Schedule) super.set(fieldName, value);
  }

  @Override
  public Schedule clone() {
    return (Schedule) super.clone();
  }

}
