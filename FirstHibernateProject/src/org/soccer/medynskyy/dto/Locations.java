package org.soccer.medynskyy.dto;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATIONS",schema="mysport")
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDLOCATION")
	private int idLocation;
	@Column(name="NAME")
	private String name;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="REGION")
	private String region;
	@Column(name="CITY")
	private String city;
	@Column(name="DISTRICT")
	private String district;
	@Column(name="STREET")
	private String street;
	@Column(name="BUILDING")
	private String building;
	@Column(name="ZIP")
	private String zip;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="CONTACTS")
	private String contacts;
	@Column(name="HTTPLINK")
	private String httpLink;
	@Column(name="STATUS")
	private String status;
	@Column(name="CHECKIN")
	private int checkin;
	@Column(name="IDCREATEDBY")
	private int idCreatedBy;
	
	@Column(name = "CREATIONDATE")
	private java.sql.Timestamp creationDate;
	
	@Column(name="CHANGEDATE")
	private java.sql.Timestamp changeDate;
	
	@Column(name="IDCHANGEBY")
	private int IdChangedBy;
	@Column(name="TAG")
	private String tag;
	@Column(name="LATITUDE")
	private String latitude;
	@Column(name="LONGTITUDE")
	private String longtitude;
	@Column(name="PIC")
	private String pic;
	public int getIdLocation() {
		return idLocation;
	}
	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getHttpLink() {
		return httpLink;
	}
	public void setHttpLink(String httpLink) {
		this.httpLink = httpLink;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCheckin() {
		return checkin;
	}
	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}
	public int getIdCreatedBy() {
		return idCreatedBy;
	}
	public void setIdCreatedBy(int idCreatedBy) {
		this.idCreatedBy = idCreatedBy;
	}
	public java.sql.Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.sql.Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public java.sql.Timestamp getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(java.sql.Timestamp changeDate) {
		this.changeDate = changeDate;
	}
	public int getIdChangedBy() {
		return IdChangedBy;
	}
	public void setIdChangedBy(int idChangedBy) {
		IdChangedBy = idChangedBy;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
	
	


}
