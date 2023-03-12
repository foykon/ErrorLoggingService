package Bit.example.ErrorLoggingService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DefectLocationRequest {

    private int defectLocationId;
    private int vehichleDefectId;
    private int defectLocationX;
    private int defectLocationY;
}


