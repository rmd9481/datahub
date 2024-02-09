/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.dataset;  
@SuppressWarnings("all")
/** Details about a View. 
e.g. Gets activated when subTypes is view */
@org.apache.avro.specific.AvroGenerated
public class ViewProperties extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ViewProperties\",\"namespace\":\"com.linkedin.pegasus2avro.dataset\",\"doc\":\"Details about a View. \\ne.g. Gets activated when subTypes is view\",\"fields\":[{\"name\":\"materialized\",\"type\":\"boolean\",\"doc\":\"Whether the view is materialized\",\"Searchable\":{\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}},{\"name\":\"viewLogic\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The view logic\"},{\"name\":\"viewLanguage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The view logic language / dialect\"}],\"Aspect\":{\"name\":\"viewProperties\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Whether the view is materialized */
  @Deprecated public boolean materialized;
  /** The view logic */
  @Deprecated public java.lang.String viewLogic;
  /** The view logic language / dialect */
  @Deprecated public java.lang.String viewLanguage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ViewProperties() {}

  /**
   * All-args constructor.
   */
  public ViewProperties(java.lang.Boolean materialized, java.lang.String viewLogic, java.lang.String viewLanguage) {
    this.materialized = materialized;
    this.viewLogic = viewLogic;
    this.viewLanguage = viewLanguage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return materialized;
    case 1: return viewLogic;
    case 2: return viewLanguage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: materialized = (java.lang.Boolean)value$; break;
    case 1: viewLogic = (java.lang.String)value$; break;
    case 2: viewLanguage = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'materialized' field.
   * Whether the view is materialized   */
  public java.lang.Boolean getMaterialized() {
    return materialized;
  }

  /**
   * Sets the value of the 'materialized' field.
   * Whether the view is materialized   * @param value the value to set.
   */
  public void setMaterialized(java.lang.Boolean value) {
    this.materialized = value;
  }

  /**
   * Gets the value of the 'viewLogic' field.
   * The view logic   */
  public java.lang.String getViewLogic() {
    return viewLogic;
  }

  /**
   * Sets the value of the 'viewLogic' field.
   * The view logic   * @param value the value to set.
   */
  public void setViewLogic(java.lang.String value) {
    this.viewLogic = value;
  }

  /**
   * Gets the value of the 'viewLanguage' field.
   * The view logic language / dialect   */
  public java.lang.String getViewLanguage() {
    return viewLanguage;
  }

  /**
   * Sets the value of the 'viewLanguage' field.
   * The view logic language / dialect   * @param value the value to set.
   */
  public void setViewLanguage(java.lang.String value) {
    this.viewLanguage = value;
  }

  /** Creates a new ViewProperties RecordBuilder */
  public static com.linkedin.pegasus2avro.dataset.ViewProperties.Builder newBuilder() {
    return new com.linkedin.pegasus2avro.dataset.ViewProperties.Builder();
  }
  
  /** Creates a new ViewProperties RecordBuilder by copying an existing Builder */
  public static com.linkedin.pegasus2avro.dataset.ViewProperties.Builder newBuilder(com.linkedin.pegasus2avro.dataset.ViewProperties.Builder other) {
    return new com.linkedin.pegasus2avro.dataset.ViewProperties.Builder(other);
  }
  
  /** Creates a new ViewProperties RecordBuilder by copying an existing ViewProperties instance */
  public static com.linkedin.pegasus2avro.dataset.ViewProperties.Builder newBuilder(com.linkedin.pegasus2avro.dataset.ViewProperties other) {
    return new com.linkedin.pegasus2avro.dataset.ViewProperties.Builder(other);
  }
  
  /**
   * RecordBuilder for ViewProperties instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ViewProperties>
    implements org.apache.avro.data.RecordBuilder<ViewProperties> {

    private boolean materialized;
    private java.lang.String viewLogic;
    private java.lang.String viewLanguage;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.pegasus2avro.dataset.ViewProperties.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.pegasus2avro.dataset.ViewProperties.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.materialized)) {
        this.materialized = data().deepCopy(fields()[0].schema(), other.materialized);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.viewLogic)) {
        this.viewLogic = data().deepCopy(fields()[1].schema(), other.viewLogic);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.viewLanguage)) {
        this.viewLanguage = data().deepCopy(fields()[2].schema(), other.viewLanguage);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ViewProperties instance */
    private Builder(com.linkedin.pegasus2avro.dataset.ViewProperties other) {
            super(com.linkedin.pegasus2avro.dataset.ViewProperties.SCHEMA$);
      if (isValidValue(fields()[0], other.materialized)) {
        this.materialized = data().deepCopy(fields()[0].schema(), other.materialized);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.viewLogic)) {
        this.viewLogic = data().deepCopy(fields()[1].schema(), other.viewLogic);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.viewLanguage)) {
        this.viewLanguage = data().deepCopy(fields()[2].schema(), other.viewLanguage);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'materialized' field */
    public java.lang.Boolean getMaterialized() {
      return materialized;
    }
    
    /** Sets the value of the 'materialized' field */
    public com.linkedin.pegasus2avro.dataset.ViewProperties.Builder setMaterialized(boolean value) {
      validate(fields()[0], value);
      this.materialized = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'materialized' field has been set */
    public boolean hasMaterialized() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'materialized' field */
    public com.linkedin.pegasus2avro.dataset.ViewProperties.Builder clearMaterialized() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'viewLogic' field */
    public java.lang.String getViewLogic() {
      return viewLogic;
    }
    
    /** Sets the value of the 'viewLogic' field */
    public com.linkedin.pegasus2avro.dataset.ViewProperties.Builder setViewLogic(java.lang.String value) {
      validate(fields()[1], value);
      this.viewLogic = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'viewLogic' field has been set */
    public boolean hasViewLogic() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'viewLogic' field */
    public com.linkedin.pegasus2avro.dataset.ViewProperties.Builder clearViewLogic() {
      viewLogic = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'viewLanguage' field */
    public java.lang.String getViewLanguage() {
      return viewLanguage;
    }
    
    /** Sets the value of the 'viewLanguage' field */
    public com.linkedin.pegasus2avro.dataset.ViewProperties.Builder setViewLanguage(java.lang.String value) {
      validate(fields()[2], value);
      this.viewLanguage = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'viewLanguage' field has been set */
    public boolean hasViewLanguage() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'viewLanguage' field */
    public com.linkedin.pegasus2avro.dataset.ViewProperties.Builder clearViewLanguage() {
      viewLanguage = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ViewProperties build() {
      try {
        ViewProperties record = new ViewProperties();
        record.materialized = fieldSetFlags()[0] ? this.materialized : (java.lang.Boolean) defaultValue(fields()[0]);
        record.viewLogic = fieldSetFlags()[1] ? this.viewLogic : (java.lang.String) defaultValue(fields()[1]);
        record.viewLanguage = fieldSetFlags()[2] ? this.viewLanguage : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
