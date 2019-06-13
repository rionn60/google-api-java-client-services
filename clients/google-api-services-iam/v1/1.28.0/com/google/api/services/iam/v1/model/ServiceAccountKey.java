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

package com.google.api.services.iam.v1.model;

/**
 * Represents a service account key.
 *
 * A service account has two sets of key-pairs: user-managed, and system-managed.
 *
 * User-managed key-pairs can be created and deleted by users.  Users are responsible for rotating
 * these keys periodically to ensure security of their service accounts.  Users retain the private
 * key of these key-pairs, and Google retains ONLY the public key.
 *
 * System-managed keys are automatically rotated by Google, and are used for signing for a maximum
 * of two weeks. The rotation process is probabilistic, and usage of the new key will gradually ramp
 * up and down over the key's lifetime. We recommend caching the public key set for a service
 * account for no more than 24 hours to ensure you have access to the latest keys.
 *
 * Public keys for all service accounts are also published at the OAuth2 Service Account API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceAccountKey extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the algorithm (and possibly key size) for the key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyAlgorithm;

  /**
   * The key origin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyOrigin;

  /**
   * The resource name of the service account key in the following format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep
   * the private key data secure because it allows for the assertion of the service account
   * identity. When base64 decoded, the private key data can be used to authenticate with Google API
   * client libraries and with gcloud auth activate-service-account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateKeyData;

  /**
   * The output format for the private key. Only provided in `CreateServiceAccountKey` responses,
   * not in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
   *
   * Google never exposes system-managed private keys, and never retains user-managed private keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateKeyType;

  /**
   * The public key data. Only provided in `GetServiceAccountKey` responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicKeyData;

  /**
   * The key can be used after this timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String validAfterTime;

  /**
   * The key can be used before this timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String validBeforeTime;

  /**
   * Specifies the algorithm (and possibly key size) for the key.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyAlgorithm() {
    return keyAlgorithm;
  }

  /**
   * Specifies the algorithm (and possibly key size) for the key.
   * @param keyAlgorithm keyAlgorithm or {@code null} for none
   */
  public ServiceAccountKey setKeyAlgorithm(java.lang.String keyAlgorithm) {
    this.keyAlgorithm = keyAlgorithm;
    return this;
  }

  /**
   * The key origin.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyOrigin() {
    return keyOrigin;
  }

  /**
   * The key origin.
   * @param keyOrigin keyOrigin or {@code null} for none
   */
  public ServiceAccountKey setKeyOrigin(java.lang.String keyOrigin) {
    this.keyOrigin = keyOrigin;
    return this;
  }

  /**
   * The resource name of the service account key in the following format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the service account key in the following format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * @param name name or {@code null} for none
   */
  public ServiceAccountKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep
   * the private key data secure because it allows for the assertion of the service account
   * identity. When base64 decoded, the private key data can be used to authenticate with Google API
   * client libraries and with gcloud auth activate-service-account.
   * @see #decodePrivateKeyData()
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateKeyData() {
    return privateKeyData;
  }

  /**
   * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep
   * the private key data secure because it allows for the assertion of the service account
   * identity. When base64 decoded, the private key data can be used to authenticate with Google API
   * client libraries and with gcloud auth activate-service-account.
   * @see #getPrivateKeyData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePrivateKeyData() {
    return com.google.api.client.util.Base64.decodeBase64(privateKeyData);
  }

  /**
   * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep
   * the private key data secure because it allows for the assertion of the service account
   * identity. When base64 decoded, the private key data can be used to authenticate with Google API
   * client libraries and with gcloud auth activate-service-account.
   * @see #encodePrivateKeyData()
   * @param privateKeyData privateKeyData or {@code null} for none
   */
  public ServiceAccountKey setPrivateKeyData(java.lang.String privateKeyData) {
    this.privateKeyData = privateKeyData;
    return this;
  }

  /**
   * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep
   * the private key data secure because it allows for the assertion of the service account
   * identity. When base64 decoded, the private key data can be used to authenticate with Google API
   * client libraries and with gcloud auth activate-service-account.
   * @see #setPrivateKeyData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ServiceAccountKey encodePrivateKeyData(byte[] privateKeyData) {
    this.privateKeyData = com.google.api.client.util.Base64.encodeBase64URLSafeString(privateKeyData);
    return this;
  }

  /**
   * The output format for the private key. Only provided in `CreateServiceAccountKey` responses,
   * not in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
   *
   * Google never exposes system-managed private keys, and never retains user-managed private keys.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateKeyType() {
    return privateKeyType;
  }

  /**
   * The output format for the private key. Only provided in `CreateServiceAccountKey` responses,
   * not in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
   *
   * Google never exposes system-managed private keys, and never retains user-managed private keys.
   * @param privateKeyType privateKeyType or {@code null} for none
   */
  public ServiceAccountKey setPrivateKeyType(java.lang.String privateKeyType) {
    this.privateKeyType = privateKeyType;
    return this;
  }

  /**
   * The public key data. Only provided in `GetServiceAccountKey` responses.
   * @see #decodePublicKeyData()
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicKeyData() {
    return publicKeyData;
  }

  /**
   * The public key data. Only provided in `GetServiceAccountKey` responses.
   * @see #getPublicKeyData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePublicKeyData() {
    return com.google.api.client.util.Base64.decodeBase64(publicKeyData);
  }

  /**
   * The public key data. Only provided in `GetServiceAccountKey` responses.
   * @see #encodePublicKeyData()
   * @param publicKeyData publicKeyData or {@code null} for none
   */
  public ServiceAccountKey setPublicKeyData(java.lang.String publicKeyData) {
    this.publicKeyData = publicKeyData;
    return this;
  }

  /**
   * The public key data. Only provided in `GetServiceAccountKey` responses.
   * @see #setPublicKeyData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ServiceAccountKey encodePublicKeyData(byte[] publicKeyData) {
    this.publicKeyData = com.google.api.client.util.Base64.encodeBase64URLSafeString(publicKeyData);
    return this;
  }

  /**
   * The key can be used after this timestamp.
   * @return value or {@code null} for none
   */
  public String getValidAfterTime() {
    return validAfterTime;
  }

  /**
   * The key can be used after this timestamp.
   * @param validAfterTime validAfterTime or {@code null} for none
   */
  public ServiceAccountKey setValidAfterTime(String validAfterTime) {
    this.validAfterTime = validAfterTime;
    return this;
  }

  /**
   * The key can be used before this timestamp.
   * @return value or {@code null} for none
   */
  public String getValidBeforeTime() {
    return validBeforeTime;
  }

  /**
   * The key can be used before this timestamp.
   * @param validBeforeTime validBeforeTime or {@code null} for none
   */
  public ServiceAccountKey setValidBeforeTime(String validBeforeTime) {
    this.validBeforeTime = validBeforeTime;
    return this;
  }

  @Override
  public ServiceAccountKey set(String fieldName, Object value) {
    return (ServiceAccountKey) super.set(fieldName, value);
  }

  @Override
  public ServiceAccountKey clone() {
    return (ServiceAccountKey) super.clone();
  }

}
