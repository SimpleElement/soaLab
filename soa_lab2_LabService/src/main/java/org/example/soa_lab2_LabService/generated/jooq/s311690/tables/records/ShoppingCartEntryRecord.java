/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.s311690.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.s311690.tables.ShoppingCartEntry;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShoppingCartEntryRecord extends UpdatableRecordImpl<ShoppingCartEntryRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.shopping_cart_entry.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.shopping_cart_entry.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.shopping_cart_entry.serial_number</code>.
     */
    public void setSerialNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.shopping_cart_entry.serial_number</code>.
     */
    public Integer getSerialNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.shopping_cart_entry.count</code>.
     */
    public void setCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.shopping_cart_entry.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.shopping_cart_entry.shopping_cart_id</code>.
     */
    public void setShoppingCartId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.shopping_cart_entry.shopping_cart_id</code>.
     */
    public Integer getShoppingCartId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ShoppingCartEntry.SHOPPING_CART_ENTRY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return ShoppingCartEntry.SHOPPING_CART_ENTRY.SERIAL_NUMBER;
    }

    @Override
    public Field<Integer> field3() {
        return ShoppingCartEntry.SHOPPING_CART_ENTRY.COUNT;
    }

    @Override
    public Field<Integer> field4() {
        return ShoppingCartEntry.SHOPPING_CART_ENTRY.SHOPPING_CART_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getSerialNumber();
    }

    @Override
    public Integer component3() {
        return getCount();
    }

    @Override
    public Integer component4() {
        return getShoppingCartId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getSerialNumber();
    }

    @Override
    public Integer value3() {
        return getCount();
    }

    @Override
    public Integer value4() {
        return getShoppingCartId();
    }

    @Override
    public ShoppingCartEntryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ShoppingCartEntryRecord value2(Integer value) {
        setSerialNumber(value);
        return this;
    }

    @Override
    public ShoppingCartEntryRecord value3(Integer value) {
        setCount(value);
        return this;
    }

    @Override
    public ShoppingCartEntryRecord value4(Integer value) {
        setShoppingCartId(value);
        return this;
    }

    @Override
    public ShoppingCartEntryRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShoppingCartEntryRecord
     */
    public ShoppingCartEntryRecord() {
        super(ShoppingCartEntry.SHOPPING_CART_ENTRY);
    }

    /**
     * Create a detached, initialised ShoppingCartEntryRecord
     */
    public ShoppingCartEntryRecord(Integer id, Integer serialNumber, Integer count, Integer shoppingCartId) {
        super(ShoppingCartEntry.SHOPPING_CART_ENTRY);

        setId(id);
        setSerialNumber(serialNumber);
        setCount(count);
        setShoppingCartId(shoppingCartId);
        resetChangedOnNotNull();
    }
}
