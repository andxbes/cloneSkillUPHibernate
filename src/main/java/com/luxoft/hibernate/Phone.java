package com.luxoft.hibernate;

import javax.persistence.*;

/**
 * Created by user on 7/30/2014.
 */
@Entity
@Table(name = "contact_tel_detail")
public class Phone {
    @Id
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(targetEntity = Contact.class)
    @JoinColumn(name = "CONTACT_ID")
    private Contact user;

    @Column(name = "TEL_NUMBER")
    private String number;

    @Override
    public String toString() {
        return "Phone{" +
                "userId=" + user +
                ", number='" + number + '\'' +
                '}';
    }
}
