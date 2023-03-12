package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;
import Bit.example.ErrorLoggingService.dto.DefectLocationResponse;
import Bit.example.ErrorLoggingService.entity.DefectLocation;

import java.util.List;

public interface DefectLocationService {
    void saveDefectLocation(DefectLocationRequest defectLocationRequest);

    List<DefectLocationResponse> getAllDefectLocations();
}
