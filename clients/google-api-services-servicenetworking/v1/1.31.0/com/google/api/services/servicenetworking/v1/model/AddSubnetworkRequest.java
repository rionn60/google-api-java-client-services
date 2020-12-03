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
 * Request to create a subnetwork in a previously peered service network.
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
public final class AddSubnetworkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. A resource that represents the service consumer, such as `projects/123456`. The
   * project number can be different from the value in the consumer network parameter. For example,
   * the network might be part of a Shared VPC network. In those cases, Service Networking validates
   * that this resource belongs to that Shared VPC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumer;

  /**
   * Required. The name of the service consumer's VPC network. The network must have an existing
   * private connection that was provisioned through the connections.create method. The name must be
   * in the following format: `projects/{project}/global/networks/{network}`, where {project} is a
   * project number, such as `12345`. {network} is the name of a VPC network in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerNetwork;

  /**
   * Optional. Description of the subnet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The prefix length of the subnet's IP address range. Use CIDR range notation, such as
   * `30` to provision a subnet with an `x.x.x.x/30` CIDR range. The IP address range is drawn from
   * a pool of available ranges in the service consumer's allocated range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ipPrefixLength;

  /**
   * Required. The name of a [region](/compute/docs/regions-zones) for the subnet, such `europe-
   * west1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Optional. The starting address of a range. The address must be a valid IPv4 address in the
   * x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the subnet.
   * The range must be within the allocated range that is assigned to the private connection. If the
   * CIDR range isn't available, the call fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestedAddress;

  /**
   * Optional. The name of one or more allocated IP address ranges associated with this private
   * service access connection. If no range names are provided all ranges associated with this
   * connection will be considered. If a CIDR range with the specified IP prefix length is not
   * available within these ranges, the call fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requestedRanges;

  /**
   * Optional. A list of secondary IP ranges to be created within the new subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SecondaryIpRangeSpec> secondaryIpRangeSpecs;

  /**
   * Required. A name for the new subnet. For information about the naming requirements, see
   * [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute API documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * A list of members that are granted the `compute.networkUser` role on the subnet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subnetworkUsers;

  /**
   * Required. A resource that represents the service consumer, such as `projects/123456`. The
   * project number can be different from the value in the consumer network parameter. For example,
   * the network might be part of a Shared VPC network. In those cases, Service Networking validates
   * that this resource belongs to that Shared VPC.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumer() {
    return consumer;
  }

  /**
   * Required. A resource that represents the service consumer, such as `projects/123456`. The
   * project number can be different from the value in the consumer network parameter. For example,
   * the network might be part of a Shared VPC network. In those cases, Service Networking validates
   * that this resource belongs to that Shared VPC.
   * @param consumer consumer or {@code null} for none
   */
  public AddSubnetworkRequest setConsumer(java.lang.String consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Required. The name of the service consumer's VPC network. The network must have an existing
   * private connection that was provisioned through the connections.create method. The name must be
   * in the following format: `projects/{project}/global/networks/{network}`, where {project} is a
   * project number, such as `12345`. {network} is the name of a VPC network in the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerNetwork() {
    return consumerNetwork;
  }

  /**
   * Required. The name of the service consumer's VPC network. The network must have an existing
   * private connection that was provisioned through the connections.create method. The name must be
   * in the following format: `projects/{project}/global/networks/{network}`, where {project} is a
   * project number, such as `12345`. {network} is the name of a VPC network in the project.
   * @param consumerNetwork consumerNetwork or {@code null} for none
   */
  public AddSubnetworkRequest setConsumerNetwork(java.lang.String consumerNetwork) {
    this.consumerNetwork = consumerNetwork;
    return this;
  }

  /**
   * Optional. Description of the subnet.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the subnet.
   * @param description description or {@code null} for none
   */
  public AddSubnetworkRequest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The prefix length of the subnet's IP address range. Use CIDR range notation, such as
   * `30` to provision a subnet with an `x.x.x.x/30` CIDR range. The IP address range is drawn from
   * a pool of available ranges in the service consumer's allocated range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIpPrefixLength() {
    return ipPrefixLength;
  }

  /**
   * Required. The prefix length of the subnet's IP address range. Use CIDR range notation, such as
   * `30` to provision a subnet with an `x.x.x.x/30` CIDR range. The IP address range is drawn from
   * a pool of available ranges in the service consumer's allocated range.
   * @param ipPrefixLength ipPrefixLength or {@code null} for none
   */
  public AddSubnetworkRequest setIpPrefixLength(java.lang.Integer ipPrefixLength) {
    this.ipPrefixLength = ipPrefixLength;
    return this;
  }

  /**
   * Required. The name of a [region](/compute/docs/regions-zones) for the subnet, such `europe-
   * west1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Required. The name of a [region](/compute/docs/regions-zones) for the subnet, such `europe-
   * west1`.
   * @param region region or {@code null} for none
   */
  public AddSubnetworkRequest setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Optional. The starting address of a range. The address must be a valid IPv4 address in the
   * x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the subnet.
   * The range must be within the allocated range that is assigned to the private connection. If the
   * CIDR range isn't available, the call fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestedAddress() {
    return requestedAddress;
  }

  /**
   * Optional. The starting address of a range. The address must be a valid IPv4 address in the
   * x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the subnet.
   * The range must be within the allocated range that is assigned to the private connection. If the
   * CIDR range isn't available, the call fails.
   * @param requestedAddress requestedAddress or {@code null} for none
   */
  public AddSubnetworkRequest setRequestedAddress(java.lang.String requestedAddress) {
    this.requestedAddress = requestedAddress;
    return this;
  }

  /**
   * Optional. The name of one or more allocated IP address ranges associated with this private
   * service access connection. If no range names are provided all ranges associated with this
   * connection will be considered. If a CIDR range with the specified IP prefix length is not
   * available within these ranges, the call fails.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequestedRanges() {
    return requestedRanges;
  }

  /**
   * Optional. The name of one or more allocated IP address ranges associated with this private
   * service access connection. If no range names are provided all ranges associated with this
   * connection will be considered. If a CIDR range with the specified IP prefix length is not
   * available within these ranges, the call fails.
   * @param requestedRanges requestedRanges or {@code null} for none
   */
  public AddSubnetworkRequest setRequestedRanges(java.util.List<java.lang.String> requestedRanges) {
    this.requestedRanges = requestedRanges;
    return this;
  }

  /**
   * Optional. A list of secondary IP ranges to be created within the new subnetwork.
   * @return value or {@code null} for none
   */
  public java.util.List<SecondaryIpRangeSpec> getSecondaryIpRangeSpecs() {
    return secondaryIpRangeSpecs;
  }

  /**
   * Optional. A list of secondary IP ranges to be created within the new subnetwork.
   * @param secondaryIpRangeSpecs secondaryIpRangeSpecs or {@code null} for none
   */
  public AddSubnetworkRequest setSecondaryIpRangeSpecs(java.util.List<SecondaryIpRangeSpec> secondaryIpRangeSpecs) {
    this.secondaryIpRangeSpecs = secondaryIpRangeSpecs;
    return this;
  }

  /**
   * Required. A name for the new subnet. For information about the naming requirements, see
   * [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute API documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Required. A name for the new subnet. For information about the naming requirements, see
   * [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute API documentation.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public AddSubnetworkRequest setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * A list of members that are granted the `compute.networkUser` role on the subnet.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubnetworkUsers() {
    return subnetworkUsers;
  }

  /**
   * A list of members that are granted the `compute.networkUser` role on the subnet.
   * @param subnetworkUsers subnetworkUsers or {@code null} for none
   */
  public AddSubnetworkRequest setSubnetworkUsers(java.util.List<java.lang.String> subnetworkUsers) {
    this.subnetworkUsers = subnetworkUsers;
    return this;
  }

  @Override
  public AddSubnetworkRequest set(String fieldName, Object value) {
    return (AddSubnetworkRequest) super.set(fieldName, value);
  }

  @Override
  public AddSubnetworkRequest clone() {
    return (AddSubnetworkRequest) super.clone();
  }

}
