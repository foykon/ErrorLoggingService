package Bit.example.ErrorLoggingService.service;

import Bit.example.ErrorLoggingService.dto.VehichleRequest;
import Bit.example.ErrorLoggingService.dto.VehichleResponse;
import Bit.example.ErrorLoggingService.entity.Vehichle;

import java.util.List;

public interface VehichleService {
    void saveVehicle(VehichleRequest vehichleRequest);
    List<VehichleResponse> getAllVehichles();
}
