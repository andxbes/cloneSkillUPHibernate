package com.luxoft.hibernate;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Artem Loginov(ALohinov@luxoft.com)
 * @since 7/30/14 5:09 PM
 */
@Repository
public class Dao {
    @Autowired
    private SessionFactory sessionFactory;

    public Contact get(Integer id) {
        Session currentSession = sessionFactory.openSession();
        try {
            Transaction t = currentSession.beginTransaction();
            try {
                return (Contact) currentSession.get(Contact.class, id);
            }finally {
                t.commit();
            }
        } finally {
            currentSession.close();
        }
    }

    public Phone getNumber(Integer id) {
        Session currentSession = sessionFactory.openSession();
        try {
            Transaction t = currentSession.beginTransaction();
            try {
                return (Phone) currentSession.get(Phone.class, id);
            }finally {
                t.commit();
            }
        } finally {
            currentSession.close();
        }
    }

    public List<Contact> getAll() {
        Session currentSession = sessionFactory.openSession();
        try {
            Transaction t = currentSession.beginTransaction();
            try {
                Query sqlQuery = currentSession.createQuery("select c from Contact c");
                return (List<Contact>)sqlQuery.list();
            }finally {
                t.commit();
            }
        } finally {
            currentSession.close();
        }
    }
}
