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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Version contains structured information about the version of a package.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Version extends com.google.api.client.json.GenericJson {

  /**
   * Used to correct mistakes in the version numbering scheme.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer epoch;

  /**
   * Required. Distinguishes between sentinel MIN/MAX versions and normal versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Required only when version kind is NORMAL. The main part of the version name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The iteration of the package build from the above version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * Used to correct mistakes in the version numbering scheme.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEpoch() {
    return epoch;
  }

  /**
   * Used to correct mistakes in the version numbering scheme.
   * @param epoch epoch or {@code null} for none
   */
  public Version setEpoch(java.lang.Integer epoch) {
    this.epoch = epoch;
    return this;
  }

  /**
   * Required. Distinguishes between sentinel MIN/MAX versions and normal versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Required. Distinguishes between sentinel MIN/MAX versions and normal versions.
   * @param kind kind or {@code null} for none
   */
  public Version setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Required only when version kind is NORMAL. The main part of the version name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required only when version kind is NORMAL. The main part of the version name.
   * @param name name or {@code null} for none
   */
  public Version setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The iteration of the package build from the above version.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * The iteration of the package build from the above version.
   * @param revision revision or {@code null} for none
   */
  public Version setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  @Override
  public Version set(String fieldName, Object value) {
    return (Version) super.set(fieldName, value);
  }

  @Override
  public Version clone() {
    return (Version) super.clone();
  }

}
