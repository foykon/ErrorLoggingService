package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.entity.Vehichle;
import Bit.example.ErrorLoggingService.repository.VehichleRepository;
import Bit.example.ErrorLoggingService.service.VehichleService;
import org.springframework.stereotype.Service;

@Service
public class VehichleServiceImpl implements VehichleService {
    private final VehichleRepository vehichleRepository;

    public VehichleServiceImpl(VehichleRepository vehichleRepository) {
        this.vehichleRepository = vehichleRepository;
    }

    @Override
    public Vehichle saveVehicle(Vehichle vehichle) {
        return vehichleRepository.save(vehichle);
    }
}
