package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.entity.DefectLocation;
import Bit.example.ErrorLoggingService.repository.DefectLocationRepository;
import Bit.example.ErrorLoggingService.service.DefectLocationService;

public class DefectLocationServiceImpl implements DefectLocationService {
    private final DefectLocationRepository defectLocationRepository;

    public DefectLocationServiceImpl(DefectLocationRepository defectLocationRepository) {
        this.defectLocationRepository = defectLocationRepository;
    }

    @Override
    public DefectLocation saveDefectLocation(DefectLocation defectLocation) {
        return defectLocationRepository.save(defectLocation);
    }
}
