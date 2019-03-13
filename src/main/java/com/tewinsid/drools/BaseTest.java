package com.tewinsid.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class BaseTest {

    protected KieSession getKieSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("all-rules");

        return kieSession;
    }

    protected KieSession getKieSession(String agendaGroupName) {
        KieSession kieSession = getKieSession();
        //利用每个规则的group进行区分
        kieSession.getAgenda().getAgendaGroup(agendaGroupName).setFocus();
        return kieSession;
    }
}
