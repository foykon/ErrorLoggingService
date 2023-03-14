package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.dto.VehichleDefectRequest;
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

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<VehichleDefectResponse> getAllVehichleDefects(){
        return vehichleDefectService.getAllVehichleDefects();
    }


    /*@GetMapping
    public String message(){
        log.info("sa");
        return "sa" ;
    }*/
}
