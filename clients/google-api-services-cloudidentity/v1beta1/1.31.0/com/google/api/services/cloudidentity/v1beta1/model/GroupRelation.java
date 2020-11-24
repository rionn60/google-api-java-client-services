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
 * Message representing a transitive group of a user or a group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupRelation extends com.google.api.client.json.GenericJson {

  /**
   * Display name for this group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Resource name for this group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String group;

  /**
   * Entity key has an id and a namespace. In case of discussion forums, the id will be an email
   * address without a namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntityKey groupKey;

  /**
   * Labels for Group resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The relation between the member and the transitive group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relationType;

  /**
   * Membership roles of the member for the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TransitiveMembershipRole> roles;

  /**
   * Display name for this group.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name for this group.
   * @param displayName displayName or {@code null} for none
   */
  public GroupRelation setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Resource name for this group.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroup() {
    return group;
  }

  /**
   * Resource name for this group.
   * @param group group or {@code null} for none
   */
  public GroupRelation setGroup(java.lang.String group) {
    this.group = group;
    return this;
  }

  /**
   * Entity key has an id and a namespace. In case of discussion forums, the id will be an email
   * address without a namespace.
   * @return value or {@code null} for none
   */
  public EntityKey getGroupKey() {
    return groupKey;
  }

  /**
   * Entity key has an id and a namespace. In case of discussion forums, the id will be an email
   * address without a namespace.
   * @param groupKey groupKey or {@code null} for none
   */
  public GroupRelation setGroupKey(EntityKey groupKey) {
    this.groupKey = groupKey;
    return this;
  }

  /**
   * Labels for Group resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels for Group resource.
   * @param labels labels or {@code null} for none
   */
  public GroupRelation setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The relation between the member and the transitive group.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelationType() {
    return relationType;
  }

  /**
   * The relation between the member and the transitive group.
   * @param relationType relationType or {@code null} for none
   */
  public GroupRelation setRelationType(java.lang.String relationType) {
    this.relationType = relationType;
    return this;
  }

  /**
   * Membership roles of the member for the group.
   * @return value or {@code null} for none
   */
  public java.util.List<TransitiveMembershipRole> getRoles() {
    return roles;
  }

  /**
   * Membership roles of the member for the group.
   * @param roles roles or {@code null} for none
   */
  public GroupRelation setRoles(java.util.List<TransitiveMembershipRole> roles) {
    this.roles = roles;
    return this;
  }

  @Override
  public GroupRelation set(String fieldName, Object value) {
    return (GroupRelation) super.set(fieldName, value);
  }

  @Override
  public GroupRelation clone() {
    return (GroupRelation) super.clone();
  }

}
