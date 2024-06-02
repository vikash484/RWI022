package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; // Hibernate Transaction
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating question
        Question q1 = new Question();
        q1.setQueid(122);
        q1.setQue("what is java?");
        
        // creating answer
        Answer ans = new Answer();
        ans.setAnswerId(221);
        ans.setAnswer("java is a programming language");
        
        // set answer
        q1.setAns(ans);
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(q1);
        session.save(ans); // save the answer entity as well
        tx.commit();
        
        session.close();
        factory.close();
    }
}
