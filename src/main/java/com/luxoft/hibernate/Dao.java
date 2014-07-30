package com.luxoft.hibernate;

import org.hibernate.SessionFactory;
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
	SessionFactory sessionFactory;
	public Contact get(){
		Session currentSession = sessionFactory.openSession();
		try{
		return (Contact) currentSession.get(Contact.class, 1);
		}finally {
			currentSession.close();
		}
	}
}
