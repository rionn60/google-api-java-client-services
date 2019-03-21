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
 * The response from `userActivity:get` call.
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
public final class SearchUserActivityResponse extends com.google.api.client.json.GenericJson {

  /**
   * This token should be passed to [SearchUserActivityRequest](#SearchUserActivityRequest) to
   * retrieve the next page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * This field represents the [sampling rate](https://support.google.com/analytics/answer/2637192)
   * for the given request and is a number between 0.0 to 1.0. See [developer
   * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double sampleRate;

  /**
   * Each record represents a session (device details, duration, etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UserActivitySession> sessions;

  /**
   * Total rows returned by this query (across different pages).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalRows;

  /**
   * This token should be passed to [SearchUserActivityRequest](#SearchUserActivityRequest) to
   * retrieve the next page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * This token should be passed to [SearchUserActivityRequest](#SearchUserActivityRequest) to
   * retrieve the next page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchUserActivityResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * This field represents the [sampling rate](https://support.google.com/analytics/answer/2637192)
   * for the given request and is a number between 0.0 to 1.0. See [developer
   * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for details.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSampleRate() {
    return sampleRate;
  }

  /**
   * This field represents the [sampling rate](https://support.google.com/analytics/answer/2637192)
   * for the given request and is a number between 0.0 to 1.0. See [developer
   * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for details.
   * @param sampleRate sampleRate or {@code null} for none
   */
  public SearchUserActivityResponse setSampleRate(java.lang.Double sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

  /**
   * Each record represents a session (device details, duration, etc).
   * @return value or {@code null} for none
   */
  public java.util.List<UserActivitySession> getSessions() {
    return sessions;
  }

  /**
   * Each record represents a session (device details, duration, etc).
   * @param sessions sessions or {@code null} for none
   */
  public SearchUserActivityResponse setSessions(java.util.List<UserActivitySession> sessions) {
    this.sessions = sessions;
    return this;
  }

  /**
   * Total rows returned by this query (across different pages).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalRows() {
    return totalRows;
  }

  /**
   * Total rows returned by this query (across different pages).
   * @param totalRows totalRows or {@code null} for none
   */
  public SearchUserActivityResponse setTotalRows(java.lang.Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  @Override
  public SearchUserActivityResponse set(String fieldName, Object value) {
    return (SearchUserActivityResponse) super.set(fieldName, value);
  }

  @Override
  public SearchUserActivityResponse clone() {
    return (SearchUserActivityResponse) super.clone();
  }

}
