/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.datajob;  
@SuppressWarnings("all")
/** Information about a Data processing job */
@org.apache.avro.specific.AvroGenerated
public class VersionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VersionInfo\",\"namespace\":\"com.linkedin.pegasus2avro.datajob\",\"doc\":\"Information about a Data processing job\",\"fields\":[{\"name\":\"customProperties\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"doc\":\"Custom property bag.\",\"default\":{},\"Searchable\":{\"/*\":{\"queryByDefault\":true}}},{\"name\":\"externalUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"URL where the reference exist\",\"default\":null,\"Searchable\":{\"fieldType\":\"KEYWORD\"},\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.url.Url\",\"coercerClass\":\"com.linkedin.pegasus2avro.common.url.UrlCoercer\"}},{\"name\":\"version\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The version which can indentify a job version like a commit hash or md5 hash\"},{\"name\":\"versionType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type of the version like git hash or md5 hash\"}],\"Aspect\":{\"name\":\"versionInfo\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Custom property bag. */
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> customProperties;
  /** URL where the reference exist */
  @Deprecated public java.lang.String externalUrl;
  /** The version which can indentify a job version like a commit hash or md5 hash */
  @Deprecated public java.lang.String version;
  /** The type of the version like git hash or md5 hash */
  @Deprecated public java.lang.String versionType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public VersionInfo() {}

  /**
   * All-args constructor.
   */
  public VersionInfo(java.util.Map<java.lang.String,java.lang.String> customProperties, java.lang.String externalUrl, java.lang.String version, java.lang.String versionType) {
    this.customProperties = customProperties;
    this.externalUrl = externalUrl;
    this.version = version;
    this.versionType = versionType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customProperties;
    case 1: return externalUrl;
    case 2: return version;
    case 3: return versionType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customProperties = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 1: externalUrl = (java.lang.String)value$; break;
    case 2: version = (java.lang.String)value$; break;
    case 3: versionType = (java.lang.String)value$; break;
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
   * Gets the value of the 'version' field.
   * The version which can indentify a job version like a commit hash or md5 hash   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * The version which can indentify a job version like a commit hash or md5 hash   * @param value the value to set.
   */
  public void setVersion(java.lang.String value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'versionType' field.
   * The type of the version like git hash or md5 hash   */
  public java.lang.String getVersionType() {
    return versionType;
  }

  /**
   * Sets the value of the 'versionType' field.
   * The type of the version like git hash or md5 hash   * @param value the value to set.
   */
  public void setVersionType(java.lang.String value) {
    this.versionType = value;
  }

  /** Creates a new VersionInfo RecordBuilder */
  public static com.linkedin.pegasus2avro.datajob.VersionInfo.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.datajob.VersionInfo.Builder();
  }
  
  /** Creates a new VersionInfo RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.datajob.VersionInfo.Builder newBuilder(com.linkedin.pegasus2avro.datajob.VersionInfo.Builder other) {
    return new com.linkedin.pegasus2avro.datajob.VersionInfo.Builder(other);
  }
  
  /** Creates a new VersionInfo RecordBuilder by copying an existing VersionInfo instance */
  public static com.linkedin.pegasus2avro.datajob.VersionInfo.Builder newBuilder(com.linkedin.pegasus2avro.datajob.VersionInfo other) {
    return new com.linkedin.pegasus2avro.datajob.VersionInfo.Builder(other);
  }
  
  /**
   * RecordBuilder for VersionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VersionInfo>
    implements org.apache.avro.data.RecordBuilder<VersionInfo> {

    private java.util.Map<java.lang.String,java.lang.String> customProperties;
    private java.lang.String externalUrl;
    private java.lang.String version;
    private java.lang.String versionType;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.datajob.VersionInfo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.datajob.VersionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customProperties)) {
        this.customProperties = data().deepCopy(fields()[0].schema(), other.customProperties);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalUrl)) {
        this.externalUrl = data().deepCopy(fields()[1].schema(), other.externalUrl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.versionType)) {
        this.versionType = data().deepCopy(fields()[3].schema(), other.versionType);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing VersionInfo instance */
    private Builder(com.linkedin.pegasus2avro.datajob.VersionInfo other) {
            super(com.linkedin.pegasus2avro.datajob.VersionInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.customProperties)) {
        this.customProperties = data().deepCopy(fields()[0].schema(), other.customProperties);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalUrl)) {
        this.externalUrl = data().deepCopy(fields()[1].schema(), other.externalUrl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.versionType)) {
        this.versionType = data().deepCopy(fields()[3].schema(), other.versionType);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'customProperties' field */
    public java.util.Map<java.lang.String,java.lang.String> getCustomProperties() {
      return customProperties;
    }
    
    /** Sets the value of the 'customProperties' field */
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder setCustomProperties(java.util.Map<java.lang.String,java.lang.String> value) {
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
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder clearCustomProperties() {
      customProperties = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'externalUrl' field */
    public java.lang.String getExternalUrl() {
      return externalUrl;
    }
    
    /** Sets the value of the 'externalUrl' field */
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder setExternalUrl(java.lang.String value) {
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
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder clearExternalUrl() {
      externalUrl = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'version' field */
    public java.lang.String getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder setVersion(java.lang.String value) {
      validate(fields()[2], value);
      this.version = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'version' field */
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder clearVersion() {
      version = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'versionType' field */
    public java.lang.String getVersionType() {
      return versionType;
    }
    
    /** Sets the value of the 'versionType' field */
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder setVersionType(java.lang.String value) {
      validate(fields()[3], value);
      this.versionType = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'versionType' field has been set */
    public boolean hasVersionType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'versionType' field */
    public com.linkedin.pegasus2avro.datajob.VersionInfo.Builder clearVersionType() {
      versionType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public VersionInfo build() {
      try {
        VersionInfo record = new VersionInfo();
        record.customProperties = fieldSetFlags()[0] ? this.customProperties : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[0]);
        record.externalUrl = fieldSetFlags()[1] ? this.externalUrl : (java.lang.String) defaultValue(fields()[1]);
        record.version = fieldSetFlags()[2] ? this.version : (java.lang.String) defaultValue(fields()[2]);
        record.versionType = fieldSetFlags()[3] ? this.versionType : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
