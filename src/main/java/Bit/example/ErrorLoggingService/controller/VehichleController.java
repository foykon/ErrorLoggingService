package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.dto.VehichleRequest;
import Bit.example.ErrorLoggingService.service.VehichleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehichle")
public class VehichleController {
    private final VehichleService vehichleService;

    public VehichleController(VehichleService vehichleService) {
        this.vehichleService = vehichleService;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveVehicle(@RequestBody VehichleRequest vehichleRequest){
        vehichleService.saveVehicle(vehichleRequest);
    }

    @PostMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateVehicle(@PathVariable ("id")Long id, @RequestBody VehichleRequest vehichleRequest){
        vehichleService.updateVehichle(id,vehichleRequest);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus. ACCEPTED)
    public void deleteVehicle(@PathVariable("id") Long id){
        vehichleService.deleteVehichle(id);
    }





}
