/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.public_.tables.Consumable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConsumableRecord extends UpdatableRecordImpl<ConsumableRecord> implements Record5<Integer, String, Double, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.consumable.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.consumable.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.consumable.photo</code>.
     */
    public void setPhoto(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.consumable.photo</code>.
     */
    public String getPhoto() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.consumable.price</code>.
     */
    public void setPrice(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.consumable.price</code>.
     */
    public Double getPrice() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.consumable.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.consumable.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.consumable.serial_number</code>.
     */
    public void setSerialNumber(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.consumable.serial_number</code>.
     */
    public Integer getSerialNumber() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Double, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Double, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Consumable.CONSUMABLE.ID;
    }

    @Override
    public Field<String> field2() {
        return Consumable.CONSUMABLE.PHOTO;
    }

    @Override
    public Field<Double> field3() {
        return Consumable.CONSUMABLE.PRICE;
    }

    @Override
    public Field<String> field4() {
        return Consumable.CONSUMABLE.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return Consumable.CONSUMABLE.SERIAL_NUMBER;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPhoto();
    }

    @Override
    public Double component3() {
        return getPrice();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Integer component5() {
        return getSerialNumber();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPhoto();
    }

    @Override
    public Double value3() {
        return getPrice();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Integer value5() {
        return getSerialNumber();
    }

    @Override
    public ConsumableRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ConsumableRecord value2(String value) {
        setPhoto(value);
        return this;
    }

    @Override
    public ConsumableRecord value3(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public ConsumableRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ConsumableRecord value5(Integer value) {
        setSerialNumber(value);
        return this;
    }

    @Override
    public ConsumableRecord values(Integer value1, String value2, Double value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConsumableRecord
     */
    public ConsumableRecord() {
        super(Consumable.CONSUMABLE);
    }

    /**
     * Create a detached, initialised ConsumableRecord
     */
    public ConsumableRecord(Integer id, String photo, Double price, String description, Integer serialNumber) {
        super(Consumable.CONSUMABLE);

        setId(id);
        setPhoto(photo);
        setPrice(price);
        setDescription(description);
        setSerialNumber(serialNumber);
        resetChangedOnNotNull();
    }
}