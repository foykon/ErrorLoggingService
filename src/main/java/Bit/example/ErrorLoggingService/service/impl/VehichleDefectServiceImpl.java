package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
import Bit.example.ErrorLoggingService.entity.Vehichle;
import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import Bit.example.ErrorLoggingService.repository.VehichleDefectRepository;
import Bit.example.ErrorLoggingService.repository.VehichleRepository;
import Bit.example.ErrorLoggingService.service.VehichleDefectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class VehichleDefectServiceImpl implements VehichleDefectService {
    private final VehichleDefectRepository vehichleDefectRepository;
    private final VehichleRepository vehichleRepository;

    @Override
    public void saveVehichleDefect(VehichleDefectRequest vehichleDefectRequest){
        VehichleDefect mappedVehichleDefect = mappingVehichleDefectRequestToVehichleDefect(vehichleDefectRequest);
        vehichleDefectRepository.save(mappedVehichleDefect);
        log.info("vehichle defect {} is added to db",mappedVehichleDefect.getVehichleDefectId());

    }

    @Override
    public void updateVehichleDefect(Long id, VehichleDefectRequest vehichleDefectRequest) {
        VehichleDefect vehichleDefect = vehichleDefectRepository.getReferenceById(id);
        vehichleDefect = mappingVehichleDefectRequestToVehichleDefect(vehichleDefectRequest);
        //To update first we delete then add new one to db
        vehichleDefectRepository.deleteById(id);
        vehichleDefectRepository.save(vehichleDefect);
        log.info("vehichle defect {} is updated. new id is {}",id,vehichleDefect.getVehichleDefectId());

    }

    @Override
    public void deleteVehichleDefect(Long id) {
        VehichleDefect vehichleDefectWillBeDeleted = vehichleDefectRepository.getReferenceById(id);
        vehichleDefectRepository.delete(vehichleDefectWillBeDeleted);
        log.info("vehichle defect {} is deleted from db",id);

    }

    public VehichleDefect mappingVehichleDefectRequestToVehichleDefect(VehichleDefectRequest vehichleDefectRequest){
        return VehichleDefect.builder()
                    .vehichleDefectDescription(vehichleDefectRequest.getVehichleDefectDescription())
                    .vehichleId(vehichleRepository.getReferenceById((long)vehichleDefectRequest.getVehichleId()))
                    .build();
    }

}
