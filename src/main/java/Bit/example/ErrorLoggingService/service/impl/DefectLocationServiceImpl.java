package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;
import Bit.example.ErrorLoggingService.entity.DefectLocation;
import Bit.example.ErrorLoggingService.repository.DefectLocationRepository;
import Bit.example.ErrorLoggingService.repository.VehichleDefectRepository;
import Bit.example.ErrorLoggingService.service.DefectLocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class DefectLocationServiceImpl implements DefectLocationService {
    private final DefectLocationRepository defectLocationRepository;
    private final VehichleDefectRepository vehichleDefectRepository;

    @Override
    public void saveDefectLocation(DefectLocationRequest defectLocationRequest) {
        DefectLocation defectLocation = DefectLocation.builder()
                .defectLocationX(defectLocationRequest.getDefectLocationX())
                .defectLocationY(defectLocationRequest.getDefectLocationY())
                .defectLocationId(defectLocationRequest.getDefectLocationId())
                .vehichleDefectId(vehichleDefectRepository.getReferenceById((long) defectLocationRequest.getVehichleDefectId()))
                .build();

        defectLocationRepository.save(defectLocation);

        log.info("defect location {} is added to db", defectLocation.getVehichleDefectId());
    }

    @Override
    public List<DefectLocationResponse> getAllDefectLocations() {
        List<DefectLocation> defectLocations=defectLocationRepository.findAll();
        log.info("{} defect locations are finded from db",defectLocations.stream().count());
        return defectLocations.stream()
                .map(this::mapToDefectLocationResponse)
                .toList();
    }

    private DefectLocationResponse mapToDefectLocationResponse(DefectLocation defectLocation) {
        return DefectLocationResponse.builder()
                .defectLocationX(defectLocation.getDefectLocationX())
                .defectLocationY(defectLocation.getDefectLocationY())
                .defectLocationId(defectLocation.getDefectLocationId())
                .vehichleDefectId(defectLocation.getVehichleDefectId()
                        .getVehichleDefectId())
                .build();

    }


}
