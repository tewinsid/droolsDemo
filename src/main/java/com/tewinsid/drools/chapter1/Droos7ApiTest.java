package com.tewinsid.drools.chapter1;

import com.tewinsid.drools.BaseTest;
import com.tewinsid.drools.model.Car;
import com.tewinsid.drools.model.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;

public class Droos7ApiTest extends BaseTest {

    @Test
    public void test() {
        KieSession kieSession = getKieSession("test-drools7");

        Person p1 = new Person();
        p1.setAge(30);
        Car c1 = new Car();
        c1.setPerson(p1);

        Person p2 = new Person();
        p2.setAge(80);
        Car c2 = new Car();
        c2.setPerson(p2);

        kieSession.insert(c1);
        kieSession.insert(c2);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("match " + count + " rules ");

        System.out.println("the discount of car1 " + c1.getDiscount() + "%");
        System.out.println("the discount of car2 " + c2.getDiscount() + "%");
    }
}
