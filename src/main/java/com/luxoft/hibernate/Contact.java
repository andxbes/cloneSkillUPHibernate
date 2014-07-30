package com.luxoft.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Artem Loginov(ALohinov@luxoft.com)
 * @since 7/30/14 5:07 PM
 */
@Entity
@Table(name = "CONTACT")
public class Contact {
	@Id
	@Column(name = "ID")
	Integer id;
	@Column(name = "FIRST_NAME")
	String firstName;
	@Column(name = "LAST_NAME")
	String lastName;

	@Override
	public String toString() {
		return "Contact{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
