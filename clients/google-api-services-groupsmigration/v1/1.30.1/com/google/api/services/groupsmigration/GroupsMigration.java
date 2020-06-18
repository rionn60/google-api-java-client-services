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

package com.google.api.services.groupsmigration;

/**
 * Service definition for GroupsMigration (v1).
 *
 * <p>
 * The Groups Migration API allows domain administrators to archive
    emails into Google groups.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/google-apps/groups-migration/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link GroupsMigrationRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class GroupsMigration extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.9 of the Groups Migration API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/groupsmigration/v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public GroupsMigration(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  GroupsMigration(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Archive collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code GroupsMigration groupsmigration = new GroupsMigration(...);}
   *   {@code GroupsMigration.Archive.List request = groupsmigration.archive().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Archive archive() {
    return new Archive();
  }

  /**
   * The "archive" collection of methods.
   */
  public class Archive {

    /**
     * Inserts a new mail into the archive of the Google group.
     *
     * Create a request for the method "archive.insert".
     *
     * This request holds the parameters needed by the groupsmigration server.  After setting any
     * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param groupId The group ID
     * @return the request
     */
    public Insert insert(java.lang.String groupId) throws java.io.IOException {
      Insert result = new Insert(groupId);
      initialize(result);
      return result;
    }

    /**
     * Inserts a new mail into the archive of the Google group.
     *
     * Create a request for the method "archive.insert".
     *
     * This request holds the parameters needed by the the groupsmigration server.  After setting any
     * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * <p>
     * This method should be used for uploading media content.
     * </p>
     *
     * @param groupId The group ID
     * @param mediaContent The media HTTP content or {@code null} if none.
     * @return the request
     * @throws java.io.IOException if the initialization of the request fails
     */
    public Insert insert(java.lang.String groupId, com.google.api.client.http.AbstractInputStreamContent mediaContent) throws java.io.IOException {
      Insert result = new Insert(groupId, mediaContent);
      initialize(result);
      return result;
    }

    public class Insert extends GroupsMigrationRequest<com.google.api.services.groupsmigration.model.Groups> {

      private static final String REST_PATH = "groups/v1/groups/{groupId}/archive";

      /**
       * Inserts a new mail into the archive of the Google group.
       *
       * Create a request for the method "archive.insert".
       *
       * This request holds the parameters needed by the the groupsmigration server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param groupId The group ID
       * @since 1.13
       */
      protected Insert(java.lang.String groupId) {
        super(GroupsMigration.this, "POST", REST_PATH, null, com.google.api.services.groupsmigration.model.Groups.class);
        this.groupId = com.google.api.client.util.Preconditions.checkNotNull(groupId, "Required parameter groupId must be specified.");
      }

      /**
       * Inserts a new mail into the archive of the Google group.
       *
       * Create a request for the method "archive.insert".
       *
       * This request holds the parameters needed by the the groupsmigration server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * <p>
       * This constructor should be used for uploading media content.
       * </p>
       *
       * @param groupId The group ID
       * @param mediaContent The media HTTP content or {@code null} if none.
       * @since 1.13
       */
      protected Insert(java.lang.String groupId, com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        super(GroupsMigration.this, "POST", "/upload/" + getServicePath() + REST_PATH, null, com.google.api.services.groupsmigration.model.Groups.class);
        this.groupId = com.google.api.client.util.Preconditions.checkNotNull(groupId, "Required parameter groupId must be specified.");
        initializeMediaUpload(mediaContent);
      }

      @Override
      public Insert set$Xgafv(java.lang.String $Xgafv) {
        return (Insert) super.set$Xgafv($Xgafv);
      }

      @Override
      public Insert setAccessToken(java.lang.String accessToken) {
        return (Insert) super.setAccessToken(accessToken);
      }

      @Override
      public Insert setAlt(java.lang.String alt) {
        return (Insert) super.setAlt(alt);
      }

      @Override
      public Insert setCallback(java.lang.String callback) {
        return (Insert) super.setCallback(callback);
      }

      @Override
      public Insert setFields(java.lang.String fields) {
        return (Insert) super.setFields(fields);
      }

      @Override
      public Insert setKey(java.lang.String key) {
        return (Insert) super.setKey(key);
      }

      @Override
      public Insert setOauthToken(java.lang.String oauthToken) {
        return (Insert) super.setOauthToken(oauthToken);
      }

      @Override
      public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Insert) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insert setQuotaUser(java.lang.String quotaUser) {
        return (Insert) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insert setUploadType(java.lang.String uploadType) {
        return (Insert) super.setUploadType(uploadType);
      }

      @Override
      public Insert setUploadProtocol(java.lang.String uploadProtocol) {
        return (Insert) super.setUploadProtocol(uploadProtocol);
      }

      /** The group ID */
      @com.google.api.client.util.Key
      private java.lang.String groupId;

      /** The group ID
       */
      public java.lang.String getGroupId() {
        return groupId;
      }

      /** The group ID */
      public Insert setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
        return this;
      }

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link GroupsMigration}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link GroupsMigration}. */
    @Override
    public GroupsMigration build() {
      return new GroupsMigration(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link GroupsMigrationRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setGroupsMigrationRequestInitializer(
        GroupsMigrationRequestInitializer groupsmigrationRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(groupsmigrationRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
