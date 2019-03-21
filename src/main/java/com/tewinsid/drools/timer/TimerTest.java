package com.tewinsid.drools.timer;

import com.tewinsid.drools.BaseTest;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class TimerTest extends BaseTest {
    @Test
    public void test() {
        KieSession session = getKieSessionBySessionName("timer-rules");

        session.fireAllRules();
        session.dispose();
    }
}
