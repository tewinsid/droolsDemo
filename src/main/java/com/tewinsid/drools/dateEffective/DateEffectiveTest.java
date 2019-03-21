package com.tewinsid.drools.dateEffective;

import com.tewinsid.drools.BaseTest;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class DateEffectiveTest extends BaseTest {
    @Test
    public void test() {
        System.setProperty("drools.dateformat", "yyyy-MM-dd");
        KieSession session = getKieSessionBySessionName("date-effective-rules");
        //设置系统时间格式
        session.fireAllRules();
        session.dispose();
    }
}
