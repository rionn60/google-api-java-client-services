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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Represents a single yum package repository. These will be added to a repo file that will be
 * managed at /etc/yum.repos.d/google_osconfig.repo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryResourceYumRepository extends com.google.api.client.json.GenericJson {

  /**
   * The location of the repository directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseUrl;

  /**
   * The display name of the repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * URIs of GPG keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> gpgKeys;

  /**
   * A one word, unique name for this repository. This will be the `repo id` in the yum config file
   * and also the `display_name` if `display_name` is omitted. This id is also used as the unique
   * identifier when checking for resource conflicts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The location of the repository directory.
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseUrl() {
    return baseUrl;
  }

  /**
   * The location of the repository directory.
   * @param baseUrl baseUrl or {@code null} for none
   */
  public RepositoryResourceYumRepository setBaseUrl(java.lang.String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * The display name of the repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the repository.
   * @param displayName displayName or {@code null} for none
   */
  public RepositoryResourceYumRepository setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * URIs of GPG keys.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGpgKeys() {
    return gpgKeys;
  }

  /**
   * URIs of GPG keys.
   * @param gpgKeys gpgKeys or {@code null} for none
   */
  public RepositoryResourceYumRepository setGpgKeys(java.util.List<java.lang.String> gpgKeys) {
    this.gpgKeys = gpgKeys;
    return this;
  }

  /**
   * A one word, unique name for this repository. This will be the `repo id` in the yum config file
   * and also the `display_name` if `display_name` is omitted. This id is also used as the unique
   * identifier when checking for resource conflicts.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A one word, unique name for this repository. This will be the `repo id` in the yum config file
   * and also the `display_name` if `display_name` is omitted. This id is also used as the unique
   * identifier when checking for resource conflicts.
   * @param id id or {@code null} for none
   */
  public RepositoryResourceYumRepository setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  @Override
  public RepositoryResourceYumRepository set(String fieldName, Object value) {
    return (RepositoryResourceYumRepository) super.set(fieldName, value);
  }

  @Override
  public RepositoryResourceYumRepository clone() {
    return (RepositoryResourceYumRepository) super.clone();
  }

}
