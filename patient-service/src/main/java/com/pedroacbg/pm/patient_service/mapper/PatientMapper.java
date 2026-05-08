package com.pedroacbg.pm.patient_service.mapper;

import com.pedroacbg.pm.patient_service.dto.PatientResponseDTO;
import com.pedroacbg.pm.patient_service.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO convertToDTO(Patient entity){
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(String.valueOf(entity.getId()));
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setAddress(entity.getAddress());
        dto.setDateOfBirth(String.valueOf(entity.getDateOfBirth()));
        return dto;
    }

}
