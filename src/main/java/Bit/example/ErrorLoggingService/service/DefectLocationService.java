package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;

import java.util.List;

public interface DefectLocationService {
    void saveDefectLocation(DefectLocationRequest defectLocationRequest);

    List<DefectLocationResponse> getAllDefectLocations();
}
