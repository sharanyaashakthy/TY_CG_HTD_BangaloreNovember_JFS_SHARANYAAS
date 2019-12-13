package com.capgemini.contactsimulator.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactsimulator.dto.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	
	//ContactBean bean = new ContactBean();
	List<ContactBean> list = new ArrayList<ContactBean>();
	
	FileReader reader;
	Properties prop;
	ContactBean bean;


	public ContactDAOImpl() {		
	try 
		{
			reader = new FileReader("contactdb.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver"));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ContactBean> showAllContacts()
	{
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("showAllContactQuery"))){
					while(rs.next())
					{
						bean = new ContactBean();
						bean.setName(rs.getInt(1));
						
						user.setUsername(rs.getString(2));
						user.setEmail(rs.getString(3));
						list.add(user);
					}
					return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
		

	@Override
	public ContactBean searchContact(String name) {
        if(!list.isEmpty()) {
        	return bean;
		}
		return null;
	}

	@Override
	public boolean addContact(ContactBean bean) {
		if(!list.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteContact(long number) {
		if(!list.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateContact(long number) {
		if(!list.isEmpty()) {
			return true;
		}
		return false;
	}

}
