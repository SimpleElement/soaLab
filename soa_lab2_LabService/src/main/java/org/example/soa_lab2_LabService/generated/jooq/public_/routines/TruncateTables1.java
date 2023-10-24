/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_.routines;


import org.example.soa_lab2_LabService.generated.jooq.public_.Public;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TruncateTables1 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.truncate_tables.username</code>.
     */
    public static final Parameter<String> USERNAME = Internal.createParameter("username", SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public TruncateTables1() {
        super("truncate_tables", Public.PUBLIC);

        addInParameter(USERNAME);
        setOverloaded(true);
    }

    /**
     * Set the <code>username</code> parameter IN value to the routine
     */
    public void setUsername(String value) {
        setValue(USERNAME, value);
    }
}
