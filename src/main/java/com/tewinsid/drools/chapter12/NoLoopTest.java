package com.tewinsid.drools.chapter12;

import com.tewinsid.drools.BaseTest;
import com.tewinsid.drools.model.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class NoLoopTest extends BaseTest {

    @Test
    public void test() {
        KieSession session = getKieSessionBySessionName("no-loop-rules");

        Person p = new Person();
        p.setAge(20);

        session.insert(p);

        int count = session.fireAllRules();

        System.out.println("match " + count + " rules ");

        session.dispose();

    }

}
