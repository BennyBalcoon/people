package fr.formation.people.entities;

import javax.persistence.*;

@Entity // Cette classe est mapée avec une table
@Table(name = "addresses") // Nom de la table différent de celui de la classe
public class Address {

	@Id // Ce champ est la clef primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30, nullable = false)
	private String country;

	@Column(length = 100, nullable = false)
	private String street;

	@Column(length = 50, nullable = false)
	private String city;

	@Column(name = "zipcode", length = 20, nullable = false)
	private String zipCode;
	
	public Address() {
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", street=" + street + ", city=" + city + ", zipCode="
				+ zipCode + "]";
	}

	
	
}
