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

package com.google.api.services.compute.model;

/**
 * Represents an Autoscaler resource.
 *
 * Google Compute Engine has two Autoscaler resources:
 *
 * * [Zonal](/compute/docs/reference/rest/{$api_version}/autoscalers) *
 * [Regional](/compute/docs/reference/rest/{$api_version}/regionAutoscalers)
 *
 * Use autoscalers to automatically add or delete instances from a managed instance group according
 * to your defined autoscaling policy. For more information, read Autoscaling Groups of Instances.
 *
 * For zonal managed instance groups resource, use the autoscaler resource.
 *
 * For regional managed instance groups, use the regionAutoscalers resource. (== resource_for
 * {$api_version}.autoscalers ==) (== resource_for {$api_version}.regionAutoscalers ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Autoscaler extends com.google.api.client.json.GenericJson {

  /**
   * The configuration parameters for the autoscaling algorithm. You can define one or more of the
   * policies for an autoscaler: cpuUtilization, customMetricUtilizations, and
   * loadBalancingUtilization.
   *
   * If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6
   * or 60%.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingPolicy autoscalingPolicy;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#autoscaler for autoscalers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] Target recommended MIG size (number of instances) computed by autoscaler.
   * Autoscaler calculates recommended MIG size even when autoscaling policy mode is different from
   * ON. This field is empty when autoscaler is not connected to the existing managed instance group
   * or autoscaler did not generate its prediction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recommendedSize;

  /**
   * [Output Only] URL of the region where the instance group resides (for autoscalers living in
   * regional scope).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Status information of existing scaling schedules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ScalingScheduleStatus> scalingScheduleStatus;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output Only] The status of the autoscaler configuration. Current set of possible values: -
   * PENDING: Autoscaler backend hasn't read new/updated configuration.  - DELETING: Configuration
   * is being deleted.  - ACTIVE: Configuration is acknowledged to be effective. Some warnings might
   * be present in the statusDetails field.  - ERROR: Configuration has errors. Actionable for
   * users. Details are present in the statusDetails field.  New values might be added in the
   * future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the
   * documentation for Commonly returned status messages for examples of status messages you might
   * encounter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AutoscalerStatusDetails> statusDetails;

  /**
   * URL of the managed instance group that this autoscaler will scale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal
   * scope).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The configuration parameters for the autoscaling algorithm. You can define one or more of the
   * policies for an autoscaler: cpuUtilization, customMetricUtilizations, and
   * loadBalancingUtilization.
   *
   * If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6
   * or 60%.
   * @return value or {@code null} for none
   */
  public AutoscalingPolicy getAutoscalingPolicy() {
    return autoscalingPolicy;
  }

  /**
   * The configuration parameters for the autoscaling algorithm. You can define one or more of the
   * policies for an autoscaler: cpuUtilization, customMetricUtilizations, and
   * loadBalancingUtilization.
   *
   * If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6
   * or 60%.
   * @param autoscalingPolicy autoscalingPolicy or {@code null} for none
   */
  public Autoscaler setAutoscalingPolicy(AutoscalingPolicy autoscalingPolicy) {
    this.autoscalingPolicy = autoscalingPolicy;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Autoscaler setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Autoscaler setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Autoscaler setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#autoscaler for autoscalers.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#autoscaler for autoscalers.
   * @param kind kind or {@code null} for none
   */
  public Autoscaler setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Autoscaler setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] Target recommended MIG size (number of instances) computed by autoscaler.
   * Autoscaler calculates recommended MIG size even when autoscaling policy mode is different from
   * ON. This field is empty when autoscaler is not connected to the existing managed instance group
   * or autoscaler did not generate its prediction.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecommendedSize() {
    return recommendedSize;
  }

  /**
   * [Output Only] Target recommended MIG size (number of instances) computed by autoscaler.
   * Autoscaler calculates recommended MIG size even when autoscaling policy mode is different from
   * ON. This field is empty when autoscaler is not connected to the existing managed instance group
   * or autoscaler did not generate its prediction.
   * @param recommendedSize recommendedSize or {@code null} for none
   */
  public Autoscaler setRecommendedSize(java.lang.Integer recommendedSize) {
    this.recommendedSize = recommendedSize;
    return this;
  }

  /**
   * [Output Only] URL of the region where the instance group resides (for autoscalers living in
   * regional scope).
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the instance group resides (for autoscalers living in
   * regional scope).
   * @param region region or {@code null} for none
   */
  public Autoscaler setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Status information of existing scaling schedules.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ScalingScheduleStatus> getScalingScheduleStatus() {
    return scalingScheduleStatus;
  }

  /**
   * [Output Only] Status information of existing scaling schedules.
   * @param scalingScheduleStatus scalingScheduleStatus or {@code null} for none
   */
  public Autoscaler setScalingScheduleStatus(java.util.Map<String, ScalingScheduleStatus> scalingScheduleStatus) {
    this.scalingScheduleStatus = scalingScheduleStatus;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Autoscaler setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public Autoscaler setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output Only] The status of the autoscaler configuration. Current set of possible values: -
   * PENDING: Autoscaler backend hasn't read new/updated configuration.  - DELETING: Configuration
   * is being deleted.  - ACTIVE: Configuration is acknowledged to be effective. Some warnings might
   * be present in the statusDetails field.  - ERROR: Configuration has errors. Actionable for
   * users. Details are present in the statusDetails field.  New values might be added in the
   * future.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the autoscaler configuration. Current set of possible values: -
   * PENDING: Autoscaler backend hasn't read new/updated configuration.  - DELETING: Configuration
   * is being deleted.  - ACTIVE: Configuration is acknowledged to be effective. Some warnings might
   * be present in the statusDetails field.  - ERROR: Configuration has errors. Actionable for
   * users. Details are present in the statusDetails field.  New values might be added in the
   * future.
   * @param status status or {@code null} for none
   */
  public Autoscaler setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the
   * documentation for Commonly returned status messages for examples of status messages you might
   * encounter.
   * @return value or {@code null} for none
   */
  public java.util.List<AutoscalerStatusDetails> getStatusDetails() {
    return statusDetails;
  }

  /**
   * [Output Only] Human-readable details about the current state of the autoscaler. Read the
   * documentation for Commonly returned status messages for examples of status messages you might
   * encounter.
   * @param statusDetails statusDetails or {@code null} for none
   */
  public Autoscaler setStatusDetails(java.util.List<AutoscalerStatusDetails> statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * URL of the managed instance group that this autoscaler will scale.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * URL of the managed instance group that this autoscaler will scale.
   * @param target target or {@code null} for none
   */
  public Autoscaler setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal
   * scope).
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal
   * scope).
   * @param zone zone or {@code null} for none
   */
  public Autoscaler setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Autoscaler set(String fieldName, Object value) {
    return (Autoscaler) super.set(fieldName, value);
  }

  @Override
  public Autoscaler clone() {
    return (Autoscaler) super.clone();
  }

}
