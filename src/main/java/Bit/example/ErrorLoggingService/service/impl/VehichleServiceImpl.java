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
        Vehichle vehichle = Vehichle.builder()
                .vehichleName(vehichleRequest.getVehichleName())
                .build();

        vehichleRepository.save(vehichle);
        log.info("vehichle {} is added to db",vehichle.getVehichleId());
    }


}
