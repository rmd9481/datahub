/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.datajob;  
@SuppressWarnings("all")
/** Information about a Data processing job */
@org.apache.avro.specific.AvroGenerated
public class DataJobInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataJobInfo\",\"namespace\":\"com.linkedin.pegasus2avro.datajob\",\"doc\":\"Information about a Data processing job\",\"fields\":[{\"name\":\"customProperties\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"doc\":\"Custom property bag.\",\"default\":{},\"Searchable\":{\"/*\":{\"queryByDefault\":true}}},{\"name\":\"externalUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"URL where the reference exist\",\"default\":null,\"Searchable\":{\"fieldType\":\"KEYWORD\"},\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.url.Url\",\"coercerClass\":\"com.linkedin.pegasus2avro.common.url.UrlCoercer\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Job name\",\"Searchable\":{\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\"}},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Job description\",\"default\":null,\"Searchable\":{\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\"}},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"AzkabanJobType\",\"namespace\":\"com.linkedin.pegasus2avro.datajob.azkaban\",\"doc\":\"The various types of support azkaban jobs\",\"symbols\":[\"COMMAND\",\"HADOOP_JAVA\",\"HADOOP_SHELL\",\"HIVE\",\"PIG\",\"SQL\",\"GLUE\"],\"symbolDocs\":{\"COMMAND\":\"The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\\nUpon execution, Azkaban spawns off a process to run the command.\",\"GLUE\":\"Glue type is for running AWS Glue job transforms.\",\"HADOOP_JAVA\":\"Runs a java program with ability to access Hadoop cluster.\\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type\",\"HADOOP_SHELL\":\"In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\\nsecurely, via Hadoop tokens.\",\"HIVE\":\"Hive type is for running Hive jobs.\",\"PIG\":\"Pig type is for running Pig jobs.\",\"SQL\":\"SQL is for running Presto, mysql queries etc\"}},{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Datajob type\\n*NOTE**: AzkabanJobType is deprecated. Please use strings instead.\"},{\"name\":\"flowUrn\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"DataFlow urn that this job is part of\",\"default\":null,\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.urn.DataFlowUrn\"}},{\"name\":\"created\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeStamp\",\"namespace\":\"com.linkedin.pegasus2avro.common\",\"doc\":\"A standard event timestamp\",\"fields\":[{\"name\":\"time\",\"type\":\"long\",\"doc\":\"When did the event occur\"},{\"name\":\"actor\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Optional: The actor urn involved in the event.\",\"default\":null,\"java\":{\"class\":\"com.linkedin.pegasus2avro.common.urn.Urn\"}}]}],\"doc\":\"A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)\",\"default\":null,\"Searchable\":{\"/time\":{\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\"}}},{\"name\":\"lastModified\",\"type\":[\"null\",\"com.linkedin.pegasus2avro.common.TimeStamp\"],\"doc\":\"A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)\",\"default\":null,\"Searchable\":{\"/time\":{\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\"}}},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"JobStatus\",\"doc\":\"Job statuses\",\"symbols\":[\"STARTING\",\"IN_PROGRESS\",\"STOPPING\",\"STOPPED\",\"COMPLETED\",\"FAILED\",\"UNKNOWN\",\"SKIPPED\"],\"symbolDocs\":{\"COMPLETED\":\"Jobs with successful completion.\",\"FAILED\":\"Jobs that have failed.\",\"IN_PROGRESS\":\"Jobs currently running.\",\"SKIPPED\":\"Jobs that have been skipped.\",\"STARTING\":\"Jobs being initialized.\",\"STOPPED\":\"Jobs that have stopped.\",\"STOPPING\":\"Jobs being stopped.\",\"UNKNOWN\":\"Jobs with unknown status (either unmappable or unavailable)\"}}],\"doc\":\"Status of the job - Deprecated for Data Process Instance model.\",\"default\":null,\"deprecated\":\"Use Data Process Instance model, instead\"}],\"Aspect\":{\"name\":\"dataJobInfo\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Custom property bag. */
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> customProperties;
  /** URL where the reference exist */
  @Deprecated public java.lang.String externalUrl;
  /** Job name */
  @Deprecated public java.lang.String name;
  /** Job description */
  @Deprecated public java.lang.String description;
  /** Datajob type
*NOTE**: AzkabanJobType is deprecated. Please use strings instead. */
  @Deprecated public java.lang.Object type;
  /** DataFlow urn that this job is part of */
  @Deprecated public java.lang.String flowUrn;
  /** A timestamp documenting when the asset was created in the source Data Platform (not on DataHub) */
  @Deprecated public com.linkedin.pegasus2avro.common.TimeStamp created;
  /** A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub) */
  @Deprecated public com.linkedin.pegasus2avro.common.TimeStamp lastModified;
  /** Status of the job - Deprecated for Data Process Instance model. */
  @Deprecated public com.linkedin.pegasus2avro.datajob.JobStatus status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataJobInfo() {}

  /**
   * All-args constructor.
   */
  public DataJobInfo(java.util.Map<java.lang.String,java.lang.String> customProperties, java.lang.String externalUrl, java.lang.String name, java.lang.String description, java.lang.Object type, java.lang.String flowUrn, com.linkedin.pegasus2avro.common.TimeStamp created, com.linkedin.pegasus2avro.common.TimeStamp lastModified, com.linkedin.pegasus2avro.datajob.JobStatus status) {
    this.customProperties = customProperties;
    this.externalUrl = externalUrl;
    this.name = name;
    this.description = description;
    this.type = type;
    this.flowUrn = flowUrn;
    this.created = created;
    this.lastModified = lastModified;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customProperties;
    case 1: return externalUrl;
    case 2: return name;
    case 3: return description;
    case 4: return type;
    case 5: return flowUrn;
    case 6: return created;
    case 7: return lastModified;
    case 8: return status;
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
    case 4: type = (java.lang.Object)value$; break;
    case 5: flowUrn = (java.lang.String)value$; break;
    case 6: created = (com.linkedin.pegasus2avro.common.TimeStamp)value$; break;
    case 7: lastModified = (com.linkedin.pegasus2avro.common.TimeStamp)value$; break;
    case 8: status = (com.linkedin.pegasus2avro.datajob.JobStatus)value$; break;
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
   * Job name   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Job name   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * Job description   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Job description   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'type' field.
   * Datajob type
*NOTE**: AzkabanJobType is deprecated. Please use strings instead.   */
  public java.lang.Object getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Datajob type
*NOTE**: AzkabanJobType is deprecated. Please use strings instead.   * @param value the value to set.
   */
  public void setType(java.lang.Object value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'flowUrn' field.
   * DataFlow urn that this job is part of   */
  public java.lang.String getFlowUrn() {
    return flowUrn;
  }

  /**
   * Sets the value of the 'flowUrn' field.
   * DataFlow urn that this job is part of   * @param value the value to set.
   */
  public void setFlowUrn(java.lang.String value) {
    this.flowUrn = value;
  }

  /**
   * Gets the value of the 'created' field.
   * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)   */
  public com.linkedin.pegasus2avro.common.TimeStamp getCreated() {
    return created;
  }

  /**
   * Sets the value of the 'created' field.
   * A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)   * @param value the value to set.
   */
  public void setCreated(com.linkedin.pegasus2avro.common.TimeStamp value) {
    this.created = value;
  }

  /**
   * Gets the value of the 'lastModified' field.
   * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)   */
  public com.linkedin.pegasus2avro.common.TimeStamp getLastModified() {
    return lastModified;
  }

  /**
   * Sets the value of the 'lastModified' field.
   * A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)   * @param value the value to set.
   */
  public void setLastModified(com.linkedin.pegasus2avro.common.TimeStamp value) {
    this.lastModified = value;
  }

  /**
   * Gets the value of the 'status' field.
   * Status of the job - Deprecated for Data Process Instance model.   */
  public com.linkedin.pegasus2avro.datajob.JobStatus getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * Status of the job - Deprecated for Data Process Instance model.   * @param value the value to set.
   */
  public void setStatus(com.linkedin.pegasus2avro.datajob.JobStatus value) {
    this.status = value;
  }

  /** Creates a new DataJobInfo RecordBuilder */
  public static com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder();
  }
  
  /** Creates a new DataJobInfo RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder newBuilder(com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder other) {
    return new com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder(other);
  }
  
  /** Creates a new DataJobInfo RecordBuilder by copying an existing DataJobInfo instance */
  public static com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder newBuilder(com.linkedin.pegasus2avro.datajob.DataJobInfo other) {
    return new com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder(other);
  }
  
  /**
   * RecordBuilder for DataJobInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataJobInfo>
    implements org.apache.avro.data.RecordBuilder<DataJobInfo> {

    private java.util.Map<java.lang.String,java.lang.String> customProperties;
    private java.lang.String externalUrl;
    private java.lang.String name;
    private java.lang.String description;
    private java.lang.Object type;
    private java.lang.String flowUrn;
    private com.linkedin.pegasus2avro.common.TimeStamp created;
    private com.linkedin.pegasus2avro.common.TimeStamp lastModified;
    private com.linkedin.pegasus2avro.datajob.JobStatus status;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.datajob.DataJobInfo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder other) {
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
      if (isValidValue(fields()[4], other.type)) {
        this.type = data().deepCopy(fields()[4].schema(), other.type);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.flowUrn)) {
        this.flowUrn = data().deepCopy(fields()[5].schema(), other.flowUrn);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.created)) {
        this.created = data().deepCopy(fields()[6].schema(), other.created);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.lastModified)) {
        this.lastModified = data().deepCopy(fields()[7].schema(), other.lastModified);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.status)) {
        this.status = data().deepCopy(fields()[8].schema(), other.status);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataJobInfo instance */
    private Builder(com.linkedin.pegasus2avro.datajob.DataJobInfo other) {
            super(com.linkedin.pegasus2avro.datajob.DataJobInfo.SCHEMA$);
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
      if (isValidValue(fields()[4], other.type)) {
        this.type = data().deepCopy(fields()[4].schema(), other.type);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.flowUrn)) {
        this.flowUrn = data().deepCopy(fields()[5].schema(), other.flowUrn);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.created)) {
        this.created = data().deepCopy(fields()[6].schema(), other.created);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.lastModified)) {
        this.lastModified = data().deepCopy(fields()[7].schema(), other.lastModified);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.status)) {
        this.status = data().deepCopy(fields()[8].schema(), other.status);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'customProperties' field */
    public java.util.Map<java.lang.String,java.lang.String> getCustomProperties() {
      return customProperties;
    }
    
    /** Sets the value of the 'customProperties' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setCustomProperties(java.util.Map<java.lang.String,java.lang.String> value) {
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
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearCustomProperties() {
      customProperties = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'externalUrl' field */
    public java.lang.String getExternalUrl() {
      return externalUrl;
    }
    
    /** Sets the value of the 'externalUrl' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setExternalUrl(java.lang.String value) {
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
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearExternalUrl() {
      externalUrl = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setName(java.lang.String value) {
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
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setDescription(java.lang.String value) {
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
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.Object getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setType(java.lang.Object value) {
      validate(fields()[4], value);
      this.type = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'type' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearType() {
      type = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'flowUrn' field */
    public java.lang.String getFlowUrn() {
      return flowUrn;
    }
    
    /** Sets the value of the 'flowUrn' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setFlowUrn(java.lang.String value) {
      validate(fields()[5], value);
      this.flowUrn = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'flowUrn' field has been set */
    public boolean hasFlowUrn() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'flowUrn' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearFlowUrn() {
      flowUrn = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'created' field */
    public com.linkedin.pegasus2avro.common.TimeStamp getCreated() {
      return created;
    }
    
    /** Sets the value of the 'created' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setCreated(com.linkedin.pegasus2avro.common.TimeStamp value) {
      validate(fields()[6], value);
      this.created = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'created' field has been set */
    public boolean hasCreated() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'created' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearCreated() {
      created = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'lastModified' field */
    public com.linkedin.pegasus2avro.common.TimeStamp getLastModified() {
      return lastModified;
    }
    
    /** Sets the value of the 'lastModified' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setLastModified(com.linkedin.pegasus2avro.common.TimeStamp value) {
      validate(fields()[7], value);
      this.lastModified = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'lastModified' field has been set */
    public boolean hasLastModified() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'lastModified' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearLastModified() {
      lastModified = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'status' field */
    public com.linkedin.pegasus2avro.datajob.JobStatus getStatus() {
      return status;
    }
    
    /** Sets the value of the 'status' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder setStatus(com.linkedin.pegasus2avro.datajob.JobStatus value) {
      validate(fields()[8], value);
      this.status = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'status' field has been set */
    public boolean hasStatus() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'status' field */
    public com.linkedin.pegasus2avro.datajob.DataJobInfo.Builder clearStatus() {
      status = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public DataJobInfo build() {
      try {
        DataJobInfo record = new DataJobInfo();
        record.customProperties = fieldSetFlags()[0] ? this.customProperties : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[0]);
        record.externalUrl = fieldSetFlags()[1] ? this.externalUrl : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.String) defaultValue(fields()[3]);
        record.type = fieldSetFlags()[4] ? this.type : (java.lang.Object) defaultValue(fields()[4]);
        record.flowUrn = fieldSetFlags()[5] ? this.flowUrn : (java.lang.String) defaultValue(fields()[5]);
        record.created = fieldSetFlags()[6] ? this.created : (com.linkedin.pegasus2avro.common.TimeStamp) defaultValue(fields()[6]);
        record.lastModified = fieldSetFlags()[7] ? this.lastModified : (com.linkedin.pegasus2avro.common.TimeStamp) defaultValue(fields()[7]);
        record.status = fieldSetFlags()[8] ? this.status : (com.linkedin.pegasus2avro.datajob.JobStatus) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
