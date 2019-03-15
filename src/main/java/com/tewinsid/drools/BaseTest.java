package com.tewinsid.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

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


    protected StatelessKieSession getStatelessKieSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        StatelessKieSession kieSession = kieContainer.newStatelessKieSession("stateless-rules");

        return kieSession;
    }

    protected StatelessKieSession getStatelessKieSession(String agendaGroupName) {
        StatelessKieSession statelessKieSession = getStatelessKieSession();
        return statelessKieSession;
    }
}
