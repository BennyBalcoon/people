package fr.formation.people.dtos;

import org.springframework.lang.Nullable;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


/*
 * Javax validation:
 * https://docs.jboss.org/hibernate/stable/beanvalidation/api/javax/validation/constraints/package-summary.html
 */
public class PersonCreateDto {

	@Size(min=1, max=255)
	@NotBlank
	private String firstName;

	@Size(min=1, max=255)
	@NotBlank
	private String lastName;

	@NotNull
	@Past
	private LocalDate birthDate;

	@Nullable
	private Long addressId;

	public PersonCreateDto() {
		//
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId( Long addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "PersonCreateDto [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + "]";
	}

}
