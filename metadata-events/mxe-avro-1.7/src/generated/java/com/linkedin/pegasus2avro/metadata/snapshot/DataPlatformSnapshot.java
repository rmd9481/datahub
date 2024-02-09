/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.metadata.snapshot;  
@SuppressWarnings("all")
/** A metadata snapshot for a specific dataplatform entity. */
@org.apache.avro.specific.AvroGenerated
public class DataPlatformSnapshot extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataPlatformSnapshot\",\"namespace\":\"com.linkedin.pegasus2avro.metadata.snapshot\",\"doc\":\"A metadata snapshot for a specific dataplatform entity.\",\"fields\":[{\"name\":\"urn\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"URN for the entity the metadata snapshot is associated with.\",\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.urn.DataPlatformUrn\"}},{\"name\":\"aspects\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"record\",\"name\":\"DataPlatformKey\",\"namespace\":\"com.linkedin.pegasus2avro.metadata.key\",\"doc\":\"Key for a Data Platform\",\"fields\":[{\"name\":\"platformName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Data platform name i.e. hdfs, oracle, espresso\"}],\"Aspect\":{\"name\":\"dataPlatformKey\"}},{\"type\":\"record\",\"name\":\"DataPlatformInfo\",\"namespace\":\"com.linkedin.pegasus2avro.dataplatform\",\"doc\":\"Information about a data platform\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Name of the data platform\",\"Searchable\":{\"boostScore\":10.0,\"enableAutocomplete\":false,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\"},\"validate\":{\"strlen\":{\"max\":15}}},{\"name\":\"displayName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name that will be used for displaying a platform type.\",\"default\":null,\"Searchable\":{\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"PlatformType\",\"doc\":\"Platform types available at LinkedIn\",\"symbols\":[\"FILE_SYSTEM\",\"KEY_VALUE_STORE\",\"MESSAGE_BROKER\",\"OBJECT_STORE\",\"OLAP_DATASTORE\",\"OTHERS\",\"QUERY_ENGINE\",\"RELATIONAL_DB\",\"SEARCH_ENGINE\"],\"symbolDocs\":{\"FILE_SYSTEM\":\"Value for a file system, e.g. hdfs\",\"KEY_VALUE_STORE\":\"Value for a key value store, e.g. espresso, voldemort\",\"MESSAGE_BROKER\":\"Value for a message broker, e.g. kafka\",\"OBJECT_STORE\":\"Value for an object store, e.g. ambry\",\"OLAP_DATASTORE\":\"Value for an OLAP datastore, e.g. pinot\",\"OTHERS\":\"Value for other platforms, e.g salesforce, dovetail\",\"QUERY_ENGINE\":\"Value for a query engine, e.g. presto\",\"RELATIONAL_DB\":\"Value for a relational database, e.g. oracle, mysql\",\"SEARCH_ENGINE\":\"Value for a search engine, e.g seas\"}},\"doc\":\"Platform type this data platform describes\"},{\"name\":\"datasetNameDelimiter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle\"},{\"name\":\"logoUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The URL for a logo associated with the platform\",\"default\":null,\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.url.Url\",\"coercerClass\":\"com.linkedin.pegasus2avro.common.url.UrlCoercer\"}}],\"Aspect\":{\"name\":\"dataPlatformInfo\"}}]},\"doc\":\"The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.\"}],\"Entity\":{\"keyAspect\":\"dataPlatformKey\",\"name\":\"dataPlatform\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** URN for the entity the metadata snapshot is associated with. */
  @Deprecated public java.lang.String urn;
  /** The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects. */
  @Deprecated public java.util.List<java.lang.Object> aspects;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataPlatformSnapshot() {}

  /**
   * All-args constructor.
   */
  public DataPlatformSnapshot(java.lang.String urn, java.util.List<java.lang.Object> aspects) {
    this.urn = urn;
    this.aspects = aspects;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return urn;
    case 1: return aspects;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: urn = (java.lang.String)value$; break;
    case 1: aspects = (java.util.List<java.lang.Object>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'urn' field.
   * URN for the entity the metadata snapshot is associated with.   */
  public java.lang.String getUrn() {
    return urn;
  }

  /**
   * Sets the value of the 'urn' field.
   * URN for the entity the metadata snapshot is associated with.   * @param value the value to set.
   */
  public void setUrn(java.lang.String value) {
    this.urn = value;
  }

  /**
   * Gets the value of the 'aspects' field.
   * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.   */
  public java.util.List<java.lang.Object> getAspects() {
    return aspects;
  }

  /**
   * Sets the value of the 'aspects' field.
   * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.   * @param value the value to set.
   */
  public void setAspects(java.util.List<java.lang.Object> value) {
    this.aspects = value;
  }

  /** Creates a new DataPlatformSnapshot RecordBuilder */
  public static com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder();
  }
  
  /** Creates a new DataPlatformSnapshot RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder newBuilder(com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder other) {
    return new com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder(other);
  }
  
  /** Creates a new DataPlatformSnapshot RecordBuilder by copying an existing DataPlatformSnapshot instance */
  public static com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder newBuilder(com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot other) {
    return new com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder(other);
  }
  
  /**
   * RecordBuilder for DataPlatformSnapshot instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataPlatformSnapshot>
    implements org.apache.avro.data.RecordBuilder<DataPlatformSnapshot> {

    private java.lang.String urn;
    private java.util.List<java.lang.Object> aspects;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.urn)) {
        this.urn = data().deepCopy(fields()[0].schema(), other.urn);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.aspects)) {
        this.aspects = data().deepCopy(fields()[1].schema(), other.aspects);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataPlatformSnapshot instance */
    private Builder(com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot other) {
            super(com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.SCHEMA$);
      if (isValidValue(fields()[0], other.urn)) {
        this.urn = data().deepCopy(fields()[0].schema(), other.urn);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.aspects)) {
        this.aspects = data().deepCopy(fields()[1].schema(), other.aspects);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'urn' field */
    public java.lang.String getUrn() {
      return urn;
    }
    
    /** Sets the value of the 'urn' field */
    public com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder setUrn(java.lang.String value) {
      validate(fields()[0], value);
      this.urn = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'urn' field has been set */
    public boolean hasUrn() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'urn' field */
    public com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder clearUrn() {
      urn = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'aspects' field */
    public java.util.List<java.lang.Object> getAspects() {
      return aspects;
    }
    
    /** Sets the value of the 'aspects' field */
    public com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder setAspects(java.util.List<java.lang.Object> value) {
      validate(fields()[1], value);
      this.aspects = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'aspects' field has been set */
    public boolean hasAspects() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'aspects' field */
    public com.linkedin.pegasus2avro.metadata.snapshot.DataPlatformSnapshot.Builder clearAspects() {
      aspects = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DataPlatformSnapshot build() {
      try {
        DataPlatformSnapshot record = new DataPlatformSnapshot();
        record.urn = fieldSetFlags()[0] ? this.urn : (java.lang.String) defaultValue(fields()[0]);
        record.aspects = fieldSetFlags()[1] ? this.aspects : (java.util.List<java.lang.Object>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
