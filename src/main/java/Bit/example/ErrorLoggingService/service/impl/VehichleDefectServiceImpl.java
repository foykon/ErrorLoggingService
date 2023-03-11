package Bit.example.ErrorLoggingService.service.impl;

import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import Bit.example.ErrorLoggingService.repository.VehichleDefectRepository;
import Bit.example.ErrorLoggingService.service.VehichleDefectService;
import org.springframework.stereotype.Service;

@Service
public class VehichleDefectServiceImpl implements VehichleDefectService {
    private final VehichleDefectRepository vehichleDefectRepository;

    public VehichleDefectServiceImpl(VehichleDefectRepository vehichleDefectRepository) {
        this.vehichleDefectRepository = vehichleDefectRepository;
    }
    @Override
    public VehichleDefect saveVehichleDefect(VehichleDefect vehichleDefect){
        return vehichleDefectRepository.save(vehichleDefect);
    }
}
