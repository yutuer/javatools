// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TipsResp.proto

package com.pureland.common.protocal;

public final class TipsRespProtocal {
  private TipsRespProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TipsRespOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 tipsId = 1;
    /**
     * <code>required int32 tipsId = 1;</code>
     */
    boolean hasTipsId();
    /**
     * <code>required int32 tipsId = 1;</code>
     */
    int getTipsId();

    // optional string tipsParam = 2;
    /**
     * <code>optional string tipsParam = 2;</code>
     */
    boolean hasTipsParam();
    /**
     * <code>optional string tipsParam = 2;</code>
     */
    java.lang.String getTipsParam();
    /**
     * <code>optional string tipsParam = 2;</code>
     */
    com.google.protobuf.ByteString
        getTipsParamBytes();
  }
  /**
   * Protobuf type {@code TipsResp}
   */
  public static final class TipsResp extends
      com.google.protobuf.GeneratedMessage
      implements TipsRespOrBuilder {
    // Use TipsResp.newBuilder() to construct.
    private TipsResp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TipsResp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TipsResp defaultInstance;
    public static TipsResp getDefaultInstance() {
      return defaultInstance;
    }

    public TipsResp getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TipsResp(
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
            case 8: {
              bitField0_ |= 0x00000001;
              tipsId_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              tipsParam_ = input.readBytes();
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
      return com.pureland.common.protocal.TipsRespProtocal.internal_static_TipsResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.TipsRespProtocal.internal_static_TipsResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.TipsRespProtocal.TipsResp.class, com.pureland.common.protocal.TipsRespProtocal.TipsResp.Builder.class);
    }

    public static com.google.protobuf.Parser<TipsResp> PARSER =
        new com.google.protobuf.AbstractParser<TipsResp>() {
      public TipsResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TipsResp(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TipsResp> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 tipsId = 1;
    public static final int TIPSID_FIELD_NUMBER = 1;
    private int tipsId_;
    /**
     * <code>required int32 tipsId = 1;</code>
     */
    public boolean hasTipsId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 tipsId = 1;</code>
     */
    public int getTipsId() {
      return tipsId_;
    }

    // optional string tipsParam = 2;
    public static final int TIPSPARAM_FIELD_NUMBER = 2;
    private java.lang.Object tipsParam_;
    /**
     * <code>optional string tipsParam = 2;</code>
     */
    public boolean hasTipsParam() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string tipsParam = 2;</code>
     */
    public java.lang.String getTipsParam() {
      java.lang.Object ref = tipsParam_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tipsParam_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tipsParam = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTipsParamBytes() {
      java.lang.Object ref = tipsParam_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tipsParam_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      tipsId_ = 0;
      tipsParam_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTipsId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, tipsId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTipsParamBytes());
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
          .computeInt32Size(1, tipsId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTipsParamBytes());
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

    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.TipsRespProtocal.TipsResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.TipsRespProtocal.TipsResp prototype) {
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
     * Protobuf type {@code TipsResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.TipsRespProtocal.TipsRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.TipsRespProtocal.internal_static_TipsResp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.TipsRespProtocal.internal_static_TipsResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.TipsRespProtocal.TipsResp.class, com.pureland.common.protocal.TipsRespProtocal.TipsResp.Builder.class);
      }

      // Construct using com.pureland.common.protocal.TipsRespProtocal.TipsResp.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        tipsId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        tipsParam_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.TipsRespProtocal.internal_static_TipsResp_descriptor;
      }

      public com.pureland.common.protocal.TipsRespProtocal.TipsResp getDefaultInstanceForType() {
        return com.pureland.common.protocal.TipsRespProtocal.TipsResp.getDefaultInstance();
      }

      public com.pureland.common.protocal.TipsRespProtocal.TipsResp build() {
        com.pureland.common.protocal.TipsRespProtocal.TipsResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.TipsRespProtocal.TipsResp buildPartial() {
        com.pureland.common.protocal.TipsRespProtocal.TipsResp result = new com.pureland.common.protocal.TipsRespProtocal.TipsResp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tipsId_ = tipsId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.tipsParam_ = tipsParam_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.TipsRespProtocal.TipsResp) {
          return mergeFrom((com.pureland.common.protocal.TipsRespProtocal.TipsResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.TipsRespProtocal.TipsResp other) {
        if (other == com.pureland.common.protocal.TipsRespProtocal.TipsResp.getDefaultInstance()) return this;
        if (other.hasTipsId()) {
          setTipsId(other.getTipsId());
        }
        if (other.hasTipsParam()) {
          bitField0_ |= 0x00000002;
          tipsParam_ = other.tipsParam_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTipsId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.TipsRespProtocal.TipsResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.TipsRespProtocal.TipsResp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 tipsId = 1;
      private int tipsId_ ;
      /**
       * <code>required int32 tipsId = 1;</code>
       */
      public boolean hasTipsId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 tipsId = 1;</code>
       */
      public int getTipsId() {
        return tipsId_;
      }
      /**
       * <code>required int32 tipsId = 1;</code>
       */
      public Builder setTipsId(int value) {
        bitField0_ |= 0x00000001;
        tipsId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 tipsId = 1;</code>
       */
      public Builder clearTipsId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tipsId_ = 0;
        onChanged();
        return this;
      }

      // optional string tipsParam = 2;
      private java.lang.Object tipsParam_ = "";
      /**
       * <code>optional string tipsParam = 2;</code>
       */
      public boolean hasTipsParam() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string tipsParam = 2;</code>
       */
      public java.lang.String getTipsParam() {
        java.lang.Object ref = tipsParam_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          tipsParam_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tipsParam = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTipsParamBytes() {
        java.lang.Object ref = tipsParam_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tipsParam_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tipsParam = 2;</code>
       */
      public Builder setTipsParam(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        tipsParam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tipsParam = 2;</code>
       */
      public Builder clearTipsParam() {
        bitField0_ = (bitField0_ & ~0x00000002);
        tipsParam_ = getDefaultInstance().getTipsParam();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tipsParam = 2;</code>
       */
      public Builder setTipsParamBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        tipsParam_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TipsResp)
    }

    static {
      defaultInstance = new TipsResp(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TipsResp)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TipsResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TipsResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016TipsResp.proto\"-\n\010TipsResp\022\016\n\006tipsId\030\001" +
      " \002(\005\022\021\n\ttipsParam\030\002 \001(\tB0\n\034com.pureland." +
      "common.protocalB\020TipsRespProtocal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TipsResp_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TipsResp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TipsResp_descriptor,
              new java.lang.String[] { "TipsId", "TipsParam", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
