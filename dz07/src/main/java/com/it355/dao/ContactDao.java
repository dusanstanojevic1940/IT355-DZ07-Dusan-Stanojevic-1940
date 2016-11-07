package com.it355.dao;

import com.it355.models.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactDao {

    public List<Contact> findAll() {
        List<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact());

        return contacts;
    }
}
