import java.util.*;

import java.sql.*;
import org.hibernate.*;
import org.hibernate.criterion.*;

public class Main {
	
	public static void main(String[] args) {
		HibernateUtil.setup("create table EVENTS ( uid int, name VARCHAR, start_Date date, duration int);");
		
		// hibernate code start

        EventDao eventDao = new EventDao();
        Event event = new Event();
        event.setName("Create");

        eventDao.create(event);

        Event event2 = (Event) eventDao.find(event.getId());
        System.out.println("Loaded Name:"+event2.getName());

        
        HibernateUtil.checkData("select uid, name from events");        

        
		// hibernate code end
	}
	
}