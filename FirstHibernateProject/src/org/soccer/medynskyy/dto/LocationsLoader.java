package org.soccer.medynskyy.dto;

import java.sql.Timestamp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.Column;

import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LocationsLoader {

	private static final Logger logger = Logger.getLogger(UserLoader.class);

	private ArrayList<Locations> myLocations = new ArrayList<Locations>();
	private ArrayList<UserDetails> myUsers = new ArrayList<UserDetails>();

	public void addAppender(Appender appender) {
	}

	public ArrayList<UserDetails> getMyUsers() {
		return myUsers;
	}

	public void setMyUsers(ArrayList<UserDetails> myUsers) {
		this.myUsers = myUsers;
	}

	public ArrayList<Locations> getMyLocations() {
		return myLocations;
	}

	public void setMyLocations(ArrayList<Locations> myLocations) {
		this.myLocations = myLocations;
	}

	// @SuppressWarnings("null")
	public LocationsLoader(String fileName) throws FileNotFoundException,
			ParseException {

		logger.debug("Running of UserLoader Constructor");
		// Appender newAppender = null;
		// newAppender.setName("NewAppenderFromJava");
		// logger.addAppender(newAppender);
		// Level level
		// logger.setLevel(level);

		/*
		 * log4j.appender.file=org.apache.log4j.RollingFileAppender
		 * log4j.appender.file.File=C:\\loging.log
		 * log4j.appender.file.MaxFileSize=1MB
		 * log4j.appender.file.MaxBackupIndex=1
		 * log4j.appender.file.layout=org.apache.log4j.PatternLayout
		 * log4j.appender.file.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss}
		 * %-5p %c{1}:%L - %m%n
		 */

		FileReader myFile = new FileReader(new File(fileName));
		BufferedReader Buff = new BufferedReader(myFile);
		String line = "";
		Scanner inputScanner = new Scanner(Buff);

		// int idLocation;
		String name;
		String country;
		String region;
		String city;
		String district;
		String street;
		String building;
		String zip;
		String description;
		String contacts;
		String httpLink;
		String status;
		int checkin;
		int idCreatedBy;
		java.sql.Timestamp creationDate;
		java.sql.Timestamp changeDate;
		int IdChangedBy;
		String tag;
		String latitude;
		String longtitude;
		String pic;

		int i = 0;
		while (inputScanner.hasNextLine()) {
			line = inputScanner.nextLine();
			Locations testLocation = new Locations();
		//	System.out.println(line);
			// UserDetails userInfo = new UserDetails();
			name = (String) line.split(";")[0];
			country = (String) (line.split(";")[1]);
			region = (String) (line.split(";")[2]);
			city = (String) line.split(";")[3];
			district = (String) (line.split(";")[4]);
			street = (String) (line.split(";")[5]);
			building = (String) (line.split(";")[6]);
			zip = (String) (line.split(";")[7]);
			description = (String) (line.split(";")[8]);
			contacts = (String) (line.split(";")[9]);
			httpLink = (String) (line.split(";")[10]);
			status = (String) (line.split(";")[11]);
			checkin = Integer.parseInt(line.split(";")[12]);
			idCreatedBy = Integer.parseInt(line.split(";")[13]);
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
			
			java.util.Date parsedDate = dateFormat.parse(line.split(";")[14]);
			creationDate = new java.sql.Timestamp(parsedDate.getTime());
	
			parsedDate = dateFormat.parse(line.split(";")[15]);
			changeDate = new java.sql.Timestamp(parsedDate.getTime());
			
		//	changeDate = (Timestamp) new SimpleDateFormat("dd.MM.yyyy HH:ss").parse(line.split(";")[15]);
			// changeDate = (line.split(";")[15]);
			IdChangedBy = Integer.parseInt(line.split(";")[16]);
			tag = (String) (line.split(";")[17]);
			latitude = (String) (line.split(";")[18]);
			longtitude = (String) (line.split(";")[19]);
			pic = (String) (line.split(";")[20]);

			testLocation.setName(name);
			testLocation.setCountry(country);
			testLocation.setRegion(region);
			testLocation.setCity(city);
			testLocation.setDistrict(district);
			testLocation.setStreet(street);
			testLocation.setBuilding(building);
			testLocation.setZip(zip);
			testLocation.setDescription(description);
			testLocation.setContacts(contacts);
			testLocation.setHttpLink(httpLink);
			testLocation.setStatus(status);
			testLocation.setCheckin(checkin);
			testLocation.setIdCreatedBy(idCreatedBy);
			testLocation.setCreationDate(creationDate);
			testLocation.setChangeDate(changeDate);
			testLocation.setIdChangedBy(IdChangedBy);
			testLocation.setTag(tag);
			testLocation.setLatitude(latitude);
			testLocation.setLongtitude(longtitude);
			myLocations.add(i, testLocation);
			i++;
		}

		try {
			Buff.close();
			myFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
