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

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<VehichleResponse> getAllVehichles(){
        return vehichleService.getAllVehichles();
    }
}
