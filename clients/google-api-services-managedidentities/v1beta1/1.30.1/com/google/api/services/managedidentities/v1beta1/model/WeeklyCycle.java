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

package com.google.api.services.managedidentities.v1beta1.model;

/**
 * Time window specified for weekly operations.
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
public final class WeeklyCycle extends com.google.api.client.json.GenericJson {

  /**
   * User can specify multiple windows in a week. Minimum of 1 window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Schedule> schedule;

  static {
    // hack to force ProGuard to consider Schedule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Schedule.class);
  }

  /**
   * User can specify multiple windows in a week. Minimum of 1 window.
   * @return value or {@code null} for none
   */
  public java.util.List<Schedule> getSchedule() {
    return schedule;
  }

  /**
   * User can specify multiple windows in a week. Minimum of 1 window.
   * @param schedule schedule or {@code null} for none
   */
  public WeeklyCycle setSchedule(java.util.List<Schedule> schedule) {
    this.schedule = schedule;
    return this;
  }

  @Override
  public WeeklyCycle set(String fieldName, Object value) {
    return (WeeklyCycle) super.set(fieldName, value);
  }

  @Override
  public WeeklyCycle clone() {
    return (WeeklyCycle) super.clone();
  }

}
