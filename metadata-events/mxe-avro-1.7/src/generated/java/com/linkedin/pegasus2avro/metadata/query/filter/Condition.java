/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.pegasus2avro.metadata.query.filter;  
@SuppressWarnings("all")
/** The matching condition in a filter criterion */
@org.apache.avro.specific.AvroGenerated
public enum Condition { 
  CONTAIN, END_WITH, EQUAL, IS_NULL, EXISTS, GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, IN, LESS_THAN, LESS_THAN_OR_EQUAL_TO, START_WITH  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Condition\",\"namespace\":\"com.linkedin.pegasus2avro.metadata.query.filter\",\"doc\":\"The matching condition in a filter criterion\",\"symbols\":[\"CONTAIN\",\"END_WITH\",\"EQUAL\",\"IS_NULL\",\"EXISTS\",\"GREATER_THAN\",\"GREATER_THAN_OR_EQUAL_TO\",\"IN\",\"LESS_THAN\",\"LESS_THAN_OR_EQUAL_TO\",\"START_WITH\"],\"symbolDocs\":{\"CONTAIN\":\"Represent the relation: String field contains value, e.g. name contains Profile\",\"END_WITH\":\"Represent the relation: String field ends with value, e.g. name ends with Event\",\"EQUAL\":\"Represent the relation: field = value, e.g. platform = hdfs\",\"EXISTS\":\"Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)\",\"GREATER_THAN\":\"Represent the relation greater than, e.g. ownerCount > 5\",\"GREATER_THAN_OR_EQUAL_TO\":\"Represent the relation greater than or equal to, e.g. ownerCount >= 5\",\"IN\":\"Represent the relation: String field is one of the array values to, e.g. name in [\\\"Profile\\\", \\\"Event\\\"]\",\"IS_NULL\":\"Represent the relation: field is null, e.g. platform is null\",\"LESS_THAN\":\"Represent the relation less than, e.g. ownerCount < 3\",\"LESS_THAN_OR_EQUAL_TO\":\"Represent the relation less than or equal to, e.g. ownerCount <= 3\",\"START_WITH\":\"Represent the relation: String field starts with value, e.g. name starts with PageView\"}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
