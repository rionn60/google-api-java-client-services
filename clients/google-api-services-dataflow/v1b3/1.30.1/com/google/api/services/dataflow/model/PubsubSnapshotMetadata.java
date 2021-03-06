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

package com.google.api.services.dataflow.model;

/**
 * Represents a Pubsub snapshot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubsubSnapshotMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The expire time of the Pubsub snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The name of the Pubsub snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snapshotName;

  /**
   * The name of the Pubsub topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicName;

  /**
   * The expire time of the Pubsub snapshot.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * The expire time of the Pubsub snapshot.
   * @param expireTime expireTime or {@code null} for none
   */
  public PubsubSnapshotMetadata setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The name of the Pubsub snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnapshotName() {
    return snapshotName;
  }

  /**
   * The name of the Pubsub snapshot.
   * @param snapshotName snapshotName or {@code null} for none
   */
  public PubsubSnapshotMetadata setSnapshotName(java.lang.String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

  /**
   * The name of the Pubsub topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicName() {
    return topicName;
  }

  /**
   * The name of the Pubsub topic.
   * @param topicName topicName or {@code null} for none
   */
  public PubsubSnapshotMetadata setTopicName(java.lang.String topicName) {
    this.topicName = topicName;
    return this;
  }

  @Override
  public PubsubSnapshotMetadata set(String fieldName, Object value) {
    return (PubsubSnapshotMetadata) super.set(fieldName, value);
  }

  @Override
  public PubsubSnapshotMetadata clone() {
    return (PubsubSnapshotMetadata) super.clone();
  }

}
