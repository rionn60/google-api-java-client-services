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

package com.google.api.services.displayvideo.v1.model;

/**
 * A negatively targeted keyword that belongs to a negative keyword list.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NegativeKeyword extends com.google.api.client.json.GenericJson {

  /**
   * Required. Immutable. The negatively targeted keyword, for example `car insurance`.
   *
   * Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80.
   * Maximum number of words is 10.
   *
   * Valid characters are restricted to ASCII characters only. The only URL-escaping permitted is
   * for representing whitespace between words. Leading or trailing whitespace is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keywordValue;

  /**
   * Output only. The resource name of the negative keyword.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The negatively targeted keyword, for example `car insurance`.
   *
   * Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80.
   * Maximum number of words is 10.
   *
   * Valid characters are restricted to ASCII characters only. The only URL-escaping permitted is
   * for representing whitespace between words. Leading or trailing whitespace is ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeywordValue() {
    return keywordValue;
  }

  /**
   * Required. Immutable. The negatively targeted keyword, for example `car insurance`.
   *
   * Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80.
   * Maximum number of words is 10.
   *
   * Valid characters are restricted to ASCII characters only. The only URL-escaping permitted is
   * for representing whitespace between words. Leading or trailing whitespace is ignored.
   * @param keywordValue keywordValue or {@code null} for none
   */
  public NegativeKeyword setKeywordValue(java.lang.String keywordValue) {
    this.keywordValue = keywordValue;
    return this;
  }

  /**
   * Output only. The resource name of the negative keyword.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the negative keyword.
   * @param name name or {@code null} for none
   */
  public NegativeKeyword setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public NegativeKeyword set(String fieldName, Object value) {
    return (NegativeKeyword) super.set(fieldName, value);
  }

  @Override
  public NegativeKeyword clone() {
    return (NegativeKeyword) super.clone();
  }

}
