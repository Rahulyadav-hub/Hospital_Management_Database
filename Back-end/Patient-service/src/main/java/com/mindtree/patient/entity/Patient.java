package com.mindtree.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	private String patientName;
	private String dateOfVisit;
	private String visitedDoctor;
	private String precription;
	private Long doctId;
	
	
	public Long getPatientId(){
		return patientId;
		
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public String getPrecription() {
		return precription;
	}
	public void setPrecription(String precription) {
		this.precription = precription;
	}
	public Long getDocId() {
		return doctId;
	}
	public void setDoctId(Long doctId) {
		this.doctId = doctId;
	}
	
	public Patient() {
		super();
	}
	public Patient(Long patientId, String patientName, String dateOfVisit, String visitedDoctor, String precription, Long doctId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dateOfVisit = dateOfVisit;
		this.visitedDoctor = visitedDoctor;
		this.precription = precription;
		this.doctId = doctId;
	}
	@Override
	public String toString() {
		return "Patient[patientId=" + patientId + ", patientName=" + patientName + ", dateOfVisit=" + dateOfVisit + ", visitedDoctor=" + visitedDoctor + ", precription=" + precription + ", doctId=" + doctId + "]";	
		}
	public void setPrecription1(String precription2) {
		// TODO Auto-generated method stub
		
	}
}


