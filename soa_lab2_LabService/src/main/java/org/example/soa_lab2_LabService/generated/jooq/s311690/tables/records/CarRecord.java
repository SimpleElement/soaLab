/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.s311690.tables.records;


import org.example.soa_lab2_LabService.generated.jooq.s311690.tables.Car;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CarRecord extends UpdatableRecordImpl<CarRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.car.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.car.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.car.car_brand_id</code>.
     */
    public void setCarBrandId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.car.car_brand_id</code>.
     */
    public Integer getCarBrandId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.car.model</code>.
     */
    public void setModel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.car.model</code>.
     */
    public String getModel() {
        return (String) get(2);
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
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Car.CAR.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Car.CAR.CAR_BRAND_ID;
    }

    @Override
    public Field<String> field3() {
        return Car.CAR.MODEL;
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
        return getModel();
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
        return getModel();
    }

    @Override
    public CarRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CarRecord value2(Integer value) {
        setCarBrandId(value);
        return this;
    }

    @Override
    public CarRecord value3(String value) {
        setModel(value);
        return this;
    }

    @Override
    public CarRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarRecord
     */
    public CarRecord() {
        super(Car.CAR);
    }

    /**
     * Create a detached, initialised CarRecord
     */
    public CarRecord(Integer id, Integer carBrandId, String model) {
        super(Car.CAR);

        setId(id);
        setCarBrandId(carBrandId);
        setModel(model);
        resetChangedOnNotNull();
    }
}
