/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.public_.Keys;
import org.example.soa_lab2_LabService.generated.jooq.public_.Public;
import org.example.soa_lab2_LabService.generated.jooq.public_.tables.records.SellerAccessoryRecord;
import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerAccessory extends TableImpl<SellerAccessoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.seller_accessory</code>
     */
    public static final SellerAccessory SELLER_ACCESSORY = new SellerAccessory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerAccessoryRecord> getRecordType() {
        return SellerAccessoryRecord.class;
    }

    /**
     * The column <code>public.seller_accessory.seller_id</code>.
     */
    public final TableField<SellerAccessoryRecord, Integer> SELLER_ID = createField(DSL.name("seller_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.seller_accessory.accessory_id</code>.
     */
    public final TableField<SellerAccessoryRecord, Integer> ACCESSORY_ID = createField(DSL.name("accessory_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.seller_accessory.count</code>.
     */
    public final TableField<SellerAccessoryRecord, Integer> COUNT = createField(DSL.name("count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.INTEGER)), this, "");

    private SellerAccessory(Name alias, Table<SellerAccessoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private SellerAccessory(Name alias, Table<SellerAccessoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.seller_accessory</code> table reference
     */
    public SellerAccessory(String alias) {
        this(DSL.name(alias), SELLER_ACCESSORY);
    }

    /**
     * Create an aliased <code>public.seller_accessory</code> table reference
     */
    public SellerAccessory(Name alias) {
        this(alias, SELLER_ACCESSORY);
    }

    /**
     * Create a <code>public.seller_accessory</code> table reference
     */
    public SellerAccessory() {
        this(DSL.name("seller_accessory"), null);
    }

    public <O extends Record> SellerAccessory(Table<O> child, ForeignKey<O, SellerAccessoryRecord> key) {
        super(child, key, SELLER_ACCESSORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SellerAccessoryRecord> getPrimaryKey() {
        return Keys.SELLER_ACCESSORY_PKEY;
    }

    @Override
    public List<ForeignKey<SellerAccessoryRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SELLER_ACCESSORY__SELLER_ACCESSORY_SELLER_ID_FKEY, Keys.SELLER_ACCESSORY__SELLER_ACCESSORY_ACCESSORY_ID_FKEY);
    }

    private transient Seller _seller;
    private transient Accessory _accessory;

    /**
     * Get the implicit join path to the <code>public.seller</code> table.
     */
    public Seller seller() {
        if (_seller == null)
            _seller = new Seller(this, Keys.SELLER_ACCESSORY__SELLER_ACCESSORY_SELLER_ID_FKEY);

        return _seller;
    }

    /**
     * Get the implicit join path to the <code>public.accessory</code> table.
     */
    public Accessory accessory() {
        if (_accessory == null)
            _accessory = new Accessory(this, Keys.SELLER_ACCESSORY__SELLER_ACCESSORY_ACCESSORY_ID_FKEY);

        return _accessory;
    }

    @Override
    public List<Check<SellerAccessoryRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("seller_accessory_count_check"), "((count > 0))", true)
        );
    }

    @Override
    public SellerAccessory as(String alias) {
        return new SellerAccessory(DSL.name(alias), this);
    }

    @Override
    public SellerAccessory as(Name alias) {
        return new SellerAccessory(alias, this);
    }

    @Override
    public SellerAccessory as(Table<?> alias) {
        return new SellerAccessory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerAccessory rename(String name) {
        return new SellerAccessory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerAccessory rename(Name name) {
        return new SellerAccessory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerAccessory rename(Table<?> name) {
        return new SellerAccessory(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}