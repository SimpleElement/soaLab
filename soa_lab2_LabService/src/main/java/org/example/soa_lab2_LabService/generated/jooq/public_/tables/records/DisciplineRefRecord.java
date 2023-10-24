/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.public_.tables.DisciplineRef;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DisciplineRefRecord extends UpdatableRecordImpl<DisciplineRefRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.discipline_ref.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.discipline_ref.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.discipline_ref.description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.discipline_ref.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.discipline_ref.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.discipline_ref.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return DisciplineRef.DISCIPLINE_REF.ID;
    }

    @Override
    public Field<String> field2() {
        return DisciplineRef.DISCIPLINE_REF.DESCRIPTION;
    }

    @Override
    public Field<String> field3() {
        return DisciplineRef.DISCIPLINE_REF.NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getDescription();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getDescription();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public DisciplineRefRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public DisciplineRefRecord value2(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public DisciplineRefRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public DisciplineRefRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DisciplineRefRecord
     */
    public DisciplineRefRecord() {
        super(DisciplineRef.DISCIPLINE_REF);
    }

    /**
     * Create a detached, initialised DisciplineRefRecord
     */
    public DisciplineRefRecord(Long id, String description, String name) {
        super(DisciplineRef.DISCIPLINE_REF);

        setId(id);
        setDescription(description);
        setName(name);
        resetChangedOnNotNull();
    }
}