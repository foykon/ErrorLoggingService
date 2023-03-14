package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;
import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;

import java.util.List;

public interface DefectLocationService {
    void saveDefectLocation(DefectLocationRequest defectLocationRequest);
    void updateDefectLocation(Long id, DefectLocationRequest defectLocationRequest);
    void deleteDefectLocation(Long id);

}
