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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * A group within the Cloud Identity Groups API. A `Group` is a collection of entities, where each
 * entity is either a user, another group, or a service account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Group extends com.google.api.client.json.GenericJson {

  /**
   * Additional entity key aliases for a Group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityKey> additionalGroupKeys;

  static {
    // hack to force ProGuard to consider EntityKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntityKey.class);
  }

  /**
   * Output only. The time when the `Group` was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * An extended description to help users determine the purpose of a `Group`. Must not be longer
   * than 4,096 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The display name of the `Group`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Dynamic group metadata like queries and status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DynamicGroupMetadata dynamicGroupMetadata;

  /**
   * Required. Immutable. The `EntityKey` of the `Group`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntityKey groupKey;

  /**
   * Required. One or more label entries that apply to the Group. Currently supported labels contain
   * a key with an empty value. Google Groups are the default type of group and have a label with a
   * key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing
   * Google Groups can have an additional label with a key of
   * `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an
   * immutable change and the security label cannot be removed once added.** Dynamic groups have a
   * label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for
   * Cloud Search have a label with a key of `system/groups/external` and an empty value. Examples:
   * {"cloudidentity.googleapis.com/groups.discussion_forum": ""} or {"system/groups/external": ""}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the
   * `Group`. Shall be of the form `groups/{group_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The resource name of the entity under which this `Group` resides in the
   * Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source_id}`
   * for external- identity-mapped groups or `customers/{customer_id}` for Google Groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Output only. The time when the `Group` was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Additional entity key aliases for a Group.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityKey> getAdditionalGroupKeys() {
    return additionalGroupKeys;
  }

  /**
   * Additional entity key aliases for a Group.
   * @param additionalGroupKeys additionalGroupKeys or {@code null} for none
   */
  public Group setAdditionalGroupKeys(java.util.List<EntityKey> additionalGroupKeys) {
    this.additionalGroupKeys = additionalGroupKeys;
    return this;
  }

  /**
   * Output only. The time when the `Group` was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the `Group` was created.
   * @param createTime createTime or {@code null} for none
   */
  public Group setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * An extended description to help users determine the purpose of a `Group`. Must not be longer
   * than 4,096 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An extended description to help users determine the purpose of a `Group`. Must not be longer
   * than 4,096 characters.
   * @param description description or {@code null} for none
   */
  public Group setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The display name of the `Group`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the `Group`.
   * @param displayName displayName or {@code null} for none
   */
  public Group setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Dynamic group metadata like queries and status.
   * @return value or {@code null} for none
   */
  public DynamicGroupMetadata getDynamicGroupMetadata() {
    return dynamicGroupMetadata;
  }

  /**
   * Optional. Dynamic group metadata like queries and status.
   * @param dynamicGroupMetadata dynamicGroupMetadata or {@code null} for none
   */
  public Group setDynamicGroupMetadata(DynamicGroupMetadata dynamicGroupMetadata) {
    this.dynamicGroupMetadata = dynamicGroupMetadata;
    return this;
  }

  /**
   * Required. Immutable. The `EntityKey` of the `Group`.
   * @return value or {@code null} for none
   */
  public EntityKey getGroupKey() {
    return groupKey;
  }

  /**
   * Required. Immutable. The `EntityKey` of the `Group`.
   * @param groupKey groupKey or {@code null} for none
   */
  public Group setGroupKey(EntityKey groupKey) {
    this.groupKey = groupKey;
    return this;
  }

  /**
   * Required. One or more label entries that apply to the Group. Currently supported labels contain
   * a key with an empty value. Google Groups are the default type of group and have a label with a
   * key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing
   * Google Groups can have an additional label with a key of
   * `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an
   * immutable change and the security label cannot be removed once added.** Dynamic groups have a
   * label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for
   * Cloud Search have a label with a key of `system/groups/external` and an empty value. Examples:
   * {"cloudidentity.googleapis.com/groups.discussion_forum": ""} or {"system/groups/external": ""}.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Required. One or more label entries that apply to the Group. Currently supported labels contain
   * a key with an empty value. Google Groups are the default type of group and have a label with a
   * key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing
   * Google Groups can have an additional label with a key of
   * `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an
   * immutable change and the security label cannot be removed once added.** Dynamic groups have a
   * label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for
   * Cloud Search have a label with a key of `system/groups/external` and an empty value. Examples:
   * {"cloudidentity.googleapis.com/groups.discussion_forum": ""} or {"system/groups/external": ""}.
   * @param labels labels or {@code null} for none
   */
  public Group setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the
   * `Group`. Shall be of the form `groups/{group_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the
   * `Group`. Shall be of the form `groups/{group_id}`.
   * @param name name or {@code null} for none
   */
  public Group setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. The resource name of the entity under which this `Group` resides in the
   * Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source_id}`
   * for external- identity-mapped groups or `customers/{customer_id}` for Google Groups.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. Immutable. The resource name of the entity under which this `Group` resides in the
   * Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source_id}`
   * for external- identity-mapped groups or `customers/{customer_id}` for Google Groups.
   * @param parent parent or {@code null} for none
   */
  public Group setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Output only. The time when the `Group` was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the `Group` was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Group setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Group set(String fieldName, Object value) {
    return (Group) super.set(fieldName, value);
  }

  @Override
  public Group clone() {
    return (Group) super.clone();
  }

}
