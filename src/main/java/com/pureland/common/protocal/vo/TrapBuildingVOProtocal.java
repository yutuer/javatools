// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrapBuildingVO.proto

package com.pureland.common.protocal.vo;

public final class TrapBuildingVOProtocal {
  private TrapBuildingVOProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TrapBuildingVOOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool broken = 1;
    /**
     * <code>required bool broken = 1;</code>
     *
     * <pre>
     *是否已经坏了,坏了需要重置
     * </pre>
     */
    boolean hasBroken();
    /**
     * <code>required bool broken = 1;</code>
     *
     * <pre>
     *是否已经坏了,坏了需要重置
     * </pre>
     */
    boolean getBroken();
  }
  /**
   * Protobuf type {@code TrapBuildingVO}
   *
   * <pre>
   *陷阱类建筑VO
   * </pre>
   */
  public static final class TrapBuildingVO extends
      com.google.protobuf.GeneratedMessage
      implements TrapBuildingVOOrBuilder {
    // Use TrapBuildingVO.newBuilder() to construct.
    private TrapBuildingVO(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TrapBuildingVO(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TrapBuildingVO defaultInstance;
    public static TrapBuildingVO getDefaultInstance() {
      return defaultInstance;
    }

    public TrapBuildingVO getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TrapBuildingVO(
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
              broken_ = input.readBool();
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
      return com.pureland.common.protocal.vo.TrapBuildingVOProtocal.internal_static_TrapBuildingVO_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.vo.TrapBuildingVOProtocal.internal_static_TrapBuildingVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.class, com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.Builder.class);
    }

    public static com.google.protobuf.Parser<TrapBuildingVO> PARSER =
        new com.google.protobuf.AbstractParser<TrapBuildingVO>() {
      public TrapBuildingVO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrapBuildingVO(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TrapBuildingVO> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool broken = 1;
    public static final int BROKEN_FIELD_NUMBER = 1;
    private boolean broken_;
    /**
     * <code>required bool broken = 1;</code>
     *
     * <pre>
     *是否已经坏了,坏了需要重置
     * </pre>
     */
    public boolean hasBroken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool broken = 1;</code>
     *
     * <pre>
     *是否已经坏了,坏了需要重置
     * </pre>
     */
    public boolean getBroken() {
      return broken_;
    }

    private void initFields() {
      broken_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBroken()) {
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
        output.writeBool(1, broken_);
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
          .computeBoolSize(1, broken_);
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

    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO prototype) {
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
     * Protobuf type {@code TrapBuildingVO}
     *
     * <pre>
     *陷阱类建筑VO
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.vo.TrapBuildingVOProtocal.internal_static_TrapBuildingVO_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.vo.TrapBuildingVOProtocal.internal_static_TrapBuildingVO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.class, com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.Builder.class);
      }

      // Construct using com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.newBuilder()
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
        broken_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.vo.TrapBuildingVOProtocal.internal_static_TrapBuildingVO_descriptor;
      }

      public com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO getDefaultInstanceForType() {
        return com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.getDefaultInstance();
      }

      public com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO build() {
        com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO buildPartial() {
        com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO result = new com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.broken_ = broken_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO) {
          return mergeFrom((com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO other) {
        if (other == com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO.getDefaultInstance()) return this;
        if (other.hasBroken()) {
          setBroken(other.getBroken());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBroken()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.vo.TrapBuildingVOProtocal.TrapBuildingVO) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool broken = 1;
      private boolean broken_ ;
      /**
       * <code>required bool broken = 1;</code>
       *
       * <pre>
       *是否已经坏了,坏了需要重置
       * </pre>
       */
      public boolean hasBroken() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool broken = 1;</code>
       *
       * <pre>
       *是否已经坏了,坏了需要重置
       * </pre>
       */
      public boolean getBroken() {
        return broken_;
      }
      /**
       * <code>required bool broken = 1;</code>
       *
       * <pre>
       *是否已经坏了,坏了需要重置
       * </pre>
       */
      public Builder setBroken(boolean value) {
        bitField0_ |= 0x00000001;
        broken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool broken = 1;</code>
       *
       * <pre>
       *是否已经坏了,坏了需要重置
       * </pre>
       */
      public Builder clearBroken() {
        bitField0_ = (bitField0_ & ~0x00000001);
        broken_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TrapBuildingVO)
    }

    static {
      defaultInstance = new TrapBuildingVO(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TrapBuildingVO)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TrapBuildingVO_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TrapBuildingVO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TrapBuildingVO.proto\" \n\016TrapBuildingVO" +
      "\022\016\n\006broken\030\001 \002(\010B9\n\037com.pureland.common." +
      "protocal.voB\026TrapBuildingVOProtocal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TrapBuildingVO_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TrapBuildingVO_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TrapBuildingVO_descriptor,
              new java.lang.String[] { "Broken", });
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
