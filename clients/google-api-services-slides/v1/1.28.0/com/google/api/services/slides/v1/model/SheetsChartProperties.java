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

package com.google.api.services.slides.v1.model;

/**
 * The properties of the SheetsChart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SheetsChartProperties extends com.google.api.client.json.GenericJson {

  /**
   * The properties of the embedded chart image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageProperties chartImageProperties;

  /**
   * The properties of the embedded chart image.
   * @return value or {@code null} for none
   */
  public ImageProperties getChartImageProperties() {
    return chartImageProperties;
  }

  /**
   * The properties of the embedded chart image.
   * @param chartImageProperties chartImageProperties or {@code null} for none
   */
  public SheetsChartProperties setChartImageProperties(ImageProperties chartImageProperties) {
    this.chartImageProperties = chartImageProperties;
    return this;
  }

  @Override
  public SheetsChartProperties set(String fieldName, Object value) {
    return (SheetsChartProperties) super.set(fieldName, value);
  }

  @Override
  public SheetsChartProperties clone() {
    return (SheetsChartProperties) super.clone();
  }

}
