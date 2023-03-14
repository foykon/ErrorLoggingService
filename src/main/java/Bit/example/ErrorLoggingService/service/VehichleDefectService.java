package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
import Bit.example.ErrorLoggingService.dto.VehichleRequest;

import java.util.List;

public interface VehichleDefectService {
    void saveVehichleDefect(VehichleDefectRequest vehichleDefectRequest);
    void updateVehichleDefect(Long id, VehichleDefectRequest vehichleDefectRequest);
    void deleteVehichleDefect(Long id);
}
