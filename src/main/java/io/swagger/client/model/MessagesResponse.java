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
import io.swagger.client.model.MessagesResponseMessages;
import java.io.IOException;

/**
 * MessagesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-23T20:36:29.911+01:00")
public class MessagesResponse {
  @SerializedName("messages")
  private MessagesResponseMessages messages = null;

  public MessagesResponse messages(MessagesResponseMessages messages) {
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")
  public MessagesResponseMessages getMessages() {
    return messages;
  }

  public void setMessages(MessagesResponseMessages messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagesResponse messagesResponse = (MessagesResponse) o;
    return Objects.equals(this.messages, messagesResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagesResponse {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

