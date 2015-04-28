// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ArmyVO.proto

package com.pureland.common.protocal.vo;

public final class ArmyVOProtocal {
  private ArmyVOProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ArmyVOOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 cid = 1;
    /**
     * <code>required int32 cid = 1;</code>
     */
    boolean hasCid();
    /**
     * <code>required int32 cid = 1;</code>
     */
    int getCid();

    // required int32 amount = 2;
    /**
     * <code>required int32 amount = 2;</code>
     */
    boolean hasAmount();
    /**
     * <code>required int32 amount = 2;</code>
     */
    int getAmount();
  }
  /**
   * Protobuf type {@code ArmyVO}
   */
  public static final class ArmyVO extends
      com.google.protobuf.GeneratedMessage
      implements ArmyVOOrBuilder {
    // Use ArmyVO.newBuilder() to construct.
    private ArmyVO(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ArmyVO(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ArmyVO defaultInstance;
    public static ArmyVO getDefaultInstance() {
      return defaultInstance;
    }

    public ArmyVO getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ArmyVO(
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
              cid_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              amount_ = input.readInt32();
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
      return com.pureland.common.protocal.vo.ArmyVOProtocal.internal_static_ArmyVO_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.vo.ArmyVOProtocal.internal_static_ArmyVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.class, com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.Builder.class);
    }

    public static com.google.protobuf.Parser<ArmyVO> PARSER =
        new com.google.protobuf.AbstractParser<ArmyVO>() {
      public ArmyVO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ArmyVO(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ArmyVO> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 cid = 1;
    public static final int CID_FIELD_NUMBER = 1;
    private int cid_;
    /**
     * <code>required int32 cid = 1;</code>
     */
    public boolean hasCid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 cid = 1;</code>
     */
    public int getCid() {
      return cid_;
    }

    // required int32 amount = 2;
    public static final int AMOUNT_FIELD_NUMBER = 2;
    private int amount_;
    /**
     * <code>required int32 amount = 2;</code>
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 amount = 2;</code>
     */
    public int getAmount() {
      return amount_;
    }

    private void initFields() {
      cid_ = 0;
      amount_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAmount()) {
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
        output.writeInt32(1, cid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, amount_);
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
          .computeInt32Size(1, cid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, amount_);
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

    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO prototype) {
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
     * Protobuf type {@code ArmyVO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.vo.ArmyVOProtocal.internal_static_ArmyVO_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.vo.ArmyVOProtocal.internal_static_ArmyVO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.class, com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.Builder.class);
      }

      // Construct using com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.newBuilder()
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
        cid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        amount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.vo.ArmyVOProtocal.internal_static_ArmyVO_descriptor;
      }

      public com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO getDefaultInstanceForType() {
        return com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.getDefaultInstance();
      }

      public com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO build() {
        com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO buildPartial() {
        com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO result = new com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cid_ = cid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.amount_ = amount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO) {
          return mergeFrom((com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO other) {
        if (other == com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO.getDefaultInstance()) return this;
        if (other.hasCid()) {
          setCid(other.getCid());
        }
        if (other.hasAmount()) {
          setAmount(other.getAmount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCid()) {
          
          return false;
        }
        if (!hasAmount()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.vo.ArmyVOProtocal.ArmyVO) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 cid = 1;
      private int cid_ ;
      /**
       * <code>required int32 cid = 1;</code>
       */
      public boolean hasCid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 cid = 1;</code>
       */
      public int getCid() {
        return cid_;
      }
      /**
       * <code>required int32 cid = 1;</code>
       */
      public Builder setCid(int value) {
        bitField0_ |= 0x00000001;
        cid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 cid = 1;</code>
       */
      public Builder clearCid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cid_ = 0;
        onChanged();
        return this;
      }

      // required int32 amount = 2;
      private int amount_ ;
      /**
       * <code>required int32 amount = 2;</code>
       */
      public boolean hasAmount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 amount = 2;</code>
       */
      public int getAmount() {
        return amount_;
      }
      /**
       * <code>required int32 amount = 2;</code>
       */
      public Builder setAmount(int value) {
        bitField0_ |= 0x00000002;
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 amount = 2;</code>
       */
      public Builder clearAmount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        amount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ArmyVO)
    }

    static {
      defaultInstance = new ArmyVO(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ArmyVO)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ArmyVO_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ArmyVO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014ArmyVO.proto\"%\n\006ArmyVO\022\013\n\003cid\030\001 \002(\005\022\016\n" +
      "\006amount\030\002 \002(\005B1\n\037com.pureland.common.pro" +
      "tocal.voB\016ArmyVOProtocal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ArmyVO_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ArmyVO_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ArmyVO_descriptor,
              new java.lang.String[] { "Cid", "Amount", });
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
