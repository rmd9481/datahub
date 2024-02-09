/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.common;  
@SuppressWarnings("all")
/** The specific instance of the data platform that this entity belongs to */
@org.apache.avro.specific.AvroGenerated
public class DataPlatformInstance extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataPlatformInstance\",\"namespace\":\"com.linkedin.pegasus2avro.common\",\"doc\":\"The specific instance of the data platform that this entity belongs to\",\"fields\":[{\"name\":\"platform\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Data Platform\",\"Searchable\":{\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"},\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.urn.Urn\"}},{\"name\":\"instance\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Instance of the data platform (e.g. db instance)\",\"default\":null,\"Searchable\":{\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"},\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.urn.Urn\"}}],\"Aspect\":{\"name\":\"dataPlatformInstance\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Data Platform */
  @Deprecated public java.lang.String platform;
  /** Instance of the data platform (e.g. db instance) */
  @Deprecated public java.lang.String instance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataPlatformInstance() {}

  /**
   * All-args constructor.
   */
  public DataPlatformInstance(java.lang.String platform, java.lang.String instance) {
    this.platform = platform;
    this.instance = instance;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return platform;
    case 1: return instance;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: platform = (java.lang.String)value$; break;
    case 1: instance = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'platform' field.
   * Data Platform   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * Sets the value of the 'platform' field.
   * Data Platform   * @param value the value to set.
   */
  public void setPlatform(java.lang.String value) {
    this.platform = value;
  }

  /**
   * Gets the value of the 'instance' field.
   * Instance of the data platform (e.g. db instance)   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * Sets the value of the 'instance' field.
   * Instance of the data platform (e.g. db instance)   * @param value the value to set.
   */
  public void setInstance(java.lang.String value) {
    this.instance = value;
  }

  /** Creates a new DataPlatformInstance RecordBuilder */
  public static com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder();
  }
  
  /** Creates a new DataPlatformInstance RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder newBuilder(com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder other) {
    return new com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder(other);
  }
  
  /** Creates a new DataPlatformInstance RecordBuilder by copying an existing DataPlatformInstance instance */
  public static com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder newBuilder(com.linkedin.pegasus2avro.common.DataPlatformInstance other) {
    return new com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder(other);
  }
  
  /**
   * RecordBuilder for DataPlatformInstance instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataPlatformInstance>
    implements org.apache.avro.data.RecordBuilder<DataPlatformInstance> {

    private java.lang.String platform;
    private java.lang.String instance;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.common.DataPlatformInstance.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.platform)) {
        this.platform = data().deepCopy(fields()[0].schema(), other.platform);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.instance)) {
        this.instance = data().deepCopy(fields()[1].schema(), other.instance);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataPlatformInstance instance */
    private Builder(com.linkedin.pegasus2avro.common.DataPlatformInstance other) {
            super(com.linkedin.pegasus2avro.common.DataPlatformInstance.SCHEMA$);
      if (isValidValue(fields()[0], other.platform)) {
        this.platform = data().deepCopy(fields()[0].schema(), other.platform);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.instance)) {
        this.instance = data().deepCopy(fields()[1].schema(), other.instance);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'platform' field */
    public java.lang.String getPlatform() {
      return platform;
    }
    
    /** Sets the value of the 'platform' field */
    public com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder setPlatform(java.lang.String value) {
      validate(fields()[0], value);
      this.platform = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'platform' field has been set */
    public boolean hasPlatform() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'platform' field */
    public com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder clearPlatform() {
      platform = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'instance' field */
    public java.lang.String getInstance() {
      return instance;
    }
    
    /** Sets the value of the 'instance' field */
    public com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder setInstance(java.lang.String value) {
      validate(fields()[1], value);
      this.instance = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'instance' field has been set */
    public boolean hasInstance() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'instance' field */
    public com.linkedin.pegasus2avro.common.DataPlatformInstance.Builder clearInstance() {
      instance = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DataPlatformInstance build() {
      try {
        DataPlatformInstance record = new DataPlatformInstance();
        record.platform = fieldSetFlags()[0] ? this.platform : (java.lang.String) defaultValue(fields()[0]);
        record.instance = fieldSetFlags()[1] ? this.instance : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
