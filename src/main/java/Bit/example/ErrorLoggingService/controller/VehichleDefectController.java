package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
import Bit.example.ErrorLoggingService.dto.VehichleRequest;
import Bit.example.ErrorLoggingService.service.VehichleDefectService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehichleDefect")
@Log4j2
public class VehichleDefectController {
    private final VehichleDefectService vehichleDefectService;

    public VehichleDefectController(VehichleDefectService vehichleDefectService) {
        this.vehichleDefectService = vehichleDefectService;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveVehichleDefect(@RequestBody VehichleDefectRequest vehichleDefectRequest){
        vehichleDefectService.saveVehichleDefect(vehichleDefectRequest);

    }

    @PostMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateVehicleDefect(@PathVariable ("id")Long id, @RequestBody VehichleDefectRequest vehichleDefectRequest){
        vehichleDefectService.updateVehichleDefect(id,vehichleDefectRequest);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus. ACCEPTED)
    public void deleteVehicleDdfect(@PathVariable("id") Long id){
        vehichleDefectService.deleteVehichleDefect(id);
    }


    /*@GetMapping
    public String message(){
        log.info("sa");
        return "sa" ;
    }*/
}
