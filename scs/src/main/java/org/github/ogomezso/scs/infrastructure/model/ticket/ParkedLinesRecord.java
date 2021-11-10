/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.github.ogomezso.scs.infrastructure.model.ticket;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ParkedLinesRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7126121486838181050L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ParkedLinesRecord\",\"namespace\":\"org.github.ogomezso.scs.infrastructure.model.ticket\",\"fields\":[{\"name\":\"employeeId\",\"type\":\"string\"},{\"name\":\"parkedTime\",\"type\":\"string\"},{\"name\":\"parkedType\",\"type\":\"string\"},{\"name\":\"lineNumber\",\"type\":\"int\"},{\"name\":\"amountLine\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ParkedLinesRecord> ENCODER =
      new BinaryMessageEncoder<ParkedLinesRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ParkedLinesRecord> DECODER =
      new BinaryMessageDecoder<ParkedLinesRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ParkedLinesRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ParkedLinesRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ParkedLinesRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ParkedLinesRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ParkedLinesRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ParkedLinesRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ParkedLinesRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ParkedLinesRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence employeeId;
  private java.lang.CharSequence parkedTime;
  private java.lang.CharSequence parkedType;
  private int lineNumber;
  private java.lang.CharSequence amountLine;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ParkedLinesRecord() {}

  /**
   * All-args constructor.
   * @param employeeId The new value for employeeId
   * @param parkedTime The new value for parkedTime
   * @param parkedType The new value for parkedType
   * @param lineNumber The new value for lineNumber
   * @param amountLine The new value for amountLine
   */
  public ParkedLinesRecord(java.lang.CharSequence employeeId, java.lang.CharSequence parkedTime, java.lang.CharSequence parkedType, java.lang.Integer lineNumber, java.lang.CharSequence amountLine) {
    this.employeeId = employeeId;
    this.parkedTime = parkedTime;
    this.parkedType = parkedType;
    this.lineNumber = lineNumber;
    this.amountLine = amountLine;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return employeeId;
    case 1: return parkedTime;
    case 2: return parkedType;
    case 3: return lineNumber;
    case 4: return amountLine;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: employeeId = (java.lang.CharSequence)value$; break;
    case 1: parkedTime = (java.lang.CharSequence)value$; break;
    case 2: parkedType = (java.lang.CharSequence)value$; break;
    case 3: lineNumber = (java.lang.Integer)value$; break;
    case 4: amountLine = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'employeeId' field.
   * @return The value of the 'employeeId' field.
   */
  public java.lang.CharSequence getEmployeeId() {
    return employeeId;
  }


  /**
   * Sets the value of the 'employeeId' field.
   * @param value the value to set.
   */
  public void setEmployeeId(java.lang.CharSequence value) {
    this.employeeId = value;
  }

  /**
   * Gets the value of the 'parkedTime' field.
   * @return The value of the 'parkedTime' field.
   */
  public java.lang.CharSequence getParkedTime() {
    return parkedTime;
  }


  /**
   * Sets the value of the 'parkedTime' field.
   * @param value the value to set.
   */
  public void setParkedTime(java.lang.CharSequence value) {
    this.parkedTime = value;
  }

  /**
   * Gets the value of the 'parkedType' field.
   * @return The value of the 'parkedType' field.
   */
  public java.lang.CharSequence getParkedType() {
    return parkedType;
  }


  /**
   * Sets the value of the 'parkedType' field.
   * @param value the value to set.
   */
  public void setParkedType(java.lang.CharSequence value) {
    this.parkedType = value;
  }

  /**
   * Gets the value of the 'lineNumber' field.
   * @return The value of the 'lineNumber' field.
   */
  public int getLineNumber() {
    return lineNumber;
  }


  /**
   * Sets the value of the 'lineNumber' field.
   * @param value the value to set.
   */
  public void setLineNumber(int value) {
    this.lineNumber = value;
  }

  /**
   * Gets the value of the 'amountLine' field.
   * @return The value of the 'amountLine' field.
   */
  public java.lang.CharSequence getAmountLine() {
    return amountLine;
  }


  /**
   * Sets the value of the 'amountLine' field.
   * @param value the value to set.
   */
  public void setAmountLine(java.lang.CharSequence value) {
    this.amountLine = value;
  }

  /**
   * Creates a new ParkedLinesRecord RecordBuilder.
   * @return A new ParkedLinesRecord RecordBuilder
   */
  public static org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder newBuilder() {
    return new org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder();
  }

  /**
   * Creates a new ParkedLinesRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ParkedLinesRecord RecordBuilder
   */
  public static org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder newBuilder(org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder other) {
    if (other == null) {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder();
    } else {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder(other);
    }
  }

  /**
   * Creates a new ParkedLinesRecord RecordBuilder by copying an existing ParkedLinesRecord instance.
   * @param other The existing instance to copy.
   * @return A new ParkedLinesRecord RecordBuilder
   */
  public static org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder newBuilder(org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord other) {
    if (other == null) {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder();
    } else {
      return new org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for ParkedLinesRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ParkedLinesRecord>
    implements org.apache.avro.data.RecordBuilder<ParkedLinesRecord> {

    private java.lang.CharSequence employeeId;
    private java.lang.CharSequence parkedTime;
    private java.lang.CharSequence parkedType;
    private int lineNumber;
    private java.lang.CharSequence amountLine;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.employeeId)) {
        this.employeeId = data().deepCopy(fields()[0].schema(), other.employeeId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.parkedTime)) {
        this.parkedTime = data().deepCopy(fields()[1].schema(), other.parkedTime);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.parkedType)) {
        this.parkedType = data().deepCopy(fields()[2].schema(), other.parkedType);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.lineNumber)) {
        this.lineNumber = data().deepCopy(fields()[3].schema(), other.lineNumber);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.amountLine)) {
        this.amountLine = data().deepCopy(fields()[4].schema(), other.amountLine);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing ParkedLinesRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.employeeId)) {
        this.employeeId = data().deepCopy(fields()[0].schema(), other.employeeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parkedTime)) {
        this.parkedTime = data().deepCopy(fields()[1].schema(), other.parkedTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parkedType)) {
        this.parkedType = data().deepCopy(fields()[2].schema(), other.parkedType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lineNumber)) {
        this.lineNumber = data().deepCopy(fields()[3].schema(), other.lineNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.amountLine)) {
        this.amountLine = data().deepCopy(fields()[4].schema(), other.amountLine);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'employeeId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmployeeId() {
      return employeeId;
    }


    /**
      * Sets the value of the 'employeeId' field.
      * @param value The value of 'employeeId'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder setEmployeeId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.employeeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'employeeId' field has been set.
      * @return True if the 'employeeId' field has been set, false otherwise.
      */
    public boolean hasEmployeeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'employeeId' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder clearEmployeeId() {
      employeeId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'parkedTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getParkedTime() {
      return parkedTime;
    }


    /**
      * Sets the value of the 'parkedTime' field.
      * @param value The value of 'parkedTime'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder setParkedTime(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.parkedTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'parkedTime' field has been set.
      * @return True if the 'parkedTime' field has been set, false otherwise.
      */
    public boolean hasParkedTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'parkedTime' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder clearParkedTime() {
      parkedTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'parkedType' field.
      * @return The value.
      */
    public java.lang.CharSequence getParkedType() {
      return parkedType;
    }


    /**
      * Sets the value of the 'parkedType' field.
      * @param value The value of 'parkedType'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder setParkedType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.parkedType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'parkedType' field has been set.
      * @return True if the 'parkedType' field has been set, false otherwise.
      */
    public boolean hasParkedType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'parkedType' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder clearParkedType() {
      parkedType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lineNumber' field.
      * @return The value.
      */
    public int getLineNumber() {
      return lineNumber;
    }


    /**
      * Sets the value of the 'lineNumber' field.
      * @param value The value of 'lineNumber'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder setLineNumber(int value) {
      validate(fields()[3], value);
      this.lineNumber = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lineNumber' field has been set.
      * @return True if the 'lineNumber' field has been set, false otherwise.
      */
    public boolean hasLineNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'lineNumber' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder clearLineNumber() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'amountLine' field.
      * @return The value.
      */
    public java.lang.CharSequence getAmountLine() {
      return amountLine;
    }


    /**
      * Sets the value of the 'amountLine' field.
      * @param value The value of 'amountLine'.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder setAmountLine(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.amountLine = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'amountLine' field has been set.
      * @return True if the 'amountLine' field has been set, false otherwise.
      */
    public boolean hasAmountLine() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'amountLine' field.
      * @return This builder.
      */
    public org.github.ogomezso.scs.infrastructure.model.ticket.ParkedLinesRecord.Builder clearAmountLine() {
      amountLine = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ParkedLinesRecord build() {
      try {
        ParkedLinesRecord record = new ParkedLinesRecord();
        record.employeeId = fieldSetFlags()[0] ? this.employeeId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.parkedTime = fieldSetFlags()[1] ? this.parkedTime : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.parkedType = fieldSetFlags()[2] ? this.parkedType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.lineNumber = fieldSetFlags()[3] ? this.lineNumber : (java.lang.Integer) defaultValue(fields()[3]);
        record.amountLine = fieldSetFlags()[4] ? this.amountLine : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ParkedLinesRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<ParkedLinesRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ParkedLinesRecord>
    READER$ = (org.apache.avro.io.DatumReader<ParkedLinesRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.employeeId);

    out.writeString(this.parkedTime);

    out.writeString(this.parkedType);

    out.writeInt(this.lineNumber);

    out.writeString(this.amountLine);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.employeeId = in.readString(this.employeeId instanceof Utf8 ? (Utf8)this.employeeId : null);

      this.parkedTime = in.readString(this.parkedTime instanceof Utf8 ? (Utf8)this.parkedTime : null);

      this.parkedType = in.readString(this.parkedType instanceof Utf8 ? (Utf8)this.parkedType : null);

      this.lineNumber = in.readInt();

      this.amountLine = in.readString(this.amountLine instanceof Utf8 ? (Utf8)this.amountLine : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.employeeId = in.readString(this.employeeId instanceof Utf8 ? (Utf8)this.employeeId : null);
          break;

        case 1:
          this.parkedTime = in.readString(this.parkedTime instanceof Utf8 ? (Utf8)this.parkedTime : null);
          break;

        case 2:
          this.parkedType = in.readString(this.parkedType instanceof Utf8 ? (Utf8)this.parkedType : null);
          break;

        case 3:
          this.lineNumber = in.readInt();
          break;

        case 4:
          this.amountLine = in.readString(this.amountLine instanceof Utf8 ? (Utf8)this.amountLine : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









