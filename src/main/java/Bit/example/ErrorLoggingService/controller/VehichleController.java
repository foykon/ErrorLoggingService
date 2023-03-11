package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.entity.Vehichle;
import Bit.example.ErrorLoggingService.service.VehichleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehichle")
public class VehichleController {
    private final VehichleService vehichleService;

    public VehichleController(VehichleService vehichleService) {
        this.vehichleService = vehichleService;
    }

    @PostMapping("/save")
    public Vehichle saveVehicle(@RequestBody Vehichle vehichle){
        return vehichleService.saveVehicle(vehichle);
    }
}
