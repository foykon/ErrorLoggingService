package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleRequest;

import java.util.List;

public interface VehichleService {
    void saveVehicle(VehichleRequest vehichleRequest);
    void updateVehichle(Long id,VehichleRequest vehichleRequest);
    void deleteVehichle(Long id);
}
