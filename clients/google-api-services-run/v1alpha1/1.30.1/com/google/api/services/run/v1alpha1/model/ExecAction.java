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

package com.google.api.services.run.v1alpha1.model;

/**
 * ExecAction describes a "run in container" action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecAction extends com.google.api.client.json.GenericJson {

  /**
   * Command is the command line to execute inside the container, the working directory for the
   * command is root ('/') in the container's filesystem. The command is simply exec'd, it is not
   * run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell,
   * you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and
   * non-zero is unhealthy. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String command;

  /**
   * Command is the command line to execute inside the container, the working directory for the
   * command is root ('/') in the container's filesystem. The command is simply exec'd, it is not
   * run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell,
   * you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and
   * non-zero is unhealthy. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getCommand() {
    return command;
  }

  /**
   * Command is the command line to execute inside the container, the working directory for the
   * command is root ('/') in the container's filesystem. The command is simply exec'd, it is not
   * run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell,
   * you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and
   * non-zero is unhealthy. +optional
   * @param command command or {@code null} for none
   */
  public ExecAction setCommand(java.lang.String command) {
    this.command = command;
    return this;
  }

  @Override
  public ExecAction set(String fieldName, Object value) {
    return (ExecAction) super.set(fieldName, value);
  }

  @Override
  public ExecAction clone() {
    return (ExecAction) super.clone();
  }

}
