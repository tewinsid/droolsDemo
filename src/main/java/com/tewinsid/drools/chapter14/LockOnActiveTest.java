package com.tewinsid.drools.chapter14;

import com.tewinsid.drools.BaseTest;
import com.tewinsid.drools.model.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class LockOnActiveTest extends BaseTest {

    @Test
    public void test() {
        KieSession session = getKieSessionBySessionName("lockOnActive-rules");

        Person person = new Person();
        person.setAge(19);
        session.insert(person);

        session.fireAllRules();
        session.dispose();
    }
}
