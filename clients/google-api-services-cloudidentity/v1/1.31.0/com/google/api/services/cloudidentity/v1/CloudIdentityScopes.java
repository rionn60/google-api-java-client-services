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

package com.google.api.services.cloudidentity.v1;

/**
 * Available OAuth 2.0 scopes for use with the Cloud Identity API.
 *
 * @since 1.4
 */
public class CloudIdentityScopes {

  /** See your device details. */
  public static final String CLOUD_IDENTITY_DEVICES_LOOKUP = "https://www.googleapis.com/auth/cloud-identity.devices.lookup";

  /** See, change, create, and delete any of the Cloud Identity Groups that you can access, including the members of each group. */
  public static final String CLOUD_IDENTITY_GROUPS = "https://www.googleapis.com/auth/cloud-identity.groups";

  /** See any Cloud Identity Groups that you can access, including group members and their emails. */
  public static final String CLOUD_IDENTITY_GROUPS_READONLY = "https://www.googleapis.com/auth/cloud-identity.groups.readonly";

  /** View and manage your data across Google Cloud Platform services. */
  public static final String CLOUD_PLATFORM = "https://www.googleapis.com/auth/cloud-platform";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(CLOUD_IDENTITY_DEVICES_LOOKUP);
    set.add(CLOUD_IDENTITY_GROUPS);
    set.add(CLOUD_IDENTITY_GROUPS_READONLY);
    set.add(CLOUD_PLATFORM);
    return java.util.Collections.unmodifiableSet(set);
  }

  private CloudIdentityScopes() {
  }
}
