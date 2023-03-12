package Bit.example.ErrorLoggingService.dto;

import Bit.example.ErrorLoggingService.entity.DefectLocation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehichleDefectRequest {
    private int vehichleDefectId;
    private int vehichleId;
    private List<DefectLocationRequest> defectLocations;
    private String vehichleDefectDescription;
}
