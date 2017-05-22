// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authTokenResult.proto

package data.data_trans;

@SuppressWarnings("unused")
public final class AuthTokenResultOuterClass {
  private AuthTokenResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AuthTokenResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:data.data_trans.AuthTokenResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string ip = 1;</code>
     */
    String getIp();
    /**
     * <code>optional string ip = 1;</code>
     */
    com.google.protobuf.ByteString
        getIpBytes();

    /**
     * <code>optional bytes token = 2;</code>
     */
    com.google.protobuf.ByteString getToken();

    /**
     * <code>optional int32 length = 3;</code>
     */
    int getLength();

    /**
     * <code>optional int32 expires = 4;</code>
     */
    int getExpires();

    /**
     * <code>optional bool result = 5;</code>
     */
    boolean getResult();

    /**
     * <code>optional int32 code = 6;</code>
     */
    int getCode();
  }
  /**
   * Protobuf type {@code data.data_trans.AuthTokenResult}
   */
  public  static final class AuthTokenResult extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:data.data_trans.AuthTokenResult)
      AuthTokenResultOrBuilder {
    // Use AuthTokenResult.newBuilder() to construct.
    private AuthTokenResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AuthTokenResult() {
      ip_ = "";
      token_ = com.google.protobuf.ByteString.EMPTY;
      length_ = 0;
      expires_ = 0;
      result_ = false;
      code_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AuthTokenResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
              String s = input.readStringRequireUtf8();

              ip_ = s;
              break;
            }
            case 18: {

              token_ = input.readBytes();
              break;
            }
            case 24: {

              length_ = input.readInt32();
              break;
            }
            case 32: {

              expires_ = input.readInt32();
              break;
            }
            case 40: {

              result_ = input.readBool();
              break;
            }
            case 48: {

              code_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AuthTokenResultOuterClass.internal_static_data_data_trans_AuthTokenResult_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AuthTokenResultOuterClass.internal_static_data_data_trans_AuthTokenResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuthTokenResult.class, Builder.class);
    }

    public static final int IP_FIELD_NUMBER = 1;
    private volatile Object ip_;
    /**
     * <code>optional string ip = 1;</code>
     */
    public String getIp() {
      Object ref = ip_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      }
    }
    /**
     * <code>optional string ip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOKEN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString token_;
    /**
     * <code>optional bytes token = 2;</code>
     */
    public com.google.protobuf.ByteString getToken() {
      return token_;
    }

    public static final int LENGTH_FIELD_NUMBER = 3;
    private int length_;
    /**
     * <code>optional int32 length = 3;</code>
     */
    public int getLength() {
      return length_;
    }

    public static final int EXPIRES_FIELD_NUMBER = 4;
    private int expires_;
    /**
     * <code>optional int32 expires = 4;</code>
     */
    public int getExpires() {
      return expires_;
    }

    public static final int RESULT_FIELD_NUMBER = 5;
    private boolean result_;
    /**
     * <code>optional bool result = 5;</code>
     */
    public boolean getResult() {
      return result_;
    }

    public static final int CODE_FIELD_NUMBER = 6;
    private int code_;
    /**
     * <code>optional int32 code = 6;</code>
     */
    public int getCode() {
      return code_;
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
      if (!getIpBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, ip_);
      }
      if (!token_.isEmpty()) {
        output.writeBytes(2, token_);
      }
      if (length_ != 0) {
        output.writeInt32(3, length_);
      }
      if (expires_ != 0) {
        output.writeInt32(4, expires_);
      }
      if (result_ != false) {
        output.writeBool(5, result_);
      }
      if (code_ != 0) {
        output.writeInt32(6, code_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIpBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, ip_);
      }
      if (!token_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, token_);
      }
      if (length_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, length_);
      }
      if (expires_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, expires_);
      }
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, result_);
      }
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, code_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static AuthTokenResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AuthTokenResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AuthTokenResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AuthTokenResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AuthTokenResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static AuthTokenResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static AuthTokenResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static AuthTokenResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static AuthTokenResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static AuthTokenResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(AuthTokenResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code data.data_trans.AuthTokenResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:data.data_trans.AuthTokenResult)
        AuthTokenResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AuthTokenResultOuterClass.internal_static_data_data_trans_AuthTokenResult_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AuthTokenResultOuterClass.internal_static_data_data_trans_AuthTokenResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AuthTokenResult.class, Builder.class);
      }

      // Construct using data.data_trans.AuthTokenResultOuterClass.AuthTokenResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        ip_ = "";

        token_ = com.google.protobuf.ByteString.EMPTY;

        length_ = 0;

        expires_ = 0;

        result_ = false;

        code_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AuthTokenResultOuterClass.internal_static_data_data_trans_AuthTokenResult_descriptor;
      }

      public AuthTokenResult getDefaultInstanceForType() {
        return AuthTokenResult.getDefaultInstance();
      }

      public AuthTokenResult build() {
        AuthTokenResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public AuthTokenResult buildPartial() {
        AuthTokenResult result = new AuthTokenResult(this);
        result.ip_ = ip_;
        result.token_ = token_;
        result.length_ = length_;
        result.expires_ = expires_;
        result.result_ = result_;
        result.code_ = code_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AuthTokenResult) {
          return mergeFrom((AuthTokenResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AuthTokenResult other) {
        if (other == AuthTokenResult.getDefaultInstance()) return this;
        if (!other.getIp().isEmpty()) {
          ip_ = other.ip_;
          onChanged();
        }
        if (other.getToken() != com.google.protobuf.ByteString.EMPTY) {
          setToken(other.getToken());
        }
        if (other.getLength() != 0) {
          setLength(other.getLength());
        }
        if (other.getExpires() != 0) {
          setExpires(other.getExpires());
        }
        if (other.getResult() != false) {
          setResult(other.getResult());
        }
        if (other.getCode() != 0) {
          setCode(other.getCode());
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
        AuthTokenResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AuthTokenResult) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object ip_ = "";
      /**
       * <code>optional string ip = 1;</code>
       */
      public String getIp() {
        Object ref = ip_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          ip_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string ip = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ip = 1;</code>
       */
      public Builder setIp(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip = 1;</code>
       */
      public Builder clearIp() {
        
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip = 1;</code>
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ip_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString token_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes token = 2;</code>
       */
      public com.google.protobuf.ByteString getToken() {
        return token_;
      }
      /**
       * <code>optional bytes token = 2;</code>
       */
      public Builder setToken(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes token = 2;</code>
       */
      public Builder clearToken() {
        
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }

      private int length_ ;
      /**
       * <code>optional int32 length = 3;</code>
       */
      public int getLength() {
        return length_;
      }
      /**
       * <code>optional int32 length = 3;</code>
       */
      public Builder setLength(int value) {
        
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 length = 3;</code>
       */
      public Builder clearLength() {
        
        length_ = 0;
        onChanged();
        return this;
      }

      private int expires_ ;
      /**
       * <code>optional int32 expires = 4;</code>
       */
      public int getExpires() {
        return expires_;
      }
      /**
       * <code>optional int32 expires = 4;</code>
       */
      public Builder setExpires(int value) {
        
        expires_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 expires = 4;</code>
       */
      public Builder clearExpires() {
        
        expires_ = 0;
        onChanged();
        return this;
      }

      private boolean result_ ;
      /**
       * <code>optional bool result = 5;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>optional bool result = 5;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool result = 5;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
        onChanged();
        return this;
      }

      private int code_ ;
      /**
       * <code>optional int32 code = 6;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 6;</code>
       */
      public Builder setCode(int value) {
        
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 6;</code>
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:data.data_trans.AuthTokenResult)
    }

    // @@protoc_insertion_point(class_scope:data.data_trans.AuthTokenResult)
    private static final AuthTokenResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AuthTokenResult();
    }

    public static AuthTokenResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AuthTokenResult>
        PARSER = new com.google.protobuf.AbstractParser<AuthTokenResult>() {
      public AuthTokenResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new AuthTokenResult(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<AuthTokenResult> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AuthTokenResult> getParserForType() {
      return PARSER;
    }

    public AuthTokenResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_data_data_trans_AuthTokenResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_data_data_trans_AuthTokenResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025authTokenResult.proto\022\017data.data_trans" +
      "\"k\n\017AuthTokenResult\022\n\n\002ip\030\001 \001(\t\022\r\n\005token" +
      "\030\002 \001(\014\022\016\n\006length\030\003 \001(\005\022\017\n\007expires\030\004 \001(\005\022" +
      "\016\n\006result\030\005 \001(\010\022\014\n\004code\030\006 \001(\005b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_data_data_trans_AuthTokenResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_data_trans_AuthTokenResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_data_data_trans_AuthTokenResult_descriptor,
        new String[] { "Ip", "Token", "Length", "Expires", "Result", "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}