/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.s311690.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.s311690.Keys;
import org.example.soa_lab2_LabService.generated.jooq.s311690.Public;
import org.example.soa_lab2_LabService.generated.jooq.s311690.tables.records.BuyerOrderRecord;
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
public class BuyerOrder extends TableImpl<BuyerOrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.buyer_order</code>
     */
    public static final BuyerOrder BUYER_ORDER = new BuyerOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BuyerOrderRecord> getRecordType() {
        return BuyerOrderRecord.class;
    }

    /**
     * The column <code>public.buyer_order.buyer_id</code>.
     */
    public final TableField<BuyerOrderRecord, Integer> BUYER_ID = createField(DSL.name("buyer_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.buyer_order.shopping_cart_id</code>.
     */
    public final TableField<BuyerOrderRecord, Integer> SHOPPING_CART_ID = createField(DSL.name("shopping_cart_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.buyer_order.amount</code>.
     */
    public final TableField<BuyerOrderRecord, Double> AMOUNT = createField(DSL.name("amount"), SQLDataType.DOUBLE.nullable(false), this, "");

    private BuyerOrder(Name alias, Table<BuyerOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private BuyerOrder(Name alias, Table<BuyerOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.buyer_order</code> table reference
     */
    public BuyerOrder(String alias) {
        this(DSL.name(alias), BUYER_ORDER);
    }

    /**
     * Create an aliased <code>public.buyer_order</code> table reference
     */
    public BuyerOrder(Name alias) {
        this(alias, BUYER_ORDER);
    }

    /**
     * Create a <code>public.buyer_order</code> table reference
     */
    public BuyerOrder() {
        this(DSL.name("buyer_order"), null);
    }

    public <O extends Record> BuyerOrder(Table<O> child, ForeignKey<O, BuyerOrderRecord> key) {
        super(child, key, BUYER_ORDER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<BuyerOrderRecord> getPrimaryKey() {
        return Keys.BUYER_ORDER_PKEY;
    }

    @Override
    public List<ForeignKey<BuyerOrderRecord, ?>> getReferences() {
        return Arrays.asList(Keys.BUYER_ORDER__BUYER_ORDER_BUYER_ID_FKEY, Keys.BUYER_ORDER__BUYER_ORDER_SHOPPING_CART_ID_FKEY);
    }

    private transient Buyer _buyer;
    private transient ShoppingCart _shoppingCart;

    /**
     * Get the implicit join path to the <code>public.buyer</code> table.
     */
    public Buyer buyer() {
        if (_buyer == null)
            _buyer = new Buyer(this, Keys.BUYER_ORDER__BUYER_ORDER_BUYER_ID_FKEY);

        return _buyer;
    }

    /**
     * Get the implicit join path to the <code>public.shopping_cart</code>
     * table.
     */
    public ShoppingCart shoppingCart() {
        if (_shoppingCart == null)
            _shoppingCart = new ShoppingCart(this, Keys.BUYER_ORDER__BUYER_ORDER_SHOPPING_CART_ID_FKEY);

        return _shoppingCart;
    }

    @Override
    public List<Check<BuyerOrderRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("buyer_order_amount_check"), "((amount > (0)::double precision))", true)
        );
    }

    @Override
    public BuyerOrder as(String alias) {
        return new BuyerOrder(DSL.name(alias), this);
    }

    @Override
    public BuyerOrder as(Name alias) {
        return new BuyerOrder(alias, this);
    }

    @Override
    public BuyerOrder as(Table<?> alias) {
        return new BuyerOrder(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BuyerOrder rename(String name) {
        return new BuyerOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BuyerOrder rename(Name name) {
        return new BuyerOrder(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BuyerOrder rename(Table<?> name) {
        return new BuyerOrder(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super Integer, ? super Double, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super Integer, ? super Double, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
