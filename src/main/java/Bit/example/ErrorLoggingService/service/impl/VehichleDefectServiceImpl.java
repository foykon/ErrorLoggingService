package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
import Bit.example.ErrorLoggingService.dto.VehichleDefectResponse;
import Bit.example.ErrorLoggingService.dto.VehichleResponse;
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
        VehichleDefect vehichleDefect = VehichleDefect.builder()
                .vehichleDefectDescription(vehichleDefectRequest.getVehichleDefectDescription())
                .vehichleId(vehichleRepository.getReferenceById((long)vehichleDefectRequest.getVehichleId()))
                .build();
        vehichleDefectRepository.save(vehichleDefect);
        log.info("vehichle defect {} is added to db",vehichleDefect.getVehichleDefectId());

    }

    @Override
    public List<VehichleDefectResponse> getAllVehichleDefects() {
        List<VehichleDefect> vehichleDefects = vehichleDefectRepository.findAll();
        log.info("{} vehichles are finded from db",vehichleDefects.stream().count());
        return vehichleDefects.stream()
                .map(this::mapToVehichleDefectResponse)
                .toList();

    }

    private VehichleDefectResponse mapToVehichleDefectResponse(VehichleDefect vehichleDefect) {
        return VehichleDefectResponse.builder()
                .vehichleDefectId(vehichleDefect.getVehichleDefectId())
                .vehichleDefectDescription(vehichleDefect.getVehichleDefectDescription())
                .vehichleId(vehichleDefect.getVehichleId().getVehichleId())
                .build();

    }


}
