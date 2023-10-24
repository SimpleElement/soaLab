/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.public_.Keys;
import org.example.soa_lab2_LabService.generated.jooq.public_.Public;
import org.example.soa_lab2_LabService.generated.jooq.public_.tables.records.SellerConsumableRecord;
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
public class SellerConsumable extends TableImpl<SellerConsumableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.seller_consumable</code>
     */
    public static final SellerConsumable SELLER_CONSUMABLE = new SellerConsumable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerConsumableRecord> getRecordType() {
        return SellerConsumableRecord.class;
    }

    /**
     * The column <code>public.seller_consumable.seller_id</code>.
     */
    public final TableField<SellerConsumableRecord, Integer> SELLER_ID = createField(DSL.name("seller_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.seller_consumable.consumable_id</code>.
     */
    public final TableField<SellerConsumableRecord, Integer> CONSUMABLE_ID = createField(DSL.name("consumable_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.seller_consumable.count</code>.
     */
    public final TableField<SellerConsumableRecord, Integer> COUNT = createField(DSL.name("count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.INTEGER)), this, "");

    private SellerConsumable(Name alias, Table<SellerConsumableRecord> aliased) {
        this(alias, aliased, null);
    }

    private SellerConsumable(Name alias, Table<SellerConsumableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.seller_consumable</code> table reference
     */
    public SellerConsumable(String alias) {
        this(DSL.name(alias), SELLER_CONSUMABLE);
    }

    /**
     * Create an aliased <code>public.seller_consumable</code> table reference
     */
    public SellerConsumable(Name alias) {
        this(alias, SELLER_CONSUMABLE);
    }

    /**
     * Create a <code>public.seller_consumable</code> table reference
     */
    public SellerConsumable() {
        this(DSL.name("seller_consumable"), null);
    }

    public <O extends Record> SellerConsumable(Table<O> child, ForeignKey<O, SellerConsumableRecord> key) {
        super(child, key, SELLER_CONSUMABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SellerConsumableRecord> getPrimaryKey() {
        return Keys.SELLER_CONSUMABLE_PKEY;
    }

    @Override
    public List<ForeignKey<SellerConsumableRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SELLER_CONSUMABLE__SELLER_CONSUMABLE_SELLER_ID_FKEY, Keys.SELLER_CONSUMABLE__SELLER_CONSUMABLE_CONSUMABLE_ID_FKEY);
    }

    private transient Seller _seller;
    private transient Consumable _consumable;

    /**
     * Get the implicit join path to the <code>public.seller</code> table.
     */
    public Seller seller() {
        if (_seller == null)
            _seller = new Seller(this, Keys.SELLER_CONSUMABLE__SELLER_CONSUMABLE_SELLER_ID_FKEY);

        return _seller;
    }

    /**
     * Get the implicit join path to the <code>public.consumable</code> table.
     */
    public Consumable consumable() {
        if (_consumable == null)
            _consumable = new Consumable(this, Keys.SELLER_CONSUMABLE__SELLER_CONSUMABLE_CONSUMABLE_ID_FKEY);

        return _consumable;
    }

    @Override
    public List<Check<SellerConsumableRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("seller_consumable_count_check"), "((count > 0))", true)
        );
    }

    @Override
    public SellerConsumable as(String alias) {
        return new SellerConsumable(DSL.name(alias), this);
    }

    @Override
    public SellerConsumable as(Name alias) {
        return new SellerConsumable(alias, this);
    }

    @Override
    public SellerConsumable as(Table<?> alias) {
        return new SellerConsumable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerConsumable rename(String name) {
        return new SellerConsumable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerConsumable rename(Name name) {
        return new SellerConsumable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerConsumable rename(Table<?> name) {
        return new SellerConsumable(name.getQualifiedName(), null);
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