/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.schema;  
@SuppressWarnings("all")
/** Record field type. */
@org.apache.avro.specific.AvroGenerated
public class RecordType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordType\",\"namespace\":\"com.linkedin.pegasus2avro.schema\",\"doc\":\"Record field type.\",\"fields\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /** Creates a new RecordType RecordBuilder */
  public static com.linkedin.pegasus2avro.schema.RecordType.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.schema.RecordType.Builder();
  }
  
  /** Creates a new RecordType RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.schema.RecordType.Builder newBuilder(com.linkedin.pegasus2avro.schema.RecordType.Builder other) {
    return new com.linkedin.pegasus2avro.schema.RecordType.Builder(other);
  }
  
  /** Creates a new RecordType RecordBuilder by copying an existing RecordType instance */
  public static com.linkedin.pegasus2avro.schema.RecordType.Builder newBuilder(com.linkedin.pegasus2avro.schema.RecordType other) {
    return new com.linkedin.pegasus2avro.schema.RecordType.Builder(other);
  }
  
  /**
   * RecordBuilder for RecordType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordType>
    implements org.apache.avro.data.RecordBuilder<RecordType> {


    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.schema.RecordType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.schema.RecordType.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing RecordType instance */
    private Builder(com.linkedin.pegasus2avro.schema.RecordType other) {
            super(com.linkedin.pegasus2avro.schema.RecordType.SCHEMA$);
    }

    @Override
    public RecordType build() {
      try {
        RecordType record = new RecordType();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
