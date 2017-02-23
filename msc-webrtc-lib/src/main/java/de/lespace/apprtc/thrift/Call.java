// Automatically generated by the Thrifty compiler; do not edit!
// Generated on: 2017-02-19T11:45:32.962Z
// Source: /Users/nico/Documents/projekte/msc-webrtc/thrifty/webrtc.thrift at 3:1
package de.lespace.apprtc.thrift;

import com.microsoft.thrifty.Adapter;
import com.microsoft.thrifty.Struct;
import com.microsoft.thrifty.StructBuilder;
import com.microsoft.thrifty.TType;
import com.microsoft.thrifty.ThriftField;
import com.microsoft.thrifty.protocol.FieldMetadata;
import com.microsoft.thrifty.protocol.Protocol;
import com.microsoft.thrifty.util.ProtocolUtil;
import java.io.IOException;

public final class Call implements Struct {
  public static final Adapter<Call, Builder> ADAPTER = new CallAdapter();

  @ThriftField(
      fieldId = 1,
      isRequired = true
  )
  public final String fromName;

  @ThriftField(
      fieldId = 2,
      isRequired = true
  )
  public final String toName;

  @ThriftField(
      fieldId = 3,
      isRequired = true
  )
  public final String fromUUID;

  @ThriftField(
      fieldId = 4,
      isRequired = true
  )
  public final String toUUID;

  private Call(Builder builder) {
    this.fromName = builder.fromName;
    this.toName = builder.toName;
    this.fromUUID = builder.fromUUID;
    this.toUUID = builder.toUUID;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof Call)) return false;
    Call that = (Call) other;
    return (this.fromName == that.fromName || this.fromName.equals(that.fromName))
        && (this.toName == that.toName || this.toName.equals(that.toName))
        && (this.fromUUID == that.fromUUID || this.fromUUID.equals(that.fromUUID))
        && (this.toUUID == that.toUUID || this.toUUID.equals(that.toUUID));
  }

  @Override
  public int hashCode() {
    int code = 16777619;
    code ^= this.fromName.hashCode();
    code *= 0x811c9dc5;
    code ^= this.toName.hashCode();
    code *= 0x811c9dc5;
    code ^= this.fromUUID.hashCode();
    code *= 0x811c9dc5;
    code ^= this.toUUID.hashCode();
    code *= 0x811c9dc5;
    return code;
  }

  @Override
  public String toString() {
    return "Call{fromName=" + this.fromName + ", toName=" + this.toName + ", fromUUID=" + this.fromUUID + ", toUUID=" + this.toUUID + "}";
  }

  @Override
  public void write(Protocol protocol) throws IOException {
    ADAPTER.write(protocol, this);
  }

  public static final class Builder implements StructBuilder<Call> {
    private String fromName;

    private String toName;

    private String fromUUID;

    private String toUUID;

    public Builder() {
    }

    public Builder(Call struct) {
      this.fromName = struct.fromName;
      this.toName = struct.toName;
      this.fromUUID = struct.fromUUID;
      this.toUUID = struct.toUUID;
    }

    public Builder fromName(String fromName) {
      if (fromName == null) {
        throw new NullPointerException("Required field 'fromName' cannot be null");
      }
      this.fromName = fromName;
      return this;
    }

    public Builder toName(String toName) {
      if (toName == null) {
        throw new NullPointerException("Required field 'toName' cannot be null");
      }
      this.toName = toName;
      return this;
    }

    public Builder fromUUID(String fromUUID) {
      if (fromUUID == null) {
        throw new NullPointerException("Required field 'fromUUID' cannot be null");
      }
      this.fromUUID = fromUUID;
      return this;
    }

    public Builder toUUID(String toUUID) {
      if (toUUID == null) {
        throw new NullPointerException("Required field 'toUUID' cannot be null");
      }
      this.toUUID = toUUID;
      return this;
    }

    @Override
    public Call build() {
      if (this.fromName == null) {
        throw new IllegalStateException("Required field 'fromName' is missing");
      }
      if (this.toName == null) {
        throw new IllegalStateException("Required field 'toName' is missing");
      }
      if (this.fromUUID == null) {
        throw new IllegalStateException("Required field 'fromUUID' is missing");
      }
      if (this.toUUID == null) {
        throw new IllegalStateException("Required field 'toUUID' is missing");
      }
      return new Call(this);
    }

    @Override
    public void reset() {
      this.fromName = null;
      this.toName = null;
      this.fromUUID = null;
      this.toUUID = null;
    }
  }

  private static final class CallAdapter implements Adapter<Call, Builder> {
    @Override
    public void write(Protocol protocol, Call struct) throws IOException {
      protocol.writeStructBegin("Call");
      protocol.writeFieldBegin("fromName", 1, TType.STRING);
      protocol.writeString(struct.fromName);
      protocol.writeFieldEnd();
      protocol.writeFieldBegin("toName", 2, TType.STRING);
      protocol.writeString(struct.toName);
      protocol.writeFieldEnd();
      protocol.writeFieldBegin("fromUUID", 3, TType.STRING);
      protocol.writeString(struct.fromUUID);
      protocol.writeFieldEnd();
      protocol.writeFieldBegin("toUUID", 4, TType.STRING);
      protocol.writeString(struct.toUUID);
      protocol.writeFieldEnd();
      protocol.writeFieldStop();
      protocol.writeStructEnd();
    }

    @Override
    public Call read(Protocol protocol, Builder builder) throws IOException {
      protocol.readStructBegin();
      while (true) {
        FieldMetadata field = protocol.readFieldBegin();
        if (field.typeId == TType.STOP) {
          break;
        }
        switch (field.fieldId) {
          case 1: {
            if (field.typeId == TType.STRING) {
              String value = protocol.readString();
              builder.fromName(value);
            } else {
              ProtocolUtil.skip(protocol, field.typeId);
            }
          }
          break;
          case 2: {
            if (field.typeId == TType.STRING) {
              String value = protocol.readString();
              builder.toName(value);
            } else {
              ProtocolUtil.skip(protocol, field.typeId);
            }
          }
          break;
          case 3: {
            if (field.typeId == TType.STRING) {
              String value = protocol.readString();
              builder.fromUUID(value);
            } else {
              ProtocolUtil.skip(protocol, field.typeId);
            }
          }
          break;
          case 4: {
            if (field.typeId == TType.STRING) {
              String value = protocol.readString();
              builder.toUUID(value);
            } else {
              ProtocolUtil.skip(protocol, field.typeId);
            }
          }
          break;
          default: {
            ProtocolUtil.skip(protocol, field.typeId);
          }
          break;
        }
        protocol.readFieldEnd();
      }
      protocol.readStructEnd();
      return builder.build();
    }

    @Override
    public Call read(Protocol protocol) throws IOException {
      return read(protocol, new Builder());
    }
  }
}