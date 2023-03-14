package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;
import Bit.example.ErrorLoggingService.entity.DefectLocation;
import Bit.example.ErrorLoggingService.entity.VehichleDefect;
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
        DefectLocation defectLocation = mappingDefectLocationRequesttoDefectLocation(defectLocationRequest);
        defectLocationRepository.save(defectLocation);
        log.info("defect location {} is added to db", defectLocation.getVehichleDefectId());
    }

    @Override
    public void updateDefectLocation(Long id, DefectLocationRequest defectLocationRequest) {
        DefectLocation defectLocation = mappingDefectLocationRequesttoDefectLocation(defectLocationRequest);
        //To update first we delete then add new one to db
        defectLocationRepository.deleteById(id);
        defectLocationRepository.save(defectLocation);
        log.info("vehichle defect location {} is updated. new id is {}",id,defectLocation.getVehichleDefectId());
    }

    @Override
    public void deleteDefectLocation(Long id) {
        DefectLocation defectLocationWillBeDeleted = defectLocationRepository.getReferenceById(id);
        defectLocationRepository.delete(defectLocationWillBeDeleted);
        log.info("vehichle defect location {} is deleted from db",id);
    }

    public DefectLocation mappingDefectLocationRequesttoDefectLocation(DefectLocationRequest defectLocationRequest){
         return   DefectLocation.builder()
                        .defectLocationX(defectLocationRequest.getDefectLocationX())
                        .defectLocationY(defectLocationRequest.getDefectLocationY())
                        .defectLocationId(defectLocationRequest.getDefectLocationId())
                        .vehichleDefectId(vehichleDefectRepository.getReferenceById((long) defectLocationRequest.getVehichleDefectId()))
                        .build();
    }


}
