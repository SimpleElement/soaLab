/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.s311690.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.s311690.Keys;
import org.example.soa_lab2_LabService.generated.jooq.s311690.Public;
import org.example.soa_lab2_LabService.generated.jooq.s311690.tables.records.CarBrandRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class CarBrand extends TableImpl<CarBrandRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.car_brand</code>
     */
    public static final CarBrand CAR_BRAND = new CarBrand();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarBrandRecord> getRecordType() {
        return CarBrandRecord.class;
    }

    /**
     * The column <code>public.car_brand.id</code>.
     */
    public final TableField<CarBrandRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.car_brand.name</code>.
     */
    public final TableField<CarBrandRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private CarBrand(Name alias, Table<CarBrandRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarBrand(Name alias, Table<CarBrandRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.car_brand</code> table reference
     */
    public CarBrand(String alias) {
        this(DSL.name(alias), CAR_BRAND);
    }

    /**
     * Create an aliased <code>public.car_brand</code> table reference
     */
    public CarBrand(Name alias) {
        this(alias, CAR_BRAND);
    }

    /**
     * Create a <code>public.car_brand</code> table reference
     */
    public CarBrand() {
        this(DSL.name("car_brand"), null);
    }

    public <O extends Record> CarBrand(Table<O> child, ForeignKey<O, CarBrandRecord> key) {
        super(child, key, CAR_BRAND);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<CarBrandRecord, Integer> getIdentity() {
        return (Identity<CarBrandRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CarBrandRecord> getPrimaryKey() {
        return Keys.CAR_BRAND_PKEY;
    }

    @Override
    public List<UniqueKey<CarBrandRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CAR_BRAND_NAME_KEY);
    }

    @Override
    public CarBrand as(String alias) {
        return new CarBrand(DSL.name(alias), this);
    }

    @Override
    public CarBrand as(Name alias) {
        return new CarBrand(alias, this);
    }

    @Override
    public CarBrand as(Table<?> alias) {
        return new CarBrand(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarBrand rename(String name) {
        return new CarBrand(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarBrand rename(Name name) {
        return new CarBrand(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarBrand rename(Table<?> name) {
        return new CarBrand(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
