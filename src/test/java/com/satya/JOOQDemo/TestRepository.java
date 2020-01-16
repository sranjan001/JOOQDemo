package com.satya.JOOQDemo;

import com.satya.JOOQDemo.jooq.tables.Person;
import com.satya.JOOQDemo.jooq.tables.records.PersonRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootTest
public class TestRepository {

    @Autowired
    private DSLContext dsl;

    @Autowired
    private EntityManager entityManager;

    @Test
    @Transactional
    public void should_run_query() {
        com.satya.JOOQDemo.entities.Person person = new com.satya.JOOQDemo.entities.Person();
        person.setFirstName("sat");
        person.setId(1L);
        person.setLastName("ls");
        entityManager.persist(person);
        entityManager.flush();

        com.satya.JOOQDemo.entities.Person result = entityManager.find(com.satya.JOOQDemo.entities.Person.class, 1L);

        System.out.println(result.getFirstName());

        //fetch
        for(Record rec : this.dsl
                .select(Person.PERSON.FIRSTNAME, Person.PERSON.LASTNAME)
                .from(Person.PERSON).fetch()) {
            System.out.println(rec.get(Person.PERSON.FIRSTNAME) + "  :  " + rec.get(Person.PERSON.LASTNAME));
        }

    }
}
