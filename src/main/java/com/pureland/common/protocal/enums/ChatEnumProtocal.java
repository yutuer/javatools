// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatEnum.proto

package com.pureland.common.protocal.enums;

public final class ChatEnumProtocal {
  private ChatEnumProtocal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code ChatChannel}
   */
  public enum ChatChannel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Global = 0;</code>
     *
     * <pre>
     *公共频道
     * </pre>
     */
    Global(0, 0),
    /**
     * <code>Clan = 1;</code>
     *
     * <pre>
     *公会频道
     * </pre>
     */
    Clan(1, 1),
    ;

    /**
     * <code>Global = 0;</code>
     *
     * <pre>
     *公共频道
     * </pre>
     */
    public static final int Global_VALUE = 0;
    /**
     * <code>Clan = 1;</code>
     *
     * <pre>
     *公会频道
     * </pre>
     */
    public static final int Clan_VALUE = 1;


    public final int getNumber() { return value; }

    public static ChatChannel valueOf(int value) {
      switch (value) {
        case 0: return Global;
        case 1: return Clan;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChatChannel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ChatChannel>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChatChannel>() {
            public ChatChannel findValueByNumber(int number) {
              return ChatChannel.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pureland.common.protocal.enums.ChatEnumProtocal.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChatChannel[] VALUES = values();

    public static ChatChannel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ChatChannel(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChatChannel)
  }

  /**
   * Protobuf enum {@code ChatType}
   */
  public enum ChatType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Normal = 0;</code>
     *
     * <pre>
     *普通聊天
     * </pre>
     */
    Normal(0, 0),
    /**
     * <code>Sound = 1;</code>
     *
     * <pre>
     *语音聊天
     * </pre>
     */
    Sound(1, 1),
    /**
     * <code>Donate = 2;</code>
     *
     * <pre>
     *请求支援
     * </pre>
     */
    Donate(2, 2),
    /**
     * <code>VideoShare = 3;</code>
     *
     * <pre>
     *视频分享
     * </pre>
     */
    VideoShare(3, 3),
    /**
     * <code>ApplyClan = 4;</code>
     *
     * <pre>
     *申请公会
     * </pre>
     */
    ApplyClan(4, 4),
    /**
     * <code>JoinClan = 5;</code>
     *
     * <pre>
     *加入公会
     * </pre>
     */
    JoinClan(5, 5),
    /**
     * <code>LeaveClan = 6;</code>
     *
     * <pre>
     *离开公会
     * </pre>
     */
    LeaveClan(6, 6),
    /**
     * <code>KickClan = 7;</code>
     *
     * <pre>
     *踢出公会									
     * </pre>
     */
    KickClan(7, 7),
    /**
     * <code>Promote = 8;</code>
     *
     * <pre>
     *职位提升
     * </pre>
     */
    Promote(8, 8),
    /**
     * <code>Degrade = 9;</code>
     *
     * <pre>
     *职位下降
     * </pre>
     */
    Degrade(9, 9),
    /**
     * <code>ClanFight = 10;</code>
     *
     * <pre>
     *发起公会战
     * </pre>
     */
    ClanFight(10, 10),
    ;

    /**
     * <code>Normal = 0;</code>
     *
     * <pre>
     *普通聊天
     * </pre>
     */
    public static final int Normal_VALUE = 0;
    /**
     * <code>Sound = 1;</code>
     *
     * <pre>
     *语音聊天
     * </pre>
     */
    public static final int Sound_VALUE = 1;
    /**
     * <code>Donate = 2;</code>
     *
     * <pre>
     *请求支援
     * </pre>
     */
    public static final int Donate_VALUE = 2;
    /**
     * <code>VideoShare = 3;</code>
     *
     * <pre>
     *视频分享
     * </pre>
     */
    public static final int VideoShare_VALUE = 3;
    /**
     * <code>ApplyClan = 4;</code>
     *
     * <pre>
     *申请公会
     * </pre>
     */
    public static final int ApplyClan_VALUE = 4;
    /**
     * <code>JoinClan = 5;</code>
     *
     * <pre>
     *加入公会
     * </pre>
     */
    public static final int JoinClan_VALUE = 5;
    /**
     * <code>LeaveClan = 6;</code>
     *
     * <pre>
     *离开公会
     * </pre>
     */
    public static final int LeaveClan_VALUE = 6;
    /**
     * <code>KickClan = 7;</code>
     *
     * <pre>
     *踢出公会									
     * </pre>
     */
    public static final int KickClan_VALUE = 7;
    /**
     * <code>Promote = 8;</code>
     *
     * <pre>
     *职位提升
     * </pre>
     */
    public static final int Promote_VALUE = 8;
    /**
     * <code>Degrade = 9;</code>
     *
     * <pre>
     *职位下降
     * </pre>
     */
    public static final int Degrade_VALUE = 9;
    /**
     * <code>ClanFight = 10;</code>
     *
     * <pre>
     *发起公会战
     * </pre>
     */
    public static final int ClanFight_VALUE = 10;


    public final int getNumber() { return value; }

    public static ChatType valueOf(int value) {
      switch (value) {
        case 0: return Normal;
        case 1: return Sound;
        case 2: return Donate;
        case 3: return VideoShare;
        case 4: return ApplyClan;
        case 5: return JoinClan;
        case 6: return LeaveClan;
        case 7: return KickClan;
        case 8: return Promote;
        case 9: return Degrade;
        case 10: return ClanFight;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChatType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ChatType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChatType>() {
            public ChatType findValueByNumber(int number) {
              return ChatType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pureland.common.protocal.enums.ChatEnumProtocal.getDescriptor().getEnumTypes().get(1);
    }

    private static final ChatType[] VALUES = values();

    public static ChatType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ChatType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChatType)
  }

  /**
   * Protobuf enum {@code ChatAuth}
   */
  public enum ChatAuth
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>User = 0;</code>
     *
     * <pre>
     *普通
     * </pre>
     */
    User(0, 0),
    /**
     * <code>System = 1;</code>
     *
     * <pre>
     *系统
     * </pre>
     */
    System(1, 1),
    ;

    /**
     * <code>User = 0;</code>
     *
     * <pre>
     *普通
     * </pre>
     */
    public static final int User_VALUE = 0;
    /**
     * <code>System = 1;</code>
     *
     * <pre>
     *系统
     * </pre>
     */
    public static final int System_VALUE = 1;


    public final int getNumber() { return value; }

    public static ChatAuth valueOf(int value) {
      switch (value) {
        case 0: return User;
        case 1: return System;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChatAuth>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ChatAuth>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChatAuth>() {
            public ChatAuth findValueByNumber(int number) {
              return ChatAuth.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pureland.common.protocal.enums.ChatEnumProtocal.getDescriptor().getEnumTypes().get(2);
    }

    private static final ChatAuth[] VALUES = values();

    public static ChatAuth valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ChatAuth(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChatAuth)
  }

  /**
   * Protobuf enum {@code ApplyStateEnum}
   */
  public enum ApplyStateEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Applying = 0;</code>
     *
     * <pre>
     *申请中
     * </pre>
     */
    Applying(0, 0),
    /**
     * <code>Agree = 1;</code>
     *
     * <pre>
     *同意
     * </pre>
     */
    Agree(1, 1),
    /**
     * <code>Refuse = 2;</code>
     *
     * <pre>
     *拒绝
     * </pre>
     */
    Refuse(2, 2),
    ;

    /**
     * <code>Applying = 0;</code>
     *
     * <pre>
     *申请中
     * </pre>
     */
    public static final int Applying_VALUE = 0;
    /**
     * <code>Agree = 1;</code>
     *
     * <pre>
     *同意
     * </pre>
     */
    public static final int Agree_VALUE = 1;
    /**
     * <code>Refuse = 2;</code>
     *
     * <pre>
     *拒绝
     * </pre>
     */
    public static final int Refuse_VALUE = 2;


    public final int getNumber() { return value; }

    public static ApplyStateEnum valueOf(int value) {
      switch (value) {
        case 0: return Applying;
        case 1: return Agree;
        case 2: return Refuse;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ApplyStateEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ApplyStateEnum>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ApplyStateEnum>() {
            public ApplyStateEnum findValueByNumber(int number) {
              return ApplyStateEnum.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.pureland.common.protocal.enums.ChatEnumProtocal.getDescriptor().getEnumTypes().get(3);
    }

    private static final ApplyStateEnum[] VALUES = values();

    public static ApplyStateEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ApplyStateEnum(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ApplyStateEnum)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016ChatEnum.proto*#\n\013ChatChannel\022\n\n\006Globa" +
      "l\020\000\022\010\n\004Clan\020\001*\240\001\n\010ChatType\022\n\n\006Normal\020\000\022\t" +
      "\n\005Sound\020\001\022\n\n\006Donate\020\002\022\016\n\nVideoShare\020\003\022\r\n" +
      "\tApplyClan\020\004\022\014\n\010JoinClan\020\005\022\r\n\tLeaveClan\020" +
      "\006\022\014\n\010KickClan\020\007\022\013\n\007Promote\020\010\022\013\n\007Degrade\020" +
      "\t\022\r\n\tClanFight\020\n* \n\010ChatAuth\022\010\n\004User\020\000\022\n" +
      "\n\006System\020\001*5\n\016ApplyStateEnum\022\014\n\010Applying" +
      "\020\000\022\t\n\005Agree\020\001\022\n\n\006Refuse\020\002B6\n\"com.purelan" +
      "d.common.protocal.enumsB\020ChatEnumProtoca" +
      "l"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
