package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.dto.VehichleRequest;
import Bit.example.ErrorLoggingService.entity.Vehichle;
import Bit.example.ErrorLoggingService.repository.VehichleRepository;
import Bit.example.ErrorLoggingService.service.VehichleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class VehichleServiceImpl implements VehichleService {
    private final VehichleRepository vehichleRepository;

    @Override
    public void saveVehicle(VehichleRequest vehichleRequest) {
        Vehichle mappedVehichle = mappingVehichleRequestToVehichle(vehichleRequest);
        vehichleRepository.save(mappedVehichle);
        log.info("vehichle {} is added to db",mappedVehichle.getVehichleId());
    }

    @Override
    public void updateVehichle(Long id, VehichleRequest vehichleRequest) {
        Vehichle mappedVehichle = vehichleRepository.getReferenceById(id);
        mappedVehichle = mappingVehichleRequestToVehichle(vehichleRequest);
        //To update first we delete then add new one to db
        vehichleRepository.deleteById(id);
        vehichleRepository.save(mappedVehichle);
        log.info("vehichle {} is updated to db",mappedVehichle.getVehichleId());
    }

    @Override
    public void deleteVehichle(Long id) {
        Vehichle vehichleWillBeDeleted = vehichleRepository.getReferenceById(id);
        vehichleRepository.delete(vehichleWillBeDeleted);
        log.info("vehichle {} is updated from db",vehichleWillBeDeleted.getVehichleId());
    }

    public Vehichle mappingVehichleRequestToVehichle(VehichleRequest vehichleRequest){
        return  Vehichle.builder()
                    .vehichleName(vehichleRequest.getVehichleName())
                    .build();
    }



}
