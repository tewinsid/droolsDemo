package com.tewinsid.drools.salience;

import com.tewinsid.drools.BaseTest;
import com.tewinsid.drools.model.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class SalienceTest extends BaseTest {
    @Test
    public void test() {
        KieSession session = getKieSessionBySessionName("salience-rules");

        Person person = new Person();
        person.setAge(-1);
        session.insert(person);

        session.fireAllRules();
        session.dispose();
    }
}
