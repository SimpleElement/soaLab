/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.s311690.tables;


import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.s311690.Keys;
import org.example.soa_lab2_LabService.generated.jooq.s311690.Public;
import org.example.soa_lab2_LabService.generated.jooq.s311690.tables.records.SerialNumberRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SerialNumber extends TableImpl<SerialNumberRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.serial_number</code>
     */
    public static final SerialNumber SERIAL_NUMBER = new SerialNumber();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SerialNumberRecord> getRecordType() {
        return SerialNumberRecord.class;
    }

    /**
     * The column <code>public.serial_number.id</code>.
     */
    public final TableField<SerialNumberRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    private SerialNumber(Name alias, Table<SerialNumberRecord> aliased) {
        this(alias, aliased, null);
    }

    private SerialNumber(Name alias, Table<SerialNumberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.serial_number</code> table reference
     */
    public SerialNumber(String alias) {
        this(DSL.name(alias), SERIAL_NUMBER);
    }

    /**
     * Create an aliased <code>public.serial_number</code> table reference
     */
    public SerialNumber(Name alias) {
        this(alias, SERIAL_NUMBER);
    }

    /**
     * Create a <code>public.serial_number</code> table reference
     */
    public SerialNumber() {
        this(DSL.name("serial_number"), null);
    }

    public <O extends Record> SerialNumber(Table<O> child, ForeignKey<O, SerialNumberRecord> key) {
        super(child, key, SERIAL_NUMBER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SerialNumberRecord> getPrimaryKey() {
        return Keys.SERIAL_NUMBER_PKEY;
    }

    @Override
    public SerialNumber as(String alias) {
        return new SerialNumber(DSL.name(alias), this);
    }

    @Override
    public SerialNumber as(Name alias) {
        return new SerialNumber(alias, this);
    }

    @Override
    public SerialNumber as(Table<?> alias) {
        return new SerialNumber(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SerialNumber rename(String name) {
        return new SerialNumber(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SerialNumber rename(Name name) {
        return new SerialNumber(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SerialNumber rename(Table<?> name) {
        return new SerialNumber(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
