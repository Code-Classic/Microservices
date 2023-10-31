package com.codeclassic.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empid")
    private Long empid;

    @Column(name = "first_name")
    private String firstName;

	@Column(name = "last_name")
    private String lastName;

	@Column(name = "date_of_joining")
    private Date dateOfJoining;
	
	@Column(name = "email", unique = true)
	private String emailAddress;

	@Column(name = "phone", unique = true)
	private String contactNumber;

    // Many-to-One relationship with manager
    @ManyToOne
    @JoinColumn(name = "managerid")
    private Employee manager;

    // Many-to-One relationship with department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Many-to-One relationship with role
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    
    @Column(name = "emp_status")
    private Boolean employmentStatus;

    // Constructors, getters, and setters
    // ...

    public Employee() {
        // Default constructor
    }
    
    public Employee(String firstName, String lastName, Date dateOfJoining, String emailAddress, String contactNumber,
			Employee manager, Department department, Role role, Boolean employmentStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.manager = manager;
		this.department = department;
		this.role = role;
		this.employmentStatus = employmentStatus;
	}



	public Long getEmpid() {
		return empid;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Boolean getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(Boolean employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
    
}

