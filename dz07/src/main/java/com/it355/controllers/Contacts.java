package com.it355.controllers;

import com.it355.dao.ContactDao;
import com.it355.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class Contacts {
    @Autowired
    private MessageSource messageSource;

    @Autowired
    private ContactDao contactDao;

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String findAll(ModelMap model) {
        new Contact().getName();

        contactDao.findAll();

        model.addAttribute("title", messageSource.getMessage("title", null, Locale.US));

        model.addAttribute("command", new Contact());

        return "contacts";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String create(@ModelAttribute Contact contact, ModelMap model) {

        model.addAttribute("contact", contact);
        model.addAttribute("title", messageSource.getMessage("title", null, Locale.US));

        return "contact";
    }
}