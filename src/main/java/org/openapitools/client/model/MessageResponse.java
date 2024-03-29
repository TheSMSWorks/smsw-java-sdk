/*
 * The SMS Works API
 * The SMS Works provides a low-cost, reliable SMS API for developers. Pay only for delivered texts, all failed UK messages are refunded.
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: support@thesmsworks.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.MessageResponseFailurereason;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T11:27:24.989260Z[Europe/London]")
public class MessageResponse {
  public static final String SERIALIZED_NAME_BATCHID = "batchid";
  @SerializedName(SERIALIZED_NAME_BATCHID)
  private String batchid;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_CUSTOMERID = "customerid";
  @SerializedName(SERIALIZED_NAME_CUSTOMERID)
  private String customerid;

  public static final String SERIALIZED_NAME_DELIVERYREPORTURL = "deliveryreporturl";
  @SerializedName(SERIALIZED_NAME_DELIVERYREPORTURL)
  private String deliveryreporturl;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private BigDecimal destination;

  public static final String SERIALIZED_NAME_FAILUREREASON = "failurereason";
  @SerializedName(SERIALIZED_NAME_FAILUREREASON)
  private MessageResponseFailurereason failurereason;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_MESSAGEID = "messageid";
  @SerializedName(SERIALIZED_NAME_MESSAGEID)
  private String messageid;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public MessageResponse() {
  }

  public MessageResponse batchid(String batchid) {
    
    this.batchid = batchid;
    return this;
  }

   /**
   * Get batchid
   * @return batchid
  **/
  @javax.annotation.Nullable
  public String getBatchid() {
    return batchid;
  }


  public void setBatchid(String batchid) {
    this.batchid = batchid;
  }


  public MessageResponse content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public MessageResponse created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public MessageResponse customerid(String customerid) {
    
    this.customerid = customerid;
    return this;
  }

   /**
   * Get customerid
   * @return customerid
  **/
  @javax.annotation.Nonnull
  public String getCustomerid() {
    return customerid;
  }


  public void setCustomerid(String customerid) {
    this.customerid = customerid;
  }


  public MessageResponse deliveryreporturl(String deliveryreporturl) {
    
    this.deliveryreporturl = deliveryreporturl;
    return this;
  }

   /**
   * Get deliveryreporturl
   * @return deliveryreporturl
  **/
  @javax.annotation.Nullable
  public String getDeliveryreporturl() {
    return deliveryreporturl;
  }


  public void setDeliveryreporturl(String deliveryreporturl) {
    this.deliveryreporturl = deliveryreporturl;
  }


  public MessageResponse destination(BigDecimal destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDestination() {
    return destination;
  }


  public void setDestination(BigDecimal destination) {
    this.destination = destination;
  }


  public MessageResponse failurereason(MessageResponseFailurereason failurereason) {
    
    this.failurereason = failurereason;
    return this;
  }

   /**
   * Get failurereason
   * @return failurereason
  **/
  @javax.annotation.Nullable
  public MessageResponseFailurereason getFailurereason() {
    return failurereason;
  }


  public void setFailurereason(MessageResponseFailurereason failurereason) {
    this.failurereason = failurereason;
  }


  public MessageResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MessageResponse identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public MessageResponse keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }


  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public MessageResponse messageid(String messageid) {
    
    this.messageid = messageid;
    return this;
  }

   /**
   * Get messageid
   * @return messageid
  **/
  @javax.annotation.Nonnull
  public String getMessageid() {
    return messageid;
  }


  public void setMessageid(String messageid) {
    this.messageid = messageid;
  }


  public MessageResponse modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nonnull
  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public MessageResponse schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nonnull
  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public MessageResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public MessageResponse sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nonnull
  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public MessageResponse tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nonnull
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.batchid, messageResponse.batchid) &&
        Objects.equals(this.content, messageResponse.content) &&
        Objects.equals(this.created, messageResponse.created) &&
        Objects.equals(this.customerid, messageResponse.customerid) &&
        Objects.equals(this.deliveryreporturl, messageResponse.deliveryreporturl) &&
        Objects.equals(this.destination, messageResponse.destination) &&
        Objects.equals(this.failurereason, messageResponse.failurereason) &&
        Objects.equals(this.id, messageResponse.id) &&
        Objects.equals(this.identifier, messageResponse.identifier) &&
        Objects.equals(this.keyword, messageResponse.keyword) &&
        Objects.equals(this.messageid, messageResponse.messageid) &&
        Objects.equals(this.modified, messageResponse.modified) &&
        Objects.equals(this.schedule, messageResponse.schedule) &&
        Objects.equals(this.status, messageResponse.status) &&
        Objects.equals(this.sender, messageResponse.sender) &&
        Objects.equals(this.tag, messageResponse.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchid, content, created, customerid, deliveryreporturl, destination, failurereason, id, identifier, keyword, messageid, modified, schedule, status, sender, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    sb.append("    batchid: ").append(toIndentedString(batchid)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customerid: ").append(toIndentedString(customerid)).append("\n");
    sb.append("    deliveryreporturl: ").append(toIndentedString(deliveryreporturl)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    failurereason: ").append(toIndentedString(failurereason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    messageid: ").append(toIndentedString(messageid)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("batchid");
    openapiFields.add("content");
    openapiFields.add("created");
    openapiFields.add("customerid");
    openapiFields.add("deliveryreporturl");
    openapiFields.add("destination");
    openapiFields.add("failurereason");
    openapiFields.add("id");
    openapiFields.add("identifier");
    openapiFields.add("keyword");
    openapiFields.add("messageid");
    openapiFields.add("modified");
    openapiFields.add("schedule");
    openapiFields.add("status");
    openapiFields.add("sender");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("customerid");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("messageid");
    openapiRequiredFields.add("modified");
    openapiRequiredFields.add("schedule");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("sender");
    openapiRequiredFields.add("tag");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MessageResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponse is not found in the empty JSON string", MessageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MessageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("batchid") != null && !jsonObj.get("batchid").isJsonNull()) && !jsonObj.get("batchid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchid").toString()));
      }
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (!jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if (!jsonObj.get("customerid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerid").toString()));
      }
      if ((jsonObj.get("deliveryreporturl") != null && !jsonObj.get("deliveryreporturl").isJsonNull()) && !jsonObj.get("deliveryreporturl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryreporturl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryreporturl").toString()));
      }
      // validate the optional field `failurereason`
      if (jsonObj.get("failurereason") != null && !jsonObj.get("failurereason").isJsonNull()) {
        MessageResponseFailurereason.validateJsonElement(jsonObj.get("failurereason"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
      if (!jsonObj.get("messageid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageid").toString()));
      }
      if (!jsonObj.get("modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      if (!jsonObj.get("schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
      if (!jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponse>() {
           @Override
           public void write(JsonWriter out, MessageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponse
  * @throws IOException if the JSON string is invalid with respect to MessageResponse
  */
  public static MessageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponse.class);
  }

 /**
  * Convert an instance of MessageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

