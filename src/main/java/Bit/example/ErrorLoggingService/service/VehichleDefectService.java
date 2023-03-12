package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
import Bit.example.ErrorLoggingService.entity.VehichleDefect;

public interface VehichleDefectService {
    void saveVehichleDefect(VehichleDefectRequest vehichleDefectRequest);
}
