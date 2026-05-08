package com.pedroacbg.pm.patient_service.service;

import com.pedroacbg.pm.patient_service.dto.PatientResponseDTO;
import com.pedroacbg.pm.patient_service.mapper.PatientMapper;
import com.pedroacbg.pm.patient_service.model.Patient;
import com.pedroacbg.pm.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getAllPatients(){
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::convertToDTO).toList();
    }



}
