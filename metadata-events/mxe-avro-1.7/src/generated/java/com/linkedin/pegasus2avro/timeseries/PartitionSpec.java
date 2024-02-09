/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.timeseries;  
@SuppressWarnings("all")
/** Defines how the data is partitioned */
@org.apache.avro.specific.AvroGenerated
public class PartitionSpec extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PartitionSpec\",\"namespace\":\"com.linkedin.pegasus2avro.timeseries\",\"doc\":\"Defines how the data is partitioned\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"PartitionType\",\"symbols\":[\"FULL_TABLE\",\"QUERY\",\"PARTITION\"]},\"default\":\"PARTITION\"},{\"name\":\"partition\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"String representation of the partition\",\"TimeseriesField\":{}},{\"name\":\"timePartition\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeWindow\",\"fields\":[{\"name\":\"startTimeMillis\",\"type\":\"long\",\"doc\":\"Start time as epoch at UTC.\"},{\"name\":\"length\",\"type\":{\"type\":\"record\",\"name\":\"TimeWindowSize\",\"doc\":\"Defines the size of a time window.\",\"fields\":[{\"name\":\"unit\",\"type\":{\"type\":\"enum\",\"name\":\"CalendarInterval\",\"symbols\":[\"SECOND\",\"MINUTE\",\"HOUR\",\"DAY\",\"WEEK\",\"MONTH\",\"QUARTER\",\"YEAR\"]},\"doc\":\"Interval unit such as minute/hour/day etc.\"},{\"name\":\"multiple\",\"type\":\"int\",\"doc\":\"How many units. Defaults to 1.\",\"default\":1}]},\"doc\":\"The length of the window.\"}]}],\"doc\":\"Time window of the partition if applicable\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.linkedin.pegasus2avro.timeseries.PartitionType type;
  /** String representation of the partition */
  @Deprecated public java.lang.String partition;
  /** Time window of the partition if applicable */
  @Deprecated public com.linkedin.pegasus2avro.timeseries.TimeWindow timePartition;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public PartitionSpec() {}

  /**
   * All-args constructor.
   */
  public PartitionSpec(com.linkedin.pegasus2avro.timeseries.PartitionType type, java.lang.String partition, com.linkedin.pegasus2avro.timeseries.TimeWindow timePartition) {
    this.type = type;
    this.partition = partition;
    this.timePartition = timePartition;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return partition;
    case 2: return timePartition;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (com.linkedin.pegasus2avro.timeseries.PartitionType)value$; break;
    case 1: partition = (java.lang.String)value$; break;
    case 2: timePartition = (com.linkedin.pegasus2avro.timeseries.TimeWindow)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public com.linkedin.pegasus2avro.timeseries.PartitionType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.linkedin.pegasus2avro.timeseries.PartitionType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'partition' field.
   * String representation of the partition   */
  public java.lang.String getPartition() {
    return partition;
  }

  /**
   * Sets the value of the 'partition' field.
   * String representation of the partition   * @param value the value to set.
   */
  public void setPartition(java.lang.String value) {
    this.partition = value;
  }

  /**
   * Gets the value of the 'timePartition' field.
   * Time window of the partition if applicable   */
  public com.linkedin.pegasus2avro.timeseries.TimeWindow getTimePartition() {
    return timePartition;
  }

  /**
   * Sets the value of the 'timePartition' field.
   * Time window of the partition if applicable   * @param value the value to set.
   */
  public void setTimePartition(com.linkedin.pegasus2avro.timeseries.TimeWindow value) {
    this.timePartition = value;
  }

  /** Creates a new PartitionSpec RecordBuilder */
  public static com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder();
  }
  
  /** Creates a new PartitionSpec RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder newBuilder(com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder other) {
    return new com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder(other);
  }
  
  /** Creates a new PartitionSpec RecordBuilder by copying an existing PartitionSpec instance */
  public static com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder newBuilder(com.linkedin.pegasus2avro.timeseries.PartitionSpec other) {
    return new com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder(other);
  }
  
  /**
   * RecordBuilder for PartitionSpec instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PartitionSpec>
    implements org.apache.avro.data.RecordBuilder<PartitionSpec> {

    private com.linkedin.pegasus2avro.timeseries.PartitionType type;
    private java.lang.String partition;
    private com.linkedin.pegasus2avro.timeseries.TimeWindow timePartition;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.timeseries.PartitionSpec.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partition)) {
        this.partition = data().deepCopy(fields()[1].schema(), other.partition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timePartition)) {
        this.timePartition = data().deepCopy(fields()[2].schema(), other.timePartition);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PartitionSpec instance */
    private Builder(com.linkedin.pegasus2avro.timeseries.PartitionSpec other) {
            super(com.linkedin.pegasus2avro.timeseries.PartitionSpec.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partition)) {
        this.partition = data().deepCopy(fields()[1].schema(), other.partition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timePartition)) {
        this.timePartition = data().deepCopy(fields()[2].schema(), other.timePartition);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder setType(com.linkedin.pegasus2avro.timeseries.PartitionType value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'partition' field */
    public java.lang.String getPartition() {
      return partition;
    }
    
    /** Sets the value of the 'partition' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder setPartition(java.lang.String value) {
      validate(fields()[1], value);
      this.partition = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'partition' field has been set */
    public boolean hasPartition() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'partition' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder clearPartition() {
      partition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'timePartition' field */
    public com.linkedin.pegasus2avro.timeseries.TimeWindow getTimePartition() {
      return timePartition;
    }
    
    /** Sets the value of the 'timePartition' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder setTimePartition(com.linkedin.pegasus2avro.timeseries.TimeWindow value) {
      validate(fields()[2], value);
      this.timePartition = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timePartition' field has been set */
    public boolean hasTimePartition() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timePartition' field */
    public com.linkedin.pegasus2avro.timeseries.PartitionSpec.Builder clearTimePartition() {
      timePartition = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public PartitionSpec build() {
      try {
        PartitionSpec record = new PartitionSpec();
        record.type = fieldSetFlags()[0] ? this.type : (com.linkedin.pegasus2avro.timeseries.PartitionType) defaultValue(fields()[0]);
        record.partition = fieldSetFlags()[1] ? this.partition : (java.lang.String) defaultValue(fields()[1]);
        record.timePartition = fieldSetFlags()[2] ? this.timePartition : (com.linkedin.pegasus2avro.timeseries.TimeWindow) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
