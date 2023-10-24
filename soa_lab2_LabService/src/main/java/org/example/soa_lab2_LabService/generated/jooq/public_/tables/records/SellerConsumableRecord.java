/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.public_.tables.SellerConsumable;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerConsumableRecord extends UpdatableRecordImpl<SellerConsumableRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.seller_consumable.seller_id</code>.
     */
    public void setSellerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.seller_consumable.seller_id</code>.
     */
    public Integer getSellerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.seller_consumable.consumable_id</code>.
     */
    public void setConsumableId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.seller_consumable.consumable_id</code>.
     */
    public Integer getConsumableId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.seller_consumable.count</code>.
     */
    public void setCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.seller_consumable.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SellerConsumable.SELLER_CONSUMABLE.SELLER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return SellerConsumable.SELLER_CONSUMABLE.CONSUMABLE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return SellerConsumable.SELLER_CONSUMABLE.COUNT;
    }

    @Override
    public Integer component1() {
        return getSellerId();
    }

    @Override
    public Integer component2() {
        return getConsumableId();
    }

    @Override
    public Integer component3() {
        return getCount();
    }

    @Override
    public Integer value1() {
        return getSellerId();
    }

    @Override
    public Integer value2() {
        return getConsumableId();
    }

    @Override
    public Integer value3() {
        return getCount();
    }

    @Override
    public SellerConsumableRecord value1(Integer value) {
        setSellerId(value);
        return this;
    }

    @Override
    public SellerConsumableRecord value2(Integer value) {
        setConsumableId(value);
        return this;
    }

    @Override
    public SellerConsumableRecord value3(Integer value) {
        setCount(value);
        return this;
    }

    @Override
    public SellerConsumableRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SellerConsumableRecord
     */
    public SellerConsumableRecord() {
        super(SellerConsumable.SELLER_CONSUMABLE);
    }

    /**
     * Create a detached, initialised SellerConsumableRecord
     */
    public SellerConsumableRecord(Integer sellerId, Integer consumableId, Integer count) {
        super(SellerConsumable.SELLER_CONSUMABLE);

        setSellerId(sellerId);
        setConsumableId(consumableId);
        setCount(count);
        resetChangedOnNotNull();
    }
}
