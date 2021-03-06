/*
 * The SMS Works API
 * The SMS Works provides a low-cost, reliable SMS API for developers. Pay only for delivered texts, all failed messages are refunded.
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
import io.swagger.client.model.MessageMetadata;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SMS message object
 */
@ApiModel(description = "SMS message object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-13T15:06:56.412+01:00")
public class Message {
  @SerializedName("sender")
  private String sender = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("ttl")
  private BigDecimal ttl = null;

  @SerializedName("metadata")
  private MessageMetadata metadata = null;

  public Message sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * The sender of the message. Should be no longer than 11 characters for alphanumeric or 15 characters for numeric sender ID&#39;s. No spaces or special characters.
   * @return sender
  **/
  @ApiModelProperty(example = "YourCompany", required = true, value = "The sender of the message. Should be no longer than 11 characters for alphanumeric or 15 characters for numeric sender ID's. No spaces or special characters.")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public Message destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Telephone number of the recipient
   * @return destination
  **/
  @ApiModelProperty(example = "447777777777", required = true, value = "Telephone number of the recipient")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Message content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Message to send to the recipient. Content can be up to 640 characters in length. You will be charged 1 credit for each 160 characters, up to a maximum of 4 credits. Messages sent to numbers registered outside the UK will be charged double credits (i.e. 2 credits per 160 characters, up to maximum of 8 credits).
   * @return content
  **/
  @ApiModelProperty(example = "Your super awesome message", required = true, value = "Message to send to the recipient. Content can be up to 640 characters in length. You will be charged 1 credit for each 160 characters, up to a maximum of 4 credits. Messages sent to numbers registered outside the UK will be charged double credits (i.e. 2 credits per 160 characters, up to maximum of 8 credits).")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Message schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Date at which to send the message. This is only used by the message/schedule service and can be left empty for other services.
   * @return schedule
  **/
  @ApiModelProperty(example = "Sun Sep 03 2017 15:34:23 GMT+0100 (BST)", required = true, value = "Date at which to send the message. This is only used by the message/schedule service and can be left empty for other services.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public Message tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * An identifying label for the message, which you can use to filter and report on messages you&#39;ve sent later. Ideal for campaigns.
   * @return tag
  **/
  @ApiModelProperty(example = "SummerSpecial", value = "An identifying label for the message, which you can use to filter and report on messages you've sent later. Ideal for campaigns.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Message ttl(BigDecimal ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * The number of minutes before the message is deleted. Optional. Omit to prevent delivery report deletion.
   * @return ttl
  **/
  @ApiModelProperty(example = "10.0", value = "The number of minutes before the message is deleted. Optional. Omit to prevent delivery report deletion.")
  public BigDecimal getTtl() {
    return ttl;
  }

  public void setTtl(BigDecimal ttl) {
    this.ttl = ttl;
  }

  public Message metadata(MessageMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public MessageMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(MessageMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.sender, message.sender) &&
        Objects.equals(this.destination, message.destination) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.schedule, message.schedule) &&
        Objects.equals(this.tag, message.tag) &&
        Objects.equals(this.ttl, message.ttl) &&
        Objects.equals(this.metadata, message.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, destination, content, schedule, tag, ttl, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

