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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Policies controlling personal usage on a company-owned device with a work profile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PersonalUsagePolicies extends com.google.api.client.json.GenericJson {

  /**
   * Account types that can't be managed by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accountTypesWithManagementDisabled;

  /**
   * Whether camera is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cameraDisabled;

  /**
   * Controls how long the work profile can stay off.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxDaysWithWorkOff;

  /**
   * Policy applied to applications in the personal profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PersonalApplicationPolicy> personalApplications;

  static {
    // hack to force ProGuard to consider PersonalApplicationPolicy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PersonalApplicationPolicy.class);
  }

  /**
   * Used together with personalApplications to control how apps in the personal profile are allowed
   * or blocked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String personalPlayStoreMode;

  /**
   * Whether screen capture is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean screenCaptureDisabled;

  /**
   * Account types that can't be managed by the user.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccountTypesWithManagementDisabled() {
    return accountTypesWithManagementDisabled;
  }

  /**
   * Account types that can't be managed by the user.
   * @param accountTypesWithManagementDisabled accountTypesWithManagementDisabled or {@code null} for none
   */
  public PersonalUsagePolicies setAccountTypesWithManagementDisabled(java.util.List<java.lang.String> accountTypesWithManagementDisabled) {
    this.accountTypesWithManagementDisabled = accountTypesWithManagementDisabled;
    return this;
  }

  /**
   * Whether camera is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCameraDisabled() {
    return cameraDisabled;
  }

  /**
   * Whether camera is disabled.
   * @param cameraDisabled cameraDisabled or {@code null} for none
   */
  public PersonalUsagePolicies setCameraDisabled(java.lang.Boolean cameraDisabled) {
    this.cameraDisabled = cameraDisabled;
    return this;
  }

  /**
   * Controls how long the work profile can stay off.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxDaysWithWorkOff() {
    return maxDaysWithWorkOff;
  }

  /**
   * Controls how long the work profile can stay off.
   * @param maxDaysWithWorkOff maxDaysWithWorkOff or {@code null} for none
   */
  public PersonalUsagePolicies setMaxDaysWithWorkOff(java.lang.Integer maxDaysWithWorkOff) {
    this.maxDaysWithWorkOff = maxDaysWithWorkOff;
    return this;
  }

  /**
   * Policy applied to applications in the personal profile.
   * @return value or {@code null} for none
   */
  public java.util.List<PersonalApplicationPolicy> getPersonalApplications() {
    return personalApplications;
  }

  /**
   * Policy applied to applications in the personal profile.
   * @param personalApplications personalApplications or {@code null} for none
   */
  public PersonalUsagePolicies setPersonalApplications(java.util.List<PersonalApplicationPolicy> personalApplications) {
    this.personalApplications = personalApplications;
    return this;
  }

  /**
   * Used together with personalApplications to control how apps in the personal profile are allowed
   * or blocked.
   * @return value or {@code null} for none
   */
  public java.lang.String getPersonalPlayStoreMode() {
    return personalPlayStoreMode;
  }

  /**
   * Used together with personalApplications to control how apps in the personal profile are allowed
   * or blocked.
   * @param personalPlayStoreMode personalPlayStoreMode or {@code null} for none
   */
  public PersonalUsagePolicies setPersonalPlayStoreMode(java.lang.String personalPlayStoreMode) {
    this.personalPlayStoreMode = personalPlayStoreMode;
    return this;
  }

  /**
   * Whether screen capture is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getScreenCaptureDisabled() {
    return screenCaptureDisabled;
  }

  /**
   * Whether screen capture is disabled.
   * @param screenCaptureDisabled screenCaptureDisabled or {@code null} for none
   */
  public PersonalUsagePolicies setScreenCaptureDisabled(java.lang.Boolean screenCaptureDisabled) {
    this.screenCaptureDisabled = screenCaptureDisabled;
    return this;
  }

  @Override
  public PersonalUsagePolicies set(String fieldName, Object value) {
    return (PersonalUsagePolicies) super.set(fieldName, value);
  }

  @Override
  public PersonalUsagePolicies clone() {
    return (PersonalUsagePolicies) super.clone();
  }

}
