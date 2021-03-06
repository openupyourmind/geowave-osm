/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package mil.nga.giat.osm.types.generated;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LongArray extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LongArray\",\"namespace\":\"mil.nga.giat.osm.types.generated\",\"fields\":[{\"name\":\"Ids\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.Long> Ids;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public LongArray() {}

  /**
   * All-args constructor.
   */
  public LongArray(java.util.List<java.lang.Long> Ids) {
    this.Ids = Ids;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Ids;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Ids = (java.util.List<java.lang.Long>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Ids' field.
   */
  public java.util.List<java.lang.Long> getIds() {
    return Ids;
  }

  /**
   * Sets the value of the 'Ids' field.
   * @param value the value to set.
   */
  public void setIds(java.util.List<java.lang.Long> value) {
    this.Ids = value;
  }

  /** Creates a new LongArray RecordBuilder */
  public static mil.nga.giat.osm.types.generated.LongArray.Builder newBuilder() {
    return new mil.nga.giat.osm.types.generated.LongArray.Builder();
  }
  
  /** Creates a new LongArray RecordBuilder by copying an existing Builder */
  public static mil.nga.giat.osm.types.generated.LongArray.Builder newBuilder(mil.nga.giat.osm.types.generated.LongArray.Builder other) {
    return new mil.nga.giat.osm.types.generated.LongArray.Builder(other);
  }
  
  /** Creates a new LongArray RecordBuilder by copying an existing LongArray instance */
  public static mil.nga.giat.osm.types.generated.LongArray.Builder newBuilder(mil.nga.giat.osm.types.generated.LongArray other) {
    return new mil.nga.giat.osm.types.generated.LongArray.Builder(other);
  }
  
  /**
   * RecordBuilder for LongArray instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LongArray>
    implements org.apache.avro.data.RecordBuilder<LongArray> {

    private java.util.List<java.lang.Long> Ids;

    /** Creates a new Builder */
    private Builder() {
      super(mil.nga.giat.osm.types.generated.LongArray.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(mil.nga.giat.osm.types.generated.LongArray.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Ids)) {
        this.Ids = data().deepCopy(fields()[0].schema(), other.Ids);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LongArray instance */
    private Builder(mil.nga.giat.osm.types.generated.LongArray other) {
            super(mil.nga.giat.osm.types.generated.LongArray.SCHEMA$);
      if (isValidValue(fields()[0], other.Ids)) {
        this.Ids = data().deepCopy(fields()[0].schema(), other.Ids);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'Ids' field */
    public java.util.List<java.lang.Long> getIds() {
      return Ids;
    }
    
    /** Sets the value of the 'Ids' field */
    public mil.nga.giat.osm.types.generated.LongArray.Builder setIds(java.util.List<java.lang.Long> value) {
      validate(fields()[0], value);
      this.Ids = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Ids' field has been set */
    public boolean hasIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Ids' field */
    public mil.nga.giat.osm.types.generated.LongArray.Builder clearIds() {
      Ids = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public LongArray build() {
      try {
        LongArray record = new LongArray();
        record.Ids = fieldSetFlags()[0] ? this.Ids : (java.util.List<java.lang.Long>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
