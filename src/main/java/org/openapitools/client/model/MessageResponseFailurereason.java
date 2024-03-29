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
 * MessageResponseFailurereason
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T11:27:24.989260Z[Europe/London]")
public class MessageResponseFailurereason {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private BigDecimal code;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_PERMANENT = "permanent";
  @SerializedName(SERIALIZED_NAME_PERMANENT)
  private Boolean permanent;

  public MessageResponseFailurereason() {
  }

  public MessageResponseFailurereason code(BigDecimal code) {
    
    this.code = code;
    return this;
  }

   /**
   * Numeric code that defines the error. Integer.
   * @return code
  **/
  @javax.annotation.Nullable
  public BigDecimal getCode() {
    return code;
  }


  public void setCode(BigDecimal code) {
    this.code = code;
  }


  public MessageResponseFailurereason details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public MessageResponseFailurereason permanent(Boolean permanent) {
    
    this.permanent = permanent;
    return this;
  }

   /**
   * Get permanent
   * @return permanent
  **/
  @javax.annotation.Nullable
  public Boolean getPermanent() {
    return permanent;
  }


  public void setPermanent(Boolean permanent) {
    this.permanent = permanent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponseFailurereason messageResponseFailurereason = (MessageResponseFailurereason) o;
    return Objects.equals(this.code, messageResponseFailurereason.code) &&
        Objects.equals(this.details, messageResponseFailurereason.details) &&
        Objects.equals(this.permanent, messageResponseFailurereason.permanent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, permanent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseFailurereason {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("details");
    openapiFields.add("permanent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MessageResponseFailurereason
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageResponseFailurereason.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponseFailurereason is not found in the empty JSON string", MessageResponseFailurereason.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MessageResponseFailurereason.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageResponseFailurereason` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponseFailurereason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseFailurereason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseFailurereason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseFailurereason.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseFailurereason>() {
           @Override
           public void write(JsonWriter out, MessageResponseFailurereason value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponseFailurereason read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponseFailurereason given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseFailurereason
  * @throws IOException if the JSON string is invalid with respect to MessageResponseFailurereason
  */
  public static MessageResponseFailurereason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseFailurereason.class);
  }

 /**
  * Convert an instance of MessageResponseFailurereason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

