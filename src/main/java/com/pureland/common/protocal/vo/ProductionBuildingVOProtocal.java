// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductionBuildingVO.proto

package com.pureland.common.protocal.vo;

public final class ProductionBuildingVOProtocal {
  private ProductionBuildingVOProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ProductionBuildingVOOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .ProductionItemVO productionItems = 1;
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    java.util.List<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO> 
        getProductionItemsList();
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO getProductionItems(int index);
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    int getProductionItemsCount();
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    java.util.List<? extends com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder> 
        getProductionItemsOrBuilderList();
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder getProductionItemsOrBuilder(
        int index);

    // optional int64 endTime = 2;
    /**
     * <code>optional int64 endTime = 2;</code>
     *
     * <pre>
     *第一个建造/训练单位结束时间
     * </pre>
     */
    boolean hasEndTime();
    /**
     * <code>optional int64 endTime = 2;</code>
     *
     * <pre>
     *第一个建造/训练单位结束时间
     * </pre>
     */
    long getEndTime();
  }
  /**
   * Protobuf type {@code ProductionBuildingVO}
   */
  public static final class ProductionBuildingVO extends
      com.google.protobuf.GeneratedMessage
      implements ProductionBuildingVOOrBuilder {
    // Use ProductionBuildingVO.newBuilder() to construct.
    private ProductionBuildingVO(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ProductionBuildingVO(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ProductionBuildingVO defaultInstance;
    public static ProductionBuildingVO getDefaultInstance() {
      return defaultInstance;
    }

    public ProductionBuildingVO getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ProductionBuildingVO(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                productionItems_ = new java.util.ArrayList<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO>();
                mutable_bitField0_ |= 0x00000001;
              }
              productionItems_.add(input.readMessage(com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              endTime_ = input.readInt64();
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          productionItems_ = java.util.Collections.unmodifiableList(productionItems_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.internal_static_ProductionBuildingVO_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.internal_static_ProductionBuildingVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.class, com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.Builder.class);
    }

    public static com.google.protobuf.Parser<ProductionBuildingVO> PARSER =
        new com.google.protobuf.AbstractParser<ProductionBuildingVO>() {
      public ProductionBuildingVO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductionBuildingVO(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ProductionBuildingVO> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // repeated .ProductionItemVO productionItems = 1;
    public static final int PRODUCTIONITEMS_FIELD_NUMBER = 1;
    private java.util.List<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO> productionItems_;
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    public java.util.List<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO> getProductionItemsList() {
      return productionItems_;
    }
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    public java.util.List<? extends com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder> 
        getProductionItemsOrBuilderList() {
      return productionItems_;
    }
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    public int getProductionItemsCount() {
      return productionItems_.size();
    }
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO getProductionItems(int index) {
      return productionItems_.get(index);
    }
    /**
     * <code>repeated .ProductionItemVO productionItems = 1;</code>
     *
     * <pre>
     *建造/训练列表
     * </pre>
     */
    public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder getProductionItemsOrBuilder(
        int index) {
      return productionItems_.get(index);
    }

    // optional int64 endTime = 2;
    public static final int ENDTIME_FIELD_NUMBER = 2;
    private long endTime_;
    /**
     * <code>optional int64 endTime = 2;</code>
     *
     * <pre>
     *第一个建造/训练单位结束时间
     * </pre>
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 endTime = 2;</code>
     *
     * <pre>
     *第一个建造/训练单位结束时间
     * </pre>
     */
    public long getEndTime() {
      return endTime_;
    }

    private void initFields() {
      productionItems_ = java.util.Collections.emptyList();
      endTime_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      for (int i = 0; i < getProductionItemsCount(); i++) {
        if (!getProductionItems(i).isInitialized()) {
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
      for (int i = 0; i < productionItems_.size(); i++) {
        output.writeMessage(1, productionItems_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(2, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < productionItems_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, productionItems_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, endTime_);
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

    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO prototype) {
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
     * Protobuf type {@code ProductionBuildingVO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.internal_static_ProductionBuildingVO_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.internal_static_ProductionBuildingVO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.class, com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.Builder.class);
      }

      // Construct using com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.newBuilder()
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
          getProductionItemsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (productionItemsBuilder_ == null) {
          productionItems_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          productionItemsBuilder_.clear();
        }
        endTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.internal_static_ProductionBuildingVO_descriptor;
      }

      public com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO getDefaultInstanceForType() {
        return com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.getDefaultInstance();
      }

      public com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO build() {
        com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO buildPartial() {
        com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO result = new com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (productionItemsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            productionItems_ = java.util.Collections.unmodifiableList(productionItems_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.productionItems_ = productionItems_;
        } else {
          result.productionItems_ = productionItemsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.endTime_ = endTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO) {
          return mergeFrom((com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO other) {
        if (other == com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO.getDefaultInstance()) return this;
        if (productionItemsBuilder_ == null) {
          if (!other.productionItems_.isEmpty()) {
            if (productionItems_.isEmpty()) {
              productionItems_ = other.productionItems_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureProductionItemsIsMutable();
              productionItems_.addAll(other.productionItems_);
            }
            onChanged();
          }
        } else {
          if (!other.productionItems_.isEmpty()) {
            if (productionItemsBuilder_.isEmpty()) {
              productionItemsBuilder_.dispose();
              productionItemsBuilder_ = null;
              productionItems_ = other.productionItems_;
              bitField0_ = (bitField0_ & ~0x00000001);
              productionItemsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getProductionItemsFieldBuilder() : null;
            } else {
              productionItemsBuilder_.addAllMessages(other.productionItems_);
            }
          }
        }
        if (other.hasEndTime()) {
          setEndTime(other.getEndTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getProductionItemsCount(); i++) {
          if (!getProductionItems(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pureland.common.protocal.vo.ProductionBuildingVOProtocal.ProductionBuildingVO) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .ProductionItemVO productionItems = 1;
      private java.util.List<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO> productionItems_ =
        java.util.Collections.emptyList();
      private void ensureProductionItemsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          productionItems_ = new java.util.ArrayList<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO>(productionItems_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder> productionItemsBuilder_;

      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public java.util.List<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO> getProductionItemsList() {
        if (productionItemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(productionItems_);
        } else {
          return productionItemsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public int getProductionItemsCount() {
        if (productionItemsBuilder_ == null) {
          return productionItems_.size();
        } else {
          return productionItemsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO getProductionItems(int index) {
        if (productionItemsBuilder_ == null) {
          return productionItems_.get(index);
        } else {
          return productionItemsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder setProductionItems(
          int index, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO value) {
        if (productionItemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProductionItemsIsMutable();
          productionItems_.set(index, value);
          onChanged();
        } else {
          productionItemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder setProductionItems(
          int index, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder builderForValue) {
        if (productionItemsBuilder_ == null) {
          ensureProductionItemsIsMutable();
          productionItems_.set(index, builderForValue.build());
          onChanged();
        } else {
          productionItemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder addProductionItems(com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO value) {
        if (productionItemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProductionItemsIsMutable();
          productionItems_.add(value);
          onChanged();
        } else {
          productionItemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder addProductionItems(
          int index, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO value) {
        if (productionItemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProductionItemsIsMutable();
          productionItems_.add(index, value);
          onChanged();
        } else {
          productionItemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder addProductionItems(
          com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder builderForValue) {
        if (productionItemsBuilder_ == null) {
          ensureProductionItemsIsMutable();
          productionItems_.add(builderForValue.build());
          onChanged();
        } else {
          productionItemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder addProductionItems(
          int index, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder builderForValue) {
        if (productionItemsBuilder_ == null) {
          ensureProductionItemsIsMutable();
          productionItems_.add(index, builderForValue.build());
          onChanged();
        } else {
          productionItemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder addAllProductionItems(
          java.lang.Iterable<? extends com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO> values) {
        if (productionItemsBuilder_ == null) {
          ensureProductionItemsIsMutable();
          super.addAll(values, productionItems_);
          onChanged();
        } else {
          productionItemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder clearProductionItems() {
        if (productionItemsBuilder_ == null) {
          productionItems_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          productionItemsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public Builder removeProductionItems(int index) {
        if (productionItemsBuilder_ == null) {
          ensureProductionItemsIsMutable();
          productionItems_.remove(index);
          onChanged();
        } else {
          productionItemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder getProductionItemsBuilder(
          int index) {
        return getProductionItemsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder getProductionItemsOrBuilder(
          int index) {
        if (productionItemsBuilder_ == null) {
          return productionItems_.get(index);  } else {
          return productionItemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public java.util.List<? extends com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder> 
           getProductionItemsOrBuilderList() {
        if (productionItemsBuilder_ != null) {
          return productionItemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(productionItems_);
        }
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder addProductionItemsBuilder() {
        return getProductionItemsFieldBuilder().addBuilder(
            com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.getDefaultInstance());
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder addProductionItemsBuilder(
          int index) {
        return getProductionItemsFieldBuilder().addBuilder(
            index, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.getDefaultInstance());
      }
      /**
       * <code>repeated .ProductionItemVO productionItems = 1;</code>
       *
       * <pre>
       *建造/训练列表
       * </pre>
       */
      public java.util.List<com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder> 
           getProductionItemsBuilderList() {
        return getProductionItemsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder> 
          getProductionItemsFieldBuilder() {
        if (productionItemsBuilder_ == null) {
          productionItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVO.Builder, com.pureland.common.protocal.vo.ProductionItemVOProtocal.ProductionItemVOOrBuilder>(
                  productionItems_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          productionItems_ = null;
        }
        return productionItemsBuilder_;
      }

      // optional int64 endTime = 2;
      private long endTime_ ;
      /**
       * <code>optional int64 endTime = 2;</code>
       *
       * <pre>
       *第一个建造/训练单位结束时间
       * </pre>
       */
      public boolean hasEndTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 endTime = 2;</code>
       *
       * <pre>
       *第一个建造/训练单位结束时间
       * </pre>
       */
      public long getEndTime() {
        return endTime_;
      }
      /**
       * <code>optional int64 endTime = 2;</code>
       *
       * <pre>
       *第一个建造/训练单位结束时间
       * </pre>
       */
      public Builder setEndTime(long value) {
        bitField0_ |= 0x00000002;
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 endTime = 2;</code>
       *
       * <pre>
       *第一个建造/训练单位结束时间
       * </pre>
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endTime_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ProductionBuildingVO)
    }

    static {
      defaultInstance = new ProductionBuildingVO(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ProductionBuildingVO)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductionBuildingVO_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ProductionBuildingVO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ProductionBuildingVO.proto\032\026Production" +
      "ItemVO.proto\"S\n\024ProductionBuildingVO\022*\n\017" +
      "productionItems\030\001 \003(\0132\021.ProductionItemVO" +
      "\022\017\n\007endTime\030\002 \001(\003B?\n\037com.pureland.common" +
      ".protocal.voB\034ProductionBuildingVOProtoc" +
      "al"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ProductionBuildingVO_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ProductionBuildingVO_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ProductionBuildingVO_descriptor,
              new java.lang.String[] { "ProductionItems", "EndTime", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.pureland.common.protocal.vo.ProductionItemVOProtocal.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
