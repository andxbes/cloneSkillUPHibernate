package com.luxoft.hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author Artem Loginov(ALohinov@luxoft.com)
 * @since 7/30/14 5:07 PM
 */
@Entity
@Table(name = "CONTACT")
public class Contact {

    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Column(name = "birth_date")
    private Date birthDate;
    
    @OneToMany(targetEntity = Phone.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTACT_ID")
    private Set<Phone> phones;

    public Set<Phone> getPhones() {
	return phones;
    }

    @Override
    public String toString() {
	return "Contact{"
		+ "id=" + id
		+ ", firstName='" + firstName + "\'"
		+ ", lastName='" + lastName + "\'"
		+ ", birthDate=" + birthDate
		+ "}\n";
    }
}
