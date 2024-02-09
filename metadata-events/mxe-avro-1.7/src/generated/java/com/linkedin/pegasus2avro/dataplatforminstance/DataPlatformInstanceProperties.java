/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.dataplatforminstance;  
@SuppressWarnings("all")
/** Properties associated with a Data Platform Instance */
@org.apache.avro.specific.AvroGenerated
public class DataPlatformInstanceProperties extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataPlatformInstanceProperties\",\"namespace\":\"com.linkedin.pegasus2avro.dataplatforminstance\",\"doc\":\"Properties associated with a Data Platform Instance\",\"fields\":[{\"name\":\"customProperties\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"doc\":\"Custom property bag.\",\"default\":{},\"Searchable\":{\"/*\":{\"queryByDefault\":true}}},{\"name\":\"externalUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"URL where the reference exist\",\"default\":null,\"Searchable\":{\"fieldType\":\"KEYWORD\"},\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.url.Url\",\"coercerClass\":\"com.linkedin.pegasus2avro.common.url.UrlCoercer\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Display name of the Data Platform Instance\",\"default\":null,\"Searchable\":{\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\"}},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Documentation of the Data Platform Instance\",\"default\":null,\"Searchable\":{\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\"}}],\"Aspect\":{\"name\":\"dataPlatformInstanceProperties\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Custom property bag. */
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> customProperties;
  /** URL where the reference exist */
  @Deprecated public java.lang.String externalUrl;
  /** Display name of the Data Platform Instance */
  @Deprecated public java.lang.String name;
  /** Documentation of the Data Platform Instance */
  @Deprecated public java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataPlatformInstanceProperties() {}

  /**
   * All-args constructor.
   */
  public DataPlatformInstanceProperties(java.util.Map<java.lang.String,java.lang.String> customProperties, java.lang.String externalUrl, java.lang.String name, java.lang.String description) {
    this.customProperties = customProperties;
    this.externalUrl = externalUrl;
    this.name = name;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customProperties;
    case 1: return externalUrl;
    case 2: return name;
    case 3: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customProperties = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 1: externalUrl = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: description = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'customProperties' field.
   * Custom property bag.   */
  public java.util.Map<java.lang.String,java.lang.String> getCustomProperties() {
    return customProperties;
  }

  /**
   * Sets the value of the 'customProperties' field.
   * Custom property bag.   * @param value the value to set.
   */
  public void setCustomProperties(java.util.Map<java.lang.String,java.lang.String> value) {
    this.customProperties = value;
  }

  /**
   * Gets the value of the 'externalUrl' field.
   * URL where the reference exist   */
  public java.lang.String getExternalUrl() {
    return externalUrl;
  }

  /**
   * Sets the value of the 'externalUrl' field.
   * URL where the reference exist   * @param value the value to set.
   */
  public void setExternalUrl(java.lang.String value) {
    this.externalUrl = value;
  }

  /**
   * Gets the value of the 'name' field.
   * Display name of the Data Platform Instance   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Display name of the Data Platform Instance   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * Documentation of the Data Platform Instance   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Documentation of the Data Platform Instance   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /** Creates a new DataPlatformInstanceProperties RecordBuilder */
  public static com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder();
  }
  
  /** Creates a new DataPlatformInstanceProperties RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder newBuilder(com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder other) {
    return new com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder(other);
  }
  
  /** Creates a new DataPlatformInstanceProperties RecordBuilder by copying an existing DataPlatformInstanceProperties instance */
  public static com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder newBuilder(com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties other) {
    return new com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder(other);
  }
  
  /**
   * RecordBuilder for DataPlatformInstanceProperties instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataPlatformInstanceProperties>
    implements org.apache.avro.data.RecordBuilder<DataPlatformInstanceProperties> {

    private java.util.Map<java.lang.String,java.lang.String> customProperties;
    private java.lang.String externalUrl;
    private java.lang.String name;
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customProperties)) {
        this.customProperties = data().deepCopy(fields()[0].schema(), other.customProperties);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalUrl)) {
        this.externalUrl = data().deepCopy(fields()[1].schema(), other.externalUrl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataPlatformInstanceProperties instance */
    private Builder(com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties other) {
            super(com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.SCHEMA$);
      if (isValidValue(fields()[0], other.customProperties)) {
        this.customProperties = data().deepCopy(fields()[0].schema(), other.customProperties);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalUrl)) {
        this.externalUrl = data().deepCopy(fields()[1].schema(), other.externalUrl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'customProperties' field */
    public java.util.Map<java.lang.String,java.lang.String> getCustomProperties() {
      return customProperties;
    }
    
    /** Sets the value of the 'customProperties' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder setCustomProperties(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[0], value);
      this.customProperties = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'customProperties' field has been set */
    public boolean hasCustomProperties() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'customProperties' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder clearCustomProperties() {
      customProperties = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'externalUrl' field */
    public java.lang.String getExternalUrl() {
      return externalUrl;
    }
    
    /** Sets the value of the 'externalUrl' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder setExternalUrl(java.lang.String value) {
      validate(fields()[1], value);
      this.externalUrl = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'externalUrl' field has been set */
    public boolean hasExternalUrl() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'externalUrl' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder clearExternalUrl() {
      externalUrl = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'name' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder setDescription(java.lang.String value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'description' field */
    public com.linkedin.pegasus2avro.dataplatforminstance.DataPlatformInstanceProperties.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public DataPlatformInstanceProperties build() {
      try {
        DataPlatformInstanceProperties record = new DataPlatformInstanceProperties();
        record.customProperties = fieldSetFlags()[0] ? this.customProperties : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[0]);
        record.externalUrl = fieldSetFlags()[1] ? this.externalUrl : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
