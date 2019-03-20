package com.tewinsid.drools.autoFocus;

import com.tewinsid.drools.BaseTest;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class autoFocusTest extends BaseTest {

    @Test
    public void test() {
        KieSession session = getKieSessionBySessionName("auto-focus-rules");
        //session.getAgenda().getAgendaGroup("auto-focus-agenda-2").setFocus();
        session.fireAllRules();
        session.dispose();
    }
}
