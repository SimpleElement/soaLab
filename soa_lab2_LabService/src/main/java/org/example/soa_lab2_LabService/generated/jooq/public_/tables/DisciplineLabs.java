/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.example.soa_lab2_LabService.generated.jooq.public_.Keys;
import org.example.soa_lab2_LabService.generated.jooq.public_.Public;
import org.example.soa_lab2_LabService.generated.jooq.public_.tables.records.DisciplineLabsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DisciplineLabs extends TableImpl<DisciplineLabsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.discipline_labs</code>
     */
    public static final DisciplineLabs DISCIPLINE_LABS = new DisciplineLabs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DisciplineLabsRecord> getRecordType() {
        return DisciplineLabsRecord.class;
    }

    /**
     * The column <code>public.discipline_labs.discipline_id</code>.
     */
    public final TableField<DisciplineLabsRecord, Long> DISCIPLINE_ID = createField(DSL.name("discipline_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.discipline_labs.lab_id</code>.
     */
    public final TableField<DisciplineLabsRecord, Long> LAB_ID = createField(DSL.name("lab_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private DisciplineLabs(Name alias, Table<DisciplineLabsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DisciplineLabs(Name alias, Table<DisciplineLabsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.discipline_labs</code> table reference
     */
    public DisciplineLabs(String alias) {
        this(DSL.name(alias), DISCIPLINE_LABS);
    }

    /**
     * Create an aliased <code>public.discipline_labs</code> table reference
     */
    public DisciplineLabs(Name alias) {
        this(alias, DISCIPLINE_LABS);
    }

    /**
     * Create a <code>public.discipline_labs</code> table reference
     */
    public DisciplineLabs() {
        this(DSL.name("discipline_labs"), null);
    }

    public <O extends Record> DisciplineLabs(Table<O> child, ForeignKey<O, DisciplineLabsRecord> key) {
        super(child, key, DISCIPLINE_LABS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<DisciplineLabsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.DISCIPLINE_LABS__FKKBQI5T86PN9ACA4Q4PQANGH1C, Keys.DISCIPLINE_LABS__FK7SJ655VMFV8UNMBBTTLD2X0OB);
    }

    private transient DisciplineRef _disciplineRef;
    private transient LabRef _labRef;

    /**
     * Get the implicit join path to the <code>public.discipline_ref</code>
     * table.
     */
    public DisciplineRef disciplineRef() {
        if (_disciplineRef == null)
            _disciplineRef = new DisciplineRef(this, Keys.DISCIPLINE_LABS__FKKBQI5T86PN9ACA4Q4PQANGH1C);

        return _disciplineRef;
    }

    /**
     * Get the implicit join path to the <code>public.lab_ref</code> table.
     */
    public LabRef labRef() {
        if (_labRef == null)
            _labRef = new LabRef(this, Keys.DISCIPLINE_LABS__FK7SJ655VMFV8UNMBBTTLD2X0OB);

        return _labRef;
    }

    @Override
    public DisciplineLabs as(String alias) {
        return new DisciplineLabs(DSL.name(alias), this);
    }

    @Override
    public DisciplineLabs as(Name alias) {
        return new DisciplineLabs(alias, this);
    }

    @Override
    public DisciplineLabs as(Table<?> alias) {
        return new DisciplineLabs(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DisciplineLabs rename(String name) {
        return new DisciplineLabs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DisciplineLabs rename(Name name) {
        return new DisciplineLabs(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DisciplineLabs rename(Table<?> name) {
        return new DisciplineLabs(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
