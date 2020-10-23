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

package com.google.api.services.servicenetworking.v1.model;

/**
 * Model definition for SecondaryIpRangeSpec.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecondaryIpRangeSpec extends com.google.api.client.json.GenericJson {

  /**
   * Required. The prefix length of the secondary IP range. Use CIDR range notation, such as `30` to
   * provision a secondary IP range with an `x.x.x.x/30` CIDR range. The IP address range is drawn
   * from a pool of available ranges in the service consumer's allocated range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ipPrefixLength;

  /**
   * Required. A name for the secondary IP range. The name must be 1-63 characters long, and comply
   * with RFC1035. The name must be unique within the subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rangeName;

  /**
   * Optional. The starting address of a range. The address must be a valid IPv4 address in the
   * x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the
   * secondary IP range. The range must be within the allocated range that is assigned to the
   * private connection. If the CIDR range isn't available, the call fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestedAddress;

  /**
   * Required. The prefix length of the secondary IP range. Use CIDR range notation, such as `30` to
   * provision a secondary IP range with an `x.x.x.x/30` CIDR range. The IP address range is drawn
   * from a pool of available ranges in the service consumer's allocated range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIpPrefixLength() {
    return ipPrefixLength;
  }

  /**
   * Required. The prefix length of the secondary IP range. Use CIDR range notation, such as `30` to
   * provision a secondary IP range with an `x.x.x.x/30` CIDR range. The IP address range is drawn
   * from a pool of available ranges in the service consumer's allocated range.
   * @param ipPrefixLength ipPrefixLength or {@code null} for none
   */
  public SecondaryIpRangeSpec setIpPrefixLength(java.lang.Integer ipPrefixLength) {
    this.ipPrefixLength = ipPrefixLength;
    return this;
  }

  /**
   * Required. A name for the secondary IP range. The name must be 1-63 characters long, and comply
   * with RFC1035. The name must be unique within the subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getRangeName() {
    return rangeName;
  }

  /**
   * Required. A name for the secondary IP range. The name must be 1-63 characters long, and comply
   * with RFC1035. The name must be unique within the subnetwork.
   * @param rangeName rangeName or {@code null} for none
   */
  public SecondaryIpRangeSpec setRangeName(java.lang.String rangeName) {
    this.rangeName = rangeName;
    return this;
  }

  /**
   * Optional. The starting address of a range. The address must be a valid IPv4 address in the
   * x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the
   * secondary IP range. The range must be within the allocated range that is assigned to the
   * private connection. If the CIDR range isn't available, the call fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestedAddress() {
    return requestedAddress;
  }

  /**
   * Optional. The starting address of a range. The address must be a valid IPv4 address in the
   * x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the
   * secondary IP range. The range must be within the allocated range that is assigned to the
   * private connection. If the CIDR range isn't available, the call fails.
   * @param requestedAddress requestedAddress or {@code null} for none
   */
  public SecondaryIpRangeSpec setRequestedAddress(java.lang.String requestedAddress) {
    this.requestedAddress = requestedAddress;
    return this;
  }

  @Override
  public SecondaryIpRangeSpec set(String fieldName, Object value) {
    return (SecondaryIpRangeSpec) super.set(fieldName, value);
  }

  @Override
  public SecondaryIpRangeSpec clone() {
    return (SecondaryIpRangeSpec) super.clone();
  }

}
