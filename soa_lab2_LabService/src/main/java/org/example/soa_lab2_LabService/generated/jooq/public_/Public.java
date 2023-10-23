/*
 * This file is generated by jOOQ.
 */
package org.example.soa_lab2_LabService.generated.jooq.public_;


import java.util.Arrays;
import java.util.List;

import org.example.soa_lab2_LabService.generated.jooq.DefaultCatalog;
import org.example.soa_lab2_LabService.generated.jooq.public_.tables.LabRef;
import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.lab_ref</code>.
     */
    public final LabRef LAB_REF = LabRef.LAB_REF;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.asList(
            Sequences.COMMENT_SEQ,
            Sequences.LAB_SEQ,
            Sequences.LIKE_SEQ,
            Sequences.MESSAGE_SEQ,
            Sequences.NEW_SERVICE_BAN_SEQ,
            Sequences.NEWS_SEQ,
            Sequences.REPORT_SEQ,
            Sequences.USER_SEQ
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            LabRef.LAB_REF
        );
    }
}