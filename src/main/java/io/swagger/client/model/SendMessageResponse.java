/*
 * The SMS Works API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SendMessageResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-23T20:36:29.911+01:00")
public class SendMessageResponse {
  @SerializedName("messageid")
  private String messageid = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("credits")
  private Integer credits = null;

  public SendMessageResponse messageid(String messageid) {
    this.messageid = messageid;
    return this;
  }

   /**
   * Get messageid
   * @return messageid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessageid() {
    return messageid;
  }

  public void setMessageid(String messageid) {
    this.messageid = messageid;
  }

  public SendMessageResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SendMessageResponse credits(Integer credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCredits() {
    return credits;
  }

  public void setCredits(Integer credits) {
    this.credits = credits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageResponse sendMessageResponse = (SendMessageResponse) o;
    return Objects.equals(this.messageid, sendMessageResponse.messageid) &&
        Objects.equals(this.status, sendMessageResponse.status) &&
        Objects.equals(this.credits, sendMessageResponse.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageid, status, credits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageResponse {\n");
    
    sb.append("    messageid: ").append(toIndentedString(messageid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

