package org.soccer.medynskyy.dto;

import java.io.FileNotFoundException;
import java.sql.*;
import java.text.ParseException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class HibernateTest {

	private static final Logger logger = Logger.getLogger(HibernateTest.class);

	public static void main(String[] args) throws FileNotFoundException,SQLException, ParseException {

		logger.log(Level.ERROR, "Error Level");
		
		//LocationsLoader ldr = new LocationsLoader("D:\\users\\oleksandr.medynskyi\\workspace\\FirstHibernateProject\\src\\locations.txt");
		//LocationsLoader ldr = new LocationsLoader("C:\\Documents and Settings\\dev01\\workspace\\FirstHibernateProject\\src\\locations.txt");
		LocationsLoader ldr = new LocationsLoader("C:\\projects\\MyFirstHibernateLocal\\FirstHibernateProject\\src\\locations.txt");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction(); 
		for(int i=0; i<ldr.getMyLocations().size(); i++){
	    	session.save(ldr.getMyLocations().get(i));
	    	logger.debug("Saving object:"+ldr.toString());
		}
		session.getTransaction().commit();
		
		session.beginTransaction(); 
		for(int i=0; i<ldr.getMyUsers().size(); i++){
	    	session.save(ldr.getMyUsers().get(i));
		}
		session.getTransaction().commit();
		session.close();
		
		logger.info("end app");
	}
}		
		
		
	//  ArrayList <Locations> myLocations = new ArrayList <Locations>();
	//	Locations homeLocation = new Locations();
	//	homeLocation.setCity("Hostomel");
	//	homeLocation.setComments("I live in Hostomel");
	//	homeLocation.setDistrict("Kyiv Oblast");

	//  Locations workLocation = new Locations();
	//	workLocation.setCity("kyiv");
	//	workLocation.setComments("I work in Kyiv");
	//	workLocation.setDistrict("Kyiv");
	//	myLocations.add(homeLocation);
	//	myLocations.add(workLocation);
		

	 /*  UserDetails MyUser = new UserDetails();
	   MyUser.setFirstName("Aleksandr");
	   UserDetails MyUser2 = new UserDetails();
	   MyUser2.setFirstName("Dima");
	   
	    Map<String, UserDetails> mMap = new HashMap<String, UserDetails>();
	    mMap.put("user1",MyUser );
       for (Map.Entry<String, UserDetails> e : mMap.entrySet()){
    	 	   System.out.println(e + " : " + mMap.get(e.getKey()).getFirstName());
       }
       
	    Hashtable<String, UserDetails> mHash = new Hashtable<String, UserDetails>();
	    mHash.put("user2", MyUser2);
	    System.out.printf(mHash.get("user2").getFirstName());*/
	    
	//    System.exit(1);
	    	
	 //   for(int i=0;i < mMap.size();i++){
	   // 	User3 = mMap.get("user1");
	    	//System.out.println(User3.getFirstName());
	    	//User3 = mMap.get("user2");
	    	//System.out.println(User3.getFirstName());
	 //   }
	    
		//var.add("First");
		//var.add("Second");
		//var.add("Third");
		//var.add(2, "Insider");
		//for(String s: var){
		//	System.out.println(s);
		//	
		//}
	    

	 //   UserLoader ldr = new UserLoader("D:\\users\\oleksandr.medynskyi\\workspace\\FirstHibernateProject\\src\\users.txt");
	/*  Locations myloc = new Locations();
	    myloc.setCity(ldr.getMyLocations().get(0).getCity());
	    System.out.print(myloc.getCity());
	    myloc.setCity(ldr.getMyLocations().get(1).getCity());
	    System.out.print(myloc.getCity());
	    myloc.setCity(ldr.getMyLocations().get(2).getCity());
	    System.out.print(myloc.getCity());
	    */
    
	
	    
	/*	
		UserDetails user = new UserDetails();

		user.setUserId(1);
		user.setUserName("First User");
		user.setJoinedDate(new Date());
		user.setDescription("Description 1");
		
		Address addr = new Address();
		addr.setCity("Kyiv");
		addr.setState("State");
		addr.setPincode("1234");
		
		Address addr2 = new Address();
		addr2.setStreet("Harkovskaya");
		addr2.setState("Kyiv");
		addr2.setPincode("5678");
		
		user.getListOfAddresses().add(addr);
		user.getListOfAddresses().add(addr2);
		*/

