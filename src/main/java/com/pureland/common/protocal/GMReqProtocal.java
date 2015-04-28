// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GMReq.proto

package com.pureland.common.protocal;

public final class GMReqProtocal {
  private GMReqProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GMReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string input = 1;
    /**
     * <code>optional string input = 1;</code>
     */
    boolean hasInput();
    /**
     * <code>optional string input = 1;</code>
     */
    java.lang.String getInput();
    /**
     * <code>optional string input = 1;</code>
     */
    com.google.protobuf.ByteString
        getInputBytes();

    // optional .GMSaveFormation gmSaveFormation = 2;
    /**
     * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
     */
    boolean hasGmSaveFormation();
    /**
     * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
     */
    com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation getGmSaveFormation();
    /**
     * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
     */
    com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormationOrBuilder getGmSaveFormationOrBuilder();
  }
  /**
   * Protobuf type {@code GMReq}
   */
  public static final class GMReq extends
      com.google.protobuf.GeneratedMessage
      implements GMReqOrBuilder {
    // Use GMReq.newBuilder() to construct.
    private GMReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GMReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GMReq defaultInstance;
    public static GMReq getDefaultInstance() {
      return defaultInstance;
    }

    public GMReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GMReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              input_ = input.readBytes();
              break;
            }
            case 18: {
              com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = gmSaveFormation_.toBuilder();
              }
              gmSaveFormation_ = input.readMessage(com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gmSaveFormation_);
                gmSaveFormation_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pureland.common.protocal.GMReqProtocal.internal_static_GMReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.GMReqProtocal.internal_static_GMReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.GMReqProtocal.GMReq.class, com.pureland.common.protocal.GMReqProtocal.GMReq.Builder.class);
    }

    public static com.google.protobuf.Parser<GMReq> PARSER =
        new com.google.protobuf.AbstractParser<GMReq>() {
      public GMReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GMReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GMReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string input = 1;
    public static final int INPUT_FIELD_NUMBER = 1;
    private java.lang.Object input_;
    /**
     * <code>optional string input = 1;</code>
     */
    public boolean hasInput() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string input = 1;</code>
     */
    public java.lang.String getInput() {
      java.lang.Object ref = input_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          input_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string input = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInputBytes() {
      java.lang.Object ref = input_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        input_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .GMSaveFormation gmSaveFormation = 2;
    public static final int GMSAVEFORMATION_FIELD_NUMBER = 2;
    private com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation gmSaveFormation_;
    /**
     * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
     */
    public boolean hasGmSaveFormation() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
     */
    public com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation getGmSaveFormation() {
      return gmSaveFormation_;
    }
    /**
     * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
     */
    public com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormationOrBuilder getGmSaveFormationOrBuilder() {
      return gmSaveFormation_;
    }

    private void initFields() {
      input_ = "";
      gmSaveFormation_ = com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (hasGmSaveFormation()) {
        if (!getGmSaveFormation().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getInputBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, gmSaveFormation_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getInputBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, gmSaveFormation_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.GMReqProtocal.GMReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.GMReqProtocal.GMReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GMReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.GMReqProtocal.GMReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.GMReqProtocal.internal_static_GMReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.GMReqProtocal.internal_static_GMReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.GMReqProtocal.GMReq.class, com.pureland.common.protocal.GMReqProtocal.GMReq.Builder.class);
      }

      // Construct using com.pureland.common.protocal.GMReqProtocal.GMReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getGmSaveFormationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        input_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (gmSaveFormationBuilder_ == null) {
          gmSaveFormation_ = com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.getDefaultInstance();
        } else {
          gmSaveFormationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.GMReqProtocal.internal_static_GMReq_descriptor;
      }

      public com.pureland.common.protocal.GMReqProtocal.GMReq getDefaultInstanceForType() {
        return com.pureland.common.protocal.GMReqProtocal.GMReq.getDefaultInstance();
      }

      public com.pureland.common.protocal.GMReqProtocal.GMReq build() {
        com.pureland.common.protocal.GMReqProtocal.GMReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.GMReqProtocal.GMReq buildPartial() {
        com.pureland.common.protocal.GMReqProtocal.GMReq result = new com.pureland.common.protocal.GMReqProtocal.GMReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.input_ = input_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (gmSaveFormationBuilder_ == null) {
          result.gmSaveFormation_ = gmSaveFormation_;
        } else {
          result.gmSaveFormation_ = gmSaveFormationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.GMReqProtocal.GMReq) {
          return mergeFrom((com.pureland.common.protocal.GMReqProtocal.GMReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.GMReqProtocal.GMReq other) {
        if (other == com.pureland.common.protocal.GMReqProtocal.GMReq.getDefaultInstance()) return this;
        if (other.hasInput()) {
          bitField0_ |= 0x00000001;
          input_ = other.input_;
          onChanged();
        }
        if (other.hasGmSaveFormation()) {
          mergeGmSaveFormation(other.getGmSaveFormation());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasGmSaveFormation()) {
          if (!getGmSaveFormation().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.GMReqProtocal.GMReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.GMReqProtocal.GMReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string input = 1;
      private java.lang.Object input_ = "";
      /**
       * <code>optional string input = 1;</code>
       */
      public boolean hasInput() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string input = 1;</code>
       */
      public java.lang.String getInput() {
        java.lang.Object ref = input_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          input_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string input = 1;</code>
       */
      public com.google.protobuf.ByteString
          getInputBytes() {
        java.lang.Object ref = input_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          input_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string input = 1;</code>
       */
      public Builder setInput(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        input_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string input = 1;</code>
       */
      public Builder clearInput() {
        bitField0_ = (bitField0_ & ~0x00000001);
        input_ = getDefaultInstance().getInput();
        onChanged();
        return this;
      }
      /**
       * <code>optional string input = 1;</code>
       */
      public Builder setInputBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        input_ = value;
        onChanged();
        return this;
      }

      // optional .GMSaveFormation gmSaveFormation = 2;
      private com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation gmSaveFormation_ = com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation, com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.Builder, com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormationOrBuilder> gmSaveFormationBuilder_;
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public boolean hasGmSaveFormation() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation getGmSaveFormation() {
        if (gmSaveFormationBuilder_ == null) {
          return gmSaveFormation_;
        } else {
          return gmSaveFormationBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public Builder setGmSaveFormation(com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation value) {
        if (gmSaveFormationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gmSaveFormation_ = value;
          onChanged();
        } else {
          gmSaveFormationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public Builder setGmSaveFormation(
          com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.Builder builderForValue) {
        if (gmSaveFormationBuilder_ == null) {
          gmSaveFormation_ = builderForValue.build();
          onChanged();
        } else {
          gmSaveFormationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public Builder mergeGmSaveFormation(com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation value) {
        if (gmSaveFormationBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              gmSaveFormation_ != com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.getDefaultInstance()) {
            gmSaveFormation_ =
              com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.newBuilder(gmSaveFormation_).mergeFrom(value).buildPartial();
          } else {
            gmSaveFormation_ = value;
          }
          onChanged();
        } else {
          gmSaveFormationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public Builder clearGmSaveFormation() {
        if (gmSaveFormationBuilder_ == null) {
          gmSaveFormation_ = com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.getDefaultInstance();
          onChanged();
        } else {
          gmSaveFormationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.Builder getGmSaveFormationBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getGmSaveFormationFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      public com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormationOrBuilder getGmSaveFormationOrBuilder() {
        if (gmSaveFormationBuilder_ != null) {
          return gmSaveFormationBuilder_.getMessageOrBuilder();
        } else {
          return gmSaveFormation_;
        }
      }
      /**
       * <code>optional .GMSaveFormation gmSaveFormation = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation, com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.Builder, com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormationOrBuilder> 
          getGmSaveFormationFieldBuilder() {
        if (gmSaveFormationBuilder_ == null) {
          gmSaveFormationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation, com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation.Builder, com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormationOrBuilder>(
                  gmSaveFormation_,
                  getParentForChildren(),
                  isClean());
          gmSaveFormation_ = null;
        }
        return gmSaveFormationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:GMReq)
    }

    static {
      defaultInstance = new GMReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GMReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_GMReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GMReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013GMReq.proto\032\025GMSaveFormation.proto\"A\n\005" +
      "GMReq\022\r\n\005input\030\001 \001(\t\022)\n\017gmSaveFormation\030" +
      "\002 \001(\0132\020.GMSaveFormationB-\n\034com.pureland." +
      "common.protocalB\rGMReqProtocal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_GMReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_GMReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_GMReq_descriptor,
              new java.lang.String[] { "Input", "GmSaveFormation", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.pureland.common.protocal.GMSaveFormationProtocal.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
