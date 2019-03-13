package com.tewinsid.drools.chapter4;

import com.tewinsid.drools.BaseTest;
import com.tewinsid.drools.model.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class FactHandlerTest extends BaseTest {

    @Test
    public void test() {
        KieSession kieSession = getKieSession("fact-handler-group");
        Person p1 = new Person();
        p1.setAge(81);

        FactHandle factHandle = kieSession.insert(p1);

        System.out.println(factHandle.toExternalForm());

        int count = kieSession.fireAllRules();

        System.out.println("match " + count + " rules ");

        p1.setAge(90);

        kieSession.getAgenda().getAgendaGroup("fact-handler-group").setFocus();

        //将workMemory中已插入的对象进行更新
        kieSession.update(factHandle, p1);

        count = kieSession.fireAllRules();

        System.out.println("match " + count + " rules ");

        kieSession.dispose();
    }
}
