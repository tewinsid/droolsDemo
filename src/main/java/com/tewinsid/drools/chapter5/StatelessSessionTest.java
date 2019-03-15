package com.tewinsid.drools.chapter5;

import com.tewinsid.drools.BaseTest;
import com.tewinsid.drools.model.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.StatelessKieSession;

import java.util.ArrayList;
import java.util.List;

public class StatelessSessionTest extends BaseTest {

    @Test
    public void test() {
        StatelessKieSession session = getStatelessKieSession();
        List<Person> list = new ArrayList<Person>();
        Person p = new Person();
        p.setAge(34);
        list.add(p);
        Person p1 = new Person();
        p1.setAge(34);
        list.add(p1);
//        session.execute(p);
        session.execute(list);

    }
}
