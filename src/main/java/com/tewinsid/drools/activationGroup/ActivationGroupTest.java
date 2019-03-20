package com.tewinsid.drools.activationGroup;

import com.tewinsid.drools.BaseTest;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class ActivationGroupTest extends BaseTest {

    @Test
    public void test() {

        KieSession session = getKieSessionBySessionName("activation-group-rules");

        session.fireAllRules();
        session.dispose();
    }
}
