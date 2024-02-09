/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.common;  
@SuppressWarnings("all")
/** Represents a single level in an entity's browsePathV2 */
@org.apache.avro.specific.AvroGenerated
public class BrowsePathEntry extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BrowsePathEntry\",\"namespace\":\"com.linkedin.pegasus2avro.common\",\"doc\":\"Represents a single level in an entity's browsePathV2\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the browse path entry. This is what gets stored in the index.\\nIf there's an urn associated with this entry, id and urn will be the same\"},{\"name\":\"urn\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Optional urn pointing to some entity in DataHub\",\"default\":null,\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.urn.Urn\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The ID of the browse path entry. This is what gets stored in the index.
If there's an urn associated with this entry, id and urn will be the same */
  @Deprecated public java.lang.String id;
  /** Optional urn pointing to some entity in DataHub */
  @Deprecated public java.lang.String urn;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public BrowsePathEntry() {}

  /**
   * All-args constructor.
   */
  public BrowsePathEntry(java.lang.String id, java.lang.String urn) {
    this.id = id;
    this.urn = urn;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return urn;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: urn = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * The ID of the browse path entry. This is what gets stored in the index.
If there's an urn associated with this entry, id and urn will be the same   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The ID of the browse path entry. This is what gets stored in the index.
If there's an urn associated with this entry, id and urn will be the same   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'urn' field.
   * Optional urn pointing to some entity in DataHub   */
  public java.lang.String getUrn() {
    return urn;
  }

  /**
   * Sets the value of the 'urn' field.
   * Optional urn pointing to some entity in DataHub   * @param value the value to set.
   */
  public void setUrn(java.lang.String value) {
    this.urn = value;
  }

  /** Creates a new BrowsePathEntry RecordBuilder */
  public static com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder();
  }
  
  /** Creates a new BrowsePathEntry RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder newBuilder(com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder other) {
    return new com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder(other);
  }
  
  /** Creates a new BrowsePathEntry RecordBuilder by copying an existing BrowsePathEntry instance */
  public static com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder newBuilder(com.linkedin.pegasus2avro.common.BrowsePathEntry other) {
    return new com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder(other);
  }
  
  /**
   * RecordBuilder for BrowsePathEntry instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BrowsePathEntry>
    implements org.apache.avro.data.RecordBuilder<BrowsePathEntry> {

    private java.lang.String id;
    private java.lang.String urn;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.common.BrowsePathEntry.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.urn)) {
        this.urn = data().deepCopy(fields()[1].schema(), other.urn);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing BrowsePathEntry instance */
    private Builder(com.linkedin.pegasus2avro.common.BrowsePathEntry other) {
            super(com.linkedin.pegasus2avro.common.BrowsePathEntry.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.urn)) {
        this.urn = data().deepCopy(fields()[1].schema(), other.urn);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'urn' field */
    public java.lang.String getUrn() {
      return urn;
    }
    
    /** Sets the value of the 'urn' field */
    public com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder setUrn(java.lang.String value) {
      validate(fields()[1], value);
      this.urn = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'urn' field has been set */
    public boolean hasUrn() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'urn' field */
    public com.linkedin.pegasus2avro.common.BrowsePathEntry.Builder clearUrn() {
      urn = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public BrowsePathEntry build() {
      try {
        BrowsePathEntry record = new BrowsePathEntry();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.urn = fieldSetFlags()[1] ? this.urn : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
