/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.s311690.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.s311690.tables.BuyerOrder;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuyerOrderRecord extends UpdatableRecordImpl<BuyerOrderRecord> implements Record3<Integer, Integer, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.buyer_order.buyer_id</code>.
     */
    public void setBuyerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.buyer_order.buyer_id</code>.
     */
    public Integer getBuyerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.buyer_order.shopping_cart_id</code>.
     */
    public void setShoppingCartId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.buyer_order.shopping_cart_id</code>.
     */
    public Integer getShoppingCartId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.buyer_order.amount</code>.
     */
    public void setAmount(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.buyer_order.amount</code>.
     */
    public Double getAmount() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BuyerOrder.BUYER_ORDER.BUYER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return BuyerOrder.BUYER_ORDER.SHOPPING_CART_ID;
    }

    @Override
    public Field<Double> field3() {
        return BuyerOrder.BUYER_ORDER.AMOUNT;
    }

    @Override
    public Integer component1() {
        return getBuyerId();
    }

    @Override
    public Integer component2() {
        return getShoppingCartId();
    }

    @Override
    public Double component3() {
        return getAmount();
    }

    @Override
    public Integer value1() {
        return getBuyerId();
    }

    @Override
    public Integer value2() {
        return getShoppingCartId();
    }

    @Override
    public Double value3() {
        return getAmount();
    }

    @Override
    public BuyerOrderRecord value1(Integer value) {
        setBuyerId(value);
        return this;
    }

    @Override
    public BuyerOrderRecord value2(Integer value) {
        setShoppingCartId(value);
        return this;
    }

    @Override
    public BuyerOrderRecord value3(Double value) {
        setAmount(value);
        return this;
    }

    @Override
    public BuyerOrderRecord values(Integer value1, Integer value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BuyerOrderRecord
     */
    public BuyerOrderRecord() {
        super(BuyerOrder.BUYER_ORDER);
    }

    /**
     * Create a detached, initialised BuyerOrderRecord
     */
    public BuyerOrderRecord(Integer buyerId, Integer shoppingCartId, Double amount) {
        super(BuyerOrder.BUYER_ORDER);

        setBuyerId(buyerId);
        setShoppingCartId(shoppingCartId);
        setAmount(amount);
        resetChangedOnNotNull();
    }
}
