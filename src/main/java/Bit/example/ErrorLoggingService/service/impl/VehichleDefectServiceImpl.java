package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import Bit.example.ErrorLoggingService.repository.VehichleDefectRepository;
import org.springframework.stereotype.Service;

@Service
public class VehichleDefectServiceImpl {
    private final VehichleDefectRepository vehichleDefectRepository;

    public VehichleDefectServiceImpl(VehichleDefectRepository vehichleDefectRepository) {
        this.vehichleDefectRepository = vehichleDefectRepository;
    }
    VehichleDefect saveVehichleDefect(VehichleDefect vehichleDefect){
        return vehichleDefectRepository.save(vehichleDefect);
    }
}
