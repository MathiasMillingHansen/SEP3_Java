// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package UserSystemStack;

/**
 * Protobuf type {@code UserSystemStack.getUserInformationResponse}
 */
public  final class getUserInformationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserSystemStack.getUserInformationResponse)
    getUserInformationResponseOrBuilder {
  // Use getUserInformationResponse.newBuilder() to construct.
  private getUserInformationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getUserInformationResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private getUserInformationResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            UserSystemStack.userInformationMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(UserSystemStack.userInformationMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return UserSystemStack.UserServiceOuterClass.internal_static_UserSystemStack_getUserInformationResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UserSystemStack.UserServiceOuterClass.internal_static_UserSystemStack_getUserInformationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UserSystemStack.getUserInformationResponse.class, UserSystemStack.getUserInformationResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private UserSystemStack.userInformationMessage message_;
  /**
   * <code>.UserSystemStack.userInformationMessage message = 1;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.UserSystemStack.userInformationMessage message = 1;</code>
   */
  public UserSystemStack.userInformationMessage getMessage() {
    return message_ == null ? UserSystemStack.userInformationMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.UserSystemStack.userInformationMessage message = 1;</code>
   */
  public UserSystemStack.userInformationMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (message_ != null) {
      output.writeMessage(1, getMessage());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UserSystemStack.getUserInformationResponse)) {
      return super.equals(obj);
    }
    UserSystemStack.getUserInformationResponse other = (UserSystemStack.getUserInformationResponse) obj;

    boolean result = true;
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UserSystemStack.getUserInformationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserSystemStack.getUserInformationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UserSystemStack.getUserInformationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserSystemStack.getUserInformationResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UserSystemStack.getUserInformationResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UserSystemStack.getUserInformationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserSystemStack.getUserInformationResponse)
      UserSystemStack.getUserInformationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserSystemStack.UserServiceOuterClass.internal_static_UserSystemStack_getUserInformationResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserSystemStack.UserServiceOuterClass.internal_static_UserSystemStack_getUserInformationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserSystemStack.getUserInformationResponse.class, UserSystemStack.getUserInformationResponse.Builder.class);
    }

    // Construct using UserSystemStack.getUserInformationResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UserSystemStack.UserServiceOuterClass.internal_static_UserSystemStack_getUserInformationResponse_descriptor;
    }

    public UserSystemStack.getUserInformationResponse getDefaultInstanceForType() {
      return UserSystemStack.getUserInformationResponse.getDefaultInstance();
    }

    public UserSystemStack.getUserInformationResponse build() {
      UserSystemStack.getUserInformationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UserSystemStack.getUserInformationResponse buildPartial() {
      UserSystemStack.getUserInformationResponse result = new UserSystemStack.getUserInformationResponse(this);
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UserSystemStack.getUserInformationResponse) {
        return mergeFrom((UserSystemStack.getUserInformationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UserSystemStack.getUserInformationResponse other) {
      if (other == UserSystemStack.getUserInformationResponse.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UserSystemStack.getUserInformationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UserSystemStack.getUserInformationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private UserSystemStack.userInformationMessage message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        UserSystemStack.userInformationMessage, UserSystemStack.userInformationMessage.Builder, UserSystemStack.userInformationMessageOrBuilder> messageBuilder_;
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public UserSystemStack.userInformationMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? UserSystemStack.userInformationMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public Builder setMessage(UserSystemStack.userInformationMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public Builder setMessage(
        UserSystemStack.userInformationMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public Builder mergeMessage(UserSystemStack.userInformationMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            UserSystemStack.userInformationMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public UserSystemStack.userInformationMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    public UserSystemStack.userInformationMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            UserSystemStack.userInformationMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.UserSystemStack.userInformationMessage message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        UserSystemStack.userInformationMessage, UserSystemStack.userInformationMessage.Builder, UserSystemStack.userInformationMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            UserSystemStack.userInformationMessage, UserSystemStack.userInformationMessage.Builder, UserSystemStack.userInformationMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:UserSystemStack.getUserInformationResponse)
  }

  // @@protoc_insertion_point(class_scope:UserSystemStack.getUserInformationResponse)
  private static final UserSystemStack.getUserInformationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserSystemStack.getUserInformationResponse();
  }

  public static UserSystemStack.getUserInformationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getUserInformationResponse>
      PARSER = new com.google.protobuf.AbstractParser<getUserInformationResponse>() {
    public getUserInformationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new getUserInformationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getUserInformationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getUserInformationResponse> getParserForType() {
    return PARSER;
  }

  public UserSystemStack.getUserInformationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

