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
public class VehichleDefectResponse {
    private int vehichleDefectId;
    private int vehichleId;
    private List<DefectLocation> defectLocations;
    private String vehichleDefectDescription;
}
