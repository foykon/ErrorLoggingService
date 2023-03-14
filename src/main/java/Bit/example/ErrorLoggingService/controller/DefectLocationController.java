package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;
import Bit.example.ErrorLoggingService.service.DefectLocationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/defectLocation")
public class DefectLocationController {

    private final DefectLocationService defectLocationService;

    public DefectLocationController(DefectLocationService defectLocationService) {
        this.defectLocationService = defectLocationService;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDefectLocation(@RequestBody DefectLocationRequest defectLocationRequest){
         defectLocationService.saveDefectLocation(defectLocationRequest);
    }


}
