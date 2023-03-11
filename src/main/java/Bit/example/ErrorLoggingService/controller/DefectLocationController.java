package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.entity.DefectLocation;
import Bit.example.ErrorLoggingService.service.DefectLocationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DefectLocation")
public class DefectLocationController {
    private final DefectLocationService defectLocationService;

    public DefectLocationController(DefectLocationService defectLocationService) {
        this.defectLocationService = defectLocationService;
    }

    @PostMapping("/save")
    public DefectLocation saveDefectLocation(DefectLocation defectLocation){
        return defectLocationService.saveDefectLocation(defectLocation);
    }
}
