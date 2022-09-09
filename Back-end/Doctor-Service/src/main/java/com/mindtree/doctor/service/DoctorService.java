package com.mindtree.doctor.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.doctor.entity.Doctor;
import com.mindtree.doctor.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	public String registerDoctor(Doctor doctor) {
		
		doctorRepository.save(doctor);
		
		return "Hello Dr. "  + doctor.getDocName()+  " your Registration process successfully completed";
	}
	public List<Doctor> findAll(){
		return doctorRepository.findAll();
	}
	
	public Doctor fetchDoctorById(Long doctId) {
		return doctorRepository.findById(doctId).get();
	}
	public Doctor fetchDoctorByName(String docName) {
		return doctorRepository.findByDocNameIgnoreCase(docName);
	}
	
	public Doctor updateDoctor(Long doctId, Doctor doctor) {
		
		Doctor docDB = doctorRepository.findById(doctId).get();
		if(Objects.nonNull(doctor.getDocName()) && !"".equalsIgnoreCase(doctor.getDocName())) {
			docDB.setDocName(doctor.getDocName());
		}
		
		if(Objects.nonNull(doctor.getDoctAge())) {
			docDB.setDoctAge(doctor.getDoctAge());
		}
		
		if(Objects.nonNull(doctor.getDoctGender())) {
			docDB.setDoctGender(doctor.getDoctGender());
		}
		if(Objects.nonNull(doctor.setNumberOfpatientAttneded())) {
			docDB.setNumberOfpatientAttneded(doctor.setNumberOfpatientAttneded());
	}
		
		return doctorRepository.save(docDB);
	}
	public List<Doctor> deleteDoctorById(Long doctId) {
		
		
		doctorRepository.deleteById(doctId);
		System.out.println("Doctor Deleted Successfully");
		return doctorRepository.findAll();
	}

}
