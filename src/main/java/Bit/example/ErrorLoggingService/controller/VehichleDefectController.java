package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import Bit.example.ErrorLoggingService.service.VehichleDefectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehichleDefect")
public class VehichleDefectController {
    private final VehichleDefectService vehichleDefectService;

    public VehichleDefectController(VehichleDefectService vehichleDefectService) {
        this.vehichleDefectService = vehichleDefectService;
    }
    @PostMapping("/save")
    public VehichleDefect saveVehichleDefect(@RequestBody VehichleDefect vehichleDefect){
        return vehichleDefectService.saveVehichleDefect(vehichleDefect);
    }
}
