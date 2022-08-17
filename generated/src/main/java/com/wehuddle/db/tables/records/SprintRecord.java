/*
 * This file is generated by jOOQ.
 */
package com.wehuddle.db.tables.records;


import com.wehuddle.db.tables.Sprint;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SprintRecord extends UpdatableRecordImpl<SprintRecord> implements Record7<UUID, Integer, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sprint.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.sprint.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sprint.number</code>.
     */
    public void setNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.sprint.number</code>.
     */
    public Integer getNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.sprint.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.sprint.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sprint.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.sprint.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.sprint.deadline</code>.
     */
    public void setDeadline(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.sprint.deadline</code>.
     */
    public OffsetDateTime getDeadline() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>public.sprint.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.sprint.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>public.sprint.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.sprint.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, Integer, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<UUID, Integer, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Sprint.SPRINT.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Sprint.SPRINT.NUMBER;
    }

    @Override
    public Field<String> field3() {
        return Sprint.SPRINT.TITLE;
    }

    @Override
    public Field<String> field4() {
        return Sprint.SPRINT.DESCRIPTION;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return Sprint.SPRINT.DEADLINE;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return Sprint.SPRINT.CREATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return Sprint.SPRINT.UPDATED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getNumber();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public OffsetDateTime component5() {
        return getDeadline();
    }

    @Override
    public OffsetDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime component7() {
        return getUpdatedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getNumber();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public OffsetDateTime value5() {
        return getDeadline();
    }

    @Override
    public OffsetDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime value7() {
        return getUpdatedAt();
    }

    @Override
    public SprintRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SprintRecord value2(Integer value) {
        setNumber(value);
        return this;
    }

    @Override
    public SprintRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public SprintRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SprintRecord value5(OffsetDateTime value) {
        setDeadline(value);
        return this;
    }

    @Override
    public SprintRecord value6(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public SprintRecord value7(OffsetDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public SprintRecord values(UUID value1, Integer value2, String value3, String value4, OffsetDateTime value5, OffsetDateTime value6, OffsetDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SprintRecord
     */
    public SprintRecord() {
        super(Sprint.SPRINT);
    }

    /**
     * Create a detached, initialised SprintRecord
     */
    public SprintRecord(UUID id, Integer number, String title, String description, OffsetDateTime deadline, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        super(Sprint.SPRINT);

        setId(id);
        setNumber(number);
        setTitle(title);
        setDescription(description);
        setDeadline(deadline);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}