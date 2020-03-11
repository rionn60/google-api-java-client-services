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

package com.google.api.services.ml.v1.model;

/**
 * A message representing a Study.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1Study extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time that the study was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. A human readable reason why the Study is inactive. This should be empty if a study
   * is ACTIVE or COMPLETED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inactiveReason;

  /**
   * Output only. The name of a study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The detailed state of a study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. Configuration of the study.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1StudyConfig studyConfig;

  /**
   * Output only. Time that the study was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time that the study was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudMlV1Study setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. A human readable reason why the Study is inactive. This should be empty if a study
   * is ACTIVE or COMPLETED.
   * @return value or {@code null} for none
   */
  public java.lang.String getInactiveReason() {
    return inactiveReason;
  }

  /**
   * Output only. A human readable reason why the Study is inactive. This should be empty if a study
   * is ACTIVE or COMPLETED.
   * @param inactiveReason inactiveReason or {@code null} for none
   */
  public GoogleCloudMlV1Study setInactiveReason(java.lang.String inactiveReason) {
    this.inactiveReason = inactiveReason;
    return this;
  }

  /**
   * Output only. The name of a study.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of a study.
   * @param name name or {@code null} for none
   */
  public GoogleCloudMlV1Study setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The detailed state of a study.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The detailed state of a study.
   * @param state state or {@code null} for none
   */
  public GoogleCloudMlV1Study setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Required. Configuration of the study.
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1StudyConfig getStudyConfig() {
    return studyConfig;
  }

  /**
   * Required. Configuration of the study.
   * @param studyConfig studyConfig or {@code null} for none
   */
  public GoogleCloudMlV1Study setStudyConfig(GoogleCloudMlV1StudyConfig studyConfig) {
    this.studyConfig = studyConfig;
    return this;
  }

  @Override
  public GoogleCloudMlV1Study set(String fieldName, Object value) {
    return (GoogleCloudMlV1Study) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1Study clone() {
    return (GoogleCloudMlV1Study) super.clone();
  }

}