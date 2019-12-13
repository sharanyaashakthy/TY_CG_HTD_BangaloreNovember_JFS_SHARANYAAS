package com.capgemini.contactsimulator.dao;

import java.util.List;

import com.capgemini.contactsimulator.dto.ContactBean;

public interface ContactDAO {
	public List<ContactBean> showAllContacts();
	public ContactBean searchContact(String name);
	public boolean addContact(ContactBean bean);
	public boolean deleteContact(long number);
	public boolean updateContact(long number);
}
