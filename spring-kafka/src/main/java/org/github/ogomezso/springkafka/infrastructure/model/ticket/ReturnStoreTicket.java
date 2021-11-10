/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.github.ogomezso.springkafka.infrastructure.model.ticket;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ReturnStoreTicket extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 672376217539282852L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReturnStoreTicket\",\"namespace\":\"org.github.ogomezso.springkafka.infrastructure.model.ticket\",\"fields\":[{\"name\":\"ticketDate\",\"type\":\"string\"},{\"name\":\"storePublicId\",\"type\":\"string\"},{\"name\":\"ticketNumber\",\"type\":\"string\"},{\"name\":\"posId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ReturnStoreTicket> ENCODER =
      new BinaryMessageEncoder<ReturnStoreTicket>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ReturnStoreTicket> DECODER =
      new BinaryMessageDecoder<ReturnStoreTicket>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ReturnStoreTicket> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ReturnStoreTicket> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ReturnStoreTicket> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ReturnStoreTicket>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ReturnStoreTicket to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ReturnStoreTicket from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ReturnStoreTicket instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ReturnStoreTicket fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence ticketDate;
  private java.lang.CharSequence storePublicId;
  private java.lang.CharSequence ticketNumber;
  private java.lang.CharSequence posId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ReturnStoreTicket() {}

  /**
   * All-args constructor.
   * @param ticketDate The new value for ticketDate
   * @param storePublicId The new value for storePublicId
   * @param ticketNumber The new value for ticketNumber
   * @param posId The new value for posId
   */
  public ReturnStoreTicket(java.lang.CharSequence ticketDate, java.lang.CharSequence storePublicId, java.lang.CharSequence ticketNumber, java.lang.CharSequence posId) {
    this.ticketDate = ticketDate;
    this.storePublicId = storePublicId;
    this.ticketNumber = ticketNumber;
    this.posId = posId;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ticketDate;
    case 1: return storePublicId;
    case 2: return ticketNumber;
    case 3: return posId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ticketDate = (java.lang.CharSequence)value$; break;
    case 1: storePublicId = (java.lang.CharSequence)value$; break;
    case 2: ticketNumber = (java.lang.CharSequence)value$; break;
    case 3: posId = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ticketDate' field.
   * @return The value of the 'ticketDate' field.
   */
  public java.lang.CharSequence getTicketDate() {
    return ticketDate;
  }


  /**
   * Sets the value of the 'ticketDate' field.
   * @param value the value to set.
   */
  public void setTicketDate(java.lang.CharSequence value) {
    this.ticketDate = value;
  }

  /**
   * Gets the value of the 'storePublicId' field.
   * @return The value of the 'storePublicId' field.
   */
  public java.lang.CharSequence getStorePublicId() {
    return storePublicId;
  }


  /**
   * Sets the value of the 'storePublicId' field.
   * @param value the value to set.
   */
  public void setStorePublicId(java.lang.CharSequence value) {
    this.storePublicId = value;
  }

  /**
   * Gets the value of the 'ticketNumber' field.
   * @return The value of the 'ticketNumber' field.
   */
  public java.lang.CharSequence getTicketNumber() {
    return ticketNumber;
  }


  /**
   * Sets the value of the 'ticketNumber' field.
   * @param value the value to set.
   */
  public void setTicketNumber(java.lang.CharSequence value) {
    this.ticketNumber = value;
  }

  /**
   * Gets the value of the 'posId' field.
   * @return The value of the 'posId' field.
   */
  public java.lang.CharSequence getPosId() {
    return posId;
  }


  /**
   * Sets the value of the 'posId' field.
   * @param value the value to set.
   */
  public void setPosId(java.lang.CharSequence value) {
    this.posId = value;
  }

  /**
   * Creates a new ReturnStoreTicket RecordBuilder.
   * @return A new ReturnStoreTicket RecordBuilder
   */
  public static org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder newBuilder() {
    return new org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder();
  }

  /**
   * Creates a new ReturnStoreTicket RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ReturnStoreTicket RecordBuilder
   */
  public static org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder newBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder other) {
    if (other == null) {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder();
    } else {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder(other);
    }
  }

  /**
   * Creates a new ReturnStoreTicket RecordBuilder by copying an existing ReturnStoreTicket instance.
   * @param other The existing instance to copy.
   * @return A new ReturnStoreTicket RecordBuilder
   */
  public static org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder newBuilder(org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket other) {
    if (other == null) {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder();
    } else {
      return new org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder(other);
    }
  }

  /**
   * RecordBuilder for ReturnStoreTicket instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReturnStoreTicket>
    implements org.apache.avro.data.RecordBuilder<ReturnStoreTicket> {

    private java.lang.CharSequence ticketDate;
    private java.lang.CharSequence storePublicId;
    private java.lang.CharSequence ticketNumber;
    private java.lang.CharSequence posId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ticketDate)) {
        this.ticketDate = data().deepCopy(fields()[0].schema(), other.ticketDate);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.storePublicId)) {
        this.storePublicId = data().deepCopy(fields()[1].schema(), other.storePublicId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.ticketNumber)) {
        this.ticketNumber = data().deepCopy(fields()[2].schema(), other.ticketNumber);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.posId)) {
        this.posId = data().deepCopy(fields()[3].schema(), other.posId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing ReturnStoreTicket instance
     * @param other The existing instance to copy.
     */
    private Builder(org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ticketDate)) {
        this.ticketDate = data().deepCopy(fields()[0].schema(), other.ticketDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.storePublicId)) {
        this.storePublicId = data().deepCopy(fields()[1].schema(), other.storePublicId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ticketNumber)) {
        this.ticketNumber = data().deepCopy(fields()[2].schema(), other.ticketNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.posId)) {
        this.posId = data().deepCopy(fields()[3].schema(), other.posId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'ticketDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getTicketDate() {
      return ticketDate;
    }


    /**
      * Sets the value of the 'ticketDate' field.
      * @param value The value of 'ticketDate'.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder setTicketDate(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ticketDate = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ticketDate' field has been set.
      * @return True if the 'ticketDate' field has been set, false otherwise.
      */
    public boolean hasTicketDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ticketDate' field.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder clearTicketDate() {
      ticketDate = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'storePublicId' field.
      * @return The value.
      */
    public java.lang.CharSequence getStorePublicId() {
      return storePublicId;
    }


    /**
      * Sets the value of the 'storePublicId' field.
      * @param value The value of 'storePublicId'.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder setStorePublicId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.storePublicId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'storePublicId' field has been set.
      * @return True if the 'storePublicId' field has been set, false otherwise.
      */
    public boolean hasStorePublicId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'storePublicId' field.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder clearStorePublicId() {
      storePublicId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ticketNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getTicketNumber() {
      return ticketNumber;
    }


    /**
      * Sets the value of the 'ticketNumber' field.
      * @param value The value of 'ticketNumber'.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder setTicketNumber(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ticketNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ticketNumber' field has been set.
      * @return True if the 'ticketNumber' field has been set, false otherwise.
      */
    public boolean hasTicketNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ticketNumber' field.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder clearTicketNumber() {
      ticketNumber = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'posId' field.
      * @return The value.
      */
    public java.lang.CharSequence getPosId() {
      return posId;
    }


    /**
      * Sets the value of the 'posId' field.
      * @param value The value of 'posId'.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder setPosId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.posId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'posId' field has been set.
      * @return True if the 'posId' field has been set, false otherwise.
      */
    public boolean hasPosId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'posId' field.
      * @return This builder.
      */
    public org.github.ogomezso.springkafka.infrastructure.model.ticket.ReturnStoreTicket.Builder clearPosId() {
      posId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReturnStoreTicket build() {
      try {
        ReturnStoreTicket record = new ReturnStoreTicket();
        record.ticketDate = fieldSetFlags()[0] ? this.ticketDate : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.storePublicId = fieldSetFlags()[1] ? this.storePublicId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ticketNumber = fieldSetFlags()[2] ? this.ticketNumber : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.posId = fieldSetFlags()[3] ? this.posId : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ReturnStoreTicket>
    WRITER$ = (org.apache.avro.io.DatumWriter<ReturnStoreTicket>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ReturnStoreTicket>
    READER$ = (org.apache.avro.io.DatumReader<ReturnStoreTicket>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ticketDate);

    out.writeString(this.storePublicId);

    out.writeString(this.ticketNumber);

    out.writeString(this.posId);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ticketDate = in.readString(this.ticketDate instanceof Utf8 ? (Utf8)this.ticketDate : null);

      this.storePublicId = in.readString(this.storePublicId instanceof Utf8 ? (Utf8)this.storePublicId : null);

      this.ticketNumber = in.readString(this.ticketNumber instanceof Utf8 ? (Utf8)this.ticketNumber : null);

      this.posId = in.readString(this.posId instanceof Utf8 ? (Utf8)this.posId : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ticketDate = in.readString(this.ticketDate instanceof Utf8 ? (Utf8)this.ticketDate : null);
          break;

        case 1:
          this.storePublicId = in.readString(this.storePublicId instanceof Utf8 ? (Utf8)this.storePublicId : null);
          break;

        case 2:
          this.ticketNumber = in.readString(this.ticketNumber instanceof Utf8 ? (Utf8)this.ticketNumber : null);
          break;

        case 3:
          this.posId = in.readString(this.posId instanceof Utf8 ? (Utf8)this.posId : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










