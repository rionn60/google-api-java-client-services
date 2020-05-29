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

package com.google.api.services.fitness.model;

/**
 * In case of multi-dimensional data (such as an accelerometer with x, y, and z axes) each field
 * represents one dimension. Each data type field has a unique name which identifies it. The field
 * also defines the format of the data (int, float, etc.).
 *
 * This message is only instantiated in code and not used for wire comms or stored in any way.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataTypeField extends com.google.api.client.json.GenericJson {

  /**
   * The different supported formats for each field in a data type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Defines the name and format of data. Unlike data type names, field names are not namespaced,
   * and only need to be unique within the data type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean optional;

  /**
   * The different supported formats for each field in a data type.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The different supported formats for each field in a data type.
   * @param format format or {@code null} for none
   */
  public DataTypeField setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Defines the name and format of data. Unlike data type names, field names are not namespaced,
   * and only need to be unique within the data type.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Defines the name and format of data. Unlike data type names, field names are not namespaced,
   * and only need to be unique within the data type.
   * @param name name or {@code null} for none
   */
  public DataTypeField setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOptional() {
    return optional;
  }

  /**
   * @param optional optional or {@code null} for none
   */
  public DataTypeField setOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return this;
  }

  @Override
  public DataTypeField set(String fieldName, Object value) {
    return (DataTypeField) super.set(fieldName, value);
  }

  @Override
  public DataTypeField clone() {
    return (DataTypeField) super.clone();
  }

}
