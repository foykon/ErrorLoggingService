package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;

import java.util.List;

public interface VehichleDefectService {
    void saveVehichleDefect(VehichleDefectRequest vehichleDefectRequest);
    List<VehichleDefectResponse> getAllVehichleDefects();
}
