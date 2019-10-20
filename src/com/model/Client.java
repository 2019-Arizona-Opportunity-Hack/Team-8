package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {

	private String timeStamp;
	@NotNull
	@Size(min=1,max=30)
	private String firstName;
	private String lastName;
	private String birthDate;
	private String diagnosis;
	private String phoneNumber;
	private String parent1;
	private String parent2;
	private String email;
	private String address;
	private String reason;
	private String funding;
	private String availableDay;
	private String availableTime;
	private String notes;
	private int ID;

	public void reader() throws FileNotFoundException
	{
		int ID = 0;
		ArrayList<Client> people = new ArrayList<Client>();
		BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\ericw\\Downloads\\MOCK_DATA (2).csv"));
		String row;
		try {
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    Client person = new Client(ID+1, data[0], data[1], data[2], data[3], data[4], data[5],data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14]);
			    people.add(person);
			    ID++;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			csvReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		toString(people);

	}

	public Client(int ID, String timeStamp, String firstName, String lastName, String birthDate, String diagnosis, String phoneNumber, String parent1, String parent2, String email, String address, String reason, String funding, String availableDay, String availableTime, String notes)
	{
		this.timeStamp = timeStamp;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.diagnosis = diagnosis;
		this.phoneNumber = phoneNumber;
		this.parent1 = parent1;
		this.parent2 = parent2;
		this.email = email;
		this.address = address;
		this.reason = reason;
		this.funding = funding;
		this.availableDay = availableDay;
		this.availableTime = availableTime;
		this.notes = notes;
		this.ID = ID;
	}

	public static void toString(ArrayList<Client> people)
	{
		for(int i = 0; i < people.size();i++)
		{
			System.out.println(people.get(i));
		}

	}

	public String getTimeStamp() { return timeStamp; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getBirthDate() { return birthDate; }
	public String getDiagnosis() { return diagnosis; }
	public String getPhoneNumber() { return phoneNumber; }
	public String getParent1() { return parent1; }
	public String getParent2() { return parent2; }
	public String getEmail() { return email; }
	public String getAddress() { return address; }
	public String getReason() { return reason; }
	public String getFunding() { return funding; }
	public String getAvailableDay() { return availableDay; }
	public String getAvailableTime() { return availableTime; }
	public String getNotes() { return notes; }
	public int getID() { return ID; }

	public String toString()
	{
		return "Client ID: " + ID + "\nName: " + firstName + " " + lastName + "\nTime of entry: " + timeStamp + "\nBirth Date: " + birthDate + "\nDiagnosis: " +  diagnosis + "\nPhone Number: " +  phoneNumber + "\nParent 1: " +  parent1 + "\nParent 2: " + parent2 + "\nEmail Address: " + email + "\nReason: " +  reason + "\nFunding Source: " +  funding + "\nAvailability: " + availableDay + " " + availableTime + "\nNotes: " +  notes + "\n";
	}



}