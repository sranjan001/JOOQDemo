/*
 * This file is generated by jOOQ.
 */
package com.satya.JOOQDemo.jooq.tables;


import com.satya.JOOQDemo.jooq.DefaultSchema;
import com.satya.JOOQDemo.jooq.Indexes;
import com.satya.JOOQDemo.jooq.Keys;
import com.satya.JOOQDemo.jooq.tables.records.PhoneBookRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhoneBook extends TableImpl<PhoneBookRecord> {

    private static final long serialVersionUID = -1227690114;

    /**
     * The reference instance of <code>PHONE_BOOK</code>
     */
    public static final PhoneBook PHONE_BOOK = new PhoneBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhoneBookRecord> getRecordType() {
        return PhoneBookRecord.class;
    }

    /**
     * The column <code>PHONE_BOOK.ID</code>.
     */
    public final TableField<PhoneBookRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PHONE_BOOK.FIRSTNAME</code>.
     */
    public final TableField<PhoneBookRecord, String> FIRSTNAME = createField(DSL.name("FIRSTNAME"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PHONE_BOOK.LASTNAME</code>.
     */
    public final TableField<PhoneBookRecord, String> LASTNAME = createField(DSL.name("LASTNAME"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PHONE_BOOK.PHONENO</code>.
     */
    public final TableField<PhoneBookRecord, String> PHONENO = createField(DSL.name("PHONENO"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PHONE_BOOK</code> table reference
     */
    public PhoneBook() {
        this(DSL.name("PHONE_BOOK"), null);
    }

    /**
     * Create an aliased <code>PHONE_BOOK</code> table reference
     */
    public PhoneBook(String alias) {
        this(DSL.name(alias), PHONE_BOOK);
    }

    /**
     * Create an aliased <code>PHONE_BOOK</code> table reference
     */
    public PhoneBook(Name alias) {
        this(alias, PHONE_BOOK);
    }

    private PhoneBook(Name alias, Table<PhoneBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private PhoneBook(Name alias, Table<PhoneBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PhoneBook(Table<O> child, ForeignKey<O, PhoneBookRecord> key) {
        super(child, key, PHONE_BOOK);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_B);
    }

    @Override
    public UniqueKey<PhoneBookRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_B;
    }

    @Override
    public List<UniqueKey<PhoneBookRecord>> getKeys() {
        return Arrays.<UniqueKey<PhoneBookRecord>>asList(Keys.CONSTRAINT_B);
    }

    @Override
    public PhoneBook as(String alias) {
        return new PhoneBook(DSL.name(alias), this);
    }

    @Override
    public PhoneBook as(Name alias) {
        return new PhoneBook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PhoneBook rename(String name) {
        return new PhoneBook(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PhoneBook rename(Name name) {
        return new PhoneBook(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
