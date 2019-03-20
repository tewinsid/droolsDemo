package com.tewinsid.drools.chapter13;

import com.tewinsid.drools.BaseTest;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class RuleFlowGroupTest extends BaseTest {

    @Test
    public void test() {
        KieSession session = getKieSessionBySessionName("ruleFlowGroup-rules");
        session.getAgenda().getAgendaGroup("rule-flow-group-2").setFocus();

        int count = session.fireAllRules();

        System.out.println("match " + count + " rules ");

        session.dispose();
    }

}
