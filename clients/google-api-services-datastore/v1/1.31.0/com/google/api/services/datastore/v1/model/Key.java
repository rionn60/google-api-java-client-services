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

package com.google.api.services.datastore.v1.model;

/**
 * A unique identifier for an entity. If a key's partition ID or any of its path kinds or names are
 * reserved/read-only, the key is reserved/read-only. A reserved/read-only key is forbidden in
 * certain documented contexts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Key extends com.google.api.client.json.GenericJson {

  /**
   * Entities are partitioned into subsets, currently identified by a project ID and namespace ID.
   * Queries are scoped to a single partition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PartitionId partitionId;

  /**
   * The entity path. An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first element identifies a _root
   * entity_, the second element identifies a _child_ of the root entity, the third element
   * identifies a child of the second entity, and so forth. The entities identified by all prefixes
   * of the path are called the element's _ancestors_. An entity path is always fully complete:
   * *all* of the entity's ancestors are required to be in the path along with the entity identifier
   * itself. The only exception is that in some documented cases, the identifier in the last path
   * element (for the entity) itself may be omitted. For example, the last path element of the key
   * of `Mutation.insert` may have no identifier. A path can never be empty, and a path can have at
   * most 100 elements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PathElement> path;

  /**
   * Entities are partitioned into subsets, currently identified by a project ID and namespace ID.
   * Queries are scoped to a single partition.
   * @return value or {@code null} for none
   */
  public PartitionId getPartitionId() {
    return partitionId;
  }

  /**
   * Entities are partitioned into subsets, currently identified by a project ID and namespace ID.
   * Queries are scoped to a single partition.
   * @param partitionId partitionId or {@code null} for none
   */
  public Key setPartitionId(PartitionId partitionId) {
    this.partitionId = partitionId;
    return this;
  }

  /**
   * The entity path. An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first element identifies a _root
   * entity_, the second element identifies a _child_ of the root entity, the third element
   * identifies a child of the second entity, and so forth. The entities identified by all prefixes
   * of the path are called the element's _ancestors_. An entity path is always fully complete:
   * *all* of the entity's ancestors are required to be in the path along with the entity identifier
   * itself. The only exception is that in some documented cases, the identifier in the last path
   * element (for the entity) itself may be omitted. For example, the last path element of the key
   * of `Mutation.insert` may have no identifier. A path can never be empty, and a path can have at
   * most 100 elements.
   * @return value or {@code null} for none
   */
  public java.util.List<PathElement> getPath() {
    return path;
  }

  /**
   * The entity path. An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first element identifies a _root
   * entity_, the second element identifies a _child_ of the root entity, the third element
   * identifies a child of the second entity, and so forth. The entities identified by all prefixes
   * of the path are called the element's _ancestors_. An entity path is always fully complete:
   * *all* of the entity's ancestors are required to be in the path along with the entity identifier
   * itself. The only exception is that in some documented cases, the identifier in the last path
   * element (for the entity) itself may be omitted. For example, the last path element of the key
   * of `Mutation.insert` may have no identifier. A path can never be empty, and a path can have at
   * most 100 elements.
   * @param path path or {@code null} for none
   */
  public Key setPath(java.util.List<PathElement> path) {
    this.path = path;
    return this;
  }

  @Override
  public Key set(String fieldName, Object value) {
    return (Key) super.set(fieldName, value);
  }

  @Override
  public Key clone() {
    return (Key) super.clone();
  }

}
