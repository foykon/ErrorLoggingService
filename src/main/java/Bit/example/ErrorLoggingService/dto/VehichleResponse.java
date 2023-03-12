package Bit.example.ErrorLoggingService.dto;

import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehichleResponse {
    private int vehichleId;
    private String vehichleName;
    private List<VehichleDefect> vehichleDefects;
}
