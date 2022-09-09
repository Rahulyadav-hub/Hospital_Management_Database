package com.mindtree.doctor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	private Long doctId;
	private String docName;
	private Integer doctAge;
	private String doctGender;
	private Long numberOfpatientAttneded;
	private String doctSpecialist;
	
	public String getDoctSpecialist() {
		return doctSpecialist;
	}
	
	public void setDoctSpecialist(String doctSpecialist) {
		this.doctSpecialist = doctSpecialist;
	}
	public Long getDoctId() {
		return doctId;
	}
	public void setDoctId(Long doctId) {
		this.doctId = doctId;
	}
	
	public String getDocName() {
		return docName;
		
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public Integer getDoctAge() {
		return doctAge;
	}
	public void setDoctAge(Integer doctAge) {
		this.doctAge = doctAge;
	}
	public String getDoctGender() {
		return doctGender;
	}
	public void setDoctGender(String doctGender) {
		this.doctGender = doctGender;
	}
	public Long setNumberOfpatientAttneded() {
		return numberOfpatientAttneded;
	}
	public void setNumberOfpatientAttneded(Long numberOfpatientAttneded) {
		this.numberOfpatientAttneded = numberOfpatientAttneded;
	}
	
	public Doctor() {
		super();
		
	}
	public Doctor(Long doctId, String docName, Integer doctAge, String doctGender, Long numberOfpatientAttnede, String doctSpecialist) {
		super();
		this.doctId = doctId;
		this.docName = docName;
		this.doctAge = doctAge;
		this.doctGender = doctGender;
		this.numberOfpatientAttneded = numberOfpatientAttneded;
		this.doctSpecialist = doctSpecialist;
	}
	@Override
	public String toString() {
		return "Doctor [doctId=" + doctId + ", docName=" + docName + ", doctAge=" + doctAge + ", doctGender=" + doctGender +", numberOfpatientAttneded=" + numberOfpatientAttneded + ",  doctSpecialist=" + doctSpecialist + "]";
	}

}
