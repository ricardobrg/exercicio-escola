package br.com.proway.senior.escola.model;

import java.security.Permission;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Colaborator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idColaborator;

	private String imgUrl;

	@OneToMany
	private ArrayList<Permission> permissions;

	private double salary;
	private boolean nocturnalWork;

	private String rg, cpf, motherName, fatherName, maritalStatus, naturalness, nacionality;
	private String password, name, surname;

	public Colaborator() {}

	public Colaborator(int idColaborator, Permission permission, LocalDate admissionDate, LocalDate birthDate, LocalDate lastVacationDate, double salary,
			boolean nocturnalWork, String rg, String cpf, String motherName, String fatherName, String maritalStatus,
			String naturalness, String nacionality, String password, String name, String surname) {
		super();
		this.idColaborator = idColaborator;this.salary = salary;
		this.nocturnalWork = nocturnalWork;
		this.rg = rg;
		this.cpf = cpf;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.maritalStatus = maritalStatus;
		this.naturalness = naturalness;
		this.nacionality = nacionality;
		this.password = password;	
		this.name = name;
		this.surname = surname;
	}
	
	public int getIdColaborator() {
		return idColaborator;
	}

	public void setIdColaborator(int idCollaborator) {
		this.idColaborator = idCollaborator;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isNocturnalWork() {
		return nocturnalWork;
	}

	public void setNocturnalWork(boolean nocturnalWork) {
		this.nocturnalWork = nocturnalWork;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNaturalness() {
		return naturalness;
	}

	public void setNaturalness(String naturalness) {
		this.naturalness = naturalness;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
