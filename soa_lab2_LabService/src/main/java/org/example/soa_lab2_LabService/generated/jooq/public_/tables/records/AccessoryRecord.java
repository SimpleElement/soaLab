/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.public_.tables.Accessory;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccessoryRecord extends UpdatableRecordImpl<AccessoryRecord> implements Record6<Integer, Integer, String, Double, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.accessory.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.accessory.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.accessory.car_brand_id</code>.
     */
    public void setCarBrandId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.accessory.car_brand_id</code>.
     */
    public Integer getCarBrandId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.accessory.photo</code>.
     */
    public void setPhoto(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.accessory.photo</code>.
     */
    public String getPhoto() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.accessory.price</code>.
     */
    public void setPrice(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.accessory.price</code>.
     */
    public Double getPrice() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.accessory.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.accessory.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.accessory.serial_number</code>.
     */
    public void setSerialNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.accessory.serial_number</code>.
     */
    public Integer getSerialNumber() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, Double, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, Double, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Accessory.ACCESSORY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Accessory.ACCESSORY.CAR_BRAND_ID;
    }

    @Override
    public Field<String> field3() {
        return Accessory.ACCESSORY.PHOTO;
    }

    @Override
    public Field<Double> field4() {
        return Accessory.ACCESSORY.PRICE;
    }

    @Override
    public Field<String> field5() {
        return Accessory.ACCESSORY.DESCRIPTION;
    }

    @Override
    public Field<Integer> field6() {
        return Accessory.ACCESSORY.SERIAL_NUMBER;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getCarBrandId();
    }

    @Override
    public String component3() {
        return getPhoto();
    }

    @Override
    public Double component4() {
        return getPrice();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public Integer component6() {
        return getSerialNumber();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getCarBrandId();
    }

    @Override
    public String value3() {
        return getPhoto();
    }

    @Override
    public Double value4() {
        return getPrice();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public Integer value6() {
        return getSerialNumber();
    }

    @Override
    public AccessoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccessoryRecord value2(Integer value) {
        setCarBrandId(value);
        return this;
    }

    @Override
    public AccessoryRecord value3(String value) {
        setPhoto(value);
        return this;
    }

    @Override
    public AccessoryRecord value4(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public AccessoryRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public AccessoryRecord value6(Integer value) {
        setSerialNumber(value);
        return this;
    }

    @Override
    public AccessoryRecord values(Integer value1, Integer value2, String value3, Double value4, String value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccessoryRecord
     */
    public AccessoryRecord() {
        super(Accessory.ACCESSORY);
    }

    /**
     * Create a detached, initialised AccessoryRecord
     */
    public AccessoryRecord(Integer id, Integer carBrandId, String photo, Double price, String description, Integer serialNumber) {
        super(Accessory.ACCESSORY);

        setId(id);
        setCarBrandId(carBrandId);
        setPhoto(photo);
        setPrice(price);
        setDescription(description);
        setSerialNumber(serialNumber);
        resetChangedOnNotNull();
    }
}
