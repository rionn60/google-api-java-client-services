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

package com.google.api.services.domainsrdap.v1.model;

/**
 * Notices object defined in [section 4.3 of RFC
 * 7483](https://tools.ietf.org/html/rfc7483#section-4.3).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Domains RDAP API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Notice extends com.google.api.client.json.GenericJson {

  /**
   * Description of the notice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> description;

  /**
   * Link to a document containing more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Link> links;

  static {
    // hack to force ProGuard to consider Link used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Link.class);
  }

  /**
   * Title of a notice. Example: "Terms of Service".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Type values defined in [section 10.2.1 of RFC
   * 7483](https://tools.ietf.org/html/rfc7483#section-10.2.1) specific to a whole response: "result
   * set truncated due to authorization", "result set truncated due to excessive load", "result set
   * truncated due to unexplainable reasons".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Description of the notice.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDescription() {
    return description;
  }

  /**
   * Description of the notice.
   * @param description description or {@code null} for none
   */
  public Notice setDescription(java.util.List<java.lang.String> description) {
    this.description = description;
    return this;
  }

  /**
   * Link to a document containing more information.
   * @return value or {@code null} for none
   */
  public java.util.List<Link> getLinks() {
    return links;
  }

  /**
   * Link to a document containing more information.
   * @param links links or {@code null} for none
   */
  public Notice setLinks(java.util.List<Link> links) {
    this.links = links;
    return this;
  }

  /**
   * Title of a notice. Example: "Terms of Service".
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of a notice. Example: "Terms of Service".
   * @param title title or {@code null} for none
   */
  public Notice setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Type values defined in [section 10.2.1 of RFC
   * 7483](https://tools.ietf.org/html/rfc7483#section-10.2.1) specific to a whole response: "result
   * set truncated due to authorization", "result set truncated due to excessive load", "result set
   * truncated due to unexplainable reasons".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type values defined in [section 10.2.1 of RFC
   * 7483](https://tools.ietf.org/html/rfc7483#section-10.2.1) specific to a whole response: "result
   * set truncated due to authorization", "result set truncated due to excessive load", "result set
   * truncated due to unexplainable reasons".
   * @param type type or {@code null} for none
   */
  public Notice setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Notice set(String fieldName, Object value) {
    return (Notice) super.set(fieldName, value);
  }

  @Override
  public Notice clone() {
    return (Notice) super.clone();
  }

}
