/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.metadata.query.filter;  
@SuppressWarnings("all")
/** The filter for finding a record or a collection of records */
@org.apache.avro.specific.AvroGenerated
public class Filter extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Filter\",\"namespace\":\"com.linkedin.pegasus2avro.metadata.query.filter\",\"doc\":\"The filter for finding a record or a collection of records\",\"fields\":[{\"name\":\"or\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ConjunctiveCriterion\",\"doc\":\"A list of criterion and'd together.\",\"fields\":[{\"name\":\"and\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Criterion\",\"doc\":\"A criterion for matching a field with given value\",\"fields\":[{\"name\":\"field\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The name of the field that the criterion refers to\"},{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The value of the intended field\"},{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"Values. one of which the intended field should match\\nNote, if values is set, the above \\\"value\\\" field will be ignored\",\"default\":[]},{\"name\":\"condition\",\"type\":{\"type\":\"enum\",\"name\":\"Condition\",\"doc\":\"The matching condition in a filter criterion\",\"symbols\":[\"CONTAIN\",\"END_WITH\",\"EQUAL\",\"IS_NULL\",\"EXISTS\",\"GREATER_THAN\",\"GREATER_THAN_OR_EQUAL_TO\",\"IN\",\"LESS_THAN\",\"LESS_THAN_OR_EQUAL_TO\",\"START_WITH\"],\"symbolDocs\":{\"CONTAIN\":\"Represent the relation: String field contains value, e.g. name contains Profile\",\"END_WITH\":\"Represent the relation: String field ends with value, e.g. name ends with Event\",\"EQUAL\":\"Represent the relation: field = value, e.g. platform = hdfs\",\"EXISTS\":\"Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)\",\"GREATER_THAN\":\"Represent the relation greater than, e.g. ownerCount > 5\",\"GREATER_THAN_OR_EQUAL_TO\":\"Represent the relation greater than or equal to, e.g. ownerCount >= 5\",\"IN\":\"Represent the relation: String field is one of the array values to, e.g. name in [\\\"Profile\\\", \\\"Event\\\"]\",\"IS_NULL\":\"Represent the relation: field is null, e.g. platform is null\",\"LESS_THAN\":\"Represent the relation less than, e.g. ownerCount < 3\",\"LESS_THAN_OR_EQUAL_TO\":\"Represent the relation less than or equal to, e.g. ownerCount <= 3\",\"START_WITH\":\"Represent the relation: String field starts with value, e.g. name starts with PageView\"}},\"doc\":\"The condition for the criterion, e.g. EQUAL, START_WITH\",\"default\":\"EQUAL\"},{\"name\":\"negated\",\"type\":\"boolean\",\"doc\":\"Whether the condition should be negated\",\"default\":false}]}},\"doc\":\"A list of and criteria the filter applies to the query\"}]}}],\"doc\":\"A list of disjunctive criterion for the filter. (or operation to combine filters)\",\"default\":null},{\"name\":\"criteria\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Criterion\"}],\"doc\":\"Deprecated! A list of conjunctive criterion for the filter. If \\\"or\\\" field is provided, then this field is ignored.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** A list of disjunctive criterion for the filter. (or operation to combine filters) */
  @Deprecated public java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> or;
  /** Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored. */
  @Deprecated public java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> criteria;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Filter() {}

  /**
   * All-args constructor.
   */
  public Filter(java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> or, java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> criteria) {
    this.or = or;
    this.criteria = criteria;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return or;
    case 1: return criteria;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: or = (java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion>)value$; break;
    case 1: criteria = (java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'or' field.
   * A list of disjunctive criterion for the filter. (or operation to combine filters)   */
  public java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> getOr() {
    return or;
  }

  /**
   * Sets the value of the 'or' field.
   * A list of disjunctive criterion for the filter. (or operation to combine filters)   * @param value the value to set.
   */
  public void setOr(java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> value) {
    this.or = value;
  }

  /**
   * Gets the value of the 'criteria' field.
   * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.   */
  public java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> getCriteria() {
    return criteria;
  }

  /**
   * Sets the value of the 'criteria' field.
   * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.   * @param value the value to set.
   */
  public void setCriteria(java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> value) {
    this.criteria = value;
  }

  /** Creates a new Filter RecordBuilder */
  public static com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder();
  }
  
  /** Creates a new Filter RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder newBuilder(com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder other) {
    return new com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder(other);
  }
  
  /** Creates a new Filter RecordBuilder by copying an existing Filter instance */
  public static com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder newBuilder(com.linkedin.pegasus2avro.metadata.query.filter.Filter other) {
    return new com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder(other);
  }
  
  /**
   * RecordBuilder for Filter instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Filter>
    implements org.apache.avro.data.RecordBuilder<Filter> {

    private java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> or;
    private java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> criteria;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.metadata.query.filter.Filter.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.or)) {
        this.or = data().deepCopy(fields()[0].schema(), other.or);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.criteria)) {
        this.criteria = data().deepCopy(fields()[1].schema(), other.criteria);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Filter instance */
    private Builder(com.linkedin.pegasus2avro.metadata.query.filter.Filter other) {
            super(com.linkedin.pegasus2avro.metadata.query.filter.Filter.SCHEMA$);
      if (isValidValue(fields()[0], other.or)) {
        this.or = data().deepCopy(fields()[0].schema(), other.or);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.criteria)) {
        this.criteria = data().deepCopy(fields()[1].schema(), other.criteria);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'or' field */
    public java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> getOr() {
      return or;
    }
    
    /** Sets the value of the 'or' field */
    public com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder setOr(java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion> value) {
      validate(fields()[0], value);
      this.or = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'or' field has been set */
    public boolean hasOr() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'or' field */
    public com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder clearOr() {
      or = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'criteria' field */
    public java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> getCriteria() {
      return criteria;
    }
    
    /** Sets the value of the 'criteria' field */
    public com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder setCriteria(java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion> value) {
      validate(fields()[1], value);
      this.criteria = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'criteria' field has been set */
    public boolean hasCriteria() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'criteria' field */
    public com.linkedin.pegasus2avro.metadata.query.filter.Filter.Builder clearCriteria() {
      criteria = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Filter build() {
      try {
        Filter record = new Filter();
        record.or = fieldSetFlags()[0] ? this.or : (java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.ConjunctiveCriterion>) defaultValue(fields()[0]);
        record.criteria = fieldSetFlags()[1] ? this.criteria : (java.util.List<com.linkedin.pegasus2avro.metadata.query.filter.Criterion>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
