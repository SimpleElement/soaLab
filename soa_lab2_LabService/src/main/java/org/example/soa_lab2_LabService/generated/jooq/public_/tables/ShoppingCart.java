/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.public_.Keys;
import org.example.soa_lab2_LabService.generated.jooq.public_.Public;
import org.example.soa_lab2_LabService.generated.jooq.public_.tables.records.ShoppingCartRecord;
import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class ShoppingCart extends TableImpl<ShoppingCartRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.shopping_cart</code>
     */
    public static final ShoppingCart SHOPPING_CART = new ShoppingCart();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShoppingCartRecord> getRecordType() {
        return ShoppingCartRecord.class;
    }

    /**
     * The column <code>public.shopping_cart.id</code>.
     */
    public final TableField<ShoppingCartRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.shopping_cart.amount</code>.
     */
    public final TableField<ShoppingCartRecord, Double> AMOUNT = createField(DSL.name("amount"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.shopping_cart.buyer_id</code>.
     */
    public final TableField<ShoppingCartRecord, Integer> BUYER_ID = createField(DSL.name("buyer_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.shopping_cart.is_active</code>.
     */
    public final TableField<ShoppingCartRecord, Boolean> IS_ACTIVE = createField(DSL.name("is_active"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    private ShoppingCart(Name alias, Table<ShoppingCartRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShoppingCart(Name alias, Table<ShoppingCartRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.shopping_cart</code> table reference
     */
    public ShoppingCart(String alias) {
        this(DSL.name(alias), SHOPPING_CART);
    }

    /**
     * Create an aliased <code>public.shopping_cart</code> table reference
     */
    public ShoppingCart(Name alias) {
        this(alias, SHOPPING_CART);
    }

    /**
     * Create a <code>public.shopping_cart</code> table reference
     */
    public ShoppingCart() {
        this(DSL.name("shopping_cart"), null);
    }

    public <O extends Record> ShoppingCart(Table<O> child, ForeignKey<O, ShoppingCartRecord> key) {
        super(child, key, SHOPPING_CART);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ShoppingCartRecord, Integer> getIdentity() {
        return (Identity<ShoppingCartRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ShoppingCartRecord> getPrimaryKey() {
        return Keys.SHOPPING_CART_PKEY;
    }

    @Override
    public List<ForeignKey<ShoppingCartRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SHOPPING_CART__SHOPPING_CART_BUYER_ID_FKEY);
    }

    private transient Buyer _buyer;

    /**
     * Get the implicit join path to the <code>public.buyer</code> table.
     */
    public Buyer buyer() {
        if (_buyer == null)
            _buyer = new Buyer(this, Keys.SHOPPING_CART__SHOPPING_CART_BUYER_ID_FKEY);

        return _buyer;
    }

    @Override
    public List<Check<ShoppingCartRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("shopping_cart_amount_check"), "((amount >= (0.0)::double precision))", true)
        );
    }

    @Override
    public ShoppingCart as(String alias) {
        return new ShoppingCart(DSL.name(alias), this);
    }

    @Override
    public ShoppingCart as(Name alias) {
        return new ShoppingCart(alias, this);
    }

    @Override
    public ShoppingCart as(Table<?> alias) {
        return new ShoppingCart(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShoppingCart rename(String name) {
        return new ShoppingCart(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShoppingCart rename(Name name) {
        return new ShoppingCart(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShoppingCart rename(Table<?> name) {
        return new ShoppingCart(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Double, Integer, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super Double, ? super Integer, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super Double, ? super Integer, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
