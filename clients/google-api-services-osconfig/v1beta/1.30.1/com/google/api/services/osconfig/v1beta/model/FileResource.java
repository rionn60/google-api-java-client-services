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
 * A resource that manages the state of a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileResource extends com.google.api.client.json.GenericJson {

  /**
   * A a file with this content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * A remote or local source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private File file;

  /**
   * The absolute path of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755.
   *
   * Below are some examples of permissions and their associated values: read, write, and execute: 7
   * read and execute: 5 read and write: 6 read only: 4
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissions;

  /**
   * Desired state of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A a file with this content.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * A a file with this content.
   * @param content content or {@code null} for none
   */
  public FileResource setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * A remote or local source.
   * @return value or {@code null} for none
   */
  public File getFile() {
    return file;
  }

  /**
   * A remote or local source.
   * @param file file or {@code null} for none
   */
  public FileResource setFile(File file) {
    this.file = file;
    return this;
  }

  /**
   * The absolute path of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The absolute path of the file.
   * @param path path or {@code null} for none
   */
  public FileResource setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755.
   *
   * Below are some examples of permissions and their associated values: read, write, and execute: 7
   * read and execute: 5 read and write: 6 read only: 4
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissions() {
    return permissions;
  }

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755.
   *
   * Below are some examples of permissions and their associated values: read, write, and execute: 7
   * read and execute: 5 read and write: 6 read only: 4
   * @param permissions permissions or {@code null} for none
   */
  public FileResource setPermissions(java.lang.String permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Desired state of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Desired state of the file.
   * @param state state or {@code null} for none
   */
  public FileResource setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public FileResource set(String fieldName, Object value) {
    return (FileResource) super.set(fieldName, value);
  }

  @Override
  public FileResource clone() {
    return (FileResource) super.clone();
  }

}
