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
 * BatchMessageResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-23T20:36:29.911+01:00")
public class BatchMessageResponse {
  @SerializedName("batchid")
  private String batchid = null;

  @SerializedName("status")
  private String status = null;

  public BatchMessageResponse batchid(String batchid) {
    this.batchid = batchid;
    return this;
  }

   /**
   * Get batchid
   * @return batchid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBatchid() {
    return batchid;
  }

  public void setBatchid(String batchid) {
    this.batchid = batchid;
  }

  public BatchMessageResponse status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchMessageResponse batchMessageResponse = (BatchMessageResponse) o;
    return Objects.equals(this.batchid, batchMessageResponse.batchid) &&
        Objects.equals(this.status, batchMessageResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchid, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchMessageResponse {\n");
    
    sb.append("    batchid: ").append(toIndentedString(batchid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

