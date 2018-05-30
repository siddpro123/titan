package com.sid.hibernet.StudentAddress.StudentAddress;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_BATCH37")

public class Student {

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private long id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "COURSE")
	private String section;

	@OneToOne(cascade = CascadeType.ALL) // here cascade will allow us to update address when we update student table
											// automatically

	@PrimaryKeyJoinColumn
	private Address address;

	public Student(String firstName, String lastName, String section) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
				+ ", address=" + address + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
