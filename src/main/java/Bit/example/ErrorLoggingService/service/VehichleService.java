package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleRequest;

import java.util.List;

public interface VehichleService {
    void saveVehicle(VehichleRequest vehichleRequest);
    List<VehichleResponse> getAllVehichles();
}
