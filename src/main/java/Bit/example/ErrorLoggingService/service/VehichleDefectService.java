package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
import Bit.example.ErrorLoggingService.dto.VehichleDefectResponse;
import Bit.example.ErrorLoggingService.dto.VehichleResponse;
import Bit.example.ErrorLoggingService.entity.VehichleDefect;

import java.util.List;

public interface VehichleDefectService {
    void saveVehichleDefect(VehichleDefectRequest vehichleDefectRequest);
    List<VehichleDefectResponse> getAllVehichleDefects();
}
