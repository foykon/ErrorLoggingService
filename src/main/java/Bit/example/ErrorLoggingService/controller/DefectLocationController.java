package Bit.example.ErrorLoggingService.controller;

import Bit.example.ErrorLoggingService.dto.DefectLocationRequest;
import Bit.example.ErrorLoggingService.dto.VehichleRequest;
import Bit.example.ErrorLoggingService.entity.DefectLocation;
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

    @PostMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateDefectLocation(@PathVariable ("id")Long id, @RequestBody DefectLocationRequest defectLocationRequest){
        defectLocationService.updateDefectLocation(id,defectLocationRequest);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus. ACCEPTED)
    public void deleteDefectLocation(@PathVariable("id") Long id){
        defectLocationService.deleteDefectLocation(id);
    }


}
