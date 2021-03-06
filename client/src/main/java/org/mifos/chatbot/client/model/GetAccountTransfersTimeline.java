/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetAccountTransfersTimeline
 */

public class GetAccountTransfersTimeline {
  @SerializedName("submittedOnDate")
  private LocalDate submittedOnDate = null;

  @SerializedName("submittedByUsername")
  private String submittedByUsername = null;

  @SerializedName("submittedByFirstname")
  private String submittedByFirstname = null;

  @SerializedName("submittedByLastname")
  private String submittedByLastname = null;

  @SerializedName("activatedOnDate")
  private LocalDate activatedOnDate = null;

  @SerializedName("activatedByUsername")
  private String activatedByUsername = null;

  @SerializedName("activatedByFirstname")
  private String activatedByFirstname = null;

  @SerializedName("activatedByLastname")
  private String activatedByLastname = null;

  public GetAccountTransfersTimeline submittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @ApiModelProperty(example = "[2012, 2, 1]", value = "")
  public LocalDate getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }

  public GetAccountTransfersTimeline submittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
    return this;
  }

   /**
   * Get submittedByUsername
   * @return submittedByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getSubmittedByUsername() {
    return submittedByUsername;
  }

  public void setSubmittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
  }

  public GetAccountTransfersTimeline submittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
    return this;
  }

   /**
   * Get submittedByFirstname
   * @return submittedByFirstname
  **/
  @ApiModelProperty(example = "App", value = "")
  public String getSubmittedByFirstname() {
    return submittedByFirstname;
  }

  public void setSubmittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
  }

  public GetAccountTransfersTimeline submittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
    return this;
  }

   /**
   * Get submittedByLastname
   * @return submittedByLastname
  **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getSubmittedByLastname() {
    return submittedByLastname;
  }

  public void setSubmittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
  }

  public GetAccountTransfersTimeline activatedOnDate(LocalDate activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
    return this;
  }

   /**
   * Get activatedOnDate
   * @return activatedOnDate
  **/
  @ApiModelProperty(example = "[2012, 2, 1]", value = "")
  public LocalDate getActivatedOnDate() {
    return activatedOnDate;
  }

  public void setActivatedOnDate(LocalDate activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
  }

  public GetAccountTransfersTimeline activatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
    return this;
  }

   /**
   * Get activatedByUsername
   * @return activatedByUsername
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getActivatedByUsername() {
    return activatedByUsername;
  }

  public void setActivatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
  }

  public GetAccountTransfersTimeline activatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
    return this;
  }

   /**
   * Get activatedByFirstname
   * @return activatedByFirstname
  **/
  @ApiModelProperty(example = "App", value = "")
  public String getActivatedByFirstname() {
    return activatedByFirstname;
  }

  public void setActivatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
  }

  public GetAccountTransfersTimeline activatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
    return this;
  }

   /**
   * Get activatedByLastname
   * @return activatedByLastname
  **/
  @ApiModelProperty(example = "Administrator", value = "")
  public String getActivatedByLastname() {
    return activatedByLastname;
  }

  public void setActivatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTimeline getAccountTransfersTimeline = (GetAccountTransfersTimeline) o;
    return Objects.equals(this.submittedOnDate, getAccountTransfersTimeline.submittedOnDate) &&
        Objects.equals(this.submittedByUsername, getAccountTransfersTimeline.submittedByUsername) &&
        Objects.equals(this.submittedByFirstname, getAccountTransfersTimeline.submittedByFirstname) &&
        Objects.equals(this.submittedByLastname, getAccountTransfersTimeline.submittedByLastname) &&
        Objects.equals(this.activatedOnDate, getAccountTransfersTimeline.activatedOnDate) &&
        Objects.equals(this.activatedByUsername, getAccountTransfersTimeline.activatedByUsername) &&
        Objects.equals(this.activatedByFirstname, getAccountTransfersTimeline.activatedByFirstname) &&
        Objects.equals(this.activatedByLastname, getAccountTransfersTimeline.activatedByLastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname, activatedOnDate, activatedByUsername, activatedByFirstname, activatedByLastname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTimeline {\n");
    
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
    sb.append("    activatedOnDate: ").append(toIndentedString(activatedOnDate)).append("\n");
    sb.append("    activatedByUsername: ").append(toIndentedString(activatedByUsername)).append("\n");
    sb.append("    activatedByFirstname: ").append(toIndentedString(activatedByFirstname)).append("\n");
    sb.append("    activatedByLastname: ").append(toIndentedString(activatedByLastname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

