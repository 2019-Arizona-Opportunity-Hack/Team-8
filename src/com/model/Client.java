package com.model;

public class Client {

	private String timeStamp;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String diagnosis;
	private long phoneNumber;
	private String parent1;
	private String parent2;
	private String email;
	private String address;
	private String reason;
	private String funding;
	private String availableDay;
	private String availableTime;
	private String notes;
	
	public Client(String timeStamp, String firstName, String lastName, String birthDate, String diagnosis, long phoneNumber, String parent1, String parent2, String email, String address, String reason, String funding, String availableDay, String availableTime, String notes)
	{
		this.setTimeStamp(timeStamp);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthDate(birthDate);
		this.setDiagnosis(diagnosis);
		this.setPhoneNumber(phoneNumber);
		this.parent1 = parent1;
		this.parent2 = parent2;
		this.email = email;
		this.address = address;
		this.reason = reason;
		this.funding = funding;
		this.availableDay = availableDay;
		this.availableTime=availableTime;
		this.notes = notes;
	}

	public String getParent1() {
		return parent1;
	}

	public void setParent1(String parent1) {
		this.parent1 = parent1;
	}

	public String getParent2() {
		return parent2;
	}

	public void setParent2(String parent2) {
		this.parent2 = parent2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAvailableDay() {
		return availableDay;
	}

	public void setAvailableDay(String availableDay) {
		this.availableDay = availableDay;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
