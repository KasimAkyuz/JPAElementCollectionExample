package com.akyuz.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PersonelElementCollection")
public class Personel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personelId;
	private String firtName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	@ElementCollection
	@CollectionTable(name = "personel_phoneNumber",joinColumns = @JoinColumn(name="personelId"))
	private List<String> phoneNumber;

	public Personel(String firtName, String lastName, Date birthDate, List<String> phoneNumber) {
		this.firtName = firtName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
	}

	public Personel() {
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
